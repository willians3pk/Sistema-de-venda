/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.Produto;
import conexao.Conexao;
import static view.TelaVenda.jTable_produto;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class TelaBuscaProduto extends javax.swing.JFrame {

    Conexao banco = new Conexao();
    Produto variavelProduto;
    TelaVenda telaVenda;
    boolean tt = true;

    public Produto getVariavelProduto() {
        return variavelProduto;
    }

    public void setVariavelProduto(Produto variavelProduto) {
        this.variavelProduto = variavelProduto;
    }

    public TelaBuscaProduto() {
        initComponents();
        btn_ok.setEnabled(false);

        TableColumn colCodigo = tabela_busca.getColumnModel().getColumn(0);
        TableColumn colNome = tabela_busca.getColumnModel().getColumn(1);
        TableColumn colCor = tabela_busca.getColumnModel().getColumn(2);
        TableColumn colPreço = tabela_busca.getColumnModel().getColumn(3);
        TableColumn colQuant = tabela_busca.getColumnModel().getColumn(4);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(190);
        colCor.setPreferredWidth(30);
        colPreço.setPreferredWidth(25);
        colQuant.setPreferredWidth(5);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        field_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_busca = new javax.swing.JTable();
        btn_ok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("buscar produto");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 177, 177)));
        jPanel1.setLayout(null);

        field_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_nomeMouseClicked(evt);
            }
        });
        field_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_nomeKeyReleased(evt);
            }
        });
        jPanel1.add(field_nome);
        field_nome.setBounds(10, 30, 450, 40);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar);
        btn_Buscar.setBounds(480, 30, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 590, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 177, 177)));
        jPanel2.setLayout(null);

        tabela_busca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo_item", "Nome:", "Cor:", "Valor:", "Qtde:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_busca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_buscaMouseClicked(evt);
            }
        });
        tabela_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabela_buscaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabela_busca);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 570, 160);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 590, 180);

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok);
        btn_ok.setBounds(474, 290, 120, 40);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 290, 120, 40);

        setSize(new java.awt.Dimension(624, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void field_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nomeKeyReleased
        carregaCampos();
    }//GEN-LAST:event_field_nomeKeyReleased

    private void field_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_nomeMouseClicked
        btn_ok.setEnabled(false);
    }//GEN-LAST:event_field_nomeMouseClicked

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                carregaCampos();
                btn_ok.setEnabled(false);
                carregando.dispose();
            }

        };
        t.start();

    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
//        adicionaNaTable();
        DefaultTableModel tableDefault = (DefaultTableModel) tabela_busca.getModel();
        int linha = tabela_busca.getSelectedRow();
        for (int i = 0; i < banco.productBook().size(); i++) {
            if (banco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                Produto item = banco.productBook().get(i); // pega o produto da lista do banco de dados;

                // verifica se a quantidade de itens selecionado é maior que a quantidade que tem em estoque;
                if (item.getQnt() <= 0) {
                    JOptionPane.showMessageDialog(null, "Produto só contém " + item.getQnt() + " em estoque");

                } else {
                    variavelProduto = banco.productBook().get(i);
                    telaVenda.carregaCampos(variavelProduto); // adiciona os itens na tabela de itens na tela vendas;
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabela_buscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_buscaMouseClicked
        btn_ok.setEnabled(true);
    }//GEN-LAST:event_tabela_buscaMouseClicked

    private void tabela_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabela_buscaKeyReleased
        btn_ok.setEnabled(true);
    }//GEN-LAST:event_tabela_buscaKeyReleased

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
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_ok;
    public javax.swing.JTextField field_nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tabela_busca;
    // End of variables declaration//GEN-END:variables

    public void carregaCampos() {

        Conexao banco = new Conexao();
        String pesquisa = field_nome.getText();
        List<Produto> produto = new ArrayList<Produto>();
        btn_ok.setEnabled(false);
        for (int i = 0; i < banco.productBook().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE produto E VERIFICA O STATUS DO produto;
            if (banco.productBook().get(i).getNome().contains(pesquisa) && banco.productBook().get(i).isStatus()) {
                Produto p = banco.productBook().get(i);
                produto.add(p); // ADICIONA NA LISTA PRODUTO;
            }
        }

        DefaultTableModel tabela = (DefaultTableModel) tabela_busca.getModel();
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        try {
            tabela.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR;
            // PEGA TODOS OS PRODUTOS QUE SÃO ADICIONADO NA LISTA;
            // E ADICIONA NA TABELA 
            for (Produto p : produto) {
                tabela.addRow(new Object[]{p.getIdProduto(), p.getNome(), p.getCor(), dinheiro.format(p.getValor_venda()), p.getQnt()});
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro no Codigo");
        }
    }

//    private void adicionaNaTable() {
//        DefaultTableModel tableDefault = (DefaultTableModel) tabela_busca.getModel();
//        int linha = tabela_busca.getSelectedRow();
//        for (int i = 0; i < banco.productBook().size(); i++) {
//            if (banco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
//                Produto item = banco.productBook().get(i); // pega o produto da lista do banco de dados;
//
//                // verifica se a quantidade de itens selecionado é maior que a quantidade que tem em estoque;
//                if (quantidadeItems.getValue() > item.getQnt() || quantidadeItems.getValue() == 0) {
//                    JOptionPane.showMessageDialog(null, "Produto só contém " + item.getQnt() + " em estoque, Por favor selecione a quantidade");
//
//                } else {
//
//                    try {
//
//                        if (lista.size() <= 0) {
//                            item.setQnt(quantidadeItems.getValue());
//                            lista.add(item); // adicionar o item na lista;
//                            telaVenda.adicionarItens(); // adiciona os itens na tabela de itens na tela vendas;
//                            dispose();
//                        } else {
//
//                            for (Produto produto : lista) {
//                                // faz a comparação do item se ja tem na lista, e só atualiza a quantidade de item;
//                                if (produto.getIdProduto().equals(item.getIdProduto()) & (quantidadeItems.getValue() + produto.getQnt() <= item.getQnt())) { // CORRIGIR A COMPARAÇÃO POR ID;
//
//                                    produto.setQnt(quantidadeItems.getValue() + produto.getQnt()); // adiciona o produto + a quantidade que ele ja tinha;
//                                    telaVenda.adicionarItens(); // adiciona os itens na tabela de itens na tela vendas;
//                                    System.out.println(produto.getNome());
//                                    tt = false; // impedi de repetir o item na tebela;
//                                    dispose();
//                                    break;
//                                }
//
//                            }
//                            if (tt) {
//                                item.setQnt(quantidadeItems.getValue());
//                                lista.add(item); // adicionar o item na lista;
//                                telaVenda.adicionarItens(); // adiciona os itens na tabela de itens na tela vendas;
//                                dispose();
//                            }
//
//                        }
//                        tt = true;
//
//                    } catch (Exception e) {
//                        System.out.println(e);
//                    }
//
//                }
//
//            }
//        }
//    }
}
