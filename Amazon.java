import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//ctl00_mainContent_ddl_originStation1_CTXT
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement>auto=driver.findElements(By.className("aajZCb"));
		for(WebElement auote:auto)
		{
			if(auote.getText().equalsIgnoreCase("ind"))
			{
				auote.click();
			}
		}
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("amazon");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);*/

	}

}
