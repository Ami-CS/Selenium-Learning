import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceLink {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//Total link Count
		driver.get("https://www.amazon.com");
        System.out.println("Previous : " +driver.findElements(By.tagName("a")).size());
		//count of links inn footer section//
        //Thread.sleep(5000);
     // from parent to child for whole footer//
       WebElement footerdriver=driver.findElement(By.xpath("//div[@id='navFooter']/div[1]/div"));
       System.out.println("Footer : " +footerdriver.findElements(By.tagName("a")).size());
       // selecting column//
       WebElement columndriver=driver.findElement(By.xpath("//div[@id='navFooter']/div[1]/div/div"));
       System.out.println("column : " +columndriver.findElements(By.tagName("a")).size());
       //loopover all links
       for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
       {
    	   String clickLinks=Keys.chord(Keys.CONTROL, Keys.ENTER);
    	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinks);
    	   Thread.sleep(5000);
    	  
       }
            Set<String> ami=driver.getWindowHandles(); //set-innterface-doesn't give duplicate thing
//    	   Iterator<String> Ap=ami.iterator(); //import it by ctrl and space together//
//    	   
//    	   while(Ap.hasNext()) {
//    		
//    		   driver.switchTo().window(Ap.next());
//    		   System.out.println("Iterator elements :" + driver.getTitle());
//    	   }
            
            
            //optimized way//
       for(String s:ami) //forEach syntax { 
    	   driver.switchTo().window(s);
           System.out.println("Iterator elements :" + driver.getTitle());
       }
       }
	


