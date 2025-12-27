 package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.KanchiLoginPage;

public class KanchiRegTest extends BaseClass{
	
	@Test(priority=1)
	public void loginvalidation()
	{
		regobj.reg("dora@gmail.com");
	}
	
	
	@Test(priority=2)
	public void logincheck()
	{
		String expurl="https://kanchivaram.in/";
		String acturl=regobj.urlvalidation();
		
		if(expurl.equals(acturl))
		{
			System.out.println("Registration failed");
		}
		else
		{
			System.out.println("Registration success");
		}

	}
	
	
	
	

}
