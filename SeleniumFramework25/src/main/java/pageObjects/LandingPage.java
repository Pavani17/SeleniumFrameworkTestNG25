package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	// WebElement
	// userEmail=driver.findElement(By.id("userEmail")).sendKeys("pavani123@gmail.com");

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement userPwd;
	
	@FindBy(id="login")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement alertMessage;
	
	public ProductCatalogue loginApplication(String email,String pwd)
	{
		userEmail.sendKeys(email);
		userPwd.sendKeys(pwd);
		loginbtn.click();
		ProductCatalogue prodCat = new ProductCatalogue(driver);
		return prodCat;
		
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public  String getAlert()
	{
		
		waitforWebbElementToAppear(alertMessage);
		return alertMessage.getText();
		
	}

}
