package Com.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");  	// get the web link to the driver
		//click submit button//
		driver.get("https://opensource-demo.orangehrmlive.com/");  	// get the web link to the driver
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement qualification=driver.findElement(By.id("menu_admin_Qualifications"));
		WebElement languages=driver.findElement(By.id("menu_admin_viewLanguages"));
		Actions action=new Actions(driver);
		action.moveToElement(admin).perform();
		action.moveToElement(qualification).perform();
		action.moveToElement(languages).click().build().perform();


	}


}