package lemai_CRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_LemaiCRM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://app.lemaicrm.com");

		WebElement email = driver.findElement(By.id("identifier"));
		email.sendKeys("ishad.m@teksacademy.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Irshad@123");
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();

		driver.findElement(By.cssSelector("span[class='mobile:block hidden']")).click();

	}

}
