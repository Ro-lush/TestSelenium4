package UI_TEST;
/**
 * Класс для запуска тестов
 */

import Base.BaseCore;
import Base.ConfigRead;
import org.junit.jupiter.api.Test;

public class Test_UI extends BaseCore {
PageGoogleSearch pgs = new PageGoogleSearch(driver,wait);
@Test
    public void googleTest(){
    pgs.getURL(ConfigRead.URL);
}
}
