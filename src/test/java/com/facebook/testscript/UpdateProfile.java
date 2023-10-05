package com.facebook.testscript;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebook.generic.BaseClass;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Listeners(com.facebook.generic.ListenerImplimentation.class)
public class UpdateProfile extends  BaseClass{
	
	@Test(priority = 1, description = "verifying login page test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify login page is displaued or not")
	@Story("Story Name: To check login page is open ")
	
		public void loginNewUser() {
		
	}

}
