import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    public String baseUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    String driverPath = "../chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching Chrome Browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(baseUrl);
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
  try {

		Thread.sleep(10000);
  }catch (InterruptedException e) {
	    e.printStackTrace();
	}
				
		driver.findElement(By.xpath("//table[@class='F cf zt']//tbody//child::tr[1]//child::td[@tabindex='-1']")).click();
		
      driver.close();
  }
}
