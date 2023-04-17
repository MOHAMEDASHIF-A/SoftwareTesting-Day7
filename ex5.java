package day7;

import org.testng.annotations.Test;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ex5 {
	@Test(groups= {"SmokeTest"})
	  public void Test1() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String actualTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		String extractedTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, extractedTitle);
		String actualURL="https://www.godaddy.com/en-in";
		String extractedURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, extractedURL);
		driver.quit();
		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);	
  }
@Test(groups= {"RegressionTest"})
  public void Test2() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver  driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Domain Name Search")).click();
		//driver.quit();
  }
  @Test(groups= {"RegressionTest"})
  public void Test3() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver  driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.linkText("Domain Name Search")).click();
		String titl=driver.getTitle();
		System.out.println("Title="+titl);
		driver.quit();

	  }
}