package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KanchiLoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu-item-6701\"]/a")WebElement account;
	@FindBy(xpath="//*[@id=\"username\"]")WebElement uname;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")WebElement login;


	
	public KanchiLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	

	public void login(String un, String pwd)
	{
		account.click();
		uname.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
	}
	
	public String urlvalidation()
	{
		return driver.getCurrentUrl();
	}

}
