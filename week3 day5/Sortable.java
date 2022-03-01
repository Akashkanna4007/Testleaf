package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/sortable/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.switchTo().frame(0);
	    WebElement opt1 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]"));
	    WebElement opt2 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][5]"));
	    
	    Actions builder = new Actions(driver);
	    builder.clickAndHold(opt1).moveToElement(opt2).build().perform();
	    builder.clickAndHold(opt2).moveToElement(opt1).build().perform();
	    driver.switchTo().defaultContent();
	    
	}

}
