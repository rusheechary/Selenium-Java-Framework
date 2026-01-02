package ERP_Teksversity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// navigation to the web application
		driver.get("https://erp.teksversity.com");
		
		//login page fields - username and password and submit button
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("erp@teksacademy.com");
		
		WebElement password = driver.findElement(By.id("password-input"));
		password.sendKeys("erp");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
