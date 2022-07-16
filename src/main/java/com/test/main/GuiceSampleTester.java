package com.test.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.test.module.GuiceTestModule;
import com.test.service.GuiceTestService;

public class GuiceSampleTester {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new GuiceTestModule());
		GuiceTestService guiceTestService = injector.getInstance(GuiceTestService.class);
		guiceTestService.showApplicationMessage();
	}
}
