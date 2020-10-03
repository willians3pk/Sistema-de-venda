/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Fornecedor;
import com.system.sistemamaven.Items;
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
    CadastroItens telacad = new CadastroItens();
    TelaItensDesativados telaItens = new TelaItensDesativados();
    
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
        jPanel3 = new javax.swing.JPanel();
        camp_pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_items = new javax.swing.JTable();
        btn_editar = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_novo = new javax.swing.JButton();
        checkBox_tamanho = new javax.swing.JCheckBox();
        checkBox_valor = new javax.swing.JCheckBox();
        checkBox_qnt = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuIDesativarItens = new javax.swing.JMenuItem();
        jMenuExcluirItens = new javax.swing.JMenuItem();
        jMenuIItensDesativados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(camp_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 370, 30));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa por:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 140, -1));

        table_items.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "codigo", "nome", "valor", "qnt", "fornecedor", "descrição", "tamanho", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 900, 270));

        btn_editar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 110, 30));

        btn_atualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 900, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 900, 10));

        btn_novo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, -1));

        checkBox_tamanho.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        checkBox_tamanho.setText(" Tamanho:");
        checkBox_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_tamanhoActionPerformed(evt);
            }
        });
        jPanel3.add(checkBox_tamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 120, -1));

        checkBox_valor.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        checkBox_valor.setText("Valor:");
        checkBox_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_valorActionPerformed(evt);
            }
        });
        jPanel3.add(checkBox_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 100, -1));

        checkBox_qnt.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        checkBox_qnt.setText("Quantidade:");
        checkBox_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_qntActionPerformed(evt);
            }
        });
        jPanel3.add(checkBox_qnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 130, -1));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Pesquisa:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, -1));

        jPanelTable.addTab("Itens", jPanel3);

        getContentPane().add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 960, 540));

        jMenu1.setText("Opções");

        jMenuIDesativarItens.setText("Desativar itens");
        jMenuIDesativarItens.setEnabled(false);
        jMenuIDesativarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIDesativarItensActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuIDesativarItens);

        jMenuExcluirItens.setText("Excluir itens");
        jMenuExcluirItens.setEnabled(false);
        jMenu1.add(jMenuExcluirItens);

        jMenuIItensDesativados.setText("Itens Desativados");
        jMenuIItensDesativados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIItensDesativadosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuIItensDesativados);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1012, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIDesativarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIDesativarItensActionPerformed
        DesativarItens();
    }//GEN-LAST:event_jMenuIDesativarItensActionPerformed

    private void checkBox_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_qntActionPerformed
        if (checkBox_qnt.isSelected()) {
            checkBox_tamanho.setEnabled(false);
            checkBox_valor.setEnabled(false);
        } else {
            checkBox_tamanho.setEnabled(true);
            checkBox_valor.setEnabled(true);
        }
    }//GEN-LAST:event_checkBox_qntActionPerformed

    private void checkBox_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_tamanhoActionPerformed
        if (checkBox_tamanho.isSelected()) {
            checkBox_qnt.setEnabled(false);
            checkBox_valor.setEnabled(false);
        } else {
            checkBox_qnt.setEnabled(true);
            checkBox_valor.setEnabled(true);
        }
    }//GEN-LAST:event_checkBox_tamanhoActionPerformed

    private void checkBox_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_valorActionPerformed
        if (checkBox_valor.isSelected()) {
            checkBox_tamanho.setEnabled(false);
            checkBox_qnt.setEnabled(false);
        } else {
            checkBox_qnt.setEnabled(true);
            checkBox_tamanho.setEnabled(true);
        }
    }//GEN-LAST:event_checkBox_valorActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        AtualizarTabela();
        btn_editar.setVisible(false);
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        EditarItem();
        tela.setVisible(true);
        tela.PopularComcobox();
        tela.CarregarCampos();
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void table_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_itemsMouseClicked
        btn_editar.setVisible(true);
    }//GEN-LAST:event_table_itemsMouseClicked

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        telacad.setVisible(true);
        telacad.PopularComcobox();
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void jMenuIItensDesativadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIItensDesativadosActionPerformed
        telaItens.setVisible(true);
        telaItens.ItensDesativados();
    }//GEN-LAST:event_jMenuIItensDesativadosActionPerformed

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
    private javax.swing.JButton btn_atualizar;
    public javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JTextField camp_pesquisa;
    private javax.swing.JCheckBox checkBox_qnt;
    private javax.swing.JCheckBox checkBox_tamanho;
    private javax.swing.JCheckBox checkBox_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuExcluirItens;
    public javax.swing.JMenuItem jMenuIDesativarItens;
    private javax.swing.JMenuItem jMenuIItensDesativados;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jPanelTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable table_items;
    // End of variables declaration//GEN-END:variables

    public void AtualizarTabela() {

        String pesquisa = camp_pesquisa.getText();
        List<Items> items = new ArrayList<>();

        if (!checkBox_valor.isSelected() && !checkBox_tamanho.isSelected() && !checkBox_qnt.isSelected()) {
            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getItem().contains(pesquisa)) {   // VERIFICA SE O TAMANHO CONTEM NO BANCO DE DADOS
                    Items item = banco.list_Items().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }

        if (checkBox_tamanho.isSelected() == true) {
            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getTamanho().contains(pesquisa)) {   // VERIFICA SE O TAMANHO CONTEM NO BANCO DE DADOS
                    Items item = banco.list_Items().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }
        if (checkBox_valor.isSelected() == true) {
            float valor = Float.parseFloat(pesquisa);
            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getValor_venda() == valor) {   // VERIFICA SE O VALOR CONTEM NO BANCO DE DADOS
                    Items item = banco.list_Items().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }
        if (checkBox_qnt.isSelected() == true) {
            int valor = Integer.parseInt(pesquisa);
            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getQnt() == valor) {   // VERIFICA SE A QNT CONTEM NO BANCO DE DADOS
                    Items item = banco.list_Items().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }

        DefaultTableModel tableDefault = (DefaultTableModel) table_items.getModel();
        try {

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Items item : items) {
                
                tableDefault.addRow(new Object[]{item.getIditem(), item.getCodigo(), item.getItem(), "R$ "+item.getValor_venda()/100,
                    item.getQnt(), item.fornecedor().getNome(), item.getDescricao(), item.getTamanho(), "R$ "+item.getValor_total()/100});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Item não Encontrado>");
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

    private void DesativarItens() {

        int confirmacao = JOptionPane.showConfirmDialog(null, "Você Deseja desativar *OS ITENS SELECIONADOS*?", "Desativar", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {

            DefaultTableModel tableDefault = (DefaultTableModel) table_items.getModel();
            int linha = table_items.getSelectedRow();

            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getIditem().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                    Items item = banco.list_Items().get(i);
                    item.setStatus(false);
                    banco.update(item);
                    AtualizarTabela();
                }
            }
            JOptionPane.showMessageDialog(null, "Item *DESATIVADOS* com Sucesso!");
           
        }
    }
}
