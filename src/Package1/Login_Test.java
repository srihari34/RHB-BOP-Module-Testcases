package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		System.getProperty("wedriver.chrome.driver","D:\\Backup\\chromedriver\\chromedrivers\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("http://192.168.2.27:9090/");
		obj.manage().window().maximize();
		WebElement Username = obj.findElement(By.id("LoginId"));
		Username.sendKeys("Srihari");
		WebElement Password = obj.findElement(By.id("Password"));
		Password.sendKeys("User@123");
		obj.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Login SucessFull");
		

	}

}
