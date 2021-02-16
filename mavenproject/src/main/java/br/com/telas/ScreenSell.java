package br.com.telas;

import br.com.classes.Cliente;
import br.com.classes.Produto;
import br.com.conexao.Conexao;
import static br.com.telas.ScreenFinalizarVenda.jLabelQuantidadeItens;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ScreenSell extends javax.swing.JPanel {

    SearchScreen s = new SearchScreen();
    ScreenFinalizarVenda f = new ScreenFinalizarVenda();
    Conexao bancoMariaDB = new Conexao();
    public static List<Produto> produtos = new ArrayList<>();
    Cliente client;
    
    public ScreenSell() {
        initComponents();
        field_preco.setEnabled(false);
        field_qnt.setEnabled(false);
        jListpesquisaClientes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jListpesquisaClientes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_produto = new javax.swing.JTable();
        camp_cliente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_totalVenda = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        field_qnt = new javax.swing.JFormattedTextField();
        field_preco = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_buscarProduto = new javax.swing.JButton();
        btn_removerItem = new javax.swing.JButton();
        camp_total = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field_observacao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        field_itensQnt = new javax.swing.JTextField();

        setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jListpesquisaClientes.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jListpesquisaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListpesquisaClientesMouseClicked(evt);
            }
        });
        jPanel3.add(jListpesquisaClientes);
        jListpesquisaClientes.setBounds(10, 80, 310, 90);

        jTable_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        camp_cliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        camp_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                camp_clienteFocusLost(evt);
            }
        });
        camp_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_clienteKeyReleased(evt);
            }
        });
        jPanel3.add(camp_cliente);
        camp_cliente.setBounds(10, 40, 310, 40);

        jButton3.setText("NOVO");
        jPanel3.add(jButton3);
        jButton3.setBounds(320, 40, 70, 40);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("CLIENTE:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 10, 140, 30);

        add(jPanel3);
        jPanel3.setBounds(10, 10, 730, 510);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL DA VENDA R$");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 0, 330, 60);

        jlabel_totalVenda.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jlabel_totalVenda.setForeground(new java.awt.Color(255, 0, 0));
        jlabel_totalVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_totalVenda.setText("0,00");
        jPanel4.add(jlabel_totalVenda);
        jlabel_totalVenda.setBounds(60, 60, 260, 30);

        add(jPanel4);
        jPanel4.setBounds(750, 10, 380, 100);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        field_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        field_qnt.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        field_qnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_qntMouseClicked(evt);
            }
        });
        field_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_qntActionPerformed(evt);
            }
        });
        jPanel5.add(field_qnt);
        field_qnt.setBounds(140, 190, 120, 40);

        field_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        field_preco.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(field_preco);
        field_preco.setBounds(10, 190, 110, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Produto:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 90, 110, 20);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Qnt:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(140, 170, 100, 20);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Preço:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 170, 100, 20);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Total:");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 260, 100, 20);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(230, 350, 130, 40);

        btn_buscarProduto.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btn_buscarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProdutoActionPerformed(evt);
            }
        });
        jPanel5.add(btn_buscarProduto);
        btn_buscarProduto.setBounds(10, 110, 360, 40);

        btn_removerItem.setText("Remover ");
        btn_removerItem.setEnabled(false);
        btn_removerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerItemActionPerformed(evt);
            }
        });
        jPanel5.add(btn_removerItem);
        btn_removerItem.setBounds(20, 350, 130, 40);

        camp_total.setEditable(false);
        camp_total.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(camp_total);
        camp_total.setBounds(10, 280, 360, 40);

        add(jPanel5);
        jPanel5.setBounds(750, 120, 380, 400);

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

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel11.setText("Itens / Qnt.:");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(810, 50, 160, 30);

        field_itensQnt.setEditable(false);
        field_itensQnt.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jPanel6.add(field_itensQnt);
        field_itensQnt.setBounds(960, 46, 130, 40);

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
                //limpa os campos
                btn_buscarProduto.setText("");
                field_preco.setText("0,00");
                field_qnt.setText("0");
                break;
            }
        }
        btn_removerItem.setEnabled(false);
    }//GEN-LAST:event_btn_removerItemActionPerformed

    private void jTable_produtoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_produtoKeyReleased
        carregaCampo();
    }//GEN-LAST:event_jTable_produtoKeyReleased

    private void jTable_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_produtoMouseClicked
        carregaCampo();
        btn_removerItem.setEnabled(true);
        field_qnt.setEnabled(true);
    }//GEN-LAST:event_jTable_produtoMouseClicked

    private void btn_buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProdutoActionPerformed
        s.setLista(produtos);
        s.setVisible(true);
        s.carregaCampos();
        s.quantidadeItems.setValue(0); // toda vez que for buscar um produto a quantidade vai iniciar sempre em zero
        s.field_nome.setText("");
        btn_removerItem.setEnabled(false);

    }//GEN-LAST:event_btn_buscarProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btn_removerItem.setEnabled(false);
        f.setVisible(true);
        f.setLista(produtos);
        f.valorTotal();
        f.setCliente(client);
        f.dataVenda.setDate(new Date()); // sempre adiciona a data atual
        f.camp_qtdeParcelas.setVisible(false);
        f.camp_valorParcelas.setVisible(false);
        f.carregarComboBox();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void field_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_qntActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;
        try {
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                if (bancoMariaDB.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(posicao, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                    int quantidade = bancoMariaDB.productBook().get(i).getQnt(); // pega quantidade que tem em estoque;

                    if (Integer.parseInt(field_qnt.getText()) > quantidade) {
                        field_qnt.setText(String.valueOf(produtos.get(posicao).getQnt()));
                        JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">ITEM SÓ CONTÉM " + quantidade + " EM ESTOQUE</font></html>");
                    } else {
                        produtos.get(posicao).setQnt(Integer.parseInt(field_qnt.getText()));
                        adicionarItens();
                    }
                    camp_total.requestFocus(); // muda o foco do cursor do mouse
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "SELECIONE O ITEM NA TABELA");
        }


    }//GEN-LAST:event_field_qntActionPerformed

    private void field_qntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_qntMouseClicked
        btn_removerItem.setEnabled(false);
    }//GEN-LAST:event_field_qntMouseClicked

    private void jListpesquisaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListpesquisaClientesMouseClicked
        camp_cliente.setText(jListpesquisaClientes.getSelectedValue());
        client = bancoMariaDB.list_Cliente().get(jListpesquisaClientes.getSelectedIndex());
        jListpesquisaClientes.setVisible(false);
    }//GEN-LAST:event_jListpesquisaClientesMouseClicked

    private void camp_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_clienteKeyReleased

        String pesquisa = camp_cliente.getText();
        List<Cliente> listaClientes = new ArrayList<>();

        for (int i = 0; i < bancoMariaDB.list_Cliente().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE CLIENTE E VERIFICA O STATUS DO CLIENTE;
            if (bancoMariaDB.list_Cliente().get(i).getNome().contains(pesquisa) && bancoMariaDB.list_Cliente().get(i).isStatus()) {
                Cliente c = bancoMariaDB.list_Cliente().get(i);
                listaClientes.add(c); // ADICIONA NA LISTA CLIENTE;
            }
        }

        DefaultListModel jlista = new DefaultListModel();
        jlista.removeAllElements();
        for (Cliente cliente : listaClientes) {
            jlista.addElement(cliente.getNome());
            jListpesquisaClientes.setModel(jlista);
            jListpesquisaClientes.setVisible(true);
        }
    }//GEN-LAST:event_camp_clienteKeyReleased

    private void camp_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camp_clienteFocusLost
        camp_cliente.setText(jListpesquisaClientes.getSelectedValue());
        client = bancoMariaDB.list_Cliente().get(jListpesquisaClientes.getSelectedIndex()); // pega o cliente do banco de dados;
        jListpesquisaClientes.setVisible(false);
    }//GEN-LAST:event_camp_clienteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_buscarProduto;
    private javax.swing.JButton btn_removerItem;
    public static javax.swing.JTextField camp_cliente;
    public static javax.swing.JTextField camp_total;
    public static javax.swing.JTextField field_itensQnt;
    public static javax.swing.JTextArea field_observacao;
    public static javax.swing.JFormattedTextField field_preco;
    public static javax.swing.JFormattedTextField field_qnt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListpesquisaClientes;
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
        TableColumn colCodigo = jTable_produto.getColumnModel().getColumn(0);
        TableColumn colNome = jTable_produto.getColumnModel().getColumn(1);
        TableColumn colPreço = jTable_produto.getColumnModel().getColumn(2);
        TableColumn colQuant = jTable_produto.getColumnModel().getColumn(3);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(200);
        colPreço.setPreferredWidth(10);
        colQuant.setPreferredWidth(15);
        try {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            int y = 0;
            int x = 0;
            int z = 0;
            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Produto produto : produtos) {
                // faz o calculo da quantidade de itens;
                x = produto.getQnt();
                y = z + x;
                z = y;
                tableDefault.addRow(new Object[]{produto.getIdProduto(), produto.getNome(), dinheiro.format(produto.getValor_venda()), produto.getQnt()});
                field_preco.setText(String.valueOf(dinheiro.format(produto.getValor_venda())));// colocar o valor do item no campo preco;             
                btn_buscarProduto.setText(produto.getNome());
                field_qnt.setText(String.valueOf(produto.getQnt()));
            }
            calculoValorTotal();
            field_itensQnt.setText("" + z);
            jLabelQuantidadeItens.setText(""+z);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void calculoValorTotal() {
        double y = 0;
        double x = 0;
        double z = 0;
        for (int i = 0; i < produtos.size(); i++) {
            x = produtos.get(i).getValor_venda() * produtos.get(i).getQnt();
            y = z + x;
            z = y;
        }
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        camp_total.setText(dinheiro.format(z)); //valor total dos itens
        jlabel_totalVenda.setText(dinheiro.format(z)); //valor total dos itens

    }

    public static void carregaCampo() {

        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;

        btn_buscarProduto.setText(tableDefault.getValueAt(posicao, 1).toString()); //Nome do produto
        field_preco.setText(tableDefault.getValueAt(posicao, 2).toString()); // preco do produto
        field_qnt.setText(tableDefault.getValueAt(posicao, 3).toString()); //quantidade do item

    }

    public void buscaCliente(){
        
        String pesquisa = camp_cliente.getText();
        List<Cliente> listaClientes = new ArrayList<>();

        for (int i = 0; i < bancoMariaDB.list_Cliente().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE CLIENTE E VERIFICA O STATUS DO CLIENTE;
            if (bancoMariaDB.list_Cliente().get(i).getNome().contains(pesquisa) && bancoMariaDB.list_Cliente().get(i).isStatus()) {
                Cliente c = bancoMariaDB.list_Cliente().get(i);
                listaClientes.add(c); // ADICIONA NA LISTA CLIENTE;
            }
        }

        DefaultListModel jlista = new DefaultListModel();
        jlista.removeAllElements();
        for (Cliente cliente : listaClientes) {
            jlista.addElement(cliente.getNome());
            jListpesquisaClientes.setModel(jlista);
            jListpesquisaClientes.setVisible(true);
        }
    }
    
}
