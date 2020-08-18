package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMehods {
	private static final boolean True = false;
	
	@Test(description="Login orangeHRM")
    public void login() {
    System.out.println("Test Case login");
    }
	@Test(dependsOnMethods="login")
    public void search() {
    System.out.println("Test Case search");
    Assert.assertEquals("xyz","abc");
    }
	@Test(dependsOnMethods="search",alwaysRun=True)
    public void logout() {
    System.out.println("Test Case logout");
    }


}
