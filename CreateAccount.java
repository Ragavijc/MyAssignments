package week2assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Ragavi");
		driver.findElement(By.id("officeSiteName")).sendKeys("ohio");	
		driver.findElement(By.name("annualRevenue")).sendKeys("10,000,000");
		WebElement tool=driver.findElement(By.name("industryEnumId"));
		Select drop= new Select(tool);
		drop.selectByIndex(3);
		WebElement tool2 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2=new Select(tool2);
		drop2.selectByVisibleText("S-Corporation");
		WebElement tool3 = driver.findElement(By.id("dataSourceId"));
		Select drop3=new Select(tool3);
		drop3.selectByValue("LEAD_EMPLOYEE");
		WebElement tool4 = driver.findElement(By.id("marketingCampaignId"));
		Select drop4= new Select(tool4);
		drop4.selectByIndex(6);
		WebElement tool5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5= new Select(tool5);
		drop5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
	}
	


}

