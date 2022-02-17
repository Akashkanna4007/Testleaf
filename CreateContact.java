package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("((//div[@class='frameSectionBody'])//a)[2]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Akash");
		driver.findElement(By.id("lastNameField")).sendKeys("Kanna");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("akash");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("kanna");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("nothing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("akashkannamech@gmail.com");
		
		WebElement DropDown1= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select index = new Select(DropDown1);
		index.selectByValue("NY");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[1]")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("nothing");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String tittle= driver.getTitle();
		System.out.println(tittle);
	}

}
