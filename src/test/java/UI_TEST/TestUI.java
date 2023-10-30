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
Page1C page1C = new Page1C(driver,wait);
static boolean prov = true;
@Test
    public void googleTest(){
    pgs.getURL(ConfigRead.URL);
    pgs.setSearch(ConfigRead.SEARCH);
    pgs.clickButton();
    //Тест пройдён
    Assertions.assertEquals(driver.getTitle()
            ,"калькулятор - Поиск в Google"
            ,ConfigRead.PASSED) ;
}
@Test
    public void OneC(){
        driver.get(ConfigRead.URL1C);
    /* Assertions.assertNotEquals(prov,page1C.userField(),"Тест не пройден");
     Assertions.assertEquals(prov,page1C.checkbox_anotherComputer(), "Тест Пройден");
     */
    if (page1C.userField() == prov){
        System.out.println("Pass");
    } else {
        System.out.println("Failed");
    }
    if (page1C.checkbox_anotherComputer() == prov){
        System.out.println("Pass");
    }else
    {
        System.out.println("Failed");
    }
}

}
