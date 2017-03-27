package coinTrack;


import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Vlayout;
import org.zkoss.zul.Window;

public class Main extends GenericRichlet {

	@Override
	public void service(Page page) throws Exception {
		final Window w = new Window("coinTrack by Sara and Tim", "normal", false);
		w.setWidth("800px");
		w.setHeight("1200px");
	    w.setPage(page);
	    
	    Vlayout v = new Vlayout();
	    v.setParent(w);
	    
	    Button addTransaction = new Button();
	    addTransaction.setLabel("Add Transaction");
	    addTransaction.setParent(v);
	    addTransaction.addEventListener(Events.ON_CLICK, e -> new AddTransaction(this).setParent(w));

	}

}
