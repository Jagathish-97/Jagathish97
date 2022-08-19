package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTool {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		// favourite automation tool
		WebElement favouriteDD1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
       Select dd =new Select(favouriteDD1);
       dd.selectByVisibleText("Selenium");
        driver.findElement(By.xpath("//label[contains(text(),'Select Country')]")).click();
        driver.findElement(By.xpath("//li[@id='j_idt87:country_1']")).click();
        Thread.sleep(3000);
	// to check with the city
        driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
        WebElement city1 = driver.findElement(By.xpath("//li[text()='Rio de Janerio']"));
       city1.click();
     
        //change the country and check with the cities
        driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        Thread.sleep(2000);
        // check the city and click
        driver.findElement(By.xpath("//label[text()='Select City']")).click();
       WebElement city2 = driver.findElement(By.xpath("//li[text()='Chennai']"));
      city2.click();
      
      driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//li[text()='AWS']")).click();
      driver.findElement(By.xpath("//label[text()='Select Language']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//li[@id='j_idt87:lang_2']")).click();
      driver.findElement(By.xpath("//li[text()='Select Values']")).click();
     // driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper']/ul)[4]/li[2]']")).click();
	}
	
}
