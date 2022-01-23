package Case_Study;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case_Study_Element {
		public WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("/html/body/header/div/nav/a[4]"));
		}
		
		public WebElement New_Account(WebDriver driver) {
			return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/div/a"));
		}
		
		
		public WebElement First_Name(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]"));
		}
		
		public WebElement Last_Name(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputLastName\"]"));
			
		}
		
		public WebElement Email(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));
			
		}
		public WebElement Company_Name(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputCompanyName\"]"));
			
		}
		public WebElement Address(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]"));
			
		}
		public WebElement City(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
			
		}
		public WebElement State1(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"stateinput\"]"));
			
		}
		public WebElement Pincode(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputPostcode\"]"));
			
		}
		
		//Password : ...........................................................................................
		
		public WebElement Password(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputNewPassword1\"]"));		
		}
		public WebElement Conform_Password(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputNewPassword2\"]"));		
		}
		
		//.......................................................................................................
		
		public WebElement Country(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputCountry\"]"));	
		}
		public WebElement Phone_Number(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"inputPhone\"]"));		
		}
		
		public WebElement State2(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"stateselect\"]"));		
		}
		
		public WebElement Register_Button(WebDriver driver) {
			return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[5]/input"));
		}
		
		

}
