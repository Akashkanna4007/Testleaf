package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		
		Actions builder=new Actions(driver);
		WebElement mens = driver.findElement(By.xpath("//div[@class='leftNavigationLeftContainer expandDiv']//li/a/span[2]"));
		builder.moveToElement(mens).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//div[@class='colDataInnerBlk']/p/a/span[text()='Sports Shoes'])[1]")).click();

		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Sports Shoe for Men Count is : "+text);

		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Sports Shoes For Men"))
		{
			System.out.println("Testcase Pass the title is : "+pageTitle);
		}
		else
		{
			System.err.println("Testcase Fail");
		}
		
		
		

	}

}
