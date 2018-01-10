package com.driverutility.selenium.com;

import com.rameshsofte.selenium.java.DriverUtility;

public class Gmail {
		public void login()
		{
			DriverUtility d = new DriverUtility();
			d.getDriver().get("https://www.gmail.com");
		}

	}


