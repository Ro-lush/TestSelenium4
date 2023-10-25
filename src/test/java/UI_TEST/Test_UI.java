package UI_TEST;
/**
 * Класс для запуска тестов
 */

import Base.BaseCore;
import Base.ConfigRead;
import org.junit.jupiter.api.Test;

public class Test_UI extends BaseCore {

@Test
    public void getURL(){

    driver.get(ConfigRead.URL);

}
}
