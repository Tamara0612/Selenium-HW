package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//fill out the form
//close the browser

//Note: use name or id as locators
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
         driver.manage().window().maximize();
         driver.findElement(By.name("customer.firstName")).sendKeys("Tamara");
         driver.findElement(By.name("customer. lastName")).sendKeys("Karaica");
         driver.findElement(By.id("customer.address.street")).sendKeys("8000 Spring Mountain rd.");
         driver.findElement(By.id("customer.address.city")).sendKeys("Las Vegas");
         driver.findElement(By.id("customer.address.state")).sendKeys("Nevada");
         driver.findElement(By.id("customer.address.zipCode")).sendKeys("89117");
         driver.findElement(By.id("customer.phoneNumber")).sendKeys("234-234-234");
         driver.findElement(By.id("customer.ssn")).sendKeys("123-45-678");
         driver.findElement(By.id("customer.username")).sendKeys("Anya1507");
         driver.findElement(By.name("customer.password")).sendKeys("Nikola3103");
         driver.findElement(By.name("repeatedPassword")).sendKeys("Nikola3103");
         Thread.sleep(5000);
         driver.quit();
    }
}
