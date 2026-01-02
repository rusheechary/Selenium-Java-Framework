package erp_teksacademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_erp {

	public static void main(String[] args) {
WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://f2k65clj-5174.inc1.devtunnels.ms/auth/login");
		/*
		 * WebElement email = d.findElement(By.cssSelector("#email"));
		 * email.sendKeys("erp@teksacademy.com"); WebElement password =
		 * d.findElement(By.cssSelector("#password-input")); password.sendKeys("erp");
		 * WebElement submit= d.findElement(By.cssSelector("button[type='submit']"));
		 * submit.click();
		 */
    
	}

}
