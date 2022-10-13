package dXC_App_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXC_App_Automation_Testing\\BrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		WebElement i = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img"));
		Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		if (p) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }
	      driver.quit();// it is a good practise to do in your code.
		
}
}
