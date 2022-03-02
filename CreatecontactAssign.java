package Week2.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatecontactAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("http://leaftaps.com/opentaps/control/login");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usrnme =  objcrmdriver.findElement(By.xpath("//input[@id='username']"));
		usrnme.sendKeys("demoSalesManager");
		objcrmdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		objcrmdriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		objcrmdriver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Sasvitha");
		objcrmdriver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Senthil");
		objcrmdriver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		objcrmdriver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Create contact info");
		objcrmdriver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sas@gmail.com");
		WebElement stepro = objcrmdriver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select objste =new Select(stepro);
		List<WebElement> options = objste.getOptions();
		int size = options.size();
		System.out.println("size"+size);
		objste.selectByIndex(1);
		objcrmdriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		objcrmdriver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		objcrmdriver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		objcrmdriver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Fill Important info");
		objcrmdriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String creatcontitle = objcrmdriver.getTitle();
		System.out.println("Title of the Page :" +creatcontitle);
		objcrmdriver.close();
	}

}
