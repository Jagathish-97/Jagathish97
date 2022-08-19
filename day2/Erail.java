package week2.day2;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementClear = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
 elementClear.clear();
 elementClear.sendKeys("MS",Keys.TAB);
 WebElement elementClear2 = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
 elementClear2.clear();
 elementClear2.sendKeys("MDU",Keys.TAB);
 WebElement elementSortButton = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
elementSortButton.click();
List<WebElement>elementRows= driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
List<WebElement> elementColumns = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));
for(int i=1;i <elementRows.size();i++){
	for(int j=1;j<elementColumns.size();j++) {
		String text = driver.findElement(By.xpath("(//table)[3]/tbody/tr[   "+ i + " ]/td[  " + j +" ]")).getText();
		System.out.println(text+ "");
	}
	System.out.println();
}

	}

	
	}


