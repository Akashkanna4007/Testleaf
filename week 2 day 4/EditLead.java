package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton'][3]")).click();
		String compName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Ak pvt ltd.");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String compName2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		if (compName.equals(compName2)) {
			System.out.println("Lead is not edited");
		}
		else {
			System.out.println("Lead is edited successfully");
		}
		}
		
		//driver.close();
	}


