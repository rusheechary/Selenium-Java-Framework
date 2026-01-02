package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee_learner_login_kpv {

	public static void main(String[] args) 
	{

		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		d.get("https://employee.infozit.kapilvidya.com/auth/login/");
		WebElement email =  d.findElement(By.cssSelector("#email"));
		email.sendKeys("rusheeshwar.akkenapally@teksacademy.com");
		WebElement password =  d.findElement(By.cssSelector("#password-input"));
		password.sendKeys("Test@1234");
		WebElement submit = d.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//css selector from inspect
    WebElement cncl_fdbck =		d.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-footer > button.button-cancel.btn.btn-primary"));
    
		cncl_fdbck.click();
		

	}

}
