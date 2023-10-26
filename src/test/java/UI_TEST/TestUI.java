package UI_TEST;


import Base.BaseCore;
import Base.ConfigRead;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Класс для запуска тестов
 */
public class TestUI extends BaseCore {
PageGoogleSearch pgs = new PageGoogleSearch(driver,wait);
@Test
    public void googleTest(){
    pgs.getURL(ConfigRead.URL);
    pgs.setSearch(ConfigRead.SEARCH);
    pgs.clickButton();
    Assertions.assertEquals(driver.getTitle(),"калькулятор - Поиск в Google");
}
}
