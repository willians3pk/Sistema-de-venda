/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.classes.Cliente;
import br.com.classes.Produto;
import br.com.conexao.Conexao;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class SearchScreen extends javax.swing.JFrame {

    Conexao banco = new Conexao();
    List<Produto> lista;
    ScreenSell telaVenda;

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }

    public SearchScreen() {
        initComponents();
        btn_ok.setEnabled(false);
        quantidadeItems.setEnabled(false);
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
        quantidadeItems = new com.toedter.components.JSpinField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_busca = new javax.swing.JTable();
        btn_ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        field_nome.setBounds(10, 30, 320, 40);

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
        jPanel1.add(quantidadeItems);
        quantidadeItems.setBounds(360, 30, 60, 40);

        jLabel2.setText("Qnt:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 10, 26, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 590, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 177, 177)));
        jPanel2.setLayout(null);

        tabela_busca.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        tabela_busca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo_item", "nome", "valor", "qnt_estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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
        jScrollPane1.setViewportView(tabela_busca);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 570, 140);

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

        setSize(new java.awt.Dimension(624, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void field_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nomeKeyReleased
        carregaCampos();
    }//GEN-LAST:event_field_nomeKeyReleased

    private void tabela_buscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_buscaMouseClicked
        btn_ok.setEnabled(true);
        quantidadeItems.setEnabled(true);
    }//GEN-LAST:event_tabela_buscaMouseClicked

    private void field_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_nomeMouseClicked
        btn_ok.setEnabled(false);
        quantidadeItems.setEnabled(false);
    }//GEN-LAST:event_field_nomeMouseClicked

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        carregaCampos();
        btn_ok.setEnabled(false);
        quantidadeItems.setEnabled(false);
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) tabela_busca.getModel();
        int linha = tabela_busca.getSelectedRow();
        for (int i = 0; i < banco.productBook().size(); i++) {
            if (banco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                Produto item = banco.productBook().get(i); // pega o produto da lista;

                if (quantidadeItems.getValue() > item.getQnt() || quantidadeItems.getValue() == 0) {
                    JOptionPane.showMessageDialog(null, "Produto só contém " + item.getQnt() + " em estoque!\nPor favor selecione a quantidade");
                   
                } else {
                    
                    item.setQnt(quantidadeItems.getValue());
                    lista.add(item);
                    telaVenda.adicionarItens(); // adiciona os itens na tabela de itens na tela vendas;
                    dispose();
                    
                }
            }
        }
    }//GEN-LAST:event_btn_okActionPerformed

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
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JTextField field_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.components.JSpinField quantidadeItems;
    private javax.swing.JTable tabela_busca;
    // End of variables declaration//GEN-END:variables

    public void carregaCampos() {

        Conexao banco = new Conexao();
        String pesquisa = field_nome.getText();
        List<Produto> produto = new ArrayList<Produto>();
        quantidadeItems.setEnabled(false);
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
                tabela.addRow(new Object[]{p.getIdProduto(), p.getNome(), dinheiro.format(p.getValor_venda()), p.getQnt()});
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro no Codigo");
        }
    }

}
