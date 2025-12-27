package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.CartPage;
import pagepkg.CheckoutPage;
import pagepkg.ElementPage;
import pagepkg.KanchiLoginPage;
import pagepkg.KanchiRegPage;
import pagepkg.PaymentPage;

public class BaseClass {
	
	public static WebDriver driver;
	public KanchiRegPage regobj;
	public KanchiLoginPage logobj;
	public ElementPage eleobj;
	public CartPage cartobj;
	public CheckoutPage cktobj;
	public PaymentPage payobj;

	
	@BeforeTest
	public void setup()
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.get("https://kanchivaram.in/");
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void mthd()
	{
		regobj=new KanchiRegPage(driver);
		logobj=new KanchiLoginPage(driver);
		eleobj=new ElementPage(driver);
		cartobj=new CartPage(driver);
		cktobj=new CheckoutPage(driver);
		payobj=new PaymentPage(driver);
	}
}
