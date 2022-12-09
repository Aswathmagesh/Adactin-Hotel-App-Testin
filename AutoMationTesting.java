package MiniProject;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutoMationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\MiniProject\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		WebElement signin=driver.findElement(By.className("login"));
		signin.click();
	    WebElement title=driver.findElement(By.className("page-subheading"));
	    System.out.println(title.getText());
		WebElement login=driver.findElement(By.id("email_create"));
		login.sendKeys("aswathmagesh@gmail.com");
		WebElement submit=driver.findElement(By.id("SubmitCreate"));
		submit.click();
		WebElement gender=driver.findElement(By.id("uniform-id_gender1"));
		gender.click(); 
		WebElement firstname=driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Aswathmagesh");
		WebElement lastname=driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("R");
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys("Aswa@0817");
		WebElement date=driver.findElement(By.id("days"));
		Select sc=new Select(date);
		sc.selectByValue("8");
		WebElement month=driver.findElement(By.id("months"));
		Select sc1=new Select(month);
		sc1.selectByValue("4");
		WebElement year=driver.findElement(By.id("years"));
		Select sc2=new Select(year);
		sc2.selectByValue("2000");
		WebElement company=driver.findElement(By.id("company"));
		company.sendKeys("RRA");
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("RRA streat,66666,ret po,dindigul");
		WebElement address1=driver.findElement(By.id("address2"));
		address1.sendKeys("Nagal Nagar,Dindigul");
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("Dindigul");
		WebElement state=driver.findElement(By.id("id_state"));
		Select sc3=new Select(state);
		sc3.selectByValue("3");
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys("9789558642");
		WebElement phone1=driver.findElement(By.id("phone_mobile"));
		phone1.sendKeys("978955863");
		WebElement other=driver.findElement(By.id("other"));
		other.sendKeys("Nothing 9789558642");
		WebElement alias=driver.findElement(By.id("alias"));
		alias.sendKeys(" Nothing");
		WebElement post=driver.findElement(By.id("postcode"));
		post.sendKeys("97895");
		WebElement sub=driver.findElement(By.id("submitAccount"));
		sub.click();
		
		
		
		
		
		
		
		
		
		
				
	}

	

	}

