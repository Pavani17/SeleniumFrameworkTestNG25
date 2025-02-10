package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {

	WebDriver driver;

	/*
	 * @FindBy(css = "h5 b") List<WebElement> cartProducts;
	 */
	@FindBy(css = ".cartSection h3")
List<WebElement> cartProducts;
	

	@FindBy(css = ".totalRow button")
	WebElement checkOutCart;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CheckOutPage goToCheckOut() {

	
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", checkOutCart);
		 */
		checkOutCart.click();
		
		CheckOutPage checkPage = new CheckOutPage(driver);
		return checkPage;
		
	

	}

	public Boolean verifyProductDisplay(String productName) {

		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	


}
