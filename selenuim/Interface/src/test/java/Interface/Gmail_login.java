package Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_login 
{
	static WebDriver driver;
	public static String url,SearchText;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\geckodriver.exe");
		
		url="https://www.google.com";
		
		SearchText="Seelenium webdriver";
		
		driver= new FirefoxDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(SearchText);
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
