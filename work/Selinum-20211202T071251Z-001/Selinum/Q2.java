package selinum;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  driver.manage().window().maximize();  
		  driver.get("http://demo.guru99.com/test/web-table-element.php");        
	        String rowtext=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();
		   
	      
	      System.out.println("current price : " + rowtext);
	   String rmax;
	   double r=0,m=0;
	      List  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")); 
	      
	      for(int i=1;i<rows.size();i++)
	      {
	    	  
	    	  rmax=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i)+"]/td[4]")).getText();
			   m=Double.parseDouble(rmax);
	    	  if(m>r){
	    		  r=m;
	    	  }
	      }
	      System.out.println(" Maximum value is:"+r);
	      driver.close();
	}

}
