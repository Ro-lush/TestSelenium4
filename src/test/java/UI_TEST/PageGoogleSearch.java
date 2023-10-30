package UI_TEST;

import Base.BaseCore;
import org.openqa.selenium.By;
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

    public void setSearch(String name){
        driver.findElement(
                By.xpath("//textarea[@jsname=\"yZiJbe\"]"))
                .sendKeys(name);
    }

    public void clickButton(){
        driver.findElement(
                By.xpath("//input[@class=\"gNO89b\"]"))
                .click();
    }

}
