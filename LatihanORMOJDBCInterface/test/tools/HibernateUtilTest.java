/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tikamhrdk
 */
public class HibernateUtilTest {
    
    public HibernateUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSessionFactory method, of class HibernateUtil.
     */
    @Test
    
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = HibernateUtil.getSessionFactory();
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertEquals(expResult, result);
//        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetSessionFactory1() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionFactory();
//        assertEquals(expResult, result);
        assertNotEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSessionFactory2() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetSessionFactory3() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetSessionFactory4() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertNotNull(result);
//        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetSessionFactory5() {
        System.out.println("getSessionFactory");
        SessionFactory expResult = null;
        SessionFactory result = HibernateUtil.getSessionFactory();
        assertNull(result);
//        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
//    public void testGetSessionFactory2() {
//        System.out.println("getSessionFactory");
//        SessionFactory expResult = HibernateUtil.getSessionFactory();
//        SessionFactory result = HibernateUtil.getSessionFactory();
////        assertEquals(expResult, result);
////        assertNull(result);
//           
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
