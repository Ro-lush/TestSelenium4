package UI_TEST;

import Base.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page1C extends BaseCore {
    public Page1C(WebDriver driver1c, WebDriverWait wait1c){
        this.driver = driver1c;
        this.wait = wait1c;
    }

    public boolean userField(){
        boolean prov;
      prov = driver.findElement(By.xpath("//input[@id=\"username\"]")).isDisplayed();
        //Этот метод используется для проверки того, отображается ли подключенный элемент на веб-странице.
        // Возвращает Boolean значение True, если подключенный элемент отображается в текущем контексте просмотра,
        // в противном случае возвращается false.

        return prov;
    }
    public boolean checkbox_anotherComputer(){

        boolean prov;
     prov = driver.findElement(By.xpath("//input[@name=\"anotherComputer\"]")).isSelected();
       // Этот метод определяет, выбран ли указанный элемент или нет.Этот метод широко используется
        // в флажках, переключателях, элементах ввода и элементах опций.
        return prov;
    }
}
