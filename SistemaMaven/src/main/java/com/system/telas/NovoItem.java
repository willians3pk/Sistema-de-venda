package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Fornecedor;
import com.system.sistemamaven.Items;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class NovoItem extends javax.swing.JFrame {

    Conexao banco = new Conexao();
    public NovoItem() {
        initComponents();
        PopularComcobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camp_nomeItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        camp_valorCompra = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        camp_qnt = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        camp_descricao = new javax.swing.JTextArea();
        comBox_fornecedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btn_cadItem = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        camp_valorVenda = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        camp_codigo = new javax.swing.JFormattedTextField();
        jLabelObrigatorioVenda = new javax.swing.JLabel();
        jLabelObrigatorioQnt = new javax.swing.JLabel();
        jLabelObrigatorioCodigo1 = new javax.swing.JLabel();
        jLabelObrigatorioNome1 = new javax.swing.JLabel();
        jLabelObrigatorioCompra = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        comBox_tamanho = new javax.swing.JComboBox<>();
        btn_novoFornecedor = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camp_nomeItem.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jPanel1.add(camp_nomeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 630, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Valor Compra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        camp_valorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(camp_valorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Qnt:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        camp_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel1.add(camp_qnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, -1));

        camp_descricao.setColumns(20);
        camp_descricao.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        camp_descricao.setRows(5);
        jScrollPane1.setViewportView(camp_descricao);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 540, 140));

        comBox_fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione Fornecedor>" }));
        jPanel1.add(comBox_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 250, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Fornecedor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 900, 10));

        btn_cadItem.setText("Cadastrar");
        btn_cadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadItemActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cadItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel23.setText("Valor Venda:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        camp_valorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(camp_valorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, -1));

        jLabel31.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel31.setText("Descrição:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel32.setText("Tamanho:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 100, -1));

        camp_codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel1.add(camp_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        jLabelObrigatorioVenda.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioVenda.setText("*");
        jPanel1.add(jLabelObrigatorioVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 10, -1));

        jLabelObrigatorioQnt.setForeground(new java.awt.Color(255, 0, 3));
        jLabelObrigatorioQnt.setText("*");
        jPanel1.add(jLabelObrigatorioQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 20, -1));

        jLabelObrigatorioCodigo1.setForeground(new java.awt.Color(255, 0, 3));
        jLabelObrigatorioCodigo1.setText("*");
        jPanel1.add(jLabelObrigatorioCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 10, -1));

        jLabelObrigatorioNome1.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioNome1.setText("*");
        jPanel1.add(jLabelObrigatorioNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 20, -1));

        jLabelObrigatorioCompra.setForeground(new java.awt.Color(250, 7, 37));
        jLabelObrigatorioCompra.setText("*");
        jPanel1.add(jLabelObrigatorioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 10, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 890, 10));

        jLabel35.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel35.setText("Codigo:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        comBox_tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecione>", "P", "M", "G", "GG" }));
        jPanel1.add(comBox_tamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 140, -1));

        btn_novoFornecedor.setText("Novo");
        btn_novoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_novoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 90, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 420, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 470));

        setSize(new java.awt.Dimension(972, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadItemActionPerformed
        CadastroItem();
    }//GEN-LAST:event_btn_cadItemActionPerformed

    private void btn_novoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoFornecedorActionPerformed
        NovoFornecedor tela = new NovoFornecedor();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_novoFornecedorActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(NovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadItem;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novoFornecedor;
    private javax.swing.JFormattedTextField camp_codigo;
    private javax.swing.JTextArea camp_descricao;
    private javax.swing.JTextField camp_nomeItem;
    private javax.swing.JFormattedTextField camp_qnt;
    private javax.swing.JFormattedTextField camp_valorCompra;
    private javax.swing.JFormattedTextField camp_valorVenda;
    private javax.swing.JComboBox<String> comBox_fornecedor;
    private javax.swing.JComboBox<String> comBox_tamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelObrigatorioCodigo1;
    private javax.swing.JLabel jLabelObrigatorioCompra;
    private javax.swing.JLabel jLabelObrigatorioNome1;
    private javax.swing.JLabel jLabelObrigatorioQnt;
    private javax.swing.JLabel jLabelObrigatorioVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    private void CadastroItem() {

        String tamanho = null;
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

//            CRIA AS VARIAVEIS 
            Items item = new Items();
            

            int precoCompra = Integer.parseInt(camp_valorCompra.getText().replaceAll(",", ""));//remove a virgula e adiciona apenas os numeros decimais
            int precoVenda = Integer.parseInt(camp_valorVenda.getText().replaceAll(",", "")); //remove a virgula e adiciona apenas os numeros decimais
            Long codigo = Long.parseLong(camp_codigo.getText());
            int quantidade = Integer.parseInt(camp_qnt.getText());
            int valorTotal = (precoVenda * quantidade);
            
            try {
                
                DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
                for (Fornecedor fornecedor : banco.list_Fornecedores()) {
                    comboBox.addElement(fornecedor.getNome());
                    comBox_fornecedor.setModel(comboBox);           // ADICIONA OS FORNECEDORES NA COMBOBOX
                }
                
                int posicao = comBox_fornecedor.getSelectedIndex();
                Fornecedor forne = banco.list_Fornecedores().get(posicao);

                item.setFornecedor(forne);
                item.setItem(camp_nomeItem.getText());
                item.setValor_compra(precoCompra);
                item.setValor_venda(precoVenda);
                item.setCodigo(codigo);
                item.setStatus(true);
                item.setExcluido(false);
                item.setQnt(quantidade);
                item.setDescricao(camp_descricao.getText());
                item.setValor_total(valorTotal);

                if (comBox_tamanho.getSelectedItem().toString().equals("<selecione>")) {
                    JOptionPane.showMessageDialog(null, "Selecione o Tamanho!!");
                } else {

                    tamanho = comBox_tamanho.getSelectedItem().toString();
                    item.setTamanho(tamanho);

                    banco.save(item);
                    camp_nomeItem.setText("");
                    camp_codigo.setText("");
                    camp_valorCompra.setText("");
                    camp_valorVenda.setText("");
                    camp_qnt.setText("");
                    camp_descricao.setText("");
                    comBox_tamanho.setSelectedIndex(0);
                } 
            } catch (Exception e) {
                System.out.println(" Erro "+e);
                JOptionPane.showMessageDialog(null, "Certifique-se o Fornecedor está cadastrado");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }

    }

    public void PopularComcobox() {
        Conexao banco = new Conexao();
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        for (Fornecedor fornecedor : banco.list_Fornecedores()) {
            comboBox.addElement(fornecedor.getNome());
            comBox_fornecedor.setModel(comboBox);           // ADICIONA OS FORNECEDORES NA COMBOBOX
        }
    }

}
