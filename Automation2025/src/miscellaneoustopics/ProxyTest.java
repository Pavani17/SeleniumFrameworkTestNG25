package miscellaneoustopics;



import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		Proxy proxy =new Proxy();
		proxy.setHttpProxy("ipaddress :4444");
		options.setCapability("proxy", proxy);
		WebDriver driver = new ChromeDriver(options);
	}

}
