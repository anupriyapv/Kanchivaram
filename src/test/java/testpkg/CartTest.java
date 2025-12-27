package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class CartTest extends BaseClass{

    @Test(priority = 1)
    public void cart() 
    {
    	cartobj.cart("2");
    }
    
    @Test(priority = 2)
    public void coupon() throws Exception 
    {
        cartobj.coupon("OFFER10");
    }
    
    @Test(priority = 3)
    public void checkout() 
    {
        cartobj.chkout();
    }

//    @Test(priority = 4)
//    public void screenshot() throws Exception
//    {
//    	cartobj.swagscreenshot();
//    }

}
