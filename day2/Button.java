package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
		System.out.println("the title of the page:"+ driver.getTitle());
		if(driver.getTitle().contains("Dashboard")) {
			System.out.println("tittle is confirmed");
		}
		else {
			System.out.println("not confirmed");
		}

		driver.navigate().back();
		WebElement buttonCheck = driver.findElement(By.xpath("//span[text()='Disabled']"));
		if(buttonCheck.isEnabled()) {
			System.out.println("the button is not enabled");
		}
		else {
			System.out.println("the button is Disabled");
		
		}
	Point location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getLocation();
	System.out.println(location);
	String cssValue = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("color");
	System.out.println(cssValue);
	Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button")).getSize();
	System.out.println(size);
	WebElement mouseOver = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
	String color1 = mouseOver.getCssValue("backgroundColor");
	Actions builder = new Actions(driver);
	builder.moveToElement(mouseOver).perform();
	String color2 = mouseOver.getCssValue("backgroundColor");
	if(color1.equals(color2)) {
		System.out.println("changed");
	}
	else {
		System.out.println("not changed");
	}
	//first click on the element
	driver.findElement(By.xpath("//span[text()='Image']")).click();
	// click somewhere hidden element
	driver.findElement(By.xpath("//div[@class='card ui-fluid']"));
	 List<WebElement>  findElements =  driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
	 int size1 =findElements.size();
	 System.out.println(size1);
	}

	
	}
	


