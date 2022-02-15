package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaf {

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
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kanna");
		driver.findElement(By.className("smallSubmit")).click();
		String tittle=driver.getTitle();
		String tittle2 = "View Lead | opentaps CRM";
			if (tittle.equals(tittle2)) {
				System.out.println("Testcase passed");
			}
			else {
				System.out.println("Testcase failed");
				driver.close();
				
			}
		
	}

}
