package week2.day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("ak4007");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Kanna");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("akashkannamech@gmail.com");
		driver.findElement(By.xpath("//option[@value=99]")).click();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("asdfg");
		driver.close();
		
		
		

	}

}
