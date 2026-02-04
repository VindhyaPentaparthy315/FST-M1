import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("​https://alchemy.hguy.co/jobs​/");
		String secondHeading = driver.findElement(By.xpath("//h2[text()='Quia quis non']")).getText();
		String msg="Quia quis non";
		Assert.assertEquals(secondHeading,msg) ;
		driver.quit();

	}

}
