package seleniumnucoteveningsessionTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AnnotationDemo {
	 @BeforeSuite
	    void beforeSuiteTest()
	    {
	        System.out.println("beforeSuiteTest");
	    }
	    
	    @BeforeTest
	    void beforeTest()
	    {
	        System.out.println("beforeTest");
	    }
	    
	    @BeforeClass
	    void beforeClass()
	    {
	        System.out.println("beforeClass");
	    }
	    @BeforeMethod
	    void beforeMethod()
	    {
	        System.out.println("beforeMethod");
	    }
	    @Test
	    void test1()
	    {
	        System.out.println("Test case one");
	    }
	    @Test
	    void test2()
	    {
	        System.out.println("Test case two");
	    }
	    
	    @Test
	    void test3()
	    {
	        System.out.println("Test case three");
	    }
	    @AfterMethod
	    void afterMethod()
	    {
	        System.out.println("afterMethod");
	    }
	    @AfterClass
	    void afterClss()
	    {
	        System.out.println("afterClass");
	    }
	    @AfterTest
	    void aftertest()
	    {
	        System.out.println("afterTest");
	    }
	    @AfterSuite
	    void afterSuite()
	    {
	        System.out.println("afterSuite");

	}

}
