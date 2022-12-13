package TestCasesLogin;

import java.io.IOException;

import org.testng.annotations.Test;

import LoginBanking.LoginPage;
import Resources.BaseClass;

public class TestcaseForLogin extends BaseClass{
    @Test
	public void Login() throws IOException, InterruptedException {
		
    	//browserlaunch();	
    	 
		//driver.get("https://demo.guru99.com/V1/index.php");
	  //driver.get(prop.getProperty("url"));	
		 
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.id().sendKeys("mngr460016");                                                                                                                                                                                                                                                                                           
		 lp.password().sendKeys("ahedetA");
		 lp.Login().click();
		
		 
		 
		 
		 
	}

}
