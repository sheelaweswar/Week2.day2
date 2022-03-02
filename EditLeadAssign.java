package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssign {

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
		objcrmdriver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sheelaw");
		objcrmdriver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(3000);
		WebElement leadid = objcrmdriver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		System.out.println("leadid:"+leadid);
		objcrmdriver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		String title = objcrmdriver.getTitle();
		System.out.println("Title of the Page :" +title);
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		objcrmdriver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		objcrmdriver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("IFG");
		objcrmdriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement updcmpnme = objcrmdriver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String gtcmpnme = updcmpnme.getText();
		System.out.println("updaded cmp name :" +gtcmpnme);
		objcrmdriver.close();
	}

}
