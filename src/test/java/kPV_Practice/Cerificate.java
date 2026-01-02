package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cerificate {

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
		
		WebElement certificate = d.findElement(By.cssSelector("a[href=\"/student/certificate\"]"));
		certificate.click();
		
	//	d.findElement(By.className("btn btn-sm btn_primary fs-13 me-1 margin_top_12")).click();
	//	d.findElement(By.cssSelector("button.btn btn-sm btn_primary fs-13 me-1 margin_top_12")).click();
		d.findElement(By.xpath("(//button[normalize-space()='Filters'])[1]")).click();
	}
	}


