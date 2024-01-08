package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.edge.driver","c://msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		driver.close();

	}

}
