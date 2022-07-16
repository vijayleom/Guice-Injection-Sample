package com.test.module;

import com.google.inject.AbstractModule;
import com.test.welcome.WelcomeMessage;
import com.test.welcome.WelcomeMessageImpl;

public class GuiceTestModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(WelcomeMessage.class).to(WelcomeMessageImpl.class);
	}
}
