import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("​https://alchemy.hguy.co/jobs​/");
		String title1=driver.getTitle();
		WebElement lnkPostAJob = driver.findElement(By.xpath("//a[text()='Post a Job']"));
		lnkPostAJob.click();
		driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("xyz.gmail.com");
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='job_description']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys("xyz.gmail.com");
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@value='Preview']")).click();
		driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
		driver.findElement(By.xpath("//a[text()='click here']")).click();
		String CompanyName=driver.findElement(By.xpath("//a[@class='website']/following-sibling::strong")).getText();
		Assert.assertEquals("IBM",CompanyName);
		
		driver.quit();		
		
		

	}

}
