package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> columnCount = driver.findElements(By.tagName("th"));
		int size = columnCount.size();
		System.out.println("Column Count is "+size);
		
		List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
		int row = rowCount.size();
		System.out.println("Row count is "+row);
		
		String Progressvalue = driver.findElement(By.xpath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]")).getText();
		System.out.println(Progressvalue);

	    List<Integer> minValue = new ArrayList<Integer>();
		for(int i=2;i<size;i++) {
			String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[2]")).getText();
			String replaceAll = text.replaceAll("%", "");
			int parseInt = Integer.parseInt(replaceAll);
			minValue.add(parseInt);
		}
		Integer min = Collections.min(minValue);
		
		driver.findElement(By.xpath("(((//td[text()='"+min+"%'])//following::td)[1])//input")).click();
	}
	

}
