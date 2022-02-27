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
		String tittle = driver.findElement(By.xpath("((((//div[@class='x-panel-mc'])[7])//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a)")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton'][1]")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@class='smallSubmit']")).click();
		String tittle2 = driver.findElement(By.xpath("((//span[text()='First name'])/following::span)[1]")).getText();
		
		if (tittle.equals(tittle2)){
			System.out.println("Verified");
			}
		else {
			System.out.println("tittle not matched");
		}
		}
	
}
