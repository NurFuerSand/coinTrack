package main;



import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Borderlayout;
import org.zkoss.zul.Button;
import org.zkoss.zul.Center;
import org.zkoss.zul.Label;
import org.zkoss.zul.North;
import org.zkoss.zul.Vlayout;
import org.zkoss.zul.Window;

import navigation.Navigation;
import transaction.AddTransaction;

public class Main extends GenericRichlet {

	final static public double version = 0.1;
	
	final private Center content = new Center();
	
	
	@Override
	public void service(Page page) throws Exception {
		
		
		final Borderlayout mainLayout = new Borderlayout();
		mainLayout.setWidth("800px");
		mainLayout.setHeight("1200px");
	    mainLayout.setPage(page);
	    
	    North header = new North();
	    header.setParent(mainLayout);
	    header.setWidth(mainLayout.getWidth());
	    header.setHeight("25px");

	    Label heading = new Label("Saras and Tims coinTrack programme v" + version);
	    heading.setParent(header);
	    
	    content.setParent(mainLayout);
	    
	    navigateTo(new Navigation(this));
	}
	
	public void navigateTo(Component c) {
		content.getChildren().clear();
		c.setParent(content);
	}

}
