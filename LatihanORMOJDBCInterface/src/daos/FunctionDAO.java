/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ignatius
 */
public class FunctionDAO {
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public FunctionDAO() {
    }

    public FunctionDAO(SessionFactory factory) {
        this.factory = factory;
    }
    
    /**
     * Fungsi untuk melakukan insert atau update Region
     * @param region
     * @param isDelete
     * @return 
     */
    public boolean insertOrUpdateOrDelete(Object object, 
            boolean isDelete){
        boolean result = false;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            if (isDelete) {
                session.delete(object);
            }else{
                session.saveOrUpdate(object);
            }
            result = true;
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction!=null) transaction.rollback();
        } finally {
            session.close();
        }
        return result;
    }
    
    /**
     * 
     * @param query
     * @return 
     */
    public List<Object> getDatas(String entity, String keyword){
        List<Object> regions = new ArrayList<>();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        String className = entity.getClass().getSimpleName();
        System.out.println(className);
        String query = "FROM" + className + "WHERE";
        short count = 0;
        for (Object r  : entity.getClass().getDeclaredFields()) {
            String field = r +"";
            if (!field.contains("UID") && !field.contains("List")) {
                field = field.substring(field.lastIndexOf(".")+1);
                System.out.println(field);
                query += field+ "LIKE '%" + keyword + "%'";
                System.out.println("");
                
            }
        }
        
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            regions = session.createQuery(query).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction!=null)transaction.rollback();
        } finally {
            session.close();
        }
        return regions;
    }
    
    /**
     * 
     * @param query
     * @return 
     */
    public Object getById(String query){
        Object object = new Object();
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            object = session.createQuery(query)
                    .uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction!=null)transaction.rollback();
        } finally {
            session.close();
        }
        return object;
    }
}
