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
    
	//COMPONENT MODULE
    
    @Test
    void downloadPdfFromComponent() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		driver.quit();
   }
    
    
    @Test
    void downloadExcelFromComponent() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
		driver.quit();
    }
	
  @Test
  void addComponent() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		driver.findElement(By.id("component_name")).sendKeys("Bhaskar Singh Bisht");
		driver.findElement(By.id("component_code")).sendKeys("14");
		driver.findElement(By.id("component_material")).sendKeys("ppp");
		driver.findElement(By.id("component_description")).sendKeys("Description");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")).click();
		driver.quit();
  }
	
	
  @Test
  void updateComponent() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[8]/a")).click();
		driver.findElement(By.id("component_name")).clear();
		driver.findElement(By.id("component_name")).sendKeys("Bhaskar Singh Bisht Updated");
		driver.findElement(By.id("component_code")).clear();
		driver.findElement(By.id("component_code")).sendKeys("14");
		driver.findElement(By.id("component_material")).clear();
		driver.findElement(By.id("component_material")).sendKeys("ppp");
		driver.findElement(By.id("component_description")).sendKeys("Description");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button\r\n")).click();
		driver.quit();
  }
	
	
	
  
	@Test
	void goToNextPage()
	{

  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
	}
	
	@Test
	void goToPreviousPage()
	{

  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/component");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_previous\"]")).click();
		driver.quit();
	}
	
	
	
	//MACHINES MODULE
	
	
	@Test
void allocateOperationToMachine()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		Select drpdown = new Select( driver.findElement(By.id("machine_id")));
		drpdown.selectByIndex(6);
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"postme1\"]")).click();
		driver.quit();
	}

	    
	    @Test
	    void downloadPdfFromMachine() {
	    	WebDriverManager.firefoxdriver().setup();
	 		driver = new FirefoxDriver();
	        driver.get("https://tms.pisystindia.com/admin/login");
			driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
			driver.findElement(By.id("admin_password")).sendKeys("123456");
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
			driver.get("https://tms.pisystindia.com/admin/machine");	
			driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
			driver.quit();
	   }
	    
	    
	    @Test
	    void downloadExcelFromMachine() {
	    	WebDriverManager.firefoxdriver().setup();
	 		driver = new FirefoxDriver();
	        driver.get("https://tms.pisystindia.com/admin/login");
			driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
			driver.findElement(By.id("admin_password")).sendKeys("123456");
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
			driver.get("https://tms.pisystindia.com/admin/machine");	
			driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
			driver.quit();
	    }
    
//	
  @Test
  void addMachine() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
		driver.findElement(By.id("machine_name")).sendKeys("Bhaskar Singh Bisht");
		driver.findElement(By.id("machine_no")).sendKeys("143");
		driver.findElement(By.id("machine_description")).sendKeys("ppp");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")).click();
		
  }
	
	
	
  @Test
  void updateMachine() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[7]/a")).click();
		driver.findElement(By.id("machine_name")).clear();
		driver.findElement(By.id("machine_name")).sendKeys("Bhaskar Singh Bisht");
		driver.findElement(By.id("machine_no")).clear();
		driver.findElement(By.id("machine_no")).sendKeys("144");
		driver.findElement(By.id("machine_description")).clear();
		driver.findElement(By.id("machine_description")).sendKeys("ppp");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")).click();	
  }
	
	
	@Test
	void goToNextPageMachine()
	{

  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
	}
	
	@Test
void goToPreviousPageMachine()
	{
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_previous\"]")).click();
		driver.quit();
	}
	
	@Test
void viewOperationAlloted()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
		driver.quit();
	}
	
	@Test
void downloadPdfviewOperationAlloted()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
	}
	
	@Test
	void downloadExcelviewOperationAlloted()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/machine");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
	}


	
	
	
	
	
	
	// OPERATION MODULE
	
	@Test
void allocateToolsToOperation()
{
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.get("https://tms.pisystindia.com/admin/login");
driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
driver.findElement(By.id("admin_password")).sendKeys("123456");
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
driver.get("https://tms.pisystindia.com/admin/operations");	
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
Select drpdown = new Select( driver.findElement(By.id("operation_id")));
drpdown.selectByIndex(2);
driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
driver.findElement(By.xpath("//*[@id=\"op_sequence\"]")).sendKeys("4");
driver.findElement(By.xpath("//*[@id=\"postme1\"]")).click();
}
	
    @Test
    void downloadPdfFromOperations() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();
		
   }
    
    
    @Test
    void downloadExcelFromOperations() {
    	WebDriverManager.firefoxdriver().setup();
 		driver = new FirefoxDriver();
        driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();
		
    }
	
	
  @Test
  void addOperation() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
		driver.findElement(By.id("operation_name")).sendKeys("BB Operation");
		driver.findElement(By.id("operation_code")).sendKeys("14");
		driver.findElement(By.id("operation_description")).sendKeys("ppp");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")).click();	
  }
	
	
  @Test
  void updateOperation() {
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("  /html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/a\r\n")).click();
		driver.findElement(By.id("operation_name")).clear();

		driver.findElement(By.id("operation_name")).sendKeys("BB Operation Updated");
		driver.findElement(By.id("operation_code")).clear();
		driver.findElement(By.id("operation_code")).sendKeys("14");
		driver.findElement(By.id("operation_description")).clear();
		driver.findElement(By.id("operation_description")).sendKeys("ppp");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")).click();	
  }
	
	@Test
	void goToNextPageOperation()
	{

  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
		driver.quit();
	}
	
	@Test
void goToPreviousPageOperation()
	{
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("//*[@id=\"example_next\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_previous\"]")).click();
		driver.quit();
	}
	
			@Test
	void viewToolsAlloted()
	{
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
	}
			
			@Test
	void downloadToolsAllotedPDF()
	{
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[3]")).click();

	}
			
			@Test
	void downloadToolsAllotedExcel()
	{
  	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
      driver.get("https://tms.pisystindia.com/admin/login");
		driver.findElement(By.id("admin_email")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.id("admin_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		driver.get("https://tms.pisystindia.com/admin/operations");	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[1]/div[1]/div[2]/button[2]")).click();

	}
			
			
}
