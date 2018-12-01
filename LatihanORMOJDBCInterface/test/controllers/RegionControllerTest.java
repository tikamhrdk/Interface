//    /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controllers;
//
//import entities.Region;
//import java.math.BigDecimal;
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
//public class RegionControllerTest {
//    
//    public RegionControllerTest() {
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
//     * Test of getAll method, of class RegionController.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        RegionController instance = new RegionController(factory);
////        List<Region> expResult = null;
//        List<Region> result = instance.getAll();
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getById method, of class RegionController.
//     */
//    @Test
//    public void testGetById() {
////        System.out.println("getSessionFactory");
////        SessionFactory expResult = HibernateUtil.getSessionFactory();
////        SessionFactory result = HibernateUtil.getSessionFactory();
////        assertEquals(expResult, result);
//        System.out.println("getById");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        RegionController instance = new RegionController(factory);
////        Object id = null;
////        RegionController instance = new RegionController();
////        List<Region> expResult = null;
//        List<Region> result = instance.getById(1);
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSearchRegion method, of class RegionController.
//     */
//    @Test
//    public void testGetSearchRegion() {
//        System.out.println("getSearchRegion");
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        Object data = "100";
//        RegionController instance = new RegionController();
////        List<Region> expResult = null;
//        List<Region> result = instance.getSearchRegion(data);
//        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insert method, of class RegionController.
//     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        Region region = new Region(BigDecimal.valueOf(12), "kal");
//        RegionController instance = new RegionController();
//        boolean expResult = true;                   
//        boolean result = instance.insert(region);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class RegionController.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Region region = null;
//        RegionController instance = new RegionController();
//        boolean expResult = false;
//        boolean result = instance.update(region);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delete method, of class RegionController.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Region region = null;
//        RegionController instance = new RegionController();
//        boolean expResult = false;
//        boolean result = instance.delete(region);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
