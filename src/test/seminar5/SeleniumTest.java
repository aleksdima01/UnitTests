package seminar5;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    //    Открывает главную страницу Google.
//            2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//            3. В результатах поиска ищет ссылку на официальный сайт Selenium
//            (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//                    результатов поиска.
    @Test
    void getLinkTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();
        webElement = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/div/div/div/cite"));
        assertThat(webElement.getText()).isEqualTo("https://www.selenium.dev");
        webDriver.quit();
    }

    @Test
    void seleniumTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
        WebElement webElement = webDriver.findElement(By.id("user-name"));
        webElement.sendKeys("standard_user");
        WebElement webElementPassword = webDriver.findElement(By.id("password"));
        webElementPassword.sendKeys("secret_sauce");
        webElementPassword.submit();
        WebElement findProduct = webDriver.findElement(By.className("title"));
        assertThat(findProduct.getText()).isEqualTo("Products");
        webDriver.quit();
    }
}
