package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;

public class ElementTest extends BaseClass{
	
	@Test(priority = 1)
    public void title() 
 	{
	 	String exptitle = "Semi Silk";
        String acttitle = eleobj.kanchititleverification();

        if (exptitle.equals(acttitle)) {
            System.out.println("title correct");
        } else {
            System.out.println("title not correct");
        }
    }
	
	@Test(priority = 2)
    public void eleshop()
    {
    	eleobj.kshop();
    }

    @Test(priority = 3)
    public void dropk() throws Exception
    {
    	eleobj.kdroplist();
    }

    @Test(priority = 4)
    public void kcart()
    {
    	eleobj.addcart();
    }
    
    @Test(priority=5)
	public void logo()
	{
		eleobj.logomthd();
	}

}
