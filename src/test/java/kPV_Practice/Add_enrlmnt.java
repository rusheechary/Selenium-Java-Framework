package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_enrlmnt {

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
		

//		WebElement crtbatch =  d.findElement(By.xpath("//button[normalize-space()='Create Batch']"));
//		crtbatch.click();

			/*
			 * WebElement expand =
			 * d.findElement(By.cssSelector("div[class='nav-item'] svg")); //
			 * expand.click(); // // WebDriverWait wait = new WebDriverWait(d,
			 * Duration.ofSeconds(5)); //
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]"
			 * )));
			 * 
			 * WebElement compress = d.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]"
			 * )); compress.click();
			 */
		
			// This explicit wait is given to overcome the element not interactable as the driver went fast.
			WebElement LrnrMgmt = d.findElement(By.cssSelector("a[data-bs-target='#student'] span"));
			LrnrMgmt.click();
		
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(3)); 
			
			WebElement EnrldLrnrs =	d.findElement(By.xpath("//a[normalize-space()='Enrolled Learners']"));
			EnrldLrnrs.click();
			
			WebElement AddEnrlmnt = d.findElement(By.cssSelector("a[class='button_color ']"));
			AddEnrlmnt.click();
			
			WebElement name = d.findElement(By.cssSelector("#name"));
			name.sendKeys("Testing the Enrollment");
			
			WebElement mailid = d.findElement(By.cssSelector("#email"));
			mailid.sendKeys("66frederique@2200freefonts.com");
			
			WebElement mobNumber = d.findElement(By.xpath("//input[@id='mobilenumber']"));
			mobNumber.sendKeys("7862314534");
			
			
			/*
			 * WebElement Gender = d.findElement(By.xpath(
			 * "/html/body/div/div[2]/div/div[2]/main/div[2]/div[2]/div/div[2]/form/div[1]/div[4]/div[1]/div/div[1]/div[2]"
			 * )); Gender.click(); Gender.sendKeys("Fem",Keys.ENTER);
			 */
			//  Select select = new Select(Gender);
			  
			//  select.selectByVisibleText("Female");
			  
			 // Gender.click();   
			//  Gender.sendKeys("Fem",Keys.ENTER);
			
				
			//WebElement Gender = d.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/main/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/input"));
			// Avoid Using Absolute or Full xpath.
			
Thread.sleep(2000);
/*
 * WebElement Gender = d.findElement(By.
 * xpath("//div[@class=\"select__input-container css-19bb58m\"][1]"));
 * Gender.click(); Thread.sleep(1000);
 * d.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("female");
 */
			//Gender.sendKeys("Female");
			// WebDriverWait wait2 = new WebDriverWait(d, Duration.ofSeconds(3));
			 
			
			//Gender.click();
			
			
//			  WebDriverWait wait2 = new WebDriverWait(d, Duration.ofSeconds(3)); WebElement
//			  element = wait2.until(ExpectedConditions.elementToBeClickable(By.className("select__input-container css-19bb58m")));
			 
//			Gender.sendKeys("Fem",Keys.ENTER);
			
			
		
				WebElement join_date = d.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/main/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/input"));
				 join_date.sendKeys("04/11/2025");
				 
				 WebElement lrnrcmpny = d.findElement(By.xpath("//select[@id='learnerCompanyId']"));
				 lrnrcmpny.sendKeys("Kapil Properties");
				 
				 
			 
				 
			
			

		
		
	}

}
