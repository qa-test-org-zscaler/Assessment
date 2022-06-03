package sample_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class componentUtility {
	public WebDriver driver;

	@Test   
    void loginIntoDashboard() //Login into the Dashboard
    {
  
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
    }
    
    
    // Email Promotion
    
    //Downloading Pdf from Email Promotion List
    @Test
    void downloadPdfFromPromotionEmailList() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[9]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		driver.quit();
   }
    
  //Downloading Excel from Email Promotion List
    @Test
     void downloadexcelFromPromotionEmailList() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[9]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
		driver.quit();
   }
    //Sending Email to user
    @Test
    void sendingEmailToUser() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[9]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		driver.findElement(By.id("subject")).sendKeys("Testing Assessment");
		driver.findElement(By.id("subject")).sendKeys("This Email Confirms that your testing is successful");
		driver.findElement(By.id("select_member_type")).click();
		driver.findElement(By.xpath("//*[@id=\"select_member_type\"]/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/div[3]")).click();
		driver.quit();
    }
    
    
    // Going to the next page of entries
    @Test
    void nextPage() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[9]")).click();
		dirver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
		driver.quit();
    }
    
    
    
    // Going to previous page 	
    @Test
    void prevPage() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[9]")).click();
		dirver.findElement(By.xpath("//*[@id=\"example_previous\"]")).click();
		driver.quit();
    }

    
    
    
    // Going back to Dashboard
    @Test
    void goingBackToDashboard(){
   	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
       driver.get("https://tms.pisystindia.com/admin/dashboard");
    }
    
}   
    
    
    
    
    
    
    
    
