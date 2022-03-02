package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicatedleadAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("http://leaftaps.com/opentaps/control/main");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usrnme =  objcrmdriver.findElement(By.xpath("//input[@id='username']"));
		usrnme.sendKeys("demoSalesManager");
		objcrmdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		objcrmdriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		objcrmdriver.findElement(By.linkText("Leads")).click();
		objcrmdriver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]/a")).click();
		objcrmdriver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		objcrmdriver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Sheelaw@gmail.com");
		objcrmdriver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(3000);
		WebElement nmeval = objcrmdriver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		System.out.println("nmeval"+nmeval);
		String frstnme = nmeval.getText();
		System.out.println("frstnme:"+frstnme);
		objcrmdriver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		String pgetitle = objcrmdriver.getTitle();
		System.out.println("pgetitle:"+pgetitle);
		objcrmdriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement duplicatenme = objcrmdriver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String dupnme = duplicatenme.getText();
		System.out.println("dupnme"+dupnme);
		if(dupnme.equals(frstnme)) {
			System.out.println("Duplicated lead name is same as captured name");
		}
		else{
			System.out.println("Not Match");
		}
		objcrmdriver.close();


	}

}
