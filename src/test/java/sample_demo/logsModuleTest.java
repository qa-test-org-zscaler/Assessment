package sample_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logsModuleTest{

	 WebDriver driver;
	 
	 	@BeforeClass
	    static void setupClass() {
	        WebDriverManager.firefoxdriver().setup();
	    }

	    @BeforeMethod
	    void setupTest() {
	        driver = new FirefoxDriver();
	    }

	    @AfterMethod
	    void teardown() {
	        driver.quit();
	    }

	    @Test(priority = -2)
	    void loginTest() throws InterruptedException { 
                        Login();
                        Login2();
	    }
	    
	    
	    public void Login() throws InterruptedException{
	    	
	    	driver.get("https://tms.pisystindia.com/admin/");
	        Thread.sleep(3000); 
	        driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
	        driver.findElement(By.id("admin_password")).sendKeys("123456");
	        driver.findElement(By.className("btn")).click();
	        Thread.sleep(3000); 
	    }
	    public void Login2() throws InterruptedException{
	    	driver.get("http://tms.pisystindia.com/siteengineer/login");
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
	    	driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
	    	driver.findElement(By.className("btn")).click();
	    	
	    }
	    @Test
	    void logs_checking() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("logs_checking")).click();
	    	Thread.sleep(3000);
	    	 Select dropdown= new Select(driver.findElement(By.id("enquiry")));
	    	 dropdown.selectByValue("Admin Logs");
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("Procurement Member Logs");
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("Site Engineer Logs");
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("Client Logs");
	  	   Thread.sleep(6000);
	    }
	    
	    @Test
	    void logs_checking_view() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("logs_checking_view")).click();
	    	Thread.sleep(3000);
	    	 Select dropdown= new Select(driver.findElement(By.id("enquiry")));
	    	 dropdown.selectByValue("3");
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-05-01';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-05-30';");  
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 driver.findElement(By.linkText("Click To View Enquiry Details")).click();
	    	 Thread.sleep(3000);
	    	driver.findElement(By.className("close")).click();
	    	
	    	Thread.sleep(6000);
	    }
	    @Test
	    void Download_logs() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("Download Logs")).click();
	    	Thread.sleep(3000);
	    	 Select dropdown= new Select(driver.findElement(By.id("enquiry")));
	    	 dropdown.selectByValue("3");
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-05-01';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-05-30';");  
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("buttons-pdf")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("buttons-excel")).click();
	    	 Thread.sleep(6000);
	    }

}
