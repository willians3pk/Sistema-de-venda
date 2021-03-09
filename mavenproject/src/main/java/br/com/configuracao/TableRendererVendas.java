
package br.com.configuracao;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableRendererVendas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        String estado = table.getModel().getValueAt(row, 6).toString();
        if(estado.equals("PAGO")){
//            comp.setBackground(Color.LIGHT_GRAY);
            comp.setForeground(Color.BLACK);
//            comp.setBackground(new Color(100, 200, 50));
        } else if(estado.equals("RECEBER")){
//            comp.setBackground(Color.YELLOW);
            comp.setForeground(Color.red);
//            comp.setBackground(new Color(255, 91, 96));
        }else if(estado.equals("CANCELADO")){
            comp.setForeground(Color.ORANGE);
//            comp.setBackground(new Color(109, 149, 254));
        }
                
        return comp;
    }

}

