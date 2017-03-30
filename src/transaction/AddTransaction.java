package transaction;


import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Column;
import org.zkoss.zul.Columns;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Vlayout;

import main.Main;

public class AddTransaction extends Div {
	public AddTransaction(Main main) {
		//Grid Declaration
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
		
		//Zeile 1 - Schuldner
		Row r = new Row();
		r.setParent(rows);
		
		Cell cell = new Cell();
		cell.setParent(r);
		Label l = new Label("Schuldner");
		cell.setParent(r);
		
		cell = new Cell();
		cell.setParent(r);
		Combobox userPicker = new Combobox();
		userPicker.setParent(cell);
		
		//Zeile 2 - Geldgeber
		r = new Row();
		r.setParent(rows);
		
		cell = new Cell();
		cell.setParent(r);
		
		//Zeile 3
		r = new Row();
		r.setParent(rows);
		
				cell = new Cell();
		cell.setParent(r);
		l = new Label();
		l.setParent(cell);
		l.setValue("Betrag");
		
		cell = new Cell();
		cell.setParent(r);
		Doublebox d = new Doublebox();
		d.setParent(c);
		
		//Zeile 4 - Betreff / Beschreibung d. Transaktion - du bist dran, Sara! :-)
	}
	
	
}
