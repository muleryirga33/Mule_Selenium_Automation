package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGClass {
  @Test
  public void f() {
	  System.out.println("Test Method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Test");
  }

}
