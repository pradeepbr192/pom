package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class Testutil extends TestBase {

	public static long IMPLICIT_WAIT=100;
	public static long PAGE_LOAD_WAIT=100;
	
	public void Switchtoframe() {
		driver.switchTo().frame("mainpanel");	
		}
}
