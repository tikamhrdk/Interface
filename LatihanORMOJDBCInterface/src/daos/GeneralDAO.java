/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class GeneralDAO implements DAOInterface {

    private FunctionDAO fdao;

    public GeneralDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }

    /**
     * method for insert, update, or delete
     * @param object
     * @param isDelete
     * @return 
     */
    @Override
    public boolean doDML(Object object, boolean isDelete) {
        return this.fdao.insertOrUpdateOrDelete(object, isDelete);
    }

    @Override
    public List<Object> doDDL(String tableName) {
        String query = "FROM " +tableName;
        return this.fdao.getDatas(query);
    }

    @Override
    public Object getById(Object id) {
        return this.fdao.getById(id+"");
    }
}
