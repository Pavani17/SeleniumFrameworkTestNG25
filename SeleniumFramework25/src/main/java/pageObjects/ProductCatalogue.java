package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.cache.AbstractCache;

import abstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {

	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".col-lg-4")
	List<WebElement> products;

	By ProductsBy = By.cssSelector(".col-lg-4");
	By addToCart = By.xpath("//div[@class='card-body']/button[2]");
	
	
	By toastMessage=By.cssSelector("#toast-container");
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	

	public List<WebElement> getProductList() {
		waitforElementToAppear(ProductsBy);
		return products;
	}

	public WebElement getProductByName(String prodName) {

		WebElement prod = getProductList().stream()
				.filter(product -> product.findElement(By.tagName("b")).getText().equals(prodName)).findFirst()
				.orElse(null);

		return prod;
	}

	public void addProductToCart(String prodName) {
		WebElement prod = getProductByName(prodName);
		prod.findElement(addToCart).click();
		waitforElementToAppear(toastMessage);
		waitforElementToDisappear(spinner);
		
	}

	
	

	

}
