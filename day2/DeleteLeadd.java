package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadd {
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
        elementLoginButton.click();
        WebElement element = driver.findElement(By.linkText("CRM/SFA"));
    	element.click();
    	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
    	elementLeads.click();
    	WebElement findLead= driver.findElement(By.linkText("Find Leads"));
    	findLead.click();
//    	driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
//    	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("647");
//    	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("4702561");
    	
    	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("JAGATHISH");
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	Thread.sleep(3000);
    	WebElement lead = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col')]/a"));
       Thread.sleep(5000);
    	
    	String text = lead.getText();
        System.out.println(text);
        lead.click();
        
	
	}
	

}
