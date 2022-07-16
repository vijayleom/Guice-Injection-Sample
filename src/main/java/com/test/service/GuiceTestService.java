package com.test.service;

import com.google.inject.Inject;
import com.test.welcome.WelcomeMessage;

public class GuiceTestService {

	private WelcomeMessage welcomeMessage;
	
	/**
	 * @param welcomeMessage
	 */
	@Inject
	public GuiceTestService(WelcomeMessage welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	
	public void showApplicationMessage() {
		this.welcomeMessage.message();
	}
	
}
