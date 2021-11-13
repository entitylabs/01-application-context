package org.entitylabs;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Application {

	public static void main(String[] args) {

		/**
		 * scanning a configuration file containing bean definitions
		 */
		var applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.registerShutdownHook();

	}

}
