package LoginBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomer {
public WebDriver driver;

public NewCustomer(WebDriver driver2) {
	this.driver=driver2;
}
   By NewCustomer=By.xpath("//a[contains(text(),'New Customer')]");
    public WebElement NewCustomer(){
	return driver.findElement(NewCustomer);
}
  
  
    
    By username=By.xpath("(//input[@maxlength='25'])[1]");
    public WebElement usensme(){
     return driver.findElement(username);
      }

    By birth=By.xpath("(//input[@type='date'])[1]");
    public WebElement birthdate(){
     return driver.findElement(birth);
      }
    By Address=By.xpath("//textarea[@name='addr']");
    public WebElement address(){
     return driver.findElement(Address);
      }
    By city=By.xpath("//input[@name='city']");
    public WebElement city(){
     return driver.findElement(city);
      }
    By State=By.xpath("//input[@name='state']");
    public WebElement state(){
     return driver.findElement(State);
      }
    By PIN=By.xpath("//input[@name='pinno']");
    public WebElement pin(){
     return driver.findElement(PIN);
      }
    By TELEPHONE=By.xpath("//input[@name='telephoneno']");
    public WebElement TELEPHONE(){
     return driver.findElement(TELEPHONE);
      }
    By Email=By.xpath("//input[@name='emailid']");
    public WebElement Email(){
     return driver.findElement(Email);
      }
    By Submit=By.xpath("//input[@name='sub']");
    public WebElement submit(){
     return driver.findElement(Submit);
      }
    
  
}
