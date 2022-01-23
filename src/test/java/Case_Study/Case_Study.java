package Case_Study;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case_Study {
	
	@Test
	public  void main() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo/");
		
		//System.out.println(driver.getCurrentUrl());

		Case_Study_Element e1 = new Case_Study_Element();

		e1.login(driver).click();

		// Switch to 2nd Window :
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> iter=windows.iterator();
		String window1=iter.next();
		String window2=iter.next();
		driver.switchTo().window(window2);

		//System.out.println(driver.getCurrentUrl());

		e1.New_Account(driver).click();
		e1.First_Name(driver).sendKeys("Kshitij0803");
		e1.Last_Name(driver).sendKeys("Ambade0803");
		e1.Email(driver).sendKeys("kshitij08.anilambade@hcl.com");
		e1.Company_Name(driver).sendKeys("HCL");
		e1.Address(driver).sendKeys("PUNE MAGARAPATTA CITY");
		e1.City(driver).sendKeys("PUNE CITY");
		e1.State1(driver).sendKeys("MAHARASHTRA");
		e1.Pincode(driver).sendKeys("411015");


		//Password :
		e1.Password(driver).sendKeys("Xperia@x8");
		e1.Conform_Password(driver).sendKeys("Xperia@x8");


		Select sel1 = new Select (e1.Country(driver));
		sel1.selectByValue("IN");

		e1.Phone_Number(driver).sendKeys("7384926568");

		Select sel2 = new Select (e1.State2(driver));
		sel2.selectByVisibleText("Maharashtra");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(16000);
		e1.Register_Button(driver).click();

		// Assertion :
		String ActualTitle = driver.getCurrentUrl();
		String ExpectedTitle = "https://phptravels.org/clientarea.php";
		Assert.assertEquals(ExpectedTitle, ActualTitle,"Dose not Match the Expected URL");
		System.out.println("You have been logged in");
		
		Robot robot1=new Robot();
		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc_size);
		BufferedImage Source=robot1.createScreenCapture(rect);
		File destination=new File("F:\\screen2.png");
		ImageIO.write(Source, "png", destination);
	
		driver.manage().deleteAllCookies(); 

	}

}
