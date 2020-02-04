package demo; /**
 * Created by Lenovo on 2020/1/10.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Title: demo.TestSelenium
 * Project: RobTicket
 * Package: PACKAGE_NAME
 * Description: Please fill description of the file here
 * Author: lianchenyu
 * Date: 2020/1/10
 */

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL="";
        Properties pro=new Properties();
        try {
//            InputStream is = TestSelenium.class.getResourceAsStream("src/main/resources/config.properties");
            pro.load(new FileInputStream("src/main/resources/config.properties"));
            baseURL=pro.get("baseurl").toString();
        } catch (IOException e) {
            System.out.println("Property file not found");
            e.printStackTrace();
        }

//        launch Fire fox and direct it to the Base URL
        driver.get("https://detail.damai.cn/item.htm?spm=a2oeg.home.card_0.ditem_0.6e5623e1JsJqay&id=611111001414");

//         get the actual value of the title
//        List<WebElement> inputs = driver.findElements(By.className("fm-text"));
//        Iterable<WebElement> itr= (Iterable<WebElement>) inputs.iterator();
//        for(WebElement ele: inputs){
//            ele.sendKeys("test is this login name?");
//        }
//        WebElement pwd = driver.findElement(By.id("fm-login-password"));
//          close Fire fox
//        driver.close();
    }
}
