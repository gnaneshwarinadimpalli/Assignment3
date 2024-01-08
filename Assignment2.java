package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		driver.close();

	}

}
