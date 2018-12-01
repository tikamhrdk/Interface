///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controllers;
//
//import entities.Employee;
//import entities.Region;
//import java.util.List;
//import org.hibernate.SessionFactory;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import tools.HibernateUtil;
//
///**
// *
// * @author tikamhrdk
// */
//public class EmployeeControllerTest {
//    
//    public EmployeeControllerTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getAll method, of class EmployeeController.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        EmployeeController instance = new EmployeeController(factory);
////        List<Employee> expResult = null;
//        List<Employee> result = instance.getAll();
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getbyId method, of class EmployeeController.
//     */
//    @Test
//    public void testGetbyId() {
//        System.out.println("getbyId");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        EmployeeController instance = new EmployeeController(factory);
////        List<Employee> expResult = null;
//        List<Employee> result = instance.getbyId(100);
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Search method, of class EmployeeController.
//     */
//    @Test
//    public void testSearch() {
//        System.out.println("Search");
//        SessionFactory factory = tools.HibernateUtil.getSessionFactory();
//        Object data = 1;
//        EmployeeController instance = new EmployeeController();
////        List<Employee> expResult = null;
//        List<Employee> result = instance.Search(data);
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//    
//}
