package br.puc.se.designPatterns.creational.builder;

public class HttpInputConnection {

	private String protocol;

	private String host;

	private Integer port;

	private String method;
	
	public HttpInputConnection(){}
	
	HttpInputConnection(String protocol, String host, Integer port, String method) {
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.method = method;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String createCURLCommandUsingConnection() {
		return String.format("curl -X %s %s:%s:%s", this.method, this.protocol, this.host, this.port);
	}

}
