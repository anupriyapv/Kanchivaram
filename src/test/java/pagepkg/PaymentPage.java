package pagepkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body")WebElement sscreen;
	
	public PaymentPage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void kanchiscreenshot() throws Exception
    {
    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File s1=sscreen.getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(s1, new File("./Screenshots/kanchipay.png"));
    	System.out.println("Screenshot saved successfully");
    }

}
