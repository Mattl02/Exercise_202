
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
    
    public void hideBand(){
        colNames = new String[2];
        colNames[0] = "Sender";
        colNames[1] = "Frequenz";
        this.fireTableStructureChanged();
    }
    
    public void showBand(){
        colNames = new String[3];
        colNames[0] = "Sender";
        colNames[1] = "Frequenz";
        colNames[2] = "Band";
        this.fireTableStructureChanged();
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

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    

}
