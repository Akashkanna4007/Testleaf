package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.findElement(By.xpath("//label[text()='Click the button to display a alert box.']/following-sibling::button")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert3.sendKeys("  Kavinraj");
		Thread.sleep(2000);
		alert3.accept();

		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		org.openqa.selenium.Alert alert4 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert4.getText();
		System.out.println("The given text is:"+text);
		alert4.accept();

		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Happy Coding!']/following::button[text()='OK']")).click();
		
	}

}
