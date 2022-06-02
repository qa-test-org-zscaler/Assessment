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

public class demo {

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
	    public void put_date() throws InterruptedException{
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-05-01';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-05-30';");  
	    }
	    public void Login2() throws InterruptedException{
	    	driver.get("http://tms.pisystindia.com/siteengineer/login");
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("siteengineer_email")).sendKeys("siteengineer@gmail.com");
	    	driver.findElement(By.id("siteengineer_password")).sendKeys("123456");
	    	driver.findElement(By.className("btn")).click();
	    	
	    }
	    @Test
	    void cpc_analysis_enquiry() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("CPC Analysis")).click();
	    	Thread.sleep(3000);
	    	 Select dropdown= new Select(driver.findElement(By.id("enquiry")));
	    	 dropdown.selectByValue("2");
	    	 put_date();
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("3");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("4");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("5");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("6");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("6");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("7");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("8");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("9");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 dropdown.selectByValue("10");
	    	 put_date();
	  	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	  	   Thread.sleep(6000);
	    }
	    
	    @Test
	    void cpc_analysis_view_enquiry() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("CPC Analysis")).click();
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
	    void Download_jpeg() throws InterruptedException{
	    	Login();
	    	driver.findElement(By.linkText("CPC Analysis")).click();
	    	Thread.sleep(3000);
	    	 Select dropdown= new Select(driver.findElement(By.id("enquiry")));
	    	 dropdown.selectByValue("3");
	    	JavascriptExecutor jsex = (JavascriptExecutor) driver;
	    	jsex.executeScript("document.getElementById('start_date').value = '2022-05-01';");	    	
	    	jsex.executeScript("document.getElementById('end_date').value = '2022-05-30';");  
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[4]/div/button")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-ToolNameVsToolQuantity")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-ToolNameVsToolPrice")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-EnquiriesTools")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-EnquiriesPrice")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-EnquiriesComponents")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-PieChartToolQuantity")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.id("download-PieChartToolPrice")).click();
	    	 Thread.sleep(6000);
	    }
	    
	    @Test
	    void site_engineering_excelandpdf() throws InterruptedException{
	    Login2();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Components"));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
	    Thread.sleep(6000);
	    }
	    
	    @Test(priority = -1)
	    void site_engineering_addcomponent() throws InterruptedException{
	    Login2();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[5]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("component_name")).sendKeys("demo");
	    Thread.sleep(3000);
	    driver.findElement(By.id("component_code")).sendKeys("12345");
	    Thread.sleep(3000);
	    driver.findElement(By.id("component_material")).sendKeys("raw");
	    Thread.sleep(3000);
	    driver.findElement(By.id("component_description")).sendKeys("raw");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")).click();
	    
	    Thread.sleep(6000);
	    }
	    
	    

}
