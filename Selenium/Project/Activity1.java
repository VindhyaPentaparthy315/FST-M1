import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Activity1 {

	public static void main(String[] args) {
       
		WebDriver driver = new ChromeDriver();
	    
		driver.get("​https://alchemy.hguy.co/jobs​/");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        String title=driver.getTitle();
        String msg="Alchemy Jobs – Job Board Application";
        
        Assert.assertEquals(title,msg) ;
        	
        driver.close();

}
}
