package org.entitylabs;

import org.entitylabs.bean.Editor;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {

		/**
		 * Multiple resource types for creation of beans annotation + xml
		 */
		try (var applicationContext = new GenericApplicationContext()) {
			new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("classpath:beans/beans1.xml");

			AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(applicationContext);
			reader.registerBean(Editor.class);
			applicationContext.refresh();

			System.out.println(applicationContext.getBean("reader"));
			System.out.println(applicationContext.getBean("reader"));

			System.out.println(applicationContext.getBean("writer"));
			System.out.println(applicationContext.getBean("writer"));

			System.out.println(applicationContext.getBean("editor"));
			System.out.println(applicationContext.getBean("editor"));

		} catch (Exception e) {
			System.err.print(e);
		}

		/**
		 * Multi context example
		 */

//		try (var applicationContext2 = new GenericApplicationContext()) {
//			AnnotatedBeanDefinitionReader reader2 = new AnnotatedBeanDefinitionReader(applicationContext2);
//			reader2.registerBean(Editor.class);
//			applicationContext2.refresh();
//
//			System.out.println(applicationContext2.getBean("editor"));
//			System.out.println(applicationContext2.getBean("editor"));
//
//		} catch (Exception e) {
//			System.err.print(e);
//		}
	}

}
