package org.entitylabs;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Application implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		var applicationContext= new AnnotationConfigWebApplicationContext();
			applicationContext.registerShutdownHook();
			
			applicationContext.setServletContext(servletContext);
			applicationContext.register(ApplicationConfiguration.class);
			applicationContext.refresh();

	        ServletRegistration.Dynamic dispatcher = servletContext
	                .addServlet("dispatcher", new DispatcherServlet(applicationContext));

	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
			
	}

}
