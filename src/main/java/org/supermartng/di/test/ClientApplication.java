package org.supermartng.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.supermartng.di.configuration.DIConfiguration;
import org.supermartng.di.consumer.MyApplication;

public class ClientApplication {
	 
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
         
        app.processMessage("Hi Lukmon", "lukmon@supermartng.com");
         
        //close the context
        context.close();
    }
 
}
