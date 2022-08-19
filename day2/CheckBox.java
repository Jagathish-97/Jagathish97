package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[2]")).click();
		//
		//
		System.out.println("favourite language");
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ')])[3]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		// toggle switch
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		boolean enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
if(enabled) {
	System.out.println("the box is enabled");
}
else {
	System.out.println("the box is not enabled");
}
driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
}
}