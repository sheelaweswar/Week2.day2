package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadcls {

	public static void main(String[] args) {
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
		objcrmdriver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]/a")).click();
		objcrmdriver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		objcrmdriver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9174425233");
		objcrmdriver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		WebElement leadid = objcrmdriver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		System.out.println("leadid:"+leadid);
		if(leadid != null) {
			String gtlead = leadid.getText();
			System.out.println("gtlead"+gtlead);
			objcrmdriver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
			objcrmdriver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
			objcrmdriver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]/a")).click();
			objcrmdriver.findElement(By.xpath("//input[@name='id']")).sendKeys(gtlead);
			objcrmdriver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
			objcrmdriver.close();
		}
	}
}
