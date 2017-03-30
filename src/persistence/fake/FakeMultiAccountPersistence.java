package persistence.fake;

import java.util.LinkedList;
import java.util.List;

import entities.MultiUserAccount;
import entities.SingleUserAccount;
import persistence.MultiAccountPersistence;

public class FakeMultiAccountPersistence implements MultiAccountPersistence{
	private static final List<MultiUserAccount> accs = new LinkedList<>();
	private static boolean hasBeenInitialized = false;
	
	public FakeMultiAccountPersistence() {
		if(!hasBeenInitialized){
			List<SingleUserAccount> membersNoe = new LinkedList<SingleUserAccount>();
			FakeSingleAccountPersistence fsap = new FakeSingleAccountPersistence();
			membersNoe.add(fsap.getUserAccountByName("Tim Staat"));
			membersNoe.add(fsap.getUserAccountByName("Jonathan Langer"));
			membersNoe.add(fsap.getUserAccountByName("Nicolas Hoffmann"));
			accs.add(new MultiUserAccount("Nö, Danke.", new LinkedList<>(), membersNoe));
			hasBeenInitialized = true;
		}
	}
	@Override
	public MultiUserAccount getUserAccountByName(String accountName) {
		for(MultiUserAccount mua : accs)
			if(mua.getAccountName().equalsIgnoreCase(accountName))
				return mua;
		return null;
	}

	@Override
	public List<MultiUserAccount> getUserAccounts() {
		List<MultiUserAccount> result = new LinkedList<>();
		for (MultiUserAccount mua : accs)
			result.add(new MultiUserAccount(mua.getAccountName(), mua.getTransactionList(), mua.getMembers()));
		return result;
	}

	@Override
	public MultiUserAccount saveAccount(MultiUserAccount acc) {
		for(MultiUserAccount mua : accs)
			if(mua.getAccountName().equalsIgnoreCase(acc.getAccountName())) {
				accs.remove(mua);
				accs.add(new MultiUserAccount(acc.getAccountName(), acc.getTransactionList(), acc.getMembers()));
			}
		return acc;
	}

}
