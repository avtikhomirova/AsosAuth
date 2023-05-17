import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args){
        //Запускаем драйвер
        WebDriver driver = new ChromeDriver();
        //Открываем нужный сайт
        driver.get("https://www.asos.com/us/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Переход на страницу авторизации, если страница полноразмерная
        WebElement myAccountButton = driver.findElement(By.id("myAccountDropdown"));
        new Actions(driver).moveToElement(myAccountButton).perform();
        WebElement signInLink = driver.findElement(By.xpath("//a[@data-testid='signin-link']"));
        signInLink.click();

        //Тут надо написать сценарий под разный масштаб страницы

        //Авторизация по почте
        WebElement emailInput = driver.findElement(By.id("checkEmailAddress"));
        emailInput.sendKeys("avtihomirova@mail.ru");

        WebElement continueButton = driver.findElement(By.className("continue-button"));
        continueButton.click();

        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys("Autenti4n0");

        WebElement signInButton = driver.findElement(By.id("signin"));
        signInButton.click();
    }
}
