package week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ragavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajaram");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ragavi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a software tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rag199720@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTestleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ragavi");
		driver.findElement(By.linkText("Create Lead")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		

}
}

