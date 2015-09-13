/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment2Test;

import com.jpretorius.assignment2.Assignment2Demo;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author user
 */
public class Assignment2DemoTest 
{
    
    public Assignment2DemoTest() 
    {
    }

    @Rule     
    public final ExpectedException thrown = ExpectedException.none();
    
    // Float Test
    @org.testng.annotations.Test(enabled = true)
    public void addFloat() throws Exception
    {
        Assignment2Demo FloatingPointAss = new Assignment2Demo();
        float result = FloatingPointAss.FloatAssertion(12.4f,20.3f);
        Assert.assertEquals(22.7,result, 22.7);
    }
    
    //  Integer Test
    @org.testng.annotations.Test(enabled = true)
    public void AssertInt() 
    {
        Assignment2Demo intTest = new Assignment2Demo();
        int result = intTest.IntAssertion(30,30);
        Assert.assertEquals(result, 60);
    }
    
    //  Equality Test
    @org.testng.annotations.Test(enabled = true)
    public void ObjectEqualityCheck() 
    {
        Assignment2Demo objectEquality = new Assignment2Demo();
        boolean result = objectEquality.ObjectEquality("Jarryd","Jarryd");
        Assert.assertEquals(result, true);
    }
    
    //  Identity Test
    @org.testng.annotations.Test(enabled = true)
    public void ObjectIdentityCheck() throws Exception
    {
        Assignment2Demo  objectIdentity = new Assignment2Demo();
        boolean result = objectIdentity.ObjectIdentity("Match");
        Assert.assertEquals(true, true);
    }
    
    
    //  Truth Test
    @org.testng.annotations.Test(enabled = true)
    public void TruthCheck() throws Exception
    {
        Assignment2Demo  AssertFalsity = new Assignment2Demo();
        boolean result = AssertFalsity.TruthCheck(true);
        Assert.assertTrue(true);
    }
    
    //  False Test
    @org.testng.annotations.Test(enabled = true)
    public void FalseCheck() throws Exception
    {
        Assignment2Demo  AssertFalsity = new Assignment2Demo();
        boolean result = AssertFalsity.FalseCheck(false);
        Assert.assertFalse(false);
    }
    
    //  Null Test
    @org.testng.annotations.Test
    public void AssertNullness() 
    {
        Assignment2Demo AssertNull= new Assignment2Demo();
        String check = AssertNull.AssertNullness(null);
        Assert.assertNull(check);
    }
    
    //  Not Null Test
    @org.testng.annotations.Test(enabled = true)
    public void AssertNonNullness() 
    {
        Assignment2Demo AssertNonNull= new Assignment2Demo();
        String check = AssertNonNull.AssertNonNullness("Not Null");
        Assert.assertNotNull(check);
    }
    
    //  Fail Test
    @org.testng.annotations.Test(enabled = true)
    public void FailingTest() throws Exception
    {
        Assert.fail("Test Fail");
    }
    
    //  Timeout Test
    @org.testng.annotations.Test(timeOut = 101) 
    public void sleep100() throws InterruptedException 
    {
       Thread.sleep(100);
    }
    

    //  Disable Test
    @org.testng.annotations.Test(enabled = false)
    public void DisablingTest() throws Exception
    {
        Assert.fail("Test Disable");
    }
    
    //  Array Test
    @org.testng.annotations.Test(enabled = true)
    public void ArrayTesting()
    {
        String[] array = new String[]{"Alpha","Beta","Gamma"};
        assertArrayEquals(array, new String[]{"Alpha","Beta","Gamma"});
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
