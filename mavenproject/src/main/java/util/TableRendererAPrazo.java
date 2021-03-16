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
public class TableRendererAPrazo extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String estado = table.getModel().getValueAt(row, 2).toString();
        if (estado.equals("PAGO")) {
            comp.setBackground(Color.GREEN);
            comp.setForeground(Color.BLACK);
//            comp.setBackground(new Color(100, 200, 50));
        } else if (estado.equals("PENDENTE")) {
            comp.setBackground(Color.red);
            comp.setForeground(Color.black);
//            comp.setBackground(new Color(255, 91, 96));
        }

        return comp;
    }
}
