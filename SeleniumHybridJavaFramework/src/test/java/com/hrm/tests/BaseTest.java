package com.hrm.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hrm.driver.Driver;

public class BaseTest {

	protected BaseTest() {

	}

	@BeforeMethod
	protected void setUp() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();

	}
}
