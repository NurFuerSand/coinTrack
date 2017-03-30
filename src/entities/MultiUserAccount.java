package entities;

import java.util.List;

import entities.Account;

public class MultiUserAccount extends Account{

	private List<Transaction> transactionList;
	private String accountName;
	private List<Account> members;
	
	public <T extends Account> MultiUserAccount(String accountName, List<Transaction> transactionList, List<T> members) {
		this.transactionList = transactionList;
		this.accountName = accountName;
		this.members = (List<Account>)members;
	}
	
	@Override
	public boolean isChargeable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canReceive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addTransaction(Transaction transaction) {
		
	}

	@Override
	public List<Transaction> getTransactionList() {
		return transactionList;
		
	}

	public String getAccountName() {
		return accountName;
	}
	
	@Override
	public void getCurrentValueByAccount(Account account) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Account> getMembers() {
		return members;
	}

}
