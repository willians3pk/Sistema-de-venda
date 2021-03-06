package view;

import model.Categoria;
import util.TableRendererProdutos;
import util.Teclas;
import util.TeclasPermitidas;
import model.dao.Conexao;
import java.awt.Color;
import model.Fornecedor;
import model.Produto;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TelaProdutos extends javax.swing.JPanel {

    public static Conexao connectbanco = new Conexao();
    TelaCadastroFornecedor f = new TelaCadastroFornecedor();
    Fornecedor forne = null;

    public TelaProdutos() {
        initComponents();
        camp_Qnt.setDocument(new TeclasPermitidas());
        btn_ToEdit.setEnabled(false);
        btn_Deactivate.setEnabled(false);
        btn_adicionarCategoria.setEnabled(false);
        table_Product.setDefaultRenderer(Object.class, new TableRendererProdutos());
        table_Product.setSelectionBackground(Color.LIGHT_GRAY);

        camp_ProductName.setDocument(new Teclas());
        camp_ProductName.setEnabled(false);
        camp_Deliverydate.setEnabled(false);
        camp_Description.setEnabled(false);
        camp_Qnt.setEnabled(false);
        camp_apelido.setEnabled(false);
        camp_cor.setEnabled(false);
        camp_Buyprice.setEnabled(false);
        camp_Sellprice.setEnabled(false);
        comboxCategoria.setEnabled(false);
        comboBox_Size.setEnabled(false);
        comboBox_Supplier.setEnabled(false);

        // modifica a largura das colunas da tabela.
        TableColumn colCodigo = table_Product.getColumnModel().getColumn(0);
        TableColumn colDataProduto = table_Product.getColumnModel().getColumn(1);
        TableColumn colNome = table_Product.getColumnModel().getColumn(2);
        TableColumn colCor = table_Product.getColumnModel().getColumn(3);
        TableColumn colPreço = table_Product.getColumnModel().getColumn(4);
        TableColumn colQuantidade = table_Product.getColumnModel().getColumn(5);
        TableColumn colFornecedor = table_Product.getColumnModel().getColumn(6);
        TableColumn colTamanho = table_Product.getColumnModel().getColumn(7);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(250);
        colCor.setPreferredWidth(50);
        colPreço.setPreferredWidth(50);
        colQuantidade.setPreferredWidth(5);
        colFornecedor.setPreferredWidth(200);
        colTamanho.setPreferredWidth(50);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Product = new javax.swing.JTable();
        camp_SearchProduct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_Size = new javax.swing.JCheckBox();
        box_Price = new javax.swing.JCheckBox();
        box_Qnt = new javax.swing.JCheckBox();
        btn_ToEdit = new javax.swing.JButton();
        btn_Deactivate = new javax.swing.JButton();
        camp_Profitmargin = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        checkbox_ordenby = new javax.swing.JCheckBox();
        btn_pesquisar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        camp_ProductName = new javax.swing.JTextField();
        camp_Qnt = new javax.swing.JFormattedTextField();
        comboBox_Supplier = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        camp_Description = new javax.swing.JTextPane();
        camp_Buyprice = new javax.swing.JFormattedTextField();
        camp_Sellprice = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBox_Size = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        camp_apelido = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        obrigatorioName = new javax.swing.JLabel();
        obrigatorioPriceBuy = new javax.swing.JLabel();
        obrigatorioPriceSell = new javax.swing.JLabel();
        obrigatorioCategoria = new javax.swing.JLabel();
        obrigatorioSupplier = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        obrigatorioDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        camp_Deliverydate = new com.toedter.calendar.JDateChooser();
        btn_cleanAll = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        comboxCategoria = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        camp_cor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        obrigatorioQnt = new javax.swing.JLabel();
        btn_Novo = new javax.swing.JButton();
        obrigatorioTamanho = new javax.swing.JLabel();
        btn_adicionarCategoria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Cadastrados"));
        jPanel1.setLayout(null);

        table_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod_Produto:", "Receb/Produto:", "Nome", "Cor:", "Preço:", "Qtde:", "Fornecedor:", "Tamanho:", "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 1090, 230);

        camp_SearchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_SearchProductKeyReleased(evt);
            }
        });
        jPanel1.add(camp_SearchProduct);
        camp_SearchProduct.setBounds(10, 50, 470, 30);

        jLabel1.setText("Pesquisar:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 16);

        box_Size.setText("Tamanho");
        box_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_SizeActionPerformed(evt);
            }
        });
        jPanel1.add(box_Size);
        box_Size.setBounds(120, 20, 100, 22);

        box_Price.setText("Preço");
        box_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_PriceActionPerformed(evt);
            }
        });
        jPanel1.add(box_Price);
        box_Price.setBounds(230, 20, 60, 22);

        box_Qnt.setText("Quantidade");
        box_Qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_QntActionPerformed(evt);
            }
        });
        jPanel1.add(box_Qnt);
        box_Qnt.setBounds(350, 20, 95, 22);

        btn_ToEdit.setText("Detalhes");
        btn_ToEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ToEditActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ToEdit);
        btn_ToEdit.setBounds(560, 50, 90, 30);

        btn_Deactivate.setText("Excluir");
        btn_Deactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeactivateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Deactivate);
        btn_Deactivate.setBounds(660, 50, 100, 30);

        camp_Profitmargin.setEditable(false);
        camp_Profitmargin.setForeground(new java.awt.Color(255, 0, 39));
        jPanel1.add(camp_Profitmargin);
        camp_Profitmargin.setBounds(990, 40, 110, 26);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setText("Margem de Lucro Bruto:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(940, 10, 170, 30);

        checkbox_ordenby.setText("ORDENAR EM ORDEM ALFABETICA");
        checkbox_ordenby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_ordenbyActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox_ordenby);
        checkbox_ordenby.setBounds(10, 80, 240, 22);

        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-48.png"))); // NOI18N
        btn_pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesquisarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_pesquisar);
        btn_pesquisar.setBounds(490, 40, 50, 50);

        add(jPanel1);
        jPanel1.setBounds(10, 300, 1120, 340);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produto"));
        jPanel2.setLayout(null);
        jPanel2.add(camp_ProductName);
        camp_ProductName.setBounds(20, 40, 370, 26);

        camp_Qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(camp_Qnt);
        camp_Qnt.setBounds(200, 110, 90, 26);

        comboBox_Supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Fornecedor>" }));
        comboBox_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_SupplierActionPerformed(evt);
            }
        });
        jPanel2.add(comboBox_Supplier);
        comboBox_Supplier.setBounds(650, 40, 370, 26);

        camp_Description.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jScrollPane2.setViewportView(camp_Description);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(200, 160, 380, 80);

        camp_Buyprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel2.add(camp_Buyprice);
        camp_Buyprice.setBounds(20, 110, 140, 26);

        camp_Sellprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel2.add(camp_Sellprice);
        camp_Sellprice.setBounds(20, 180, 140, 26);

        jLabel2.setText("Nome Produto:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 20, 110, 16);

        jLabel3.setText("Preço venda:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 160, 100, 16);

        jLabel4.setText("Preço compra:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 90, 100, 16);

        jLabel5.setText("Qnt:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 90, 44, 16);

        comboBox_Size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecione>", "P", "M", "G", "GG", "TAM. UNICO" }));
        jPanel2.add(comboBox_Size);
        comboBox_Size.setBounds(340, 110, 160, 26);

        jLabel6.setText("Tamanho:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(340, 90, 80, 16);

        btn_Register.setText("Cadastrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Register);
        btn_Register.setBounds(1020, 220, 90, 30);
        jPanel2.add(camp_apelido);
        camp_apelido.setBounds(760, 110, 157, 26);

        jLabel7.setText("Apelido:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(760, 90, 70, 16);

        jLabel9.setText("Fornecedor:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(650, 20, 100, 16);

        obrigatorioName.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioName.setText("* obrigatorio");
        jPanel2.add(obrigatorioName);
        obrigatorioName.setBounds(120, 20, 110, 16);

        obrigatorioPriceBuy.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceBuy.setText("* obrigatorio");
        jPanel2.add(obrigatorioPriceBuy);
        obrigatorioPriceBuy.setBounds(110, 90, 100, 20);

        obrigatorioPriceSell.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceSell.setText("* obrigatorio");
        jPanel2.add(obrigatorioPriceSell);
        obrigatorioPriceSell.setBounds(100, 160, 100, 16);

        obrigatorioCategoria.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioCategoria.setText("* obrigatorio");
        jPanel2.add(obrigatorioCategoria);
        obrigatorioCategoria.setBounds(500, 20, 100, 16);

        obrigatorioSupplier.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioSupplier.setText("* obrigatorio");
        jPanel2.add(obrigatorioSupplier);
        obrigatorioSupplier.setBounds(730, 20, 100, 16);

        jLabel10.setText("Data Entrega:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(650, 160, 100, 16);

        obrigatorioDate.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioDate.setText("* obrigatorio");
        jPanel2.add(obrigatorioDate);
        obrigatorioDate.setBounds(740, 160, 100, 16);

        jLabel11.setText("Ajuda?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(850, 180, 50, 20);
        jPanel2.add(camp_Deliverydate);
        camp_Deliverydate.setBounds(650, 180, 180, 27);

        btn_cleanAll.setText("Limpar ");
        btn_cleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanAllActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cleanAll);
        btn_cleanAll.setBounds(810, 220, 100, 30);

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1030, 40, 80, 30);

        jPanel2.add(comboxCategoria);
        comboxCategoria.setBounds(400, 40, 180, 26);

        jLabel12.setText("Tipo Categoria:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(400, 20, 110, 16);
        jPanel2.add(camp_cor);
        camp_cor.setBounds(650, 110, 90, 26);

        jLabel13.setText("Cor:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(650, 90, 25, 16);

        obrigatorioQnt.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioQnt.setText("* obrigatorio");
        jPanel2.add(obrigatorioQnt);
        obrigatorioQnt.setBounds(230, 90, 100, 16);

        btn_Novo.setText("Novo");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Novo);
        btn_Novo.setBounds(920, 220, 90, 30);

        obrigatorioTamanho.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioTamanho.setText("* obrigatorio");
        jPanel2.add(obrigatorioTamanho);
        obrigatorioTamanho.setBounds(410, 90, 100, 16);

        btn_adicionarCategoria.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_adicionarCategoria.setText("+");
        btn_adicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_adicionarCategoria);
        btn_adicionarCategoria.setBounds(580, 40, 30, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 10, 1120, 270);
        add(jSeparator1);
        jSeparator1.setBounds(10, 280, 1120, 10);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        RegisterProduct();
        camp_ProductName.setEnabled(false);
        camp_Deliverydate.setEnabled(false);
        camp_Description.setEnabled(false);
        camp_Qnt.setEnabled(false);
        camp_apelido.setEnabled(false);
        camp_cor.setEnabled(false);
        camp_Buyprice.setEnabled(false);
        camp_Sellprice.setEnabled(false);
        comboxCategoria.setEnabled(false);
        comboBox_Size.setEnabled(false);
        comboBox_Supplier.setEnabled(false);
        btn_adicionarCategoria.setEnabled(false);
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void box_QntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_QntActionPerformed
        if (box_Qnt.isSelected()) {
            box_Size.setEnabled(false);
            box_Price.setEnabled(false);
        } else {
            box_Size.setEnabled(true);
            box_Price.setEnabled(true);
        }
    }//GEN-LAST:event_box_QntActionPerformed

    private void box_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_SizeActionPerformed
        if (box_Size.isSelected()) {
            box_Qnt.setEnabled(false);
            box_Price.setEnabled(false);
        } else {
            box_Qnt.setEnabled(true);
            box_Price.setEnabled(true);
        }
    }//GEN-LAST:event_box_SizeActionPerformed

    private void box_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_PriceActionPerformed
        if (box_Price.isSelected()) {
            box_Size.setEnabled(false);
            box_Qnt.setEnabled(false);
        } else {
            box_Qnt.setEnabled(true);
            box_Size.setEnabled(true);
        }
    }//GEN-LAST:event_box_PriceActionPerformed

    private void table_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ProductMouseClicked
        btn_ToEdit.setEnabled(true);
        btn_Deactivate.setEnabled(true);
    }//GEN-LAST:event_table_ProductMouseClicked

    private void btn_DeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeactivateActionPerformed
        DeactivateItens();
    }//GEN-LAST:event_btn_DeactivateActionPerformed

    private void btn_ToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ToEditActionPerformed
        TelaEditProduto screenEdit = new TelaEditProduto();

        DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();
        int linha = table_Product.getSelectedRow();
        for (int i = 0; i < connectbanco.productBook().size(); i++) {
            if (connectbanco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                Produto item = connectbanco.productBook().get(i);
                screenEdit.setVisible(true); // TORNA VISIVEL A TELA DE EDITAR PRODUTO;
                screenEdit.setProduto(item); // MANDA O ITEM PRA OUTRA TELA;
                screenEdit.loadingCampos();  // CARREGA OS CAMPOS DA TELA QUE EDITA OS PRODUTOS;
                screenEdit.popularCombox();// CARREGA A COMBOBOX COM OS FORNECEDORES;
            }
        }
    }//GEN-LAST:event_btn_ToEditActionPerformed

    private void camp_SearchProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_SearchProductKeyReleased
        loadingTableProduct();
        btn_ToEdit.setEnabled(false);
        btn_Deactivate.setEnabled(false);
        checkbox_ordenby.setSelected(false);
    }//GEN-LAST:event_camp_SearchProductKeyReleased

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        JOptionPane.showMessageDialog(null, "Data em que o Produto foi recebido do Correio!", "Ajuda!!", HEIGHT);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btn_cleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanAllActionPerformed
        camp_ProductName.setText("");
        camp_apelido.setText("");
        camp_Buyprice.setText("");
        camp_Sellprice.setText("");
        camp_Qnt.setText("");
        camp_Description.setText("");
        camp_cor.setText("");
        comboxCategoria.setSelectedIndex(0);
        comboBox_Size.setSelectedIndex(0);
    }//GEN-LAST:event_btn_cleanAllActionPerformed

    private void comboBox_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_SupplierActionPerformed
        int posicao = comboBox_Supplier.getSelectedIndex();
        forne = connectbanco.list_Fornecedores().get(posicao);
        System.out.println(posicao + " " + forne.getNome());
    }//GEN-LAST:event_comboBox_SupplierActionPerformed

    private void checkbox_ordenbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_ordenbyActionPerformed

        btn_ToEdit.setEnabled(false);
        btn_Deactivate.setEnabled(false);

        List<Produto> items = new ArrayList<>();
        for (int i = 0; i < connectbanco.produtosOrdenados().size(); i++) {
            Produto item = connectbanco.produtosOrdenados().get(i);
            if (item.isStatus()) {      // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                items.add(item);        // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
            }
        }
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat lucroBruto = NumberFormat.getCurrencyInstance(localeBR);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

        DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();

        double y = 0;
        double x = 0;
        double z = 0;

        try {
            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR PARA NAO HAVER DUPLICAÇÃO DE ITENS;
            for (Produto item : items) {

                x = item.getValor_total();

                tableDefault.addRow(new Object[]{item.getIdProduto(), formato.format(item.getDataEntrega()), item.getNome(), item.getCor(), dinheiro.format((item.getValor_venda())),
                    item.getQnt(), item.getFornecedor().getNome(), item.getTamanho(), dinheiro.format(item.getValor_total())});

                // calculo do valor lucro bruto
                y = z + x;
                z = y;
            }

            camp_Profitmargin.setText(lucroBruto.format(z)); // adiciona a margem de lucro bruto

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Item não Encontrado>");
        }
    }//GEN-LAST:event_checkbox_ordenbyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadastroFornecedor fornecedor = new TelaCadastroFornecedor();
        fornecedor.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_pesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisarMouseClicked
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                loadingTableProduct();
                btn_ToEdit.setEnabled(false);
                btn_Deactivate.setEnabled(false);
                checkbox_ordenby.setSelected(false);
                carregando.dispose();
            }

        };
        t.start();


    }//GEN-LAST:event_btn_pesquisarMouseClicked

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        camp_ProductName.setEnabled(true);
        camp_Deliverydate.setEnabled(true);
        camp_Description.setEnabled(true);
        camp_Qnt.setEnabled(true);
        camp_apelido.setEnabled(true);
        camp_cor.setEnabled(true);
        camp_Buyprice.setEnabled(true);
        camp_Sellprice.setEnabled(true);
        comboxCategoria.setEnabled(true);
        comboBox_Size.setEnabled(true);
        comboBox_Supplier.setEnabled(true);
        btn_adicionarCategoria.setEnabled(true);
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_adicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarCategoriaActionPerformed
        new TelaCategoria().setVisible(true);
    }//GEN-LAST:event_btn_adicionarCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_Price;
    private javax.swing.JCheckBox box_Qnt;
    private javax.swing.JCheckBox box_Size;
    public javax.swing.JButton btn_Deactivate;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Register;
    public javax.swing.JButton btn_ToEdit;
    private javax.swing.JButton btn_adicionarCategoria;
    private javax.swing.JButton btn_cleanAll;
    private javax.swing.JLabel btn_pesquisar;
    private javax.swing.JFormattedTextField camp_Buyprice;
    private com.toedter.calendar.JDateChooser camp_Deliverydate;
    private javax.swing.JTextPane camp_Description;
    private javax.swing.JTextField camp_ProductName;
    private javax.swing.JFormattedTextField camp_Profitmargin;
    private javax.swing.JFormattedTextField camp_Qnt;
    private javax.swing.JTextField camp_SearchProduct;
    private javax.swing.JFormattedTextField camp_Sellprice;
    private javax.swing.JFormattedTextField camp_apelido;
    private javax.swing.JTextField camp_cor;
    private javax.swing.JCheckBox checkbox_ordenby;
    public static javax.swing.JComboBox<String> comboBox_Size;
    public static javax.swing.JComboBox<String> comboBox_Supplier;
    public static javax.swing.JComboBox<String> comboxCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel obrigatorioCategoria;
    private javax.swing.JLabel obrigatorioDate;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioPriceBuy;
    private javax.swing.JLabel obrigatorioPriceSell;
    private javax.swing.JLabel obrigatorioQnt;
    private javax.swing.JLabel obrigatorioSupplier;
    private javax.swing.JLabel obrigatorioTamanho;
    private javax.swing.JTable table_Product;
    // End of variables declaration//GEN-END:variables

    private void RegisterProduct() {

        if (camp_ProductName.getText().length() > 0) {
            obrigatorioName.setVisible(false);
        } else {
            obrigatorioName.setVisible(true);
        }
        if (camp_Qnt.getText().length() > 0) {
            obrigatorioQnt.setVisible(false);
        } else {
            obrigatorioQnt.setVisible(true);
        }
        if (camp_Buyprice.getText().length() > 0) {
            obrigatorioPriceBuy.setVisible(false);
        } else {
            obrigatorioPriceBuy.setVisible(true);
        }
        if (camp_Sellprice.getText().length() > 0) {
            obrigatorioPriceSell.setVisible(false);
        } else {
            obrigatorioPriceSell.setVisible(true);
        }
        try {
            if (!camp_Deliverydate.getDate().equals("")) {
                obrigatorioDate.setVisible(false);
            } else {
                obrigatorioDate.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">O CAMPO DATA NAO PODE FICAR EM BRANCO!</font></html>");
        }
        if (comboBox_Supplier.getSelectedItem().toString() != "<Selecione o Fornecedor>") {
            obrigatorioSupplier.setVisible(false);
        } else {
            obrigatorioSupplier.setVisible(true);
        }

        if ((camp_ProductName.getText().length() > 0)
                && (camp_Buyprice.getText().length() > 0)
                && (camp_Qnt.getText().length() > 0)
                && (camp_Sellprice.getText().length() > 0)
                && (!camp_Deliverydate.getDate().equals(""))
                && (comboBox_Supplier.getSelectedItem().toString() != "<Selecione o Fornecedor>")) {

            Produto newProduct = new Produto(); // cria um novo produto;
            String size = null;

            double priceSell = Double.parseDouble(camp_Sellprice.getText().replaceAll(",", ".").replace("R$", "")); //remove a virgula e adiciona apenas os numeros decimais
            int qnt = Integer.parseInt(camp_Qnt.getText());
            Double totalvalue = (priceSell * qnt);

            try {

                int posicao = comboBox_Supplier.getSelectedIndex();
                forne = connectbanco.list_Fornecedores().get(posicao);
                System.out.println("Fornecedor: " + forne.getNome());
            } catch (Exception e) {
                System.out.println(" Erro " + e);
                JOptionPane.showMessageDialog(null, "Certifique-se o Fornecedor está Cadastrado");
            }

            // adiciona os valores dos campos, nos atributos do novo produto;
            newProduct.setFornecedor(forne);
            newProduct.setNome(camp_ProductName.getText());
            newProduct.setValor_compra(Double.parseDouble(camp_Buyprice.getText().replace(",", ".")));
            newProduct.setValor_venda(Double.parseDouble(camp_Sellprice.getText().replace(",", ".")));
            newProduct.setApelido(camp_apelido.getText());
            newProduct.setStatus(true);
            newProduct.setQnt(qnt);
            newProduct.setDescricao(camp_Description.getText());
            newProduct.setDataEntrega(camp_Deliverydate.getDate());
            newProduct.setValor_total(totalvalue);
            newProduct.setDataRegistro(new Date()); // DATA QUE FOI REGISTRADO O PRODUTO;
            newProduct.setCor(camp_cor.getText());

            try {
                newProduct.setCategoria(comboxCategoria.getSelectedItem().toString());
                obrigatorioCategoria.setVisible(false);
            } catch (Exception e) {
                obrigatorioCategoria.setVisible(true);
                JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">SELECIONE A CATEGORIA DO PRODUTO!</font></html>");
            }

            if (comboBox_Size.getSelectedItem().toString().equals("<selecione>")) {
                JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">SELECIONE O TAMENHO!</font></html>");
                obrigatorioTamanho.setVisible(true);
            } else {
                obrigatorioTamanho.setVisible(false);
                size = comboBox_Size.getSelectedItem().toString();
                newProduct.setTamanho(size);

                /* ----------------- LIMPA OS CAMPOS  -------------- */
                connectbanco.save(newProduct);
                camp_ProductName.setText("");
                camp_apelido.setText("");
                camp_Buyprice.setText("");
                camp_Sellprice.setText("");
                camp_Qnt.setText("");
                camp_Description.setText("");
                camp_cor.setText("");
                comboxCategoria.setSelectedIndex(0);
                comboBox_Size.setSelectedIndex(0);

                loadingTableProduct(); // carrega os dados na tabela de produtos
                JOptionPane.showMessageDialog(null, "<html><font color=\"#0000FF\">PRODUTO SALVO COM SUCESSO!</font></html>");
            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">CONFIRA OS CAMPOS OBRIGATORIOS!</font></html>");
        }
    }

    public void loadingTableProduct() {

        String pesquisa = camp_SearchProduct.getText();
        List<Produto> items = new ArrayList<>();

        if (!box_Price.isSelected() && !box_Size.isSelected() && !box_Qnt.isSelected()) {
            for (int i = 0; i < connectbanco.productBook().size(); i++) {
                if (connectbanco.productBook().get(i).getNome().contains(pesquisa)) {   // VERIFICA SE O NOME CONTEM NO BANCO DE DADOS
                    Produto item = connectbanco.productBook().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }

        if (box_Size.isSelected() == true) {
            for (int i = 0; i < connectbanco.productBook().size(); i++) {
                if (connectbanco.productBook().get(i).getTamanho().contains(pesquisa)) {   // VERIFICA SE O TAMANHO CONTEM NO BANCO DE DADOS
                    Produto item = connectbanco.productBook().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }
        if (box_Price.isSelected() == true) {
            double valor = Float.parseFloat(pesquisa.replace(",", "").replace(".", ""));
            for (int i = 0; i < connectbanco.productBook().size(); i++) {
                if (connectbanco.productBook().get(i).getValor_venda() == valor) {   // VERIFICA SE O VALOR CONTEM NO BANCO DE DADOS
                    Produto item = connectbanco.productBook().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }
        if (box_Qnt.isSelected() == true) {
            int valor = Integer.parseInt(pesquisa);
            for (int i = 0; i < connectbanco.productBook().size(); i++) {
                if (connectbanco.productBook().get(i).getQnt() == valor) {   // VERIFICA SE A QNT CONTEM NO BANCO DE DADOS
                    Produto item = connectbanco.productBook().get(i);
                    if (item.isStatus()) {                                    // ESSE IF VAI ADICIONAR NA ARRAYLIST APENAS OS ITEMS QUE TIVEREM COM STATUS TRUE
                        items.add(item);                                     // ADICIONA O ITEM DA PESQUISA NA ARRAYLIST
                    }
                }
            }
        }

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat lucroBruto = NumberFormat.getCurrencyInstance(localeBR);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

        DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();

        double y = 0;
        double x = 0;
        double z = 0;

        try {
            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR PARA NAO HAVER DUPLICAÇÃO DE ITENS;
            for (Produto item : items) {

                x = item.getValor_total();

                tableDefault.addRow(new Object[]{item.getIdProduto(), formato.format(item.getDataEntrega()), item.getNome(), item.getCor(), dinheiro.format((item.getValor_venda())),
                    item.getQnt(), item.getFornecedor().getNome(), item.getTamanho(), dinheiro.format(item.getValor_total())});

                // calculo do valor lucro bruto
                y = z + x;
                z = y;
            }

            camp_Profitmargin.setText(lucroBruto.format(z)); // adiciona a margem de lucro bruto

        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(null, "<Item não Encontrado>");
        }

    }

    private void DeactivateItens() {

        int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja Desativar <html><font color=\"#FF0000\">*O ITEM SELECIONADO*?</font></html></html>", "Desativar", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {

            DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();
            int linha = table_Product.getSelectedRow();

            for (int i = 0; i < connectbanco.productBook().size(); i++) {
                if (connectbanco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                    Produto item = connectbanco.productBook().get(i);
                    item.setStatus(false);
                    connectbanco.update(item);
                    loadingTableProduct();
                    JOptionPane.showMessageDialog(null, "<html>Item <html><font color=\"#FF0000\">*DESATIVADO*</font></html>!</html>");
                    break;
                }
            }

        }
    }

    public static void loadingCampos() {

        Thread t = new Thread() {
            public void run() {
                try {
                    DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
                    for (Fornecedor fornecedor : connectbanco.list_Fornecedores()) { // PEGA OS FORNECEDORES CADASTRADOS NO BANCO DE DADOS;
                        comboBox.addElement(fornecedor.getNome());
                        comboBox_Supplier.setModel(comboBox);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        };
        t.start();

    }

    public static void carregarComboxCategoria() {
        DefaultComboBoxModel comboBoxCategoria = new DefaultComboBoxModel();
        for (Categoria categoria : Conexao.lista_Categoria()) {
            comboBoxCategoria.addElement(categoria.getTipo_Categoria());
            comboxCategoria.setModel(comboBoxCategoria);
        }
    }

}
