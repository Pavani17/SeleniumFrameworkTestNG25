package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class OrderPageTest extends AbstractComponent {
	WebDriver driver;

	@FindBy(xpath = "//tr/td[2]")
	List<WebElement> orderProducts;

	public OrderPageTest(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public Boolean verifyOrderHistory(String productName) {

		Boolean match = orderProducts.stream()
				.anyMatch(orderProduct -> orderProduct.getText().equalsIgnoreCase(productName));
		return match;
	}

}
