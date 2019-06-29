package Automation.Flipcart;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Properties;
import java.util.Set;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import Automation.Flipcart.*;
import cucumber.runtime.junit.Assertions;

public class App extends readProperties{

	
	static ChromeDriver driver = new ChromeDriver(); 
	static ObjectRepository obj = new ObjectRepository(driver);	

	
	public static void launch() { 
		driver.get("https://www.flipkart.com");
	}
	
	public static void inputCredentails(String userName, String password) { 
		obj.UserName().sendKeys(userName);
		obj.Password().sendKeys(password);
		obj.LoginButton().click();
	}
	
	public static void loginButton() {
		obj.LoginButton().click();
	}
	
	public static void homepageDisplayed() throws IOException, InterruptedException { 
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		String myAccountValidation = obj.myAccount.getText();		
		String homePage=loadData("homePageValidation");	
		Assert.assertEquals(myAccountValidation, homePage);
		System.out.println("Logged in successfully");
		
	}
	
	public static void inputMobileBrand(String Brand) throws IOException, InterruptedException {	
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		obj.InputBrand().sendKeys(Brand);
		obj.InputBrand().sendKeys(Keys.RETURN);
	}
	
	public static void phonedDisplayedByRelevance() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		String sortType = obj.Relevance().getText();
		Assert.assertEquals("Relevance", sortType);
		System.out.println("The Current list of phones is sorted by relevance");
		
	}
	
	public static void sortByPopularity() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		obj.Popularity().click();	
	}
	
	public static void displayPopularity() {
		System.out.println("The mobiles are sorted based on popularity");
	}
	
	public static void sortByHighToLow() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		obj.HighToLow().click();	
	}
	
	public static void displayHightoLow() {
		System.out.println("The mobiles are sorted based on high to low pricing");
	}
	
	public static void sortByNewestFirst() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		obj.NewFirst().click();	
	}
	
	public static void displayNewestFirst() {
		System.out.println("The mobiles are sorted newest phones first");
	}
	
	public static void sortByLowToHigh() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		obj.LowToHigh().click();	
	}
	
	public static void selectPhone() throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		String parentWinHandle = driver.getWindowHandle();
		obj.SelectPhone().click();	
		Set<String> windowHandles =driver.getWindowHandles();
		for(String x: windowHandles) {
			if(x.equals(parentWinHandle) == false) {
				driver.switchTo().window(x);
				break;
			}
		}
		
	}

	public static void enterPincode(String Pincode) throws InterruptedException {
		synchronized (driver)
		{
		    driver.wait(4000);
		}
			for(int i=1;i<=6;i++) {
			obj.EnterPincode().sendKeys(Keys.BACK_SPACE);
			}
			obj.EnterPincode().sendKeys(Pincode);
	}
	
	public static void verifyProductAvailability() throws IOException {
		String delivery = obj.deliveryDate().getText();
		String productAvailable = loadData("productAvailability");
		assertTrue(delivery.contains(productAvailable));
		System.out.println("This product is available for delivery");
	}
	
}