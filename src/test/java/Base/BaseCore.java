package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


abstract public class BaseCore {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Assertions assertions;
@BeforeEach
    public void startDriver(){
        System.setProperty(ConfigRead.DRIVER_NAME,ConfigRead.CROME_DRIVER_PATH);// имя и путь до ChromeDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(BaseCore.driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//Устанавливает время ожидания завершения загрузки страницы перед выдачей ошибки.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Указывает время, в течение которого драйвер должен ждать при поиске элемента, если он отсутствует сразу.

}
@AfterEach
    public void closeDriver() {
    driver.close();
    driver.quit();

}

}
