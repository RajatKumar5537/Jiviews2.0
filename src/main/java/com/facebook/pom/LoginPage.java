package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.BaseClass;

import io.qameta.allure.Step;

public class LoginPage extends BaseClass{

	@FindBy(name="email")
	private WebElement unTbx;
	
	@FindBy(name="pass")
	private WebElement pwTbx;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@Step("Sign in with username: {0} and passward: {1} step... ")
	public void setLogin(String un, String pw) {
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
	}
}
