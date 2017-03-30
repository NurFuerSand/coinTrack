package persistence.fake;

import java.util.LinkedList;
import java.util.List;

import entities.SingleUserAccount;
import persistence.SingleAccountPersistence;

public class FakeSingleAccountPersistence implements SingleAccountPersistence {

	private static final List<SingleUserAccount> accs = new LinkedList<>();
	private static boolean hasBeenInitialized = false;
	
	public FakeSingleAccountPersistence() {
		if(!hasBeenInitialized){
			accs.add(new SingleUserAccount("Sara Buick", new LinkedList<>()));
			accs.add(new SingleUserAccount("Tim Staat", new LinkedList<>()));
			accs.add(new SingleUserAccount("Jonathan Langer", new LinkedList<>()));
			accs.add(new SingleUserAccount("Nicolas Hoffmann", new LinkedList<>()));
			accs.add(new SingleUserAccount("Dummy", new LinkedList<>()));
			hasBeenInitialized = true;
		}
	}
	
	
	@Override
	public SingleUserAccount getUserAccountByName(String userName) {
		for(SingleUserAccount sua : accs)
			if(sua.getUserName().equalsIgnoreCase(userName))
				return sua;
		return null;
	}

	@Override
	public List<SingleUserAccount> getUserAccounts() {
		List<SingleUserAccount> result = new LinkedList<>();
		for (SingleUserAccount sua : accs)
			result.add(new SingleUserAccount(sua.getUserName(), sua.getTransactionList()));
		return result;
	}

	@Override
	public SingleUserAccount saveAccount(SingleUserAccount acc) {
		for(SingleUserAccount sua : accs)
			if(sua.getUserName().equalsIgnoreCase(acc.getUserName())) {
				accs.remove(sua);
				accs.add(new SingleUserAccount(acc.getUserName(), acc.getTransactionList()));
			}
		return acc;
	}

}
