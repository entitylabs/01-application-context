package org.entitylabs.config.Beans;

import javax.annotation.PreDestroy;

public class Writer {

	public Writer() {
	
		System.out.println("Writer created");
	}
	
	@PreDestroy
	public void onDestroy() {
		System.out.println("Destroying Writer bean");
	}
}
