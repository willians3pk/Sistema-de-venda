/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Items;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class TelaEdicao extends javax.swing.JFrame {

    Items item;

    /**
     * Creates new form TelaEdicao
     */
    public TelaEdicao() {
        initComponents();
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        camp_nomeItem = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        camp_valorCompra = new javax.swing.JFormattedTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        camp_qnt = new javax.swing.JFormattedTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        camp_descricao = new javax.swing.JTextArea();
        comBox_fornecedor = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        jSeparator46 = new javax.swing.JSeparator();
        jSeparator47 = new javax.swing.JSeparator();
        jSeparator48 = new javax.swing.JSeparator();
        btn_cadItem15 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        camp_valorVenda = new javax.swing.JFormattedTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        camp_codigo = new javax.swing.JFormattedTextField();
        jLabelObrigatorioVenda = new javax.swing.JLabel();
        jLabelObrigatorioQnt = new javax.swing.JLabel();
        jLabelObrigatorioCodigo1 = new javax.swing.JLabel();
        jLabelObrigatorioNome1 = new javax.swing.JLabel();
        jLabelObrigatorioCompra = new javax.swing.JLabel();
        jSeparator49 = new javax.swing.JSeparator();
        btn_cancelar = new javax.swing.JButton();
        comBox_tamanho = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuDesativarItem = new javax.swing.JMenuItem();
        jMenuExcluir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(camp_nomeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, -1));

        jLabel76.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel76.setText("Nome:");
        jPanel16.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel77.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel77.setText("Valor Compra:");
        jPanel16.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        try {
            camp_valorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel16.add(camp_valorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, -1));

        jLabel78.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel78.setText("Tamanho:");
        jPanel16.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel79.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel79.setText("Qnt:");
        jPanel16.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        camp_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel16.add(camp_qnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 100, -1));

        camp_descricao.setColumns(20);
        camp_descricao.setRows(5);
        jScrollPane16.setViewportView(camp_descricao);

        jPanel16.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 460, 190));

        comBox_fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(comBox_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 240, -1));

        jLabel80.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel80.setText("Fornecedor:");
        jPanel16.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        jSeparator46.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel16.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 10, 210));
        jPanel16.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 790, 10));
        jPanel16.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 363, 800, 10));

        btn_cadItem15.setText("Atualizar");
        btn_cadItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadItem15ActionPerformed(evt);
            }
        });
        jPanel16.add(btn_cadItem15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jLabel81.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel81.setText("Valor Venda:");
        jPanel16.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        try {
            camp_valorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel16.add(camp_valorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 60, -1));

        jLabel82.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel82.setText("Descrição:");
        jPanel16.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel83.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel83.setText("Codigo:");
        jPanel16.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        camp_codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel16.add(camp_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, -1));

        jLabelObrigatorioVenda.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioVenda.setText("*");
        jPanel16.add(jLabelObrigatorioVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 10, -1));

        jLabelObrigatorioQnt.setForeground(new java.awt.Color(255, 0, 3));
        jLabelObrigatorioQnt.setText("*");
        jPanel16.add(jLabelObrigatorioQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, -1));

        jLabelObrigatorioCodigo1.setForeground(new java.awt.Color(255, 0, 3));
        jLabelObrigatorioCodigo1.setText("*");
        jPanel16.add(jLabelObrigatorioCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 10, -1));

        jLabelObrigatorioNome1.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioNome1.setText("*");
        jPanel16.add(jLabelObrigatorioNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 20, -1));

        jLabelObrigatorioCompra.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioCompra.setText("*");
        jPanel16.add(jLabelObrigatorioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 10, -1));
        jPanel16.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 790, 10));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel16.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 90, -1));

        comBox_tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G", "GG" }));
        jPanel16.add(comBox_tamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 90, -1));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 830, 430));

        jMenu1.setText("Opções");

        jMenuDesativarItem.setText("Desativar item");
        jMenuDesativarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDesativarItemActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDesativarItem);

        jMenuExcluir.setText("Excluir");
        jMenuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExcluirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuExcluir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(898, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadItem15ActionPerformed
        AtualizarItem();
    }//GEN-LAST:event_btn_cadItem15ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jMenuDesativarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDesativarItemActionPerformed
        DesativarItem();
    }//GEN-LAST:event_jMenuDesativarItemActionPerformed

    private void jMenuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExcluirActionPerformed
        Excluir();
    }//GEN-LAST:event_jMenuExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadItem15;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JFormattedTextField camp_codigo;
    private javax.swing.JTextArea camp_descricao;
    private javax.swing.JTextField camp_nomeItem;
    private javax.swing.JFormattedTextField camp_qnt;
    private javax.swing.JFormattedTextField camp_valorCompra;
    private javax.swing.JFormattedTextField camp_valorVenda;
    private javax.swing.JComboBox<String> comBox_fornecedor;
    private javax.swing.JComboBox<String> comBox_tamanho;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabelObrigatorioCodigo1;
    private javax.swing.JLabel jLabelObrigatorioCompra;
    private javax.swing.JLabel jLabelObrigatorioNome1;
    private javax.swing.JLabel jLabelObrigatorioQnt;
    private javax.swing.JLabel jLabelObrigatorioVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDesativarItem;
    private javax.swing.JMenuItem jMenuExcluir;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    // End of variables declaration//GEN-END:variables

    public void CarregarCampos() {

        String qnt = String.valueOf(item.getQnt());
        String valorCompra = String.valueOf(item.getValor_compra());
        String valorVenda = String.valueOf(item.getValor_venda());
        String codigo = String.valueOf(item.getCodigo());

        camp_nomeItem.setText(item.getItem());
        camp_qnt.setText(qnt);
        camp_valorCompra.setText(valorCompra);
        camp_valorVenda.setText(valorVenda);
        camp_descricao.setText(item.getDescricao());
        camp_codigo.setText(codigo);

    }

    private void AtualizarItem() {

        if (camp_nomeItem.getText().length() > 0) {
            jLabelObrigatorioVenda.setVisible(false);
        } else {
            jLabelObrigatorioVenda.setVisible(true);
        }
        if (camp_codigo.getText().length() > 0) {
            jLabelObrigatorioQnt.setVisible(false);
        } else {
            jLabelObrigatorioQnt.setVisible(true);
        }
        if (camp_qnt.getText().length() > 0) {
            jLabelObrigatorioQnt.setVisible(false);
        } else {
            jLabelObrigatorioQnt.setVisible(true);
        }
        if (camp_valorCompra.getText().length() > 0) {
            jLabelObrigatorioCompra.setVisible(false);
        } else {
            jLabelObrigatorioCompra.setVisible(true);
        }
        if (camp_valorVenda.getText().length() > 0) {
            jLabelObrigatorioVenda.setVisible(false);
        } else {
            jLabelObrigatorioVenda.setVisible(true);
        }

        if ((camp_nomeItem.getText().length() > 0)
                && (camp_codigo.getText().length() > 0)
                && (camp_qnt.getText().length() > 0)
                && (camp_valorCompra.getText().length() > 0)
                && (camp_valorVenda.getText().length() > 0)) {

            Long precoCompra = Long.parseLong(camp_valorCompra.getText().replaceAll(",", ""));//remove a virgula e adiciona apenas os numeros decimais
            Long precoVenda = Long.parseLong(camp_valorVenda.getText().replaceAll(",", "")); //remove a virgula e adiciona apenas os numeros decimais
//            Long peso = Long.parseLong(camp_peso.getText());
            Long codigo = Long.parseLong(camp_codigo.getText());
            int quantidade = Integer.parseInt(camp_qnt.getText());
            int valorTotal = (int) (precoVenda * quantidade);

// -- AINDA ESTÁ FALTANDO ACRESCENTAR FORNECEDOR --
            item.setItem(camp_nomeItem.getText());
            item.setValor_compra(precoCompra);
            item.setValor_venda(precoVenda);
            item.setCodigo(codigo);
//            boolean status = chekBoxAtivado.isSelected();
            item.setStatus(true);
            item.setTamanho(comBox_tamanho.getSelectedItem().toString());
            item.setQnt(quantidade);
            item.setDescricao(camp_descricao.getText());
            item.setValor_total(valorTotal);

            Conexao banco = new Conexao();
            banco.update(item); // ATUALIZA OS DADOS DO ITEM QUE FOI SELECIONADO;

//            LIMPA TODOS OS CAMPOS NOVAMENTE
            camp_nomeItem.setText("");
            camp_codigo.setText("");
            camp_valorCompra.setText("");
            camp_valorVenda.setText("");
            camp_qnt.setText("");
            camp_descricao.setText("");

            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
    }

    private void DesativarItem() {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Você Deseja desativar esse item?", "Desativar", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            item.setStatus(false);
            Conexao banco = new Conexao();
            banco.update(item); // ATUALIZA OS DADOS DO ITEM QUE FOI SELECIONADO;
            JOptionPane.showMessageDialog(null, "Voce pode ativa o item novamente quando quiser, \nbasta ir na tela principal do sistema na barra menu configurações!");
            dispose();
        }
    }

    private void Excluir() {
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Voce deseja Realmente Excluir este item?", "Excluir", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            item.setExcluido(true);
            item.setStatus(false);
            Conexao banco = new Conexao();
            banco.update(item); // ATUALIZA OS DADOS DO ITEM QUE FOI SELECIONADO;
            JOptionPane.showMessageDialog(null, "Item Excluido com Sucesso!!");
            dispose();
        }
    
    }
    
}
