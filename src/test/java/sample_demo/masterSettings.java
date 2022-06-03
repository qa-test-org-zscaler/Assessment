/*
 * Created by:
 * Kritika Mittal (kmittal@zscaler.com)
 * Aashima Mehta (aashima.mehta@zscaler.com)
 */

package sample_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class masterSettings {

	WebDriver driver;
 	//Login
    @BeforeMethod
    void login() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kritika Mittal\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
        driver = new ChromeDriver();	
        driver.get("https://tms.pisystindia.com/admin/tasks");
		driver.manage().window().maximize();
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[12]/a")).click();
		Thread.sleep(3000);
    }
 	
 	//Download Excel file of tasks
    @Test
    void test_download_task_excel_file() throws InterruptedException {
    	driver.findElement(By.xpath("//button[@class='btn btn-secondary buttons-excel buttons-html5']")).click();
		Thread.sleep(5000);
		driver.quit();
    }
    
    
  //Download PDF file
    @Test
    void test_download_task_pdf_file() throws InterruptedException {
    	driver.findElement(By.xpath("//button[@class='btn btn-secondary buttons-pdf buttons-html5']")).click();
		Thread.sleep(5000);
		driver.quit();
    }
    
    //Search task from search bar
    @Test
    void test_search_task() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='example_filter']//label//input")).sendKeys("Tool Management System");
		Thread.sleep(6000);
		driver.quit();
    }
    
  //Update tool details
    
    @Test
    void test_update_tool_details() throws InterruptedException{
		
    	driver.findElement(By.xpath("//table[@id='example']//tbody//tr[1]//a[@class='fa-solid fa-pen-to-square text-blue']")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//*[@id='delay_place_order']")).clear();
		driver.findElement(By.xpath("//*[@id='delay_place_order']")).sendKeys("4");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='order_booking_delay']")).clear();
		driver.findElement(By.xpath("//*[@id='order_booking_delay']")).sendKeys("3");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='delay_shipment_manufacturing']")).clear();
		driver.findElement(By.xpath("//*[@id='delay_shipment_manufacturing']")).sendKeys("4");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='delay_courier']")).clear();
		driver.findElement(By.xpath("//*[@id='delay_courier']")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-outline-danger float-right']")).click();
		Thread.sleep(5000);
		
		driver.quit();
    }

}
