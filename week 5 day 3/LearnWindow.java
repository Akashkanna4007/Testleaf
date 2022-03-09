package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String Parentwindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> openwindow = new ArrayList<String>(windowhandles);
		driver.switchTo().window(openwindow.get(1));
	
		driver.manage().window().maximize();
		
		driver.switchTo().window(Parentwindow);
		
		driver.quit();
	}

}
