package frameworks;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.ConfirmationPage;
import pageObjects.LandingPage;
import pageObjects.ProductCatalogue;
import testComponents.BaseTest;

public class ErrorValidationTest extends BaseTest{
	@Test(groups= {"ErrorHandling"},retryAnalyzer = testComponents.Retry.class)
	public void errorMessageTest() throws IOException {
		

		//LandingPage landpage = launchApplication();
		 landpage.loginApplication("pavani123@gmail.com", "Pavani@123456");
		Assert.assertEquals("Incorrect email or password.", landpage.getAlert());
		

		
	}
	
	
	
	@Test
	public void productValidation() throws IOException {
		String productName = "IPHONE 13 PRO";

		//LandingPage landpage = launchApplication();
		ProductCatalogue prodCat = landpage.loginApplication("pavani123@gmail.com", "Pavani@123");

		List<WebElement> products = prodCat.getProductList();
		prodCat.addProductToCart(productName);
		CartPage cPage = prodCat.goToCartPage();

		Boolean match = cPage.verifyProductDisplay(productName);

		Assert.assertTrue(match);
		

	}
}
