/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Items;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author willian
 */
public class Pesquisas extends javax.swing.JFrame {

    Conexao banco = new Conexao();
    TelaEdicao tela = new TelaEdicao();

    /**
     * Creates new form Pesquisas
     */
    public Pesquisas() {
        initComponents();
        btn_editar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTable = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_items2 = new javax.swing.JTable();
        camp_pesquisa2 = new javax.swing.JTextField();
        btn_pesquisa2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_items1 = new javax.swing.JTable();
        camp_pesquisa1 = new javax.swing.JTextField();
        btn_pesquisa1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        camp_pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_items = new javax.swing.JTable();
        btn_pesquisa = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        areaTrabalho = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_items2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "nome", "cnpj", "email", "home page", "rua", "cep", "bairro", "contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_items2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 220));
        jPanel1.add(camp_pesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 370, 30));

        btn_pesquisa2.setText("pesquisar");
        btn_pesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisa2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 40));

        jLabel3.setText("Pesquisa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        jPanelTable.addTab("Fornecedor", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_items1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "nome", "cpf", "email", "contato", "data nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_items1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 220));
        jPanel2.add(camp_pesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 370, 30));

        btn_pesquisa1.setText("pesquisar");
        btn_pesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisa1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 40));

        jLabel2.setText("Pesquisa:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        jPanelTable.addTab("Pessoas", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(camp_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 370, 30));

        jLabel1.setText("Pesquisa:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        table_items.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "codigo", "nome", "valor", "qnt", "fornecedor", "descrição", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_itemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_items);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 220));

        btn_pesquisa.setText("pesquisar");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 110, 40));

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 356, 90, 40));

        jPanelTable.addTab("Itens", jPanel3);

        getContentPane().add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 900, 450));
        getContentPane().add(areaTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 950, 530));

        setSize(new java.awt.Dimension(965, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        AtualizarTabela();
        btn_editar.setVisible(false);
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        EditarItem();
        tela.setVisible(true);
        tela.CarregarCampos();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_pesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisa1ActionPerformed

    private void btn_pesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisa2ActionPerformed

    private void table_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_itemsMouseClicked
        btn_editar.setVisible(true);
    }//GEN-LAST:event_table_itemsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_pesquisa1;
    private javax.swing.JButton btn_pesquisa2;
    private javax.swing.JTextField camp_pesquisa;
    private javax.swing.JTextField camp_pesquisa1;
    private javax.swing.JTextField camp_pesquisa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jPanelTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_items;
    private javax.swing.JTable table_items1;
    private javax.swing.JTable table_items2;
    // End of variables declaration//GEN-END:variables

    public void AtualizarTabela() {
        
        String pesquisa = camp_pesquisa.getText();
        List<Items> items = new ArrayList<>();

        for (int i = 0; i < banco.list_Items().size(); i++) {
            if (banco.list_Items().get(i).getItem().contains(pesquisa)) { // VERIFICA SE A STRING CONTEM NO BANCO DE DADOS
                Items item = banco.list_Items().get(i);
                System.out.println(item.getItem());
                items.add(item);                                          // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
            };
        }
        DefaultTableModel tableDefault = (DefaultTableModel) table_items.getModel();
        try {

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Items item : items) {
                Long l = item.getValor_venda() / 100; // A DIVISÃO POR 100 É APENAS PRA MOVER A VIRGULA 3 CASAS DECIMAIS.
                int t = item.getValor_total() / 100; // A DIVISÃO POR 100 É APENAS PRA MOVER A VIRGULA 3 CASAS DECIMAIS.

                String valorVenda = DecimalFormat.getNumberInstance().format(l);
                String valorTotal = DecimalFormat.getNumberInstance().format(t);

                tableDefault.addRow(new Object[]{item.getIditem(), item.getCodigo(), item.getItem(), "R$ " + valorVenda,
                    item.getQnt(), item.getFornecedor(), item.getDescricao(), "R$ " + valorTotal});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a tabela Itens>");
        }

    }

    private void EditarItem() {

        DefaultTableModel tableDefault = (DefaultTableModel) table_items.getModel();
        int linha = table_items.getSelectedRow();

        for (int i = 0; i < banco.list_Items().size(); i++) {
            if (banco.list_Items().get(i).getIditem().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO ONTEM NO BANCO DE DADOS
                Items item = banco.list_Items().get(i);
                tela.setItem(item); //MANDA O ITEM SELECIONADO PARA OUTRA TELA UTILIZANDO O METODO GETT E SETT
            }
        }
    }
}
