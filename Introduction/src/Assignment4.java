import java.awt.Window;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='/windows']")).click();
		driver.findElement(By.cssSelector("a[href*='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentID, childID]
		java.util.Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
	}

}
