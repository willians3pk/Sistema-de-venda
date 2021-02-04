package br.com.telas;

import br.com.classes.Produto;
import br.com.conexao.Conexao;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class ScreenSell extends javax.swing.JPanel {

    SearchScreen s = new SearchScreen();
    ScreenFinalizarVenda f = new ScreenFinalizarVenda();
    Conexao banco = new Conexao();
    public static List<Produto> produtos = new ArrayList<>();

    public ScreenSell() {
        initComponents();
        field_preco.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        field_vendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        field_client = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_produto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_totalVenda = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        field_qnt = new javax.swing.JFormattedTextField();
        field_preco = new javax.swing.JFormattedTextField();
        field_desconto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_buscarProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_removerItem = new javax.swing.JButton();
        camp_total = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field_observacao = new javax.swing.JTextArea();
        field_ItensQnt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        field_vendedor.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(field_vendedor);
        field_vendedor.setBounds(20, 30, 200, 40);

        jLabel2.setText("Vendedor:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 90, 16);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(380, 20, 340, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        field_client.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel2.add(field_client);
        field_client.setBounds(20, 30, 200, 40);

        jLabel1.setText("Cliente:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 70, 16);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 20, 340, 80);

        jTable_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codigo_item", "nome", "valor", "quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_produtoMouseClicked(evt);
            }
        });
        jTable_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_produtoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_produto);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 110, 710, 390);

        add(jPanel3);
        jPanel3.setBounds(10, 10, 730, 510);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL DA VENDA R$");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 20, 330, 60);

        jlabel_totalVenda.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jlabel_totalVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_totalVenda.setText("0,00");
        jPanel4.add(jlabel_totalVenda);
        jlabel_totalVenda.setBounds(130, 90, 130, 30);

        add(jPanel4);
        jPanel4.setBounds(750, 10, 380, 150);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        field_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        field_qnt.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(field_qnt);
        field_qnt.setBounds(10, 140, 120, 40);

        field_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        field_preco.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(field_preco);
        field_preco.setBounds(140, 140, 110, 40);

        field_desconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0%"))));
        jPanel5.add(field_desconto);
        field_desconto.setBounds(260, 140, 110, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Produto:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 40, 110, 20);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Qnt:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(10, 120, 100, 20);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Preço:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(140, 120, 100, 20);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Desc.:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(260, 120, 100, 20);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Total:");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 210, 100, 20);

        btn_buscarProduto.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btn_buscarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProdutoActionPerformed(evt);
            }
        });
        jPanel5.add(btn_buscarProduto);
        btn_buscarProduto.setBounds(10, 60, 360, 40);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(234, 300, 130, 40);

        btn_removerItem.setText("Remover ");
        btn_removerItem.setEnabled(false);
        btn_removerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerItemActionPerformed(evt);
            }
        });
        jPanel5.add(btn_removerItem);
        btn_removerItem.setBounds(20, 300, 130, 40);

        camp_total.setEditable(false);
        camp_total.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(camp_total);
        camp_total.setBounds(10, 230, 360, 40);

        add(jPanel5);
        jPanel5.setBounds(750, 170, 380, 350);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setText("Observações:");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(10, 10, 130, 21);

        field_observacao.setColumns(20);
        field_observacao.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        field_observacao.setRows(5);
        jScrollPane2.setViewportView(field_observacao);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(130, 10, 590, 90);

        field_ItensQnt.setEditable(false);
        jPanel6.add(field_ItensQnt);
        field_ItensQnt.setBounds(979, 56, 130, 40);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Itens / Qnt.:");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(860, 60, 110, 30);

        add(jPanel6);
        jPanel6.setBounds(10, 530, 1120, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerItemActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto().equals(tableDefault.getValueAt(posicao, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                produtos.remove(produtos.get(i)); // remove o item;
                adicionarItens();
            }
        }
    }//GEN-LAST:event_btn_removerItemActionPerformed

    private void jTable_produtoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_produtoKeyReleased
        carregaCampo();
    }//GEN-LAST:event_jTable_produtoKeyReleased

    private void jTable_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_produtoMouseClicked
        carregaCampo();
        btn_removerItem.setEnabled(true);
    }//GEN-LAST:event_jTable_produtoMouseClicked

    private void btn_buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProdutoActionPerformed
        s.setLista(produtos);
        s.setVisible(true);
    }//GEN-LAST:event_btn_buscarProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btn_removerItem.setEnabled(false);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarProduto;
    private javax.swing.JButton btn_removerItem;
    public static javax.swing.JTextField camp_total;
    public static javax.swing.JTextField field_ItensQnt;
    private javax.swing.JTextField field_client;
    private javax.swing.JFormattedTextField field_desconto;
    private javax.swing.JTextArea field_observacao;
    public static javax.swing.JFormattedTextField field_preco;
    private javax.swing.JFormattedTextField field_qnt;
    private javax.swing.JTextField field_vendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable_produto;
    public static javax.swing.JLabel jlabel_totalVenda;
    // End of variables declaration//GEN-END:variables

    public static void adicionarItens() {
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();

        try {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Produto produto : produtos) {
                tableDefault.addRow(new Object[]{produto.getIdProduto(), produto.getNome(), dinheiro.format(produto.getValor_venda() / 100), produto.getQnt()});
                field_preco.setText(String.valueOf(dinheiro.format(produto.getValor_venda() / 100)));// colocar o valor do item no campo preco;             
                
            }
            calculoValorTotal();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void calculoValorTotal() {
        float y = 0;
        float x = 0;
        float z = 0;
        for (int i = 0; i < produtos.size(); i++) {
            x = produtos.get(i).getValor_venda();
            y = z + x;
            z = y;
        }
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        camp_total.setText(dinheiro.format(z / 100));
        jlabel_totalVenda.setText(dinheiro.format(z / 100));
    }

    private void carregaCampo() {
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;

        btn_buscarProduto.setText(tableDefault.getValueAt(posicao, 1).toString()); //Nome do produto
        field_preco.setText(tableDefault.getValueAt(posicao, 2).toString()); // preco do produto

    }

}
