package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();
	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyName.sendKeys("JagathishINC");
	WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstName.sendKeys("JAGATHISH");
	WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementLastName.sendKeys("PONNUSAMY TAMILSELVAN");
	WebElement elementbutton = driver.findElement(By.className("smallSubmit"));
    elementbutton .click();
 String tittle =driver.getTitle();
    System.out.println(tittle);
    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
    WebElement newName = driver.findElement(By.xpath("//input[@value='JagathishINC']"));
    newName.clear();
    newName.sendKeys("Jagathish PVT");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    String tittle1 =driver.getTitle();
    System.out.println(tittle1);
    driver.close();

	}
}
