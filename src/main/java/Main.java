import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args){
        //Start the driver
        WebDriver driver = new ChromeDriver();
        //Open required website
        driver.get("https://www.asos.com/us/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Transition to authorization page. Variant with full screen mode.
        WebElement myAccountButton = driver.findElement(By.id("myAccountDropdown"));
        new Actions(driver).moveToElement(myAccountButton).perform();
        WebElement signInLink = driver.findElement(By.xpath("//a[@data-testid='signin-link']"));
        signInLink.click();

        //Develop later variant for narrow screen mode

        //Authorization with email
        WebElement emailInput = driver.findElement(By.id("checkEmailAddress"));
        emailInput.sendKeys("apaccforautomation@gmail.com");

        WebElement continueButton = driver.findElement(By.className("continue-button"));
        continueButton.click();

        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys("0987654321ap!");

        WebElement signInButton = driver.findElement(By.id("signin"));
        signInButton.click();
    }
}
