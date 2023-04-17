package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ex4 {
	WebDriver driver;
	@BeforeSuite
	void init() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);}
    @Test
    public void Test1() throws InterruptedException {
    	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    	driver.get(url);
    	Thread.sleep(3000);
    	WebElement name=driver.findElement(By.name("username"));
    	WebElement pass=driver.findElement(By.name("password"));
    	name.sendKeys("Admin"+Keys.ENTER);
    	pass.sendKeys("admin123"+Keys.ENTER);
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();;}
    @Test(dependsOnMethods="Test1")
    public void Test2() throws InterruptedException {  
    	String end="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    	driver.get(end);
    	Thread.sleep(4000);
    	WebElement ds=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
    	ds.click();
    	List<WebElement> menu=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul"));
    	menu.get(3).click();	
    }
}
