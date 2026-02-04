import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("​https://alchemy.hguy.co/jobs​/");
		String title1=driver.getTitle();
		WebElement lnkJobs = driver.findElement(By.xpath("//a[text()='Jobs']"));
		lnkJobs.click();
		driver.findElement(By.xpath("//input[@name='search_keywords']")).sendKeys("banking");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> joblistings=driver.findElements(By.xpath("//ul[@class='job_listings']//li//div//h3"));
		System.out.println("Num of job listed are :" +joblistings.size());
		driver.findElement(By.xpath("(//ul[@class='job_listings']//li//div//h3)[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Apply for job']")).click();
		String ContactEmail=driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
		System.out.println("please send details to :" +ContactEmail);

	}

}
