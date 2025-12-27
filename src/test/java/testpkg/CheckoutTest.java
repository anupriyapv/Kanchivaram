package testpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import basepkg.BaseClass;

public class CheckoutTest extends BaseClass{
	
	@Test(priority = 1)
    public void entercoupon()
    {
        cktobj.entercoupon();
    }
	
	@Test(priority = 3)
    public void bill() throws Exception
    {
    	cktobj.billing("Dora", "Buji", "Wonderla", "Disney", "98765", "9080706050");
    	cktobj.selectCountry("Germany");
    	cktobj.selectState("Berlin");
    }

	@Test(priority = 2)
    public void coupon() throws Exception 
    {
        cktobj.coupon("OFFER10");
    }
	
	@Test(priority = 4)
    public void termsorder()
    {
        cktobj.terms_order();
    }

}
