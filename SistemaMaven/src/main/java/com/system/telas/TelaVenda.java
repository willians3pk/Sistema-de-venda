/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Items;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVenda extends javax.swing.JPanel {

    public static Items item = null;
    public static float valortotal = 0;
    public static List<Items> items = new ArrayList<>();
    DefaultListModel listaPesquisa = new DefaultListModel();
    Conexao banco = new Conexao();
    
    public TelaVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        labelvalortotal = new javax.swing.JLabel();
        camp_pesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btn_removeItem = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlabelvalortotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        camp_nomeproduto = new javax.swing.JTextField();
        camp_precoproduto = new javax.swing.JTextField();
        camp_qnt = new javax.swing.JFormattedTextField();
        btn_adicionarcarrinho = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jImpressao = new javax.swing.JEditorPane();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Marinho Moda Intima");
        jPanelFundo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 500, 50));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Codigo", "Qnt", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 650, 130));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel12.setText("Itens da Venda");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 40));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 640, 10));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 620, 10));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, -1));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 620, 10));

        labelvalortotal.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        labelvalortotal.setForeground(new java.awt.Color(255, 0, 0));
        labelvalortotal.setText("R$ VALOR");
        jPanel7.add(labelvalortotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 90, -1));

        camp_pesquisa.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jPanel7.add(camp_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 310, 40));

        btn_pesquisa.setText("Buscar");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });
        jPanel7.add(btn_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 90, -1));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel15.setText("Informe o codigo do produto:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 280, 20));

        btn_removeItem.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btn_removeItem.setText("Remover Item");
        btn_removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeItemActionPerformed(evt);
            }
        });
        jPanel7.add(btn_removeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        btn_pesquisar.setText("....");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        jPanel7.add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 50, 40));

        jTabbedPane2.addTab("CARRINHO", jPanel7);

        jPanelFundo.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 690, 450));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Nome Produto:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Preço Produto:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 30));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 30));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setText("Cod. Venda: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setText("000000");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setText("Data");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 70, 20));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel9.setText("Data Venda:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel10.setText("Vend:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, -1));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("TOTAL:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, 20));

        jlabelvalortotal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jlabelvalortotal.setForeground(new java.awt.Color(255, 0, 0));
        jlabelvalortotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelvalortotal.setText("R$ VALOR");
        jPanel4.add(jlabelvalortotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 80));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, 220, 10));

        jButton1.setText("Finalizar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, 50));

        jButton2.setText("Cancelar Venda Atual");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 220, 50));

        camp_nomeproduto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        camp_nomeproduto.setEnabled(false);
        jPanel3.add(camp_nomeproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 50));

        camp_precoproduto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        camp_precoproduto.setEnabled(false);
        jPanel3.add(camp_precoproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 40));

        camp_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_qnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        camp_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_qntActionPerformed(evt);
            }
        });
        jPanel3.add(camp_qnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 80, 40));

        btn_adicionarcarrinho.setText("Adiciona ao Carrinho");
        btn_adicionarcarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarcarrinhoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_adicionarcarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 50));

        jPanelFundo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 250, 570));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jImpressao.setEnabled(false);
        jScrollPane2.setViewportView(jImpressao);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 520));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("IMPRESSÃO");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, -1));

        jPanelFundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 380, 570));

        jLabel17.setText("IMPRIMIR CUPOM");
        jPanelFundo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 610, -1, -1));

        jLabel18.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Marinho Moda Intima");
        jPanelFundo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 500, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        telaBuscaItens tela = new telaBuscaItens();
        tela.setItems(items);
        tela.setVisible(true);
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        carregaCampos();
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_adicionarcarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarcarrinhoActionPerformed
        adicionarItem();
    }//GEN-LAST:event_btn_adicionarcarrinhoActionPerformed

    private void btn_removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeItemActionPerformed
        removeItem();
    }//GEN-LAST:event_btn_removeItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FinalizarVenda tela = new FinalizarVenda();
        tela.setVisible(true);
        tela.setItem_venda(items);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void camp_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_qntActionPerformed
        adicionarItem();
    }//GEN-LAST:event_camp_qntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_adicionarcarrinho;
    public static javax.swing.JButton btn_pesquisa;
    public static javax.swing.JButton btn_pesquisar;
    public static javax.swing.JButton btn_removeItem;
    public static javax.swing.JTextField camp_nomeproduto;
    public static javax.swing.JTextField camp_pesquisa;
    public static javax.swing.JTextField camp_precoproduto;
    public static javax.swing.JFormattedTextField camp_qnt;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JEditorPane jImpressao;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanelFundo;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JSeparator jSeparator2;
    public static javax.swing.JSeparator jSeparator3;
    public static javax.swing.JSeparator jSeparator4;
    public static javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel jlabelvalortotal;
    public static javax.swing.JLabel labelvalortotal;
    public static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    public void carregaCampos() {

        Conexao banco = new Conexao();

        try {
            int busca = Integer.parseInt(camp_pesquisa.getText());

            for (int i = 0; i < banco.list_Items().size(); i++) {
                if (banco.list_Items().get(i).getCodigo() == busca) {
                    item = banco.list_Items().get(i);
                }

            }

            String preco = String.valueOf((item.getValor_venda() / 100)).replace(".", ","); // A DIVISÃO POR 100 É APENAS PARA MOVER A VIRGULA
            camp_nomeproduto.setText(item.getItem());
            camp_precoproduto.setText(preco);
            camp_qnt.setText("1");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Item Não encontrado");
        }

    }

    public void adicionarItem() {

        DefaultTableModel tableDefault = (DefaultTableModel) tabela.getModel();
        try {

            int qnt = Integer.parseInt(camp_qnt.getText());
            item.setQnt(qnt);
            items.add(item);

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Items obj : items) {

                float valortotalitens = obj.getQnt() * obj.getValor_venda();//pega a quantidade de items multiplica pelo valor dele;
                obj.setValor_total((valortotalitens / 100));
                tableDefault.addRow(new Object[]{obj.getItem(), "R$ " + obj.getValor_venda() / 100, obj.getCodigo(), obj.getQnt(), "R$ " + obj.getValor_total().toString()});

            }

            jlabelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            labelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            camp_qnt.setText("1");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void atualizartabela() {
        DefaultTableModel tableDefault = (DefaultTableModel) tabela.getModel();
        try {

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Items obj : items) {

                float valortotalitens = obj.getQnt() * obj.getValor_venda();//pega a quantidade de items multiplica pelo valor dele;
                obj.setValor_total(valortotalitens / 100);
                tableDefault.addRow(new Object[]{obj.getItem(), "R$ " + obj.getValor_venda() / 100, obj.getCodigo(), obj.getQnt(), "R$ " + obj.getValor_total()});

            }

            jlabelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            labelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            camp_qnt.setText("1");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeItem() {

        items.remove(tabela.getSelectedRow());
        DefaultTableModel tableDefault = (DefaultTableModel) tabela.getModel();
        try {

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Items obj : items) {
                float valortotalitens = obj.getQnt() * obj.getValor_venda();//pega a quantidade de items multiplica pelo valor dele;
                obj.setValor_total(valortotalitens / 100);
                tableDefault.addRow(new Object[]{obj.getItem(), "R$ " + obj.getValor_venda() / 100, obj.getCodigo(), obj.getQnt(), "R$ " + obj.getValor_total()});

            }
            jlabelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            labelvalortotal.setText(String.valueOf("R$ " + valorTotal()).replace(".", ","));
            camp_qnt.setText("1");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    METODO QUE CALCULA O VALOR TOTAL
    public static float valorTotal() {

        float valorItem = 0;
        for (int i = 0; i < items.size(); i++) {
            valorItem = valorItem + (items.get(i).getQnt() * items.get(i).getValor_venda()) / 100;
        }
        valortotal = valorItem;
        return valortotal;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void pesquisa() {
//        new Thread() {
//            String pesquisa = camp_pesquisa.getText();
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        sleep(1000);
//                        if(camp_pesquisa.getText().length() > 0) {
//
//                            for (int i = 0; i < banco.list_Items().size(); i++) {
//
//                                if (banco.list_Items().get(i).getItem().contains(pesquisa)) {
//                                    
//                                    Items t = banco.list_Items().get(i);
//                                    listaPesquisa.addElement(t.getItem());
//                                    jList1.setVisible(true);
//                                    jList1.setModel(listaPesquisa);
//
//                                }
//
//                            }
//                        }else{jList1.setVisible(false);}
//                        
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }.start();
//    }
}
