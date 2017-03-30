package persistence;

import java.util.LinkedList;
import java.util.List;

import entities.Account;
import entities.MultiUserAccount;
import entities.SingleUserAccount;
import persistence.fake.FakeMultiAccountPersistence;
import persistence.fake.FakeSingleAccountPersistence;

public class PersistenceHandler {

	SingleAccountPersistence sap = new FakeSingleAccountPersistence();
	MultiAccountPersistence map = new FakeMultiAccountPersistence();

	public Account getAccountByName(String accountName) {
		if (sap.getUserAccountByName(accountName) != null)
			return sap.getUserAccountByName(accountName);
		if (map.getUserAccountByName(accountName) != null)
			return map.getUserAccountByName(accountName);
		return null;
	}

	public Account saveAccount(Account a) {
		if(a instanceof SingleUserAccount)
			return sap.saveAccount(((SingleUserAccount)a));
		if(a instanceof MultiUserAccount)
			return map.saveAccount(((MultiUserAccount)a));
		return null;
}
	
	public List<Account> getAccounts() {
		List<Account> result = new LinkedList<>();
		for(SingleUserAccount sua : sap.getUserAccounts())
			result.add(sua);
		for(MultiUserAccount mua : map.getUserAccounts())
			result.add(mua);
		return result;
	}
}
