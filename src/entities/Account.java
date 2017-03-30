package entities;

import java.util.List;

public abstract class Account {
	
	private List<Transaction> transactionList;

	public abstract boolean isChargeable();
	
	public abstract boolean canReceive();
	
	public abstract void addTransaction(Transaction transaction);
	
	public abstract List<Transaction> getTransactionList();
	
	public abstract void getCurrentValueByAccount(Account account);
}
