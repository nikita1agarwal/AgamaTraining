package Com.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id=\'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//and locator//
		driver.findElement(By.xpath("//input[@id=\'btnLogin\'and @name=\'Submit\']")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
		Select userRole=new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_userType\']")));
		userRole.selectByVisibleText("ESS");
		Select status=new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_status\']")));
		status.selectByIndex(1);
	
	
	
		
		
				

	}

}
