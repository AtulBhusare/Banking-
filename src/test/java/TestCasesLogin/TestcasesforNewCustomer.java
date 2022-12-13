package TestCasesLogin;

import java.io.IOException;

import org.testng.annotations.Test;

import LoginBanking.LoginPage;
import LoginBanking.NewCustomer;
import Resources.BaseClass;

public class TestcasesforNewCustomer  extends BaseClass{
    @Test
	public void customer() throws IOException, InterruptedException {
		//browserlaunch();
	 //	driver.get("https://demo.guru99.com/V1/index.php");
		
		 LoginPage lp=new LoginPage(driver);
		 lp.id().sendKeys("mngr460016");
		 lp.password().sendKeys("ahedetA");
		 lp.Login().click();
		 Thread.sleep(5000);
		NewCustomer nw=new NewCustomer(driver);
		nw.NewCustomer().click();
		 Thread.sleep(5200);
		 
		
		nw.birthdate().sendKeys("11111111");
		nw.address().sendKeys("Professional Gamer Colony, Dubai");
		nw.city().sendKeys("SOLAPUR");
		nw.state().sendKeys("MAHARASTRA");
		nw.pin().sendKeys("123456");
		nw.TELEPHONE().sendKeys("12346789");
		nw.Email().sendKeys("alpha@213gmail.com");
		nw.usensme().sendKeys("Alpha Clasher");
		nw.submit().click();
		
		
 	}
	 
}
