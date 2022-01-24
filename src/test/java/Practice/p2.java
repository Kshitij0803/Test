package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		String file_upload="C:\\Users\\ACER\\Downloads\\PanCard.pdf";
		StringSelection select1=new StringSelection(file_upload);
		
		Thread.sleep(2000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		/*driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a/img")).click();
		
		driver.manage().deleteAllCookies();*/
		
		
	}

}
