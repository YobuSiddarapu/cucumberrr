package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginsteps {
	private WebDriver driver;
	
	private By emailid=By.xpath("//input[@id='email']");
	private By pass=By.xpath("//input[@id='password']");
	private By loginbtn=By.xpath("//button[@id='login_button']");
	
	public Loginsteps(WebDriver driver) {
		this.driver= driver;
		
	}
	public void EnterUsername(String username) {
		driver.findElement(emailid).sendKeys(username);
		
	}
	public void Enterpassword(String password) {
		driver.findElement(pass).sendKeys(password);
		
		
	}
	public void Clickbtn() {
		driver.findElement(loginbtn).click();
	}
	

}
