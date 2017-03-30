package navigation;

import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Button;
import org.zkoss.zul.Vlayout;

import main.Main;
import transaction.AddTransaction;

public class Navigation extends Vlayout {
	
	public Navigation(Main main) {
		this.setStyle("text-align: center;");
		
	    Button addTransaction = new Button();
	    addTransaction.setLabel("Add Transaction");
	    addTransaction.setParent(this);
	    addTransaction.addEventListener(Events.ON_CLICK, e -> main.navigateTo(new AddTransaction(main)));
	}

}
