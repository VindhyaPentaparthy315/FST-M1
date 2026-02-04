import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Activity5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("​https://alchemy.hguy.co/jobs​/");
		String title1=driver.getTitle();
		WebElement lnkJobs = driver.findElement(By.xpath("//a[text()='Jobs']"));
		lnkJobs.click();
		String title2=driver.getTitle();
		Assert.assertEquals(title1, title2);
		driver.quit();
		
		

	}

}
