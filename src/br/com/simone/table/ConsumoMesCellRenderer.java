
package br.com.simone.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ConsumoMesCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    
        if ( row % 2 == 0 ) {
            Color c = new Color(176, 196, 222);
            setBackground( c );
        } else {
            setBackground( null );
        }
        
        if ( isSelected ) {
            setBackground( Color.blue );
        }
        
        table.getColumnModel().getColumn( 0 ).setMaxWidth( 50 );
        table.getColumnModel().getColumn( 1 ).setMaxWidth( 300 );
        table.getColumnModel().getColumn( 2 ).setMaxWidth( 400 );
        table.getColumnModel().getColumn( 3 ).setMaxWidth( 400 );
        table.getColumnModel().getColumn( 4 ).setMaxWidth( 300 );
       
        
        return this;
    }
    
}
