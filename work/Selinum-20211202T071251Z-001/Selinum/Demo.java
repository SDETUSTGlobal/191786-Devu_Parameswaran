package selinum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  driver.manage().window().maximize();  
	      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");    
	      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	      driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	      driver.findElement(By.className("button")).click(); 
	      driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll")).click(); 
         
	    
	}

}
