package br.puc.se.designPatterns.creational.builder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HttpInputBuilder implements InputBuilder<HttpInputConnection> {
	
	private String host;
	private Properties connectionProperties;
	private String protocol;
	private Integer port;
	private String method;

	public HttpInputBuilder fromPropertyFile(String fileName) throws FileNotFoundException, IOException {
		this.connectionProperties = BuilderUtilities.readPropertiesFromResourceFile(fileName);
		this.host = connectionProperties.getProperty("host");
		this.port = Integer.parseInt(connectionProperties.getProperty("port"));
		this.protocol = connectionProperties.getProperty("protocol");
		this.method = connectionProperties.getProperty("method");
		return this;
	}

	@Override
	public Input<HttpInputConnection> build() {
		HttpInputConnection httpInputConnection = new HttpInputConnection(protocol, host, port, method);
		return () -> httpInputConnection;
	}
	
	public HttpInputBuilder fromHost(String host) {
		this.host = host;
		return this;
	}
	
	public HttpInputBuilder usingProtocol(String protocol) {
		this.protocol= protocol;
		return this;
	}
	
	public HttpInputBuilder onPort(Integer port) {
		this.port = port;
		return this;
	}
	
	public HttpInputBuilder usingMethod(String method) {
		this.method = method;
		return this;
	}

}
