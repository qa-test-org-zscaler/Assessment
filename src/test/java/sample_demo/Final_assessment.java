//<------------------------  AN ASSIGNMENT MADE BY HIMANSHU SHARMA AND CHETAN CHAUHAN ------------------------------>

package sample_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Final_assessment{
	
	public WebDriver driver;
 	//Login
    @Test
    void test0() {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.quit();
    }
 	
 	//Download Excel file of tasks
    @Test
    void test_download_task_excel_file() throws InterruptedException {
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
    
    
  //Download PDF file
    @Test
    void test_download_task_pdf_file() throws InterruptedException {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.get("http://tms.pisystindia.com/siteengineer/tasks");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		Thread.sleep(6000);
		driver.quit();
    }
    
    //Search task from search bar
    @Test
    void test_search_task() throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.get("http://tms.pisystindia.com/siteengineer/tasks");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("new testing per");
		Thread.sleep(6000);
		driver.quit();
    }
    
  //Update tool details
    
    @Test
    void test_update_tool_details() throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.get("http://tms.pisystindia.com/siteengineer/tools");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("CCMT09T308");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a[1]")).click();
		
		driver.findElement(By.id("tool_no")).clear();
		
		driver.findElement(By.id("tool_no")).sendKeys("Himanshu");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tool_description")).clear();
		
		driver.findElement(By.id("tool_description")).sendKeys("Himanshu and Chetan's tool");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[7]/button")).click();
		
		Thread.sleep(6000);
		
		driver.quit();
    }
    
  //Add new tool
    
    @Test
    void test_add_new_tool_details() throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.get("http://tms.pisystindia.com/siteengineer/tools");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		driver.findElement(By.id("tool_no")).sendKeys("T1");
		driver.findElement(By.id("tool_name")).sendKeys("Himanshu and Chetan Tool");
		driver.findElement(By.id("tool_make")).sendKeys("Made by Himanshu and Chetan");
		driver.findElement(By.id("tool_description")).sendKeys("Himanshu and Chetan's Tool");
		driver.findElement(By.id("other")).sendKeys("None");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[7]/button")).click();
		
		driver.quit();
    }
    
    
//Add new machine and check if it is added by searching it on the search bar
    
    @Test
    void test_add_new_machine() throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.get("http://tms.pisystindia.com/siteengineer/machine");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		
		driver.findElement(By.id("machine_name")).sendKeys("Himanshu and Chetan's machine");
		driver.findElement(By.id("machine_no")).sendKeys("111");
		driver.findElement(By.id("machine_description")).sendKeys("Himanshu and Chetan's Machine");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Himanshu and Chetan's machine");
		Thread.sleep(3000);
		driver.quit();
		
    }
    
    
  //Download Excel file of logs
    
    @Test
    void test_download_log_excel()  throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.get("http://tms.pisystindia.com/siteengineer/logs/Siteengineerlogs");
		
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(3000);
		
		driver.quit();
    }
    
  //Download pdf file of tasks
 
    @Test
    void test_download_log_pdf()  throws InterruptedException{
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.get("http://tms.pisystindia.com/siteengineer/logs/Siteengineerlogs");
		
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		Thread.sleep(3000);
		
		driver.quit();
    }
    
    
    @Test
    void test_add_component() throws InterruptedException{    
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("http://tms.pisystindia.com/siteengineer/login");
		         
		  driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		         
		  driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		         
		  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		  Thread.sleep(3000);      
		    
		  driver.get("http://tms.pisystindia.com/siteengineer/component");
		                
		  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		  
		  driver.findElement(By.id("component_name")).sendKeys("Himanshu and Chetan");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("component_code")).sendKeys("HC22");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("component_material")).sendKeys("Himanshu and Chetan");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("component_description")).sendKeys("Chetan and Himanshu");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")).click();
		
		  Thread.sleep(3000);
		                 
		  driver.quit();
      }
 
 
  //select the number of entries displayed to 100
    
    @Test
    void test_show_entries()  throws InterruptedException {
        // Exercise
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("http://tms.pisystindia.com/siteengineer/login");
		driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
		driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.get("http://tms.pisystindia.com/siteengineer/tasks");	
		
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"example_length\"]/label/select")));
		se.selectByIndex(3);
		
		Thread.sleep(3000);
		
		driver.quit();
    }
    
}
