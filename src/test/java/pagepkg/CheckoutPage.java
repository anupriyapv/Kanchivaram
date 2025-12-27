package pagepkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"post-599\"]/div/div/div[2]/div/a")WebElement entercode;
	@FindBy(id = "coupon_code")WebElement couponcode;
    @FindBy(xpath = "//*[@id=\"woocommerce-checkout-form-coupon\"]/p[2]/button")WebElement applycoupon;	
    @FindBy(xpath="//*[@id=\"billing_first_name\"]")WebElement fname;
    @FindBy(xpath="//*[@id=\"billing_last_name\"]")WebElement lname;
	@FindBy(xpath="//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]")WebElement countrydrop;
	@FindBy(xpath="/html/body/span/span/span[1]/input")WebElement enteraddress;
	@FindBy(xpath="//*[@id=\"billing_address_1\"]")WebElement address;
	@FindBy(xpath="//*[@id=\"billing_city\"]")WebElement city;
	@FindBy(xpath="//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")WebElement statedrop;
	@FindBy(xpath="//*[@id=\"billing_postcode\"]")WebElement pcode;
	@FindBy(xpath="//*[@id=\"billing_phone\"]")WebElement phone;
	@FindBy(id="terms")WebElement terms;
	@FindBy(id="place_order")WebElement placeorder;	
		

	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercoupon() 
    {
		entercode.click();
    }
	
	public void coupon(String ccode) throws Exception
    {
//		entercode.click();
    	Thread.sleep(3000);
    	couponcode.sendKeys(ccode);
        applycoupon.click();
    }

	
	public void selectCountry(String countryName) throws Exception 
	{ 
		countrydrop.click();
		Thread.sleep(500);

	    WebElement search = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	    search.sendKeys(countryName);
	    Thread.sleep(500);

	    driver.findElement(By.xpath("//li[contains(text(),'" + countryName + "')]")).click();
	}
	
	public void selectState(String stateName) throws Exception {

        statedrop.click();
        Thread.sleep(500);

        WebElement search = driver.findElement(By.xpath("//input[@class='select2-search__field']"));

        search.sendKeys(stateName);
        Thread.sleep(500);

        driver.findElement(By.xpath("//li[contains(text(), '" + stateName + "')]")).click();
    }
	
	public void billing(String fn, String ln, String add, String cty, String pin, String ph)
	{
		fname.clear();
		fname.sendKeys(fn);
		lname.clear();
		lname.sendKeys(ln);
		address.clear();
		address.sendKeys(add);
		city.clear();
		city.sendKeys(cty);
		pcode.clear();
		pcode.sendKeys(pin);
		phone.clear();
		phone.sendKeys(ph);

//		placeorder.click();
	}
	
	public void terms_order()
	{
		if(!terms.isSelected())
		{
			terms.click();
		}
		placeorder.click();
	}


}
