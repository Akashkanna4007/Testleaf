package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		String name = driver.findElement(By.xpath("((//span[text()='First name'])/following::span)[1]")).getText();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder'])//input")).sendKeys(name);
		driver.findElement(By.id("ext-gen841")).click();
		String result = driver.findElement(By.xpath("(//div[@class='x-panel-header x-panel-header-noborder x-unselectable']//span[@class='x-panel-header-text'])[2]")).getText();
		System.out.println(result);
		
		
		
	}

}
