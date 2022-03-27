package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roshima");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rosh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Senior Analyst");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("r@gmail.com");
		
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(ele);
		sel.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement cmp = driver.findElement(By.id("createLeadForm_companyName"));
		cmp.clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tcs");
		WebElement frst=driver.findElement(By.id("createLeadForm_firstName"));
		frst.clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rr");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("Title of the webpage:"+title);
	}

}
