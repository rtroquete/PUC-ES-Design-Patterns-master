package br.puc.se.designPatterns.creational.factory;

public class LogFactory {

	public OutputLogger of(LoggerType type) {

		switch (type) {
		case CONSOLE:
			return new ConsoleOutputLogger();
		case FILE:
			return new FileOutputLogger();
		case HTTP_POST:
			return new HTTPOutputLogger();
		case JMS:
			return new JMSOutputLogger();
		default:
			throw new RuntimeException();
		}

	}

}
