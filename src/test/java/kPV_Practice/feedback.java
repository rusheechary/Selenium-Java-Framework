package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class feedback {

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
	
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(3)); 
		
		WebElement EnrldLrnrs =	d.findElement(By.xpath("//a[normalize-space()='Enrolled Learners']"));
		EnrldLrnrs.click();
		
		WebDriverWait wait2 = new WebDriverWait(d, Duration.ofSeconds(3)); 
		
		WebElement feedback =	d.findElement(By.cssSelector("a[href=\"/student/feedback\"]"));
		feedback.click();
		
		/*
		 * WebDriverWait wait3 = new WebDriverWait(d, Duration.ofSeconds(3)); WebElement
		 * toggle =
		 * wait3.until(d.->d.findElement(By.xpath("(//*[name()='path'])[17]")).);
		 */
			
		
		WebElement toggle =	d.findElement(By.cssSelector("#root > div.app > div > div.content > main > div.topbar.w-full > nav > div > div:nth-child(1) > div > span > svg"));
	//	WebElement togglebutton = d.findElement(By.xpath("(//*[name()='path'])[17]"));
		toggle.click();

	}

}
