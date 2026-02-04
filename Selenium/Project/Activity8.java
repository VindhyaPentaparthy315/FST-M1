	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Activity8 {
	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	            driver.get("https://alchemy.hguy.co/jobs/wp-admin");

	            WebElement UserNameField = driver.findElement(By.id("user_login"));
	            UserNameField.sendKeys("username");

	            WebElement PasswordField = driver.findElement(By.id("user_pass"));
	            PasswordField.sendKeys("password");

	            WebElement loginButton = driver.findElement(By.id("wp-submit"));
	            loginButton.click();

	            WebElement homepage = driver.findElement(By.id("my_profile"));

	            if (homepage.isDisplayed()) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Login failed");
	            }

	            driver.quit();
	        }
	    
	}



