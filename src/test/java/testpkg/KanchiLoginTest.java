package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.KanchiLoginPage;
import utilities.ExcelUtils;

public class KanchiLoginTest extends BaseClass{
	
//	@Test(priority=1)
//	public void loginvalidation()
//	{
//		logobj.login("dorabuji@yopmail.com", "dorabuji123");
//	}
//	
//	
//	@Test(priority=3)
//	public void logincheck()
//	{
//		String expurl="https://kanchivaram.in/";
//		String acturl=logobj.urlvalidation();
//		
//		if(expurl.equals(acturl))
//		{
//			System.out.println("Registration failed");
//		}
//		else
//		{
//			System.out.println("Registration success");
//		}
//
//	}
	
	
	@Test(priority=1)
	public void datadrivenmethod()
	{
		KanchiLoginPage obj=new KanchiLoginPage(driver);
		
		String xl="C:\\Users\\anupr\\Desktop\\Selenium Works\\Kanchi.xlsx";
		String sheet="login";
		int rowcount=ExcelUtils.getRowCount(xl, sheet);
		
		for(int i=1; i<=rowcount; i++)
		{
			String UserName=ExcelUtils.getCellValString(xl, sheet, i, 0);	
			System.out.println("username ----- " + UserName);
			
			String Pwd=ExcelUtils.getCellValString(xl, sheet, i, 1);
			System.out.println("password ----- " + Pwd);
			
			driver.get("https://kanchivaram.in/");
			
			logobj.login(UserName, Pwd);
			
			String expurl="https://kanchivaram.in/";
			String acturl=logobj.urlvalidation();
			
			if(expurl.equals(acturl))
			{
				System.out.println("Login failed");
			}
			else
			{
				System.out.println("Login success");
			}
		}
	}
	
	@Test(priority=2)
	public void login()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int linkcount=li.size();
		
		if(linkcount==30)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		for(WebElement e:li)
		{
			String lin=e.getDomAttribute("href");
			String linktext=e.getText();
			System.out.println(lin + "---" + linktext);
		}
		
		
		System.out.println("No of Links : " + linkcount);

	}

}
