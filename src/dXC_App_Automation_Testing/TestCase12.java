package dXC_App_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase12 {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXC_App_Automation_Testing\\BrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("shybxc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dom12@");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a")).click();
		
		driver.findElement(By.id("add-to-cart-button-18")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		
		WebElement country_Dropdown = driver. findElement(By.id("CountryId"));
		Select country = new Select(country_Dropdown);
		WebElement State_Dropdown = driver. findElement(By.id("StateProvinceId"));
		Select state = new Select(State_Dropdown);
		
		country.selectByVisibleText("India");
		state.selectByIndex(0);
		driver.findElement(By.id("ZipPostalCode")).clear();
		driver.findElement(By.id("ZipPostalCode")).sendKeys("244001");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.close();
		
		

}

}
