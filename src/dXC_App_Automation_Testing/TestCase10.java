package dXC_App_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase10 {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXC_App_Automation_Testing\\BrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("shybxc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dom12@");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		driver.findElement(By.xpath("<<PLEASE USE THE XPATH HERE TO GET THE EXACT RESULT>>")).click();
		driver.findElement(By.xpath("<<PLEASE USE THE XPATH HERE TO GET THE EXACT RESULT>>")).click();
		driver.findElement(By.xpath("<<PLEASE USE THE XPATH HERE TO GET THE EXACT RESULT>>")).click();
		
		driver.findElement(By.id("add-to-cart-button-18")).click();

		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.close(); // IT is a good practise to close the Driver after utilzing the whole code.
}
}
