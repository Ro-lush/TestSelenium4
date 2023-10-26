package UI_TEST;

import Base.BaseCore;
import Base.ConfigRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageGoogleSearch extends BaseCore {
    public PageGoogleSearch(WebDriver driverPGS, WebDriverWait waitPGS){
        this.driver = driverPGS;
        this.wait = waitPGS;
    }
    public void getURL(String url){
        driver.get(url);
    }

}
