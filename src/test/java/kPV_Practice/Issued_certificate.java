package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Issued_certificate {

	public static void main(String[] args) throws InterruptedException 
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
		
		WebElement issuedcertificate =	d.findElement(By.cssSelector("a[href=\"/student/issuedcertificates\"]"));
		issuedcertificate.click();
	
		WebElement searchfor = d.findElement(By.xpath("//input[@placeholder='Search for...']"));
		searchfor.sendKeys("battu",Keys.ENTER);	
		
		Thread.sleep(5000);
		WebElement backbutton =	d.findElement(By.className("BackButtonn"));
		backbutton.click();
		backbutton.click();
	}

}
