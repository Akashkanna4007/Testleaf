package week2.day7;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kanna");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("akashkannamech@gmail.com");
		driver.findElement(By.xpath("//option[@value='Developer']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//option[@value='75']")).click();
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8695182161");
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		driver.close();
	}

}
