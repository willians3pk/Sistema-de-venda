package br.com.telas;

import br.com.classes.Fornecedor;
import br.com.classes.Produto;
import br.com.conexao.Conexao;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditProductScreen extends javax.swing.JFrame {

    Conexao connectbanco = new Conexao();
    Produto produto;

    public EditProductScreen() {
        initComponents();
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        camp_ProductName = new javax.swing.JTextField();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        obrigatorioName = new javax.swing.JLabel();
        obrigatorioPriceBuy = new javax.swing.JLabel();
        obrigatorioPriceSell = new javax.swing.JLabel();
        obrigatorioQnt = new javax.swing.JLabel();
        obrigatorioSupplier = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        camp_Apelido = new javax.swing.JTextField();
        camp_Qnt = new javax.swing.JFormattedTextField();
        camp_Deliverydate = new com.toedter.calendar.JDateChooser();
        obrigatorioTamanho = new javax.swing.JLabel();
        obrigatorioData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Edite Produto"));
        jPanel2.setLayout(null);
        jPanel2.add(camp_ProductName);
        camp_ProductName.setBounds(20, 50, 560, 32);

        comboBox_Supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboBox_Supplier);
        comboBox_Supplier.setBounds(620, 50, 230, 32);

        camp_Description.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição:"));
        jScrollPane2.setViewportView(camp_Description);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 240, 380, 110);

        camp_Buyprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel2.add(camp_Buyprice);
        camp_Buyprice.setBounds(20, 110, 140, 32);

        camp_Sellprice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
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

        jLabel7.setText("Apelido:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 160, 70, 16);

        jLabel9.setText("Fornecedor:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(620, 30, 100, 16);

        jLabel10.setText("Data Entrega:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(430, 160, 100, 16);

        obrigatorioName.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioName.setText("* obrigatorio");
        jPanel2.add(obrigatorioName);
        obrigatorioName.setBounds(120, 30, 90, 16);

        obrigatorioPriceBuy.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceBuy.setText("* obrigatorio");
        jPanel2.add(obrigatorioPriceBuy);
        obrigatorioPriceBuy.setBounds(110, 90, 90, 20);

        obrigatorioPriceSell.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioPriceSell.setText("* obrigatorio");
        jPanel2.add(obrigatorioPriceSell);
        obrigatorioPriceSell.setBounds(100, 160, 90, 16);

        obrigatorioQnt.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioQnt.setText("* obrigatorio");
        jPanel2.add(obrigatorioQnt);
        obrigatorioQnt.setBounds(230, 90, 90, 16);

        obrigatorioSupplier.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioSupplier.setText("* obrigatorio");
        jPanel2.add(obrigatorioSupplier);
        obrigatorioSupplier.setBounds(710, 30, 100, 16);

        btn_save.setText("Salvar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save);
        btn_save.setBounds(780, 350, 90, 36);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar);
        btn_cancelar.setBounds(668, 350, 90, 36);
        jPanel2.add(camp_Apelido);
        camp_Apelido.setBounds(200, 180, 150, 32);

        camp_Qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(camp_Qnt);
        camp_Qnt.setBounds(200, 110, 90, 32);
        jPanel2.add(camp_Deliverydate);
        camp_Deliverydate.setBounds(430, 180, 210, 33);

        obrigatorioTamanho.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioTamanho.setText("* obrigatorio");
        jPanel2.add(obrigatorioTamanho);
        obrigatorioTamanho.setBounds(420, 90, 90, 16);

        obrigatorioData.setForeground(new java.awt.Color(255, 0, 0));
        obrigatorioData.setText("* obrigatorio");
        jPanel2.add(obrigatorioData);
        obrigatorioData.setBounds(540, 160, 90, 16);

        jLabel1.setText("Ajuda?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(650, 180, 50, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 890, 400);

        setSize(new java.awt.Dimension(922, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        editProduct();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null, "Data em que o Produto foi recebido do Correio!", "Ajuda!!", HEIGHT);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(EditProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProductScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField camp_Apelido;
    private javax.swing.JFormattedTextField camp_Buyprice;
    private com.toedter.calendar.JDateChooser camp_Deliverydate;
    private javax.swing.JTextPane camp_Description;
    private javax.swing.JTextField camp_ProductName;
    private javax.swing.JFormattedTextField camp_Qnt;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel obrigatorioData;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioPriceBuy;
    private javax.swing.JLabel obrigatorioPriceSell;
    private javax.swing.JLabel obrigatorioQnt;
    private javax.swing.JLabel obrigatorioSupplier;
    private javax.swing.JLabel obrigatorioTamanho;
    // End of variables declaration//GEN-END:variables

    private void editProduct() {

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
                obrigatorioData.setVisible(false);
            } else {
                obrigatorioData.setVisible(true);
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
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja Realmente <html><font color=\"#FF0000\">*ALTERAR OS DADOS DESSE ITEM*?</font></html></html>", "Salvar?", JOptionPane.YES_NO_OPTION);

        if ((camp_ProductName.getText().length() > 0)
                && (camp_Buyprice.getText().length() > 0)
                && (camp_Qnt.getText().length() > 0)
                && (camp_Sellprice.getText().length() > 0)
                && (!camp_Deliverydate.getDate().equals(""))
                && (comboBox_Supplier.getSelectedItem().toString() != "<Selecione o Fornecedor>")
                && (confirmacao == JOptionPane.YES_OPTION)) {

            String size = null;

            Float priceBuy = Float.parseFloat(camp_Buyprice.getText().replaceAll(",", "").replace(".", "").replace("R$", "").trim());//remove a virgula e adiciona apenas os numeros decimais
            Float priceSell = Float.parseFloat(camp_Sellprice.getText().replaceAll(",", "").replace(".", "").replace("R$", "").trim()); //remove a virgula e adiciona apenas os numeros decimais
            int qnt = Integer.parseInt(camp_Qnt.getText());
            Float totalvalue = (priceSell * qnt);

            // PEGA O FORNECEDOR DA COMBOBOX;
            Fornecedor forne = null;
            int posicao = comboBox_Supplier.getSelectedIndex();
            forne = connectbanco.list_Fornecedores().get(posicao);

            // ADICIONA AS INFORMAÇÕES DO PRODUTO;
            produto.setFornecedor(forne);
            produto.setNome(camp_ProductName.getText());
            produto.setValor_compra(priceBuy);
            produto.setValor_venda(priceSell);
            produto.setApelido(camp_Apelido.getText());
            produto.setStatus(true);
            produto.setExcluido(false);
            produto.setQnt(qnt);
            produto.setDescricao(camp_Description.getText());
            produto.setDataEntrega(camp_Deliverydate.getDate());// ADICIONA A DATA;
            produto.setValor_total(totalvalue); // ADICIONA O VALOR TOTAL;

            if (comboBox_Size.getSelectedItem().toString().equals("<selecione>")) {
                JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">SELECIONE O TAMENHO!</font></html>");
                obrigatorioTamanho.setVisible(true);
            } else {
                obrigatorioTamanho.setVisible(false);
                size = comboBox_Size.getSelectedItem().toString(); // PEGA O TAMANHO DO ITEM NA COMBOBOX;
                produto.setTamanho(size); // ADICIONA O TAMANHO DO ITEM AO PRODUTO;
                connectbanco.update(produto);// ATUALIZA O PRODUTO;
                JOptionPane.showMessageDialog(null, "<html><font color=\"#0000FF\">PRODUTO ATUALIZADO COM SUCESSO!</font></html>");
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">CONFIRA OS CAMPOS OBRIGATORIOS!</font></html>");
        }

    }

    public void loadingCampos() {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

        DecimalFormat dinheiro = new DecimalFormat("0.##");
        String pricebuy = dinheiro.format(produto.getValor_compra() / 100); // MOVE A VIRGULA DUAS CASAS DECIMAIS;
        String pricesell = dinheiro.format(produto.getValor_venda() / 100); // MOVE A VIRGULA DUAS CASAS DECIMAIS;

        // ACRECENTA A VIRGULA E DUAS CASAS DECIMAIS AOS NUMEROS QUE SÃO INTEIROS;
        if (pricebuy.contains(",")) {
            camp_Buyprice.setText(pricebuy);
        } else {
            camp_Buyprice.setText(pricebuy + ",00");
        }
        if (pricesell.contains(",")) {
            camp_Sellprice.setText(pricesell);
        } else {
            camp_Sellprice.setText(pricesell + ",00");
        }

        // ADICIONA OS ATRIBUTOS DO ITEM NOS CAMPOS PARA SER EDITADOS;
        camp_ProductName.setText(produto.getNome());
        camp_Apelido.setText(produto.getApelido());

        camp_Qnt.setText(String.valueOf(produto.getQnt()));
        camp_Description.setText(produto.getDescricao());
        camp_Deliverydate.setDate(produto.getDataEntrega());
        comboBox_Size.setSelectedItem(produto.getTamanho());

        if (comboBox_Supplier.getSelectedItem().toString() == produto.getFornecedor().getNome()) {
            JOptionPane.showMessageDialog(null, "Fornecedor nao contem na lista");
        } else {
            comboBox_Supplier.setSelectedItem(produto.getFornecedor().getNome()); // ADICIONA O FORNECEDOR DO ITEM NA COMBOBOX
        }
    }

    public void PopularComcobox() {

        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        for (Fornecedor fornecedor : connectbanco.list_Fornecedores()) {
            comboBox.addElement(fornecedor.getNome());
            comboBox_Supplier.setModel(comboBox);           // ADICIONA OS FORNECEDORES NA COMBOBOX
        }
    }

}
