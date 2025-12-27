package pagepkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[5]/div/input")
    WebElement quantity;
    
    @FindBy(xpath = "//*[@id=\"post-598\"]/div/div/form/table/tbody/tr[2]/td/button")
    WebElement updatecart;

    @FindBy(id = "coupon_code")
    WebElement couponcode;
    
    @FindBy(xpath = "//*[@id=\"post-598\"]/div/div/form/table/tbody/tr[2]/td/div/button")
    WebElement applycoupon;	

    @FindBy(xpath = "//*[@id=\"post-598\"]/div/div/div[2]/div/div/a")
    WebElement checkout;	
    

//    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]")
//    WebElement sscreen;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cart(String qty) {
    	quantity.clear();
        quantity.sendKeys(qty);
        updatecart.click();
    }
    
    public void coupon(String ccode) throws Exception
    {
    	Thread.sleep(3000);
    	couponcode.sendKeys(ccode);
        applycoupon.click();
    }
    
    public void chkout()
    {
        checkout.click();
    }
    
//    public void swagscreenshot() throws Exception
//    {
//    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    	File s1=sscreen.getScreenshotAs(OutputType.FILE);
//    	FileHandler.copy(s1, new File("./Screenshots/swag.png"));
//    	System.out.println("Screenshot saved successfully");
//    }

}
