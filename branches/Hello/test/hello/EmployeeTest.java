/*
 * EmployeeTest.java
 * JUnit based test
 *
 * Created on October 19, 2006, 11:29 PM
 */

package hello;

import junit.framework.*;

/**
 *
 * @author home
 */
public class EmployeeTest extends TestCase {
    
    public EmployeeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of getID method, of class hello.Employee.
     */
    public void testGetID() {
        System.out.println("getID");
        
        Employee instance = new Employee(22);
        
        int expResult = 0;
        int result = instance.getID();
        this.assertNotNull(instance);
        //assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class hello.Employee.
     */
    public void testGetName() {
        System.out.println("getName");
        
        Employee instance = null;
        
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class hello.Employee.
     */
    public void testSetName() {
        System.out.println("setName");
        
        String name = "";
        Employee instance = null;
        
        instance.setName(name);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class hello.Employee.
     */
    public void testGetAge() {
        System.out.println("getAge");
        
        Employee instance = null;
        
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class hello.Employee.
     */
    public void testSetAge() {
        System.out.println("setAge");
        
        int age = 0;
        Employee instance = null;
        
        instance.setAge(age);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class hello.Employee.
     */
    public void testGetSalary() {
        System.out.println("getSalary");
        
        Employee instance = null;
        
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class hello.Employee.
     */
    public void testSetSalary() {
        System.out.println("setSalary");
        
        double salary = 0.0;
        Employee instance = null;
        
        instance.setSalary(salary);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
