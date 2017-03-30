package entities;

import java.util.List;

public class SingleUserAccount extends Account {
	private static final boolean chargeable = true;
	private static final boolean canReceive = true;	
	
	private List<Transaction> transactionList;
	private String userName;
	
	public SingleUserAccount(String userName, List<Transaction> transactionList) {
		this.userName = userName;
		this.transactionList = transactionList;
	}
	
	@Override
	public boolean isChargeable() {
		return chargeable;
	}

	@Override
	public boolean canReceive() {
		return canReceive;
	}

	@Override
	public void addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Transaction> getTransactionList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCurrentValueByAccount(Account account) {
		// TODO Auto-generated method stub

	}

	public String getUserName() {
		return userName;
	}
	
	public void saveChanges() {
		
	}
}
