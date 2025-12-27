package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KanchiRegPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu-item-6701\"]/a")WebElement account;
	@FindBy(xpath="//*[@id=\"reg_email\"]")WebElement regemail;
//	@FindBy(xpath="//*[@id=\"create_customer\"]/div[1]/input")WebElement fname;
//	@FindBy(xpath="//*[@id=\"create_customer\"]/div[2]/input")WebElement lname;
//	@FindBy(xpath="//*[@id=\"create_customer\"]/div[3]/input")WebElement email;
//	@FindBy(xpath="//*[@id=\"create_customer\"]/div[4]/input")WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[3]/button")WebElement submit;


	
	public KanchiRegPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	

	public void reg(String em)
	{
		account.click();		
		regemail.sendKeys(em);
//		fname.sendKeys(fn);
//		lname.sendKeys(ln);
//		email.sendKeys(em);
//		password.sendKeys(pwd);
		submit.click();
	}
	
	public String urlvalidation()
	{
		return driver.getCurrentUrl();
	}

}
