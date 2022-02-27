package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("akashkannamech@gmail.com");
		WebElement ele = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[4]/input"));
		ele.clear();
		ele.sendKeys("Ak");
		String attribute = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/input")).getAttribute("value");
		System.out.println(attribute);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
	}

}
