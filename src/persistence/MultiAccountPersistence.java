package persistence;

import java.util.List;

import entities.MultiUserAccount;

public interface MultiAccountPersistence {
	public MultiUserAccount getUserAccountByName(String accountName);
	
	public List<MultiUserAccount> getUserAccounts();
	
	public MultiUserAccount saveAccount(MultiUserAccount acc);
}
