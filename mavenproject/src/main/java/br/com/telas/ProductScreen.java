/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.conexao.Conexao;
import br.com.classes.Fornecedor;
import br.com.classes.Produto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ProductScreen extends javax.swing.JPanel {

    Conexao connectbanco = new Conexao();

    public ProductScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Product = new javax.swing.JTable();
        camp_SearchProduct = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        box_Size = new javax.swing.JCheckBox();
        box_Price = new javax.swing.JCheckBox();
        box_Qnt = new javax.swing.JCheckBox();
        btn_ToEdit = new javax.swing.JButton();
        btn_Deactivate = new javax.swing.JButton();
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
        camp_Code = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camp_Profitmargin = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_NewSupplier = new javax.swing.JButton();
        camp_Deliverydate = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        obrigatorioName = new javax.swing.JLabel();
        obrigatorioPriceBuy = new javax.swing.JLabel();
        obrigatorioPriceSell = new javax.swing.JLabel();
        obrigatorioQnt = new javax.swing.JLabel();
        obrigatorioDate = new javax.swing.JLabel();
        obrigatorioSupplier = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Cadastrados"));
        jPanel1.setLayout(null);

        table_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_Product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 830, 130);
        jPanel1.add(camp_SearchProduct);
        camp_SearchProduct.setBounds(10, 90, 470, 32);

        btn_Search.setText("Buscar");
        jPanel1.add(btn_Search);
        btn_Search.setBounds(510, 90, 100, 36);

        jLabel1.setText("Pesquisar:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 80, 16);

        box_Size.setText("Tamanho");
        jPanel1.add(box_Size);
        box_Size.setBounds(120, 60, 81, 24);

        box_Price.setText("Preço");
        jPanel1.add(box_Price);
        box_Price.setBounds(230, 60, 62, 24);

        box_Qnt.setText("Quantidade");
        jPanel1.add(box_Qnt);
        box_Qnt.setBounds(350, 60, 97, 24);

        btn_ToEdit.setText("Editar");
        jPanel1.add(btn_ToEdit);
        btn_ToEdit.setBounds(640, 90, 100, 36);

        btn_Deactivate.setText("Desativa");
        jPanel1.add(btn_Deactivate);
        btn_Deactivate.setBounds(770, 90, 100, 36);

        add(jPanel1);
        jPanel1.setBounds(10, 320, 1120, 300);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Produto"));
        jPanel2.setLayout(null);
        jPanel2.add(camp_ProductName);
        camp_ProductName.setBounds(20, 50, 560, 32);

        camp_Qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(camp_Qnt);
        camp_Qnt.setBounds(200, 110, 90, 32);

        comboBox_Supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboBox_Supplier);
        comboBox_Supplier.setBounds(650, 50, 370, 32);

        camp_Description.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição:"));
        jScrollPane2.setViewportView(camp_Description);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(200, 160, 380, 110);

        camp_Buyprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel2.add(camp_Buyprice);
        camp_Buyprice.setBounds(20, 110, 140, 32);

        camp_Sellprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel2.add(camp_Sellprice);
        camp_Sellprice.setBounds(20, 180, 140, 32);

        jLabel2.setText("Nome Produto:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 110, 16);

        jLabel3.setText("Preço venda:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 160, 100, 16);

        jLabel4.setText("Preço compra:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 90, 100, 16);

        jLabel5.setText("Qnt:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 90, 44, 16);

        comboBox_Size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecione>", "P", "M", "G", "GG" }));
        jPanel2.add(comboBox_Size);
        comboBox_Size.setBounds(350, 110, 230, 32);

        jLabel6.setText("Tamanho:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(350, 90, 80, 16);

        btn_Register.setText("Cadastrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Register);
        btn_Register.setBounds(970, 240, 130, 36);
        jPanel2.add(camp_Code);
        camp_Code.setBounds(650, 130, 157, 32);

        jLabel7.setText("Codigo:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(650, 110, 70, 16);

        jLabel8.setText("Margem de Lucro:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(650, 180, 120, 16);

        camp_Profitmargin.setEnabled(false);
        jPanel2.add(camp_Profitmargin);
        camp_Profitmargin.setBounds(650, 200, 110, 32);

        jLabel9.setText("Fornecedor:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(650, 30, 100, 16);

        btn_NewSupplier.setText("Novo");
        jPanel2.add(btn_NewSupplier);
        btn_NewSupplier.setBounds(1030, 50, 80, 36);

        try {
            camp_Deliverydate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(camp_Deliverydate);
        camp_Deliverydate.setBounds(840, 130, 120, 32);

        jLabel10.setText("Data Entrega:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(840, 110, 100, 16);

        obrigatorioName.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioName.setText("*");
        jPanel2.add(obrigatorioName);
        obrigatorioName.setBounds(120, 30, 40, 16);

        obrigatorioPriceBuy.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceBuy.setText("*");
        jPanel2.add(obrigatorioPriceBuy);
        obrigatorioPriceBuy.setBounds(110, 90, 30, 20);

        obrigatorioPriceSell.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceSell.setText("*");
        jPanel2.add(obrigatorioPriceSell);
        obrigatorioPriceSell.setBounds(100, 160, 30, 16);

        obrigatorioQnt.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioQnt.setText("*");
        jPanel2.add(obrigatorioQnt);
        obrigatorioQnt.setBounds(230, 90, 30, 16);

        obrigatorioDate.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioDate.setText("*");
        jPanel2.add(obrigatorioDate);
        obrigatorioDate.setBounds(930, 110, 30, 16);

        obrigatorioSupplier.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioSupplier.setText("*");
        jPanel2.add(obrigatorioSupplier);
        obrigatorioSupplier.setBounds(730, 30, 30, 16);

        add(jPanel2);
        jPanel2.setBounds(10, 10, 1120, 290);
        add(jSeparator1);
        jSeparator1.setBounds(10, 310, 1120, 10);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        RegisterProduct();
    }//GEN-LAST:event_btn_RegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_Price;
    private javax.swing.JCheckBox box_Qnt;
    private javax.swing.JCheckBox box_Size;
    private javax.swing.JButton btn_Deactivate;
    private javax.swing.JButton btn_NewSupplier;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_ToEdit;
    private javax.swing.JFormattedTextField camp_Buyprice;
    private javax.swing.JFormattedTextField camp_Code;
    private javax.swing.JFormattedTextField camp_Deliverydate;
    private javax.swing.JTextPane camp_Description;
    private javax.swing.JTextField camp_ProductName;
    private javax.swing.JFormattedTextField camp_Profitmargin;
    private javax.swing.JFormattedTextField camp_Qnt;
    private javax.swing.JTextField camp_SearchProduct;
    private javax.swing.JFormattedTextField camp_Sellprice;
    private javax.swing.JComboBox<String> comboBox_Size;
    private javax.swing.JComboBox<String> comboBox_Supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel obrigatorioDate;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioPriceBuy;
    private javax.swing.JLabel obrigatorioPriceSell;
    private javax.swing.JLabel obrigatorioQnt;
    private javax.swing.JLabel obrigatorioSupplier;
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

        if ((camp_ProductName.getText().length() > 0)
                && (camp_Buyprice.getText().length() > 0)
                && (camp_Qnt.getText().length() > 0)
                && (camp_Sellprice.getText().length() > 0)
                && (camp_Deliverydate.getText().length() > 0)) {

            Produto newProduct = new Produto(); // cria um novo produto;
            String size = null;
            
            Long priceBuy = Long.parseLong(camp_Buyprice.getText().replaceAll(",", ""));//remove a virgula e adiciona apenas os numeros decimais
            Long priceSell = Long.parseLong(camp_Sellprice.getText().replaceAll(",", "")); //remove a virgula e adiciona apenas os numeros decimais
            Long code = Long.parseLong(camp_Code.getText());
            int qnt = Integer.parseInt(camp_Qnt.getText());
            Long totalvalue = (priceSell * qnt);

            try {

                DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
                for (Fornecedor fornecedor : connectbanco.list_Fornecedores()) { // PEGA OS FORNECEDORES CADASTRADOS NO BANCO DE DADOS;
                    comboBox.addElement(fornecedor.getNome());
                    comboBox_Supplier.setModel(comboBox);           // ADICIONA OS FORNECEDORES NA COMBOBOX;
                }

                int position = comboBox_Supplier.getSelectedIndex();
                Fornecedor forne = connectbanco.list_Fornecedores().get(position);

                // adiciona os valores dos campos nos atributos do novo produto;
                newProduct.setFornecedor(forne);
                newProduct.setNome(camp_ProductName.getText());
                newProduct.setValor_compra(priceBuy);
                newProduct.setValor_venda(priceSell);
                newProduct.setCodigo(code);
                newProduct.setStatus(true);
                newProduct.setExcluido(false);
                newProduct.setQnt(qnt);
                newProduct.setDescricao(camp_Description.getText());
//                newProduct.setValor_total(totalvalue);             ******** NÃO ESQUECER DE ARRUMA ESSA LINHA DE CODIGO ********

                if (comboBox_Size.getSelectedItem().toString().equals("<selecione>")) {
                    JOptionPane.showMessageDialog(null, "Selecione o Tamanho!!");
                } else {

                    size = comboBox_Size.getSelectedItem().toString();
                    newProduct.setTamanho(size);

                    connectbanco.save(newProduct);
                    camp_ProductName.setText("");
                    camp_Code.setText("");
                    camp_Buyprice.setText("");
                    camp_Sellprice.setText("");
                    camp_Qnt.setText("");
                    camp_Description.setText("");
                    comboBox_Size.setSelectedIndex(0);
                }
            } catch (Exception e) {
                System.out.println(" Erro " + e);
                JOptionPane.showMessageDialog(null, "Certifique-se o Fornecedor está Cadastrado");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Confira os campos obrigatorio!");
        }
    }

}
