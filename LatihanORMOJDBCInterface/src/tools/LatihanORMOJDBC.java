/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

//import daos.RegionDAO;
//import daos.EmployeeDAO;
import daos.DAOInterface;
import daos.GeneralDAO;
import entities.Region;
import entities.Region;
import entities.Country;
import entities.Department;
import entities.Employee;
import entities.Job;
import entities.Location;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.text.html.HTML;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 *
 * @author tikamhrdk
 */
public class LatihanORMOJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(tools.HibernateUtil.getSessionFactory());
        SessionFactory sessionFactory = tools.HibernateUtil.getSessionFactory();
        //versi Interface
        DAOInterface dAOInterface = (GeneralDAO) new GeneralDAO(sessionFactory);
        Region region = new Region(new BigDecimal("10"),"BND");
        System.out.println(dAOInterface.doDML(region, true)); //INSERT,UPDATE,DELETE
        
        for (Object object: dAOInterface.doDDL("Region")) {
            Region region1 = (Region) object;
            System.out.println(region1.getRegionName());
        }
        System.out.println("Region");
        for(Object object : gdao.doDDL(nwe))
            
            
            
            
            
            
            
            
            
            
            
            
            region
//        RegionDAO rdao = new RegionDAO(sessionFactory);
//        for (Region allRegion : rdao.getAllRegions()){
//            System.out.println(allRegion.getRegionName()); 
//            for(Country country : allRegion.getCountryList()){
//                System.out.println("-"+country.getCountryName());
//                for(Location location : country.getLocationList())
//                    System.out.println("->"+location.getCity());
//                
//            }
//        }
//        for(Region getid : rdao.getIdRegions(2)){
//            System.out.println(getid.getRegionId() +" "+ getid.getRegionName());
//        }
//        for(Region getid : rdao.getSearchRegion("A")){
//            System.out.println(getid.getRegionId() +" "+ getid.getRegionName());
//        }
//        BigDecimal nil = BigDecimal.valueOf(10);
//        Region region = new Region(nil, "Palembang");
//        System.out.println(rdao.insert(region));
        
//        BigDecimal nil = BigDecimal.valueOf(10);
//        Region region = new Region(nil, "palembang");
//        System.out.println(rdao.insert(region));
        
//        System.out.println(rdao.update(region));
//        
//        System.out.println(rdao.delete(region));
        /**
         * EMPLOYEEE
         */
//        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
//        System.out.println("GET ALL");
//        for (Employee allEmployee : edao.getAllEmployee()){
//            System.out.println (allEmployee.getEmployeeId()+" "+ allEmployee.getFirstName()
//                               +" "+ allEmployee.getLastName() +" "+ allEmployee.getEmail()
//                               +" "+ allEmployee.getPhoneNumber() +" "+ allEmployee.getHireDate()
//                               +" "+ allEmployee.getJobId() +" "+ allEmployee.getSalary()
//                               +" "+ allEmployee.getCommissionPct() +" "+ allEmployee.getManagerId()
//                               +" "+ allEmployee.getDepartmentId()); 
//            
//        }
//        System.out.println("GET BY ID");
//        for(Employee getid : edao.getIdEmployee(100)){
//            System.out.println(getid.getEmployeeId()+" "+ getid.getFirstName()
//                               +" "+ getid.getLastName() +" "+ getid.getEmail()
//                               +" "+ getid.getPhoneNumber() +" "+ getid.getHireDate()
//                               +" "+ getid.getJobId() +" "+ getid.getSalary()
//                               +" "+ getid.getCommissionPct() +" "+ getid.getManagerId()
//                               +" "+ getid.getDepartmentId());
//        System.out.println("SEARCH");
//        for(Employee getSearch : edao.getSearchEmployee("1")){
//            System.out.println(getSearch.getEmployeeId()+" "+ getSearch.getFirstName()
//                               +" "+ getSearch.getLastName() +" "+ getSearch.getEmail()
//                               +" "+ getSearch.getPhoneNumber() +" "+ getSearch.getHireDate()
//                               +" "+ getSearch.getJobId() +" "+ getSearch.getSalary()
//                               +" "+ getSearch.getCommissionPct() +" "+ getSearch.getManagerId()
//                               +" "+ getSearch.getDepartmentId());
//        }
        




        
    }
    
}

