package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainer_Login {

	public static void main(String[] args)
	{
		WebDriver d = new ChromeDriver();
		
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  d.get("https://infozit.kapilvidya.com/auth/login/"); WebElement email =
		  d.findElement(By.cssSelector("#email"));
		  email.sendKeys("rusheeshwar.akkenapally@teksacademy.com");
		  
		  WebElement password = d.findElement(By.cssSelector("#password-input"));
		  password.sendKeys("rusheeshwar.akkenapally");
		  
		  WebElement Login = d.findElement(By.xpath(
		  "//*[@id=\"root\"]/div[2]/div/div/div[2]/div/div/div/div[2]/form/div[4]/button"
		  )); Login.click();
		 
		
	d.get("https://infozit.kapilvidya.com/user/list");
		
	}

}
