/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raju Methwani
 */
public class Order1Test {
    
    public Order1Test() {
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
     * Test of main method, of class Order1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Order1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOrdered method, of class Order1.
     */
    @Test
    public void testGetListOrdered() {
        System.out.println("getListOrdered");
        String[] expResult = null;
        String[] result = Order1.getListOrdered();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJsValue method, of class Order1.
     */
    @Test
    public void testGetJsValue() {
        System.out.println("getJsValue");
        Order1 instance = new Order1();
        int expResult = 0;
        int result = instance.getJsValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListOrdered method, of class Order1.
     */
    @Test
    public void testSetListOrdered() {
        System.out.println("setListOrdered");
        String[] list = null;
        Order1 instance = new Order1();
        instance.setListOrdered(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJsValue method, of class Order1.
     */
    @Test
    public void testSetJsValue() {
        System.out.println("setJsValue");
        int value = 0;
        Order1 instance = new Order1();
        instance.setJsValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObject method, of class Order1.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
        Order1 expResult = null;
        Order1 result = Order1.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectedItem method, of class Order1.
     */
    @Test
    public void testSelectedItem() {
        System.out.println("selectedItem");
        Order1 instance = new Order1();
        String expResult = "";
        String result = instance.selectedItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Order1.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Order1 instance = new Order1();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addElementsIntoList1 method, of class Order1.
     */
    @Test
    public void testAddElementsIntoList1() {
        System.out.println("addElementsIntoList1");
        String sql = "";
        boolean flag = false;
        Order1 instance = new Order1();
        instance.addElementsIntoList1(sql, flag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPrice method, of class Order1.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        int pr = 0;
        Order1 instance = new Order1();
        int expResult = 0;
        int result = instance.getTotalPrice(pr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceOfItem method, of class Order1.
     */
    @Test
    public void testGetPriceOfItem() {
        System.out.println("getPriceOfItem");
        String itemName = "";
        Order1 instance = new Order1();
        int expResult = 0;
        int result = instance.getPriceOfItem(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertIntoDb method, of class Order1.
     */
    @Test
    public void testInsertIntoDb() {
        System.out.println("insertIntoDb");
        boolean flag = false;
        Order1 instance = new Order1();
        instance.insertIntoDb(flag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderedListActionPerformed method, of class Order1.
     */
    @Test
    public void testOrderedListActionPerformed() {
        System.out.println("orderedListActionPerformed");
        Order1 instance = new Order1();
        instance.orderedListActionPerformed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of okButtonActionPerformed method, of class Order1.
     */
    @Test
    public void testOkButtonActionPerformed() {
        System.out.println("okButtonActionPerformed");
        Order1 instance = new Order1();
        instance.okButtonActionPerformed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmButtonActionPerformed method, of class Order1.
     */
    @Test
    public void testConfirmButtonActionPerformed() {
        System.out.println("confirmButtonActionPerformed");
        Order1 instance = new Order1();
        instance.confirmButtonActionPerformed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
