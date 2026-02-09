import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            driver.get("https://alchemy.hguy.co/jobs/wp-admin");

	            WebElement UserNameField = driver.findElement(By.id("user_login"));
	            UserNameField.sendKeys("username");

	            WebElement PasswordField = driver.findElement(By.id("user_pass"));
	            PasswordField.sendKeys("password");
	            WebElement loginButton = driver.findElement(By.id("wp-submit"));
	            loginButton.click();
	            WebElement lnkjobListingsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Job Listings']")));
	            lnkjobListingsMenu.click();
	            WebElement addNewButton = wait.until(
	                    ExpectedConditions.elementToBeClickable(By.linkText("Add New")));
	            addNewButton.click();

	            driver.findElement(By.id("post_title")).sendKeys("Senior Selenium Automation Engineer");

	            driver.findElement(By.id("_job_location")).sendKeys("Remote");
	            driver.findElement(By.id("_company_name")).sendKeys("Alchemy Tech");

	            WebElement description = driver.findElement(By.id("job_description"));
	            description.sendKeys("We are looking for an experienced Selenium Automation Engineer.");

	            WebElement publishButton = wait.until(
	                    ExpectedConditions.elementToBeClickable(By.id("publish")));
	            publishButton.click();

	            WebElement publishMessage = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(
	                            By.xpath("//*[contains(text(),'Post published')]")
	                    ) );

	            if (publishMessage.isDisplayed()) {
	                System.out.println("Job listing published successfully.");
	            }
	            driver.quit();
	        }
	    }
	           


