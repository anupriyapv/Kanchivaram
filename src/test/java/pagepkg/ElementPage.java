package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"menu-item-6447\"]/a")
    WebElement shop;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div/form/select")
    WebElement kdrop;	
	
	@FindBy(xpath = "//*[@id=\"block-40\"]/div/ul/li[2]/a/span")
    WebElement semisilk;	

    @FindBy(xpath = "//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img")
    WebElement brocade;

    @FindBy(xpath = "//*[@id=\"product-6825\"]/div[2]/form/button")
    WebElement addcart;	

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/a")
    WebElement viewcart;
    
    public ElementPage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String kanchititleverification() 
    {
        return driver.getTitle();
    }
    
    public void kshop()
    {
    	shop.click();
    }

    public void kdroplist() throws Exception
    {
//    	System.out.println(driver.getCurrentUrl());
//    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//    	wait.until(ExpectedConditions.elementToBeClickable(kdrop)); 	
//    	((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);", kdrop);
//    	Thread.sleep(500);
        Select droplist = new Select(kdrop);
        droplist.selectByValue("price-desc");
    }

    public void addcart()
    {
    	semisilk.click();
    	brocade.click();
    	addcart.click();    
    	viewcart.click();
    }
    
    public void logomthd()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[1]/div/div/span/a/img"));
		boolean a=logo.isDisplayed();
		System.out.println("Logo is displayed " + a);
	}

}
