package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
   public void browserlaunch() throws IOException {
	
   FileInputStream fis=new FileInputStream("C:\\Users\\Divya\\eclipse-workspace\\PersonelProject\\src\\main\\java\\Resources\\data.properties");
   prop=new Properties();
   
   prop.load(fis);
   
   String browsername=prop.getProperty("browser");
   
   if (browsername.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver(); 
	   
   }
 else if (browsername.equalsIgnoreCase("Firefox")) {
	   
   }
   else {
	   System.out.println("Please select browser");
   } }
    @BeforeMethod
    public void Alpha() throws IOException {
	  browserlaunch();
	  driver.get(prop.getProperty("url"));
}
    
      
}  

