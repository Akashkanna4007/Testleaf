package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton'][1]")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@class='smallSubmit']")).click();
		String tittle = driver.getTitle();
		String tittle2 = "Duplicate Lead";
		if (tittle.equals(tittle2)){
			System.out.println("Verified");
			}
		else {
			System.out.println("tittle not matched");
		}
		driver.close();
}

}
