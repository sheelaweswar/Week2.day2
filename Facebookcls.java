package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("https://en-gb.facebook.com/");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		objcrmdriver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		objcrmdriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sas");
		objcrmdriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sen");
		objcrmdriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9999999999");
		objcrmdriver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123sheela");
		WebElement brtday = objcrmdriver.findElement(By.xpath("//select[@id='day']"));
		Select objbrtday = new Select(brtday);
		objbrtday.selectByVisibleText("27");
		WebElement brtmon = objcrmdriver.findElement(By.xpath("//select[@id='month']"));
		Select objbrtmon = new Select(brtmon);
		objbrtmon.selectByVisibleText("Mar");
		WebElement brtyr = objcrmdriver.findElement(By.xpath("//select[@id='year']"));
		Select objbrtyr = new Select(brtyr);
		objbrtyr.selectByVisibleText("1989");
		objcrmdriver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		objcrmdriver.findElement(By.xpath("//button[@name='websubmit']")).click();


	}

}
