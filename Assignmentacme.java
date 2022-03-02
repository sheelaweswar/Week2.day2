package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentacme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("https://acme-test.uipath.com/login");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		objcrmdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		objcrmdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		String acmetitle = objcrmdriver.getTitle();
		System.out.println(acmetitle);
		objcrmdriver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
