package com.driverutility.selenium.com;

import com.rameshsofte.selenium.java.DriverUtility;

public class FaceBook {

	public void login()
	{
		DriverUtility d = new DriverUtility();
		d.getDriver().get("https://www.facebook.com");
	}
}
