import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("​https://alchemy.hguy.co/jobs​/");
		String subHeading = driver.findElement(By.className("entry-title")).getText();
		String msg="Welcome to Alchemy Jobs";
		Assert.assertEquals(subHeading,msg) ;
		driver.quit();
		
	}

}
