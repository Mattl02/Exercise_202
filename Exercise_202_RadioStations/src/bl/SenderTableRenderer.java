
package bl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Matthias
 */
public class SenderTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label = new JLabel("", SwingConstants.CENTER);
        label.setOpaque(true);
        Sender s = (Sender) value;
        
        switch(col){
            case 0:
                label.setText(s.getName());
                break;
            case 1:
                label.setText(s.getFrequenz()+"");
                break;
            case 2:
                label.setText(s.getBand());
                break;
        }
        
        
        label.setFont(new Font("Arial", Font.ITALIC, 14));
        if(isSelected){
            label.setForeground(Color.WHITE);
            label.setBackground(Color.black);
        }
        else{
            label.setForeground(Color.LIGHT_GRAY);
            if(s.getBand().equals("FM")){
                label.setBackground(Color.RED);
            }
            else label.setBackground(Color.blue);
        } 
        
        return label;
    }

}
