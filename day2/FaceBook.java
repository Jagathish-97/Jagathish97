package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to click on create new account button
		WebElement clickButton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		clickButton.click();
		// to enter the first name
		WebElement enterFirstName = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		enterFirstName.sendKeys("jagathish");
		// to enter the last name 
		WebElement enterLastName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
        enterLastName.sendKeys("tamilselvan");
        // to enter the phone number
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6474702561");
        // to enter new password
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Jagathish@97");
        // dropdown for dob
        WebElement dobDD = driver.findElement(By.xpath("//select[@id='day']"));
        Select DD=new Select(dobDD);
        DD.selectByIndex(4);
        WebElement dobMM = driver.findElement(By.xpath("//select[@id='month']"));
        Select DD1=new Select(dobMM);
        DD1.selectByVisibleText("Dec");
        WebElement dobYear = driver.findElement(By.xpath("//select[@id='year']"));
	 Select DD2=new Select(dobYear);
	 DD2.selectByVisibleText("1997");
	 driver.findElement(By.xpath("//input[@name='sex']")).click();
	}

}
