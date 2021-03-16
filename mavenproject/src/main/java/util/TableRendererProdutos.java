/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author user
 */
public class TableRendererProdutos extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String estado = table.getModel().getValueAt(row, 5).toString();
        Integer Qtde = Integer.parseInt(estado);
        if (Qtde <= 0) {
            comp.setBackground(Color.RED);
            comp.setForeground(Color.BLACK);
//            comp.setBackground(new Color(100, 200, 50));
        } else if (Qtde >=3) {
            comp.setForeground(Color.black);
            comp.setBackground(new Color(247,247,247));
        } else if (Qtde <=2) {
            comp.setForeground(Color.BLACK);
            comp.setBackground(Color.YELLOW);
//            comp.setBackground(new Color(109, 149, 254));
        }

        return comp;
    }
}
