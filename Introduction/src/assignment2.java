import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.easemytrip.com/");

		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("FromSector_show")).sendKeys("DEL");
		driver.findElement(By.id("Editbox13_show")).click();
		driver.findElement(By.id("Editbox13_show")).sendKeys("DEL");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='active-date']")).click();
		// driver.findElement(By.className("active-date")).click();

		driver.findElement(By.className("dropbtn_n9")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.className("plus_box1")).click();
		}

		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.switchTo().alert().accept();
	}
	//comments added

}
