package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_admin_login_kpv {

	public static void main(String[] args) {

	
		
		
		// WebDriver d = new EdgeDriver();
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
				.findElement(By.cssSelector("button[type='submit']"));
		Login.click();

		
		}
	
}
