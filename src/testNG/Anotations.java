package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotations {
  /*@BeforeClass
  public void classBeforeAnotation() {
	  
	  Reporter.log("This is classBeforeAnotation", true);
  }*/
  @BeforeMethod
  public void beforeMethodAnotation() {
	  Reporter.log("This is beforeMethodAnotation", true);
  }
  @AfterMethod
  public void afterMethodAnotation() {
	  Reporter.log("This is afterMethodAnotation", true);
  }
  @AfterClass
  public void afterClassAnotation() {
	  Reporter.log("This is afterClassAnotation", true);
  }
  @BeforeClass
  public void beforeClassAnotation() {
	  Reporter.log("This is afterClassAnotation", true);
  }
  @Test(dependsOnMethods= {"Mul"})
  public void Add() {
	  Reporter.log("This is 'add' Test Anotatio", true);
  }
  @Test(timeOut = 200)
  public void Mul() throws InterruptedException {
	  Thread.sleep(500);
	  Reporter.log("This is 'Div' Test Anotatio", true);
  }
  @Test
  public void Sub() {
	  Reporter.log("This is 'sub' Test Anotatio", true);
  }
 
}
