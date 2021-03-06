package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		
		Actions builder = new Actions(driver);
		
		//builder.clickAndHold(ele1).moveToElement(ele2).release().perform();
		builder.keyDown(Keys.CONTROL).click(ele1).click(ele3).click(ele2).release().perform();
		
		}

}
