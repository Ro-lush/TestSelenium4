package UI_TEST;

import Base.BaseCore;
import Base.ConfigRead;
import org.junit.jupiter.api.Test;

public class UI_Test extends BaseCore {

@Test
    public void getURL(){

    driver.get(ConfigRead.URL);

}
}
