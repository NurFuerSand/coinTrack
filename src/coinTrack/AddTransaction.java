package coinTrack;

import java.awt.Label;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Column;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Div;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Vlayout;

public class AddTransaction extends Div {
	public AddTransaction(Main m) {
		Grid g = new Grid();
		g.setParent(this);
		
		Rows rows = new Rows();
		rows.setParent(g);
		Columns cols = new Columns();
		cols.setParent(g);
		
		Column c = new Column();
		c.setParent(cols);
		c = new Column();
		c.setParent(cols);
		
		
		Row r = new Row();
		r.setParent(rows);
		
		//Ab hier nachmachen
		Cell cell = new Cell();
		cell.setParent(r);
		Label l = new Label();
		l.setText("Betrag");
		
		cell = new Cell();
		cell.setParent(r);
		Doublebox d = new Doublebox();
		d.setParent(c);
		
		
	}
	
	
}
