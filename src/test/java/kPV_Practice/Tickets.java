package kPV_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tickets {

	public static void main(String[] args) throws InterruptedException
	{
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
					
					WebElement Tickets = d.findElement(By.cssSelector("a[href=\"/tickets/ticketsDashboard\"]"));
					Tickets.click();
					
			//		d.findElement(By.xpath("button[status,'Received']")).click();
				WebElement Open_Tickets=	d.findElement(By.cssSelector("button[data-status='Open'] p[class='text-start text-uppercase fw-medium text-mute text-truncate mt-1 fs-14']"));
				Open_Tickets.click();
				Thread.sleep(2000);
				
				WebElement Resolved = d.findElement(By.cssSelector("button[data-status=\"Resolved\"]"));
				Resolved.click();
				Thread.sleep(2000);
				
				WebElement UnResolved = d.findElement(By.cssSelector("button[data-status=\"Unresolved\"]"));
				UnResolved.click();
				Thread.sleep(2000);
				
				WebElement Pending = d.findElement(By.cssSelector("button[data-status=\"Pending\"]"));
				Pending.click();
				Thread.sleep(2000);
				
				WebElement Inprogress = d.findElement(By.cssSelector("button[data-status=\"Inprogress\"]"));
				Inprogress.click();
				Thread.sleep(2000);
				
				WebElement Received = d.findElement(By.cssSelector("button[data-status=\"Received\"]"));
				Received.click();
				
				
	}
		
	}
}
