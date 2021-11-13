package org.entitylabs;

import org.entitylabs.config.ApplicationBeansScanner;
import org.entitylabs.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/** scanning a file containing @componentScan 
		 * 
		 **/
//		try(var applicationContext= new AnnotationConfigApplicationContext(ApplicationBeansScanner.class)){
//			applicationContext.registerShutdownHook();
//		}catch(Exception e) {
//			System.out.println("Error in application context");
//		}
		
		/**
		 * scanning a configuration file containing bean definitions
		 */
		try(var applicationContext= new AnnotationConfigApplicationContext(ApplicationConfig.class)){
			applicationContext.registerShutdownHook();
		}catch(Exception e) {
			System.out.println("Error in application context");
		}
	
	}

}
