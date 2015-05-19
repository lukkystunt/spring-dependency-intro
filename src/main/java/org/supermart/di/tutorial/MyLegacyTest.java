package org.supermart.di.tutorial;

import org.supermartng.withoutdi.tutorial.EmailService;

public class MyLegacyTest {
	
	 public static void main(String[] args) {
		MyApplication app = new MyApplication(new EmailService());
		app.processMessages("Hi all", "alebiosulukmon@yahoo.com");
	 }
}
