package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createleadxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("http://leaftaps.com/opentaps/control/login");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usrnme =  objcrmdriver.findElement(By.xpath("//input[@id='username']"));
		usrnme.sendKeys("demoSalesManager");
		objcrmdriver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		objcrmdriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		WebElement cmpnme = objcrmdriver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		cmpnme.sendKeys("TestLeaf");
		WebElement fstnme = objcrmdriver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fstnme.sendKeys("t1");
		WebElement lstnme = objcrmdriver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lstnme.sendKeys("t2");
		WebElement indusname = objcrmdriver.findElement(By.id("createLeadForm_industryEnumId"));
		Select objchoosest = new Select(indusname);
		objchoosest.selectByVisibleText("Aerospace");
		List<WebElement> options = objchoosest.getOptions();
		int size = options.size();
		System.out.println("insustry size of :" +size);
		objchoosest.selectByIndex(size-2);
		for(int i=0;i<size;i++) {
			String text = options.get(i).getText();
			System.out.println("options in the Dropdown"+i+":" + text);
		}
		boolean multiple = objchoosest.isMultiple();
		System.out.println(multiple);
		objcrmdriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String crtleadtitle = objcrmdriver.getTitle();
		System.out.println(crtleadtitle);
		objcrmdriver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]/a")).click();
		objcrmdriver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sheelaw");
		objcrmdriver.findElement(By.linkText("Find Leads")).click();
		objcrmdriver.findElement(By.xpath("//td[@class='x-btn-center']//button")).click();
		objcrmdriver.close();
	}
	

}
