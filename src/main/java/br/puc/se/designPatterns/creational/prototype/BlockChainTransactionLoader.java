package br.puc.se.designPatterns.creational.prototype;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BlockChainTransactionLoader implements Cloneable{
	
	public List<UserTransaction> loadTransactionsFromFile(String fileName) {
		return loadTheMessages(fileName);
	}
	
	private List<UserTransaction> loadTheMessages(String fileName) {
		try {
//			Thread.sleep(60000);
			Thread.sleep(6);
			return PrototypeUtils.readLinesFromResource(fileName);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return new LinkedList<>();
	}

	public BlockChainTransactionLoader deepCopy() {
		try {
			return (BlockChainTransactionLoader) this.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(); 
		}
	}
	
	
	
}
