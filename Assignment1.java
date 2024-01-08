package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
	}

}
