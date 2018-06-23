package br.puc.se.designPatterns.creational.singleton;

import java.util.Objects;

public class MyCustomApplicationContext {
	
	private MyCustomApplicationContext(){}
	
	private static MyCustomApplicationContext INSTANCE;
	
	public static MyCustomApplicationContext getInstance() {
		if(Objects.isNull(INSTANCE)) {
			INSTANCE = new MyCustomApplicationContext();
			return INSTANCE;
		}
		return INSTANCE;
	}

}
