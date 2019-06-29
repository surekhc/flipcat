package Automation.Flipcart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
public class ObjectRepository {
	WebDriver driver;
	
	public ObjectRepository(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath= "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement userName;
	
	@FindBy(xpath= "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath= "(//button[@type='submit'])[2]")
	WebElement loginButton;
	
	@FindBy(xpath= "//div[contains(text(),'My Account')]")
	WebElement myAccount;
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	WebElement inputBrand;
	
	@FindBy(xpath="//div[@class='_1xHtJz xufquN']")
	WebElement relevance;
	
	@FindBy(xpath= "//div[contains(text(),'Popularity')]")
	WebElement popularity;
	
	@FindBy(xpath= "//div[contains(text(),'Price -- Low to High')]")
	WebElement lowToHigh;
	
	@FindBy(xpath= "//div[contains(text(),'Price -- High to Low')]")
	WebElement highToLow;
	
	@FindBy(xpath= "//div[contains(text(),'Newest First')]")
	WebElement firstNew;
	
	@FindBy(xpath= "//div[@data-id='MOBFFGFP7UHHJUZU']")
	WebElement selectPhone;
	
	@FindBy(xpath= "//input[@id='pincodeInputId']")
	WebElement enterPincode;
	
	@FindBy(xpath= "//div[contains(text(),'Delivery by')]")
	WebElement deliveryDate;
	
	public WebElement UserName() {
		return userName;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement LoginButton() {
		return loginButton;
	}
	
	public WebElement MyAccount() {
		return myAccount;
	}

	public WebElement InputBrand() {
		return inputBrand;
	}
	
	public WebElement Relevance() {
		return relevance;
	}
	
	public WebElement Popularity() {
		return popularity;
	}
	
	public WebElement LowToHigh() {
		return lowToHigh;
	}
	
	public WebElement HighToLow() {
		return highToLow;
	}
	
	public WebElement NewFirst() {
		return firstNew;
	}
	
	public WebElement SelectPhone() {
		 return selectPhone;
	}
	
	public WebElement EnterPincode() {
		 return enterPincode;
	}

	public WebElement deliveryDate() {
		return deliveryDate;
	}
	
}