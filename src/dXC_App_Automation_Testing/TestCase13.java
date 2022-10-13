package dXC_App_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase13 {
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
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.id("checkout")).click();
		//new Address
		WebElement address_Dropdown = driver. findElement(By.id("billing-address-select"));
		Select address = new Select(address_Dropdown);
		address.selectByVisibleText("New Address");
		
		//filling Billing address
		
		WebElement address_Country_Dropdown = driver. findElement(By.id("BillingNewAddress_CountryId"));
		Select address_country = new Select(address_Country_Dropdown);
		address_country.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Moradbad");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("House No C-12");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("244001");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9243769915");
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		// Choosing the address
		address.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		driver.close();

		
	}
}
