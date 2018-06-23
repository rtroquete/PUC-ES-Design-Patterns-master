package br.puc.se.designPatterns.creational.builder;

import static java.util.Objects.isNull;

import java.io.IOException;
import java.util.Properties;

public class ResourceFileBuilder implements InputBuilder<String> {
	
	private Properties connectionProperties;

	@Override
	public Input<String> build() {
		return () -> isNull(connectionProperties) ? "no content" : connectionProperties.toString();
	}
	
	public ResourceFileBuilder fromResource(String fileName) {
		try {
			this. connectionProperties = BuilderUtilities.readPropertiesFromResourceFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	} 

}
