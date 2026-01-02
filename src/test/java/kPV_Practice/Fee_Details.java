package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fee_Details {

	public static void main(String[] args)
	{
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://infozit.kapilvidya.com/auth/login/");
		WebElement email = d.findElement(By.cssSelector("#email"));
		email.sendKeys("info@kapilvidya.com");

		WebElement password = d.findElement(By.cssSelector("#password-input"));
		password.sendKeys("Kapil@123");

		WebElement Login = d
				.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div/div/div[2]/form/div[4]/button"));
		Login.click();
		
		WebElement LrnrMgmt = d.findElement(By.cssSelector("a[data-bs-target='#student'] span"));
		LrnrMgmt.click();
		
		WebElement feedetails =  d.findElement(By.cssSelector("a[href=\"/student/feedetails/list?search=&page=1&pageSize=10\"]"));
		feedetails.click();
		
		WebElement NodueRecords = d.findElement(By.xpath("(//div[@class='d-flex justify-content-between align-items-center'])[2]"));
		NodueRecords.click();
		
		WebElement FeeFollowUps = d.findElement(By.xpath("(//div[@class='d-flex justify-content-between align-items-center'])[3]"));
		FeeFollowUps.click();
		
		/*
		 * WebElement FeeRecords =
		 * d.findElement(By.xpath("(//span[normalize-space()='Fee Records'])[1]"));
		 * FeeRecords.click(); feedetails.click(); FeeFollowUps.click();
		 */		
		
		/*
		 * WebElement Upcoming = d.findElement(By.cssSelector(
		 * "a[href=\"/student/feefollowUps/upcoming/list?search=&page=1&pageSize=10]"));
		 * Upcoming.click();
		 */	
		WebElement Overdue = d.findElement(By.cssSelector("a[href=\"/student/feefollowUps/overdue/list?search=&page=1&pageSize=10\"]"));
		Overdue.click();
		
		WebElement Today = d.findElement(By.cssSelector("a[href=\"/student/feefollowUps/today/list?search=&page=1&pageSize=10\"]"));
		Today.click();
		
	//	Upcoming.click();
		
	//	feedetails.click();
				
				
	}

}
