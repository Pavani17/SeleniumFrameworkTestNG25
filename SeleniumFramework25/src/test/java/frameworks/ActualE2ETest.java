package frameworks;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.ConfirmationPage;
import pageObjects.OrderPageTest;
import pageObjects.ProductCatalogue;
import testComponents.BaseTest;

public class ActualE2ETest extends BaseTest {
	// String productName = "IPHONE 13 PRO";
	@Test(dataProvider = "getData", groups = { "Purchase" })
	public void submitOrderTest(String email, String password, String productName) throws IOException {

		// LandingPage landpage = launchApplication();
		ProductCatalogue prodCat = landpage.loginApplication(email, password);

		List<WebElement> products = prodCat.getProductList();
		prodCat.addProductToCart(productName);
		CartPage cPage = prodCat.goToCartPage();

		Boolean match = cPage.verifyProductDisplay(productName);

		Assert.assertTrue(match);
		CheckOutPage checkPage = cPage.goToCheckOut();

		checkPage.selectCountry("India");

		ConfirmationPage confirmpage = checkPage.submitOrder();

		String confirmationMessage = confirmpage.getConfirmationMessage();

		Assert.assertTrue(confirmationMessage.equalsIgnoreCase("Thankyou for the order."));

	}

	@Test(dataProvider = "getHashMapData", groups = { "HashMapPurchase" })
	public void submitOrderHashMapTest(HashMap<String, String> mapinput) throws IOException {

		// LandingPage landpage = launchApplication();
		ProductCatalogue prodCat = landpage.loginApplication(mapinput.get("email"), mapinput.get("password"));

		List<WebElement> products = prodCat.getProductList();
		prodCat.addProductToCart(mapinput.get("product"));
		CartPage cPage = prodCat.goToCartPage();

		Boolean match = cPage.verifyProductDisplay(mapinput.get("product"));

		Assert.assertTrue(match);
		CheckOutPage checkPage = cPage.goToCheckOut();

		checkPage.selectCountry("India");

		ConfirmationPage confirmpage = checkPage.submitOrder();

		String confirmationMessage = confirmpage.getConfirmationMessage();

		Assert.assertTrue(confirmationMessage.equalsIgnoreCase("Thankyou for the order."));

	}

	@Test(dataProvider = "getJsonData", groups = { "JSONPurchase" })
	public void submitOrderJSONTest(HashMap<String, String> mapinput) throws IOException {

		// LandingPage landpage = launchApplication();
		ProductCatalogue prodCat = landpage.loginApplication(mapinput.get("email"), mapinput.get("password"));

		List<WebElement> products = prodCat.getProductList();
		prodCat.addProductToCart(mapinput.get("product"));
		CartPage cPage = prodCat.goToCartPage();

		Boolean match = cPage.verifyProductDisplay(mapinput.get("product"));

		Assert.assertTrue(match);
		CheckOutPage checkPage = cPage.goToCheckOut();

		checkPage.selectCountry("India");

		ConfirmationPage confirmpage = checkPage.submitOrder();

		String confirmationMessage = confirmpage.getConfirmationMessage();

		Assert.assertTrue(confirmationMessage.equalsIgnoreCase("Thankyou for the order."));

	}

	@Test(dependsOnMethods = { "submitOrderTest" })
	public void orderHistoryTest(String email, String password, String productName) {
		ProductCatalogue prodCat = landpage.loginApplication(email, password);
		OrderPageTest orderpage = prodCat.goToOrderPage();
		Assert.assertTrue(orderpage.verifyOrderHistory(productName));

	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "pavani123@gmail.com", "Pavani@123", "IPHONE 13 PRO" },
				{ "Tippi@gmail.com", "Satya@123", "BANARSI SAREE" } };
	}
	


	@DataProvider
	public Object[][] getHashMapData() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "pavani123@gmail.com");
		map.put("password", "Pavani@123");
		map.put("product", "IPHONE 13 PRO");

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "Tippi@gmail.com");
		map1.put("password", "Satya@123");
		map1.put("product", "BANARSI SAREE");

		return new Object[][] { { map }, { map1 } };

	}

	@DataProvider
	public Object[][] getJsonData() throws IOException {
		List<HashMap<String, String>> jsonData = getJsontoHashMap(
				System.getProperty("user.dir") +"//src//test//java//dataFiles//purchase.json");
		return new Object[][] { {jsonData.get(0)},{jsonData.get(1)} };
	}
}
