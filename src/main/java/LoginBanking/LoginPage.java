package LoginBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver2) {
	 this.driver=driver2;
}
   By UserID=By.xpath("//input[@type='text']");
  

public WebElement id(){
	  return driver.findElement(UserID);
  }
  
   By Password=By.xpath("//input[@type='password']");
   public WebElement password(){
	  return driver.findElement(Password);
   }
   By Login=By.xpath("//input[@type='submit']");
   public WebElement Login(){
	  return driver.findElement(Login);
   }
	
   
   
   
}
