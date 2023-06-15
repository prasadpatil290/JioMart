package TestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Keywords in TestNG
public class TestTestNG {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class is running");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method is running");
	}
	
	@Test(priority=1)
	public void test1() {
		System.out.println("test1 method is running");
	}
	
	@Test(priority=-2)    //smallest priority test case
	public void test2() {
		System.out.println("test2 method is running");
	}
	
	@Test() //priority is not specified then it will take default as 0
	public void test3() {
		System.out.println("test3 method is running");
	}
	
	@Test(priority=4,invocationCount=3)  //same method run for multi times due to invocation count
	public void test4() {
		System.out.println("test4 method is running");
	}
	
	@Test(priority=5,invocationCount=0)  //same method  not run  due to 0 invocation count
	public void test5() {
		System.out.println("test5 method is running");
	}
	
	@Test(timeOut=3000)
	public void test6() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test6 method is running");
	}
	
	@Test(priority=7,dependsOnMethods={"test3","test4"})
	public void test7() {
		System.out.println("test7 method is running");
	}
	
	@Test(enabled=false) //it will not execute particular test 
	public void test8() {
		System.out.println("test8 method is running");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method is running");
	}
	
	@AfterMethod
	public void afterClass() {
		System.out.println("after class is running");
	}
//If priority is not specified it will run on the basis of alphabetical order
}
