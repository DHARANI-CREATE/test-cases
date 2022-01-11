package Testcases;

import java.util.concurrent,TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Switchcase{

    webDriver driver;

    public void launchApplication(){
        System.setProperty("webdriver.crome.driver")
        driver=new ChromeDriver();
        driver.get("https://usgradapp.com/universities/")
    }
    @Test
    public void performUsgradeSteps(){
        String university="Xpath#input[@name='university']"
        String cityorstate= "Name#loction"
        String searchbtn="Type#search"
        checkLocators(university);
        checkLocators(cityorstate);
        checkLocators(searchbtn)
    }
    public void checkLocators(){
        keyLocater=StringUtils.substringBefore(strLocator,"#");
        System.out.println("key ---->"+keyLocater);
        strLocator=StringUtils.substringAfter(strLocator,"#");
        System.out.println("value ---->" +strLocator);


        switch(key){
            case "Xapth":
            driver.findElement(By.Xpath(strLocator)).sendkeys("New York University
");
            System.out.println("Xpath is Executed ---->enter univerity name");
            break;
            case "Name"
            driver.findElement(By.Name(strLocator)).sendkeys("New york");

            System.out.println("Name is Executed ---->enter city or state");
            break;
            case "Type":
            driver.findElement(By.Type(strLocator)).click();
            System.out.println("Type is Executed ---->click search btn");
            break;

            default:
            System.out.println("default statement");
            break;
        }
    }
}

