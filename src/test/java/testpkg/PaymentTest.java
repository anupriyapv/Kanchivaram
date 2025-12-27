package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class PaymentTest extends BaseClass{
	
	@Test()
    public void screenshot() throws Exception
    {
    	payobj.kanchiscreenshot();
    }

}
