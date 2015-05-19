package org.supermartng.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.supermartng.di.consumer.MyXMLApplication;

public class ClientXMLApplication {
	 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);
 
        app.processMessage("Hi Lukmon", "lukmon@supermartng.com");
 
        // close the context
       // context.close();
    }
 
}
