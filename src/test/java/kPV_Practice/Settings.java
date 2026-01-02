package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {

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

		WebElement Login = d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div/div/div[2]/form/div[4]/button"));
		Login.click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	//	WebElement Settings = d.findElement(By.id("Settings"));
	//	WebElement Settings = d.findElement(By.cssSelector("WebElement Settings = d.findElement(By.id(\"Settings\"));"));
		Thread.sleep(2000);
		
		WebElement Settings = d.findElement(By.xpath("//span[normalize-space()='Settings']"));
		Settings.click();

	}

}
