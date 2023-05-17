package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
//enter the username "Tester"
//enter the password "test"
//get the title of the webPage and confirm that it is  "Web Orders Login"
    public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.manage().window().maximize();
driver.findElement(By.id("ct.100_MainContent_username")).sendKeys("Tester");
driver.findElement(By.id("ct100$MainContent$password")).sendKeys("Test");
String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders Login")){
            System.out.println("WebPage title is correct");
        }else{
            System.out.println("WebPage title is incorrect");
        }
    }
}

