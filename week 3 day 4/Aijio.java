package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aijio {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder = new Actions (driver);
		
		WebElement men = driver.findElement(By.linkText("MEN"));
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("((//div[@class='column column-2']//div[@class='items'])[1]//a)[3]")).click();

		WebElement women = driver.findElement(By.linkText("WOMEN"));
		builder.moveToElement(women).perform();
		
		driver.findElement(By.xpath("//div[@class='items']/span/a[text()='Sarees']")).click();
				}
}
