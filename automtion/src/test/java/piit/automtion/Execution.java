package piit.automtion;

import org.testng.annotations.Test;

import m.Common.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution extends Utility{
  @Test
  public void f() {
	  System.out.println("This is  test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after Method annotation");
  }

 @Test
 public void Test2() {
	 System.out.println("This is Test2");
	 
 }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before Class annotation");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after Class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before Test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after Test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before Suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after Suite annotation");
  }

}
