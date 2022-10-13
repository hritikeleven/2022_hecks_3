package dXC_App_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXC_App_Automation_Testing\\BrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("domnic");
		driver.findElement(By.id("LastName")).sendKeys("sweta");
		driver.findElement(By.id("Email")).sendKeys("dswetagmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dom12");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Dom12");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
		
		

}
}