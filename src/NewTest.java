import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;
 @Test
public class NewTest {
    public String baseUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    String driverPath = "chromedriver";
    public WebDriver driver ; 
     
 
       
      System.out.println("launching Chrome Browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
	  System.out.println("1");
	public ChromeOptions options = new ChromeOptions();
	  System.out.println("2");
	  options.addArgument("--headless");
	  System.out.println("3");
      driver = new ChromeDriver(options);
	  System.out.println("4");
      driver.manage().window().maximize();
	  System.out.println("launching Chrome Browser");
      driver.get(baseUrl);
	  System.out.println("Enter Username");
      try {
        Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("sudheer.velagapudi@testingxperts.com");
      }catch (InterruptedException e) {
    	    e.printStackTrace();
    	}
      try {

      Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
      }catch (InterruptedException e) {
  	    e.printStackTrace();
  	}
	  System.out.println("Enter Password");
      try {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).click();
  }catch (InterruptedException e) {
	    e.printStackTrace();
	}
      try {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Damco@123");
      }catch (InterruptedException e) {
  	    e.printStackTrace();
  	}
      try {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
  }catch (InterruptedException e) {
	    e.printStackTrace();
	}
	  System.out.println("Loggged in Sucessfully");
  try {

		Thread.sleep(10000);
  }catch (InterruptedException e) {
	    e.printStackTrace();
	}
				
		driver.findElement(By.xpath("//table[@class='F cf zt']//tbody//child::tr[1]//child::td[@tabindex='-1']")).click();
		
      driver.close();
 
}
