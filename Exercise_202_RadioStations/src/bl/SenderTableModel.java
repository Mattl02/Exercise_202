
package bl;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matthias
 */
public class SenderTableModel extends AbstractTableModel{

    private String[] colNames = {"Sender", "Frequenz", "Band"};
    private ArrayList<Sender> radios = new ArrayList<>();
    
    public void add(Sender s){
        radios.add(s);
        Collections.sort(radios, new SortByFrequency());
        this.fireTableRowsInserted(radios.size()-1, radios.size()-1);
    }
    
    @Override
    public int getRowCount() {
        return radios.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return radios.get(row);
    }

}
