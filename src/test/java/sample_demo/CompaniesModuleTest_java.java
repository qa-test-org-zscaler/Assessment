/*  User: Ankit Punia, Rohan Bhardwaj, Kardam Pandey
 *  Date: 03/06/2022
 *  File Name : CompaniesModuleTest.java
 * */

package sample_demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class CompaniesModuleTest {
	WebDriver driver;
	
	@BeforeClass
	private final void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void login() throws InterruptedException {
		driver.get("http://tms.pisystindia.com/admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sales.infinitycorp@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	/*
	 * Client Companies Test 
	 * Created By - Ankit Punia
	 */
	
	@Test
	public void downloadExcelFileTestInClientCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Client Companies')]")).click();
		driver.findElement(By.xpath("//button[contains(., 'Excel')]")).click();
	}
	
	@Test
	public void downloadPdfFileTestInClientCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Client Companies')]")).click();
		driver.findElement(By.xpath("//button[contains(., 'PDF')]")).click();
	}
	
	@Test
	public void searchInClientCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Client Companies')]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Test");
	}
	
	@Test
	public void addClientCompanyTest() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Client Companies')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add Client Company')]")).click();
		driver.findElement(By.id("client_company_name")).sendKeys("Test Company");
		driver.findElement(By.id("client_company_contact")).sendKeys("1234567891");
		driver.findElement(By.id("client_company_email")).sendKeys("test_company@gmail.com");
		driver.findElement(By.id("client_company_address")).sendKeys("Test Address");
		driver.findElement(By.id("client_gst_number")).sendKeys("GST890956789345");
		driver.findElement(By.id("client_personof_contact")).sendKeys("Test Person of Contact");
		driver.findElement(By.id("client_department")).sendKeys("Test Dept");
		driver.findElement(By.id("client_company_password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}
	
	/*
	 * All Vendor Companies Test
	 * Created By - Rohan Bhardwaj
	 */
	
	@Test
	public void downloadExcelFileTestInVendorCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.findElement(By.xpath("//a[contains(., 'Vendor Companies ')]")).click();
		driver.findElement(By.xpath("//button[contains(., 'Excel')]")).click();
	}
	
	@Test
	public void downloadPdfFileTestInVendorCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//button[contains(., 'PDF')]")).click();
	}
	
	@Test
	public void searchInVendorCompanies() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Harry Potter");
	}
	
	@Test
	public void addVendorCompanyTest() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//a[contains(.,'Add Vendor Company')]")).click();
		driver.findElement(By.id("client_company_name")).sendKeys("Test Vendor Company");
		driver.findElement(By.id("client_company_contact")).sendKeys("1234567891");
		driver.findElement(By.id("client_company_email")).sendKeys("test_vendor_company@gmail.com");
		driver.findElement(By.id("client_company_address")).sendKeys("Test Vendor Address");
		driver.findElement(By.id("client_gst_number")).sendKeys("GST890956789345");
		driver.findElement(By.id("client_personof_contact")).sendKeys("vendor person");
		driver.findElement(By.id("client_department")).sendKeys("Test vendor Dept");
		driver.findElement(By.id("client_company_password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}
	
	
	@Test
	public void viewToolsAllocated() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//a[contains(., 'View Tools Allocated')]")).click();
	}
	
	@Test
	public void searchInToolsAllocated() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//a[contains(., 'View Tools Allocated')]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Drill");
	}
	
	@Test
	public void allocateToolToCompany() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/vendorcompanies");
		driver.findElement(By.xpath("//a[contains(., 'View Tools Allocated')]")).click();
		driver.findElement(By.xpath("//a[contains(., 'Allocate tool to company')]")).click();
		Select dropDown = new Select(driver.findElement(By.id("company_id")));
		dropDown.selectByIndex(4);
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='2']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='8']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Allocate')]")).click();
	}
	
	/*
	 * Shifts Test
	 * Created By - Kardam Pandey
	 */
	
	@Test
	public void downloadExcelFileTestInShifts() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/shift");
		driver.findElement(By.xpath("//button[contains(., 'Excel')]")).click();
	}
	
	@Test
	public void downloadPdfFileTestInShifts() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/shift");
		driver.findElement(By.xpath("//button[contains(., 'PDF')]")).click();
	}
	
	@Test
	public void searchInShiftsTest() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/shift");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("night shift");
	}
	
	
	@Test
	public void addShiftTest() throws InterruptedException {
		login();
		driver.findElement(By.xpath("//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")).click();
		driver.get("https://tms.pisystindia.com/admin/shift");
		driver.findElement(By.xpath("//a[contains(., 'Add Shift')]")).click();
		driver.findElement(By.id("shift_name")).sendKeys("Test Shift");
		driver.findElement(By.id("start_time")).sendKeys("0900");
		driver.findElement(By.id("end_time")).sendKeys("1800");
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}
}
