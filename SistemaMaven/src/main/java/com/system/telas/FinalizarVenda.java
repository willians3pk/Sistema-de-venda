/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.FormaPagamento;
import com.system.sistemamaven.Items;
import com.system.sistemamaven.ItensVenda;
import com.system.sistemamaven.Venda;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class FinalizarVenda extends javax.swing.JFrame {

    List<Items> carrinho;

    public FinalizarVenda() {
        initComponents();
        carregarCampos();
    }

    public List<Items> getItem_venda() {
        return carrinho;
    }

    public void setItem_venda(List<Items> item_venda) {
        this.carrinho = item_venda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        combox = new javax.swing.JComboBox<>();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jlabelValorTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        camp_porcentagem = new javax.swing.JFormattedTextField();
        camp_valordavenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_fecharVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        camp_Desconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setText("Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel4.setText("Codigo da Venda:");

        jlabelValorTotal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jlabelValorTotal.setForeground(new java.awt.Color(250, 14, 14));
        jlabelValorTotal.setText("R$");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel5.setText("Forma de Pagamento:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("VALOR TOTAL:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 113, 230, 330));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camp_porcentagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_porcentagem.setText("0");
        camp_porcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_porcentagemKeyReleased(evt);
            }
        });
        jPanel4.add(camp_porcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 30, -1));

        camp_valordavenda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        camp_valordavenda.setEnabled(false);
        jPanel4.add(camp_valordavenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 35, 290, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel2.setText("Total da Venda:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setText("Desconto");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 84, -1, 40));

        btn_fecharVenda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_fecharVenda.setText("Fechar Venda");
        btn_fecharVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharVendaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_fecharVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 256, 270, 60));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("%");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 20, 20));

        camp_Desconto.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        camp_Desconto.setEnabled(false);
        jPanel4.add(camp_Desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel7.setText("Valor do Desconto:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, 320, 330));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 585, 461));

        setSize(new java.awt.Dimension(612, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void camp_porcentagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_porcentagemKeyReleased
        desconto();
    }//GEN-LAST:event_camp_porcentagemKeyReleased

    private void btn_fecharVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharVendaActionPerformed
        fecharvenda();
    }//GEN-LAST:event_btn_fecharVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fecharVenda;
    private javax.swing.JTextField camp_Desconto;
    private javax.swing.JFormattedTextField camp_porcentagem;
    private javax.swing.JTextField camp_valordavenda;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlabelValorTotal;
    // End of variables declaration//GEN-END:variables

    private void carregarCampos() {
        jlabelValorTotal.setText(String.valueOf(TelaVenda.valorTotal())); // converte o valor float pra string;
        camp_valordavenda.setText("R$ " + String.valueOf(TelaVenda.valorTotal()));// converte o valor float pra string;

        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        Conexao banco = new Conexao();
        for (FormaPagamento formaPagamento : banco.FormaPagamento()) {
            comboBox.addElement(formaPagamento.getDescricao());
            combox.setModel(comboBox);
        }
    }

    private void desconto() {
        try {
            String search = camp_porcentagem.getText().trim();
            if (!search.equals("")) {
                float numero = Integer.parseInt(camp_porcentagem.getText());
                float porcentagem = numero / 100; // valor da porcentagem
                float valorVenda = TelaVenda.valorTotal(); // valortotal da venda;
                float valordesconto = valorVenda * porcentagem; // valor do desconto
                camp_Desconto.setText(String.valueOf("R$ " + valordesconto).replace(".", ","));
                camp_valordavenda.setText(String.valueOf("R$ " + (valorVenda - valordesconto)).replace(".", ","));  // set campo valordavenda o o valor total com o desconto
                jlabelValorTotal.setText(String.valueOf((valorVenda - valordesconto)).replace(".", ","));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void fecharvenda() {

        float numero = Integer.parseInt(camp_porcentagem.getText());
        float valorVenda = TelaVenda.valorTotal(); // valortotal da venda;
        float porcentagem = numero / 100; // valor da porcentagem
        float valordesconto = valorVenda * porcentagem; // valor do desconto

        int desconto = Integer.parseInt(String.valueOf(valordesconto).replace(".", "")); // faz a conversao do valor float pra string e depois converte pra inteiro
        Long total = Long.parseLong(String.valueOf(valorVenda).replace(".", ""));

        Set<FormaPagamento> setForma = new HashSet<>(0);
        Set<Venda> setVendas = new HashSet<>(0);
        Set<ItensVenda> setItensVenda = new HashSet<>(0);

        Conexao banco = new Conexao();
        FormaPagamento forma_Pagamento = banco.FormaPagamento().get(combox.getSelectedIndex());

        if (valorVenda > 0) {
            Venda venda = new Venda();
            // dados da venda
            venda.setDataVenda(new Date());
            venda.setDesconto(desconto);
            venda.setValorTotal(total);
            venda.setStatus(true);

            venda.setFormaPagamento(setForma);
            venda.getFormaPagamento().add(forma_Pagamento);
            forma_Pagamento.setVendas(setVendas);
            forma_Pagamento.getVendas().add(venda);
            venda.setItensVendas(setItensVenda);

            for (int i = 0; i < carrinho.size(); i++) {
                ItensVenda itensvenda = new ItensVenda();

                System.out.println(carrinho.get(i));

                itensvenda.setItems(carrinho.get(i)); // adiciona o item do carrinho na tabela itens da venda;
                itensvenda.setQnt(carrinho.get(i).getQnt()); // adiciona a quantidade de itens;
                itensvenda.setStatus(true); // adiciona o status do items da venda;
                banco.persist(itensvenda); // persiste o objeto no banco de dados;
                venda.getItensVendas().add(itensvenda); // adiciona a lista de itensVenda os itens da venda;

            }

            banco.save(venda);
            banco.update(forma_Pagamento);

            for (int i = 0; i < banco.list_ItemsVenda().size(); i++) {
                ItensVenda itemdaVenda = new ItensVenda();
                itemdaVenda = banco.list_ItemsVenda().get(i);

                if (banco.list_ItemsVenda().get(i).getIditensVenda() == venda.getItensVendas().hashCode()) {
                    itemdaVenda.setVenda(venda);
                    System.out.println("agora deu certo!");
                    banco.update(itemdaVenda);
                    
                }else{
                    System.out.println("deu errado cara, tenta outra!");
                }
            }

            JOptionPane.showMessageDialog(null, "Venda finalizada!");

        } else {
            JOptionPane.showMessageDialog(null, "Valor da Venda é igual a 0");
        }

    }

//    public void desconto() {
//        new Thread() {
//            @Override
//            public void run() {
//                try {
//                    while (true) { // esse loop garante que sempre irá ler o campo_porcentagem;
//                        sleep(100);
//                        while (camp_porcentagem.getText().length() > 0) {
//                            float numero = Integer.parseInt(camp_porcentagem.getText());
//                            float porcentagem = numero / 100; // valor da porcentagem
//                            float valorVenda = TelaVenda.valorTotal(); // valortotal da venda;
//                            float valordesconto = valorVenda * porcentagem; // valor do desconto
//                            camp_Desconto.setText(String.valueOf("R$ "+valordesconto).replace(".", ","));
//                            camp_valordavenda.setText(String.valueOf("R$ "+(valorVenda - valordesconto)).replace(".", ","));  // set campo valordavenda o o valor total com o desconto
//                            jlabelValorTotal.setText(String.valueOf((valorVenda - valordesconto)).replace(".", ","));
//                        }
//                    }
//
//                } catch (Exception e) {
//                    System.out.println("Erro ao calcular desconto!");
//                }
//
//            }
//        }.start();
//
//    }
}
