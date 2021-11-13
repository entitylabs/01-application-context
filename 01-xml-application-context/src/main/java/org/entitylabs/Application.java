package org.entitylabs;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		try(var applicationContext = new ClassPathXmlApplicationContext(
				"classpath:/beans/beans1.xml", 
				"beans2.xml")){
			var readerBean=applicationContext.getBean("reader");
			System.out.printf("Redader bean id: %s",readerBean.hashCode());
			
			System.out.println();
			var readerBean2=applicationContext.getBean("reader");
			System.out.printf("Redader bean id: %s",readerBean2.hashCode());
		}catch (Exception e){
			System.out.println(e);
			System.out.println("Error while closing context");
		}
		
		
//		// from absolute path outside the application
//		try(var applicationContext = new FileSystemXmlApplicationContext(
//				"file:/home/entitylabs/entity-labs/backend/spring-core/01-application-context/01-xml-application-context/beans1.xml")){
//			var readerBean=applicationContext.getBean("reader");
//			System.out.printf("Redader bean id: %s",readerBean.hashCode());
//			
//			System.out.println();
//			var readerBean2=applicationContext.getBean("reader");
//			System.out.printf("Redader bean id: %s",readerBean2.hashCode());
//		}catch (Exception e){
//			
//			System.out.println("Error while closing context");
//		}
		
	}

}
