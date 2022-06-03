import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MembersTesting {
    	ChromeOptions options = new ChromeOptions();
    	WebDriver web;
     	@BeforeTest
      	public void beforeTest() {
         System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
         
         web = new ChromeDriver();
          web.get("https://tms.pisystindia.com/admin/login");
          
          web.manage().window().maximize();
          
          
      	}
	//Add new task testing
	@Test
    	void test_create_task() throws InterruptedException{
    	WebDriverManager.firefoxdriver().setup();
 	driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/admin/tasks/");
	driver.findElement(By.id("title")).sendKeys("testing");
	driver.findElement(By.id("description")).sendKeys("Testing tasks framework for final assessment");
	driver.findElement(By.id("start_date")).sendKeys("3-06-2022");
	driver.findElement(By.id("start_date")).sendKeys("5-06-2022");
	Thread.sleep(3000);
	driver.get("http://tms.pisystindia.com/admin/tasks");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[5]/button")).click();
	Thread.sleep(6000);
	driver.quit();
        }
	//Update task testing
	@Test
    	void test_create_task() throws InterruptedException{
    	WebDriverManager.firefoxdriver().setup();
 	driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/admin/tasks/");
	driver.findElement(By.id("title")).sendKeys("testing");
	driver.findElement(By.id("description")).sendKeys("Testing tasks framework for final assessment");
	driver.findElement(By.id("start_date")).sendKeys("3-06-2022");
	driver.findElement(By.id("start_date")).sendKeys("5-06-2022");
	Thread.sleep(3000);
	driver.get("http://tms.pisystindia.com/admin/tasks");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[5]/button")).click();
	Thread.sleep(6000);
	driver.quit();
        }
	//Check pagination next button 
	@Test
    	void test_create_task() throws InterruptedException{
    	WebDriverManager.firefoxdriver().setup();
 	driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/admin/tasks/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[9]/div/div/div/button")).click();
	Thread.sleep(6000);
	driver.quit();
        }
	//Check PDF button
        @Test
        void test_create_task() throws InterruptedException{
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/admin/tasks/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[8]/div/div/div[1]/div[2]/button")).click();
        Thread.sleep(6000);
        driver.quit();
        }
	//excel downlod test
	@Test
    	void download_task_excel_test() throws InterruptedException {
    	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
	driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
	driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
	driver.quit();
    
	}







  }

