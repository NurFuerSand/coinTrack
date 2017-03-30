package persistence;

import java.util.List;

import entities.SingleUserAccount;

public interface SingleAccountPersistence {
	
	public SingleUserAccount getUserAccountByName(String userName);
	
	public List<SingleUserAccount> getUserAccounts();
	
	public SingleUserAccount saveAccount(SingleUserAccount acc);

}
