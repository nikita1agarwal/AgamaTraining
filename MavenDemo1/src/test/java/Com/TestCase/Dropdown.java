package Com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		c
		driver.get("https://www.facebook.com/");  	// get the web link to the driver
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");  	// get the web link to the driver
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		

	}

}
