package br.com.telas;

import br.com.classes.Fornecedor;
import br.com.classes.Produto;
import br.com.conexao.Conexao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
        camp_Code = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        camp_Deliverydate = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        obrigatorioName = new javax.swing.JLabel();
        obrigatorioPriceBuy = new javax.swing.JLabel();
        obrigatorioPriceSell = new javax.swing.JLabel();
        obrigatorioQnt = new javax.swing.JLabel();
        obrigatorioDate = new javax.swing.JLabel();
        obrigatorioSupplier = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Edite Produto"));
        jPanel2.setLayout(null);
        jPanel2.add(camp_ProductName);
        camp_ProductName.setBounds(20, 50, 560, 32);

        camp_Qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(camp_Qnt);
        camp_Qnt.setBounds(200, 110, 90, 32);

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
        jPanel2.add(camp_Code);
        camp_Code.setBounds(200, 180, 157, 32);

        jLabel7.setText("Codigo:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 160, 70, 16);

        jLabel9.setText("Fornecedor:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(620, 30, 100, 16);

        try {
            camp_Deliverydate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(camp_Deliverydate);
        camp_Deliverydate.setBounds(390, 180, 120, 32);

        jLabel10.setText("Data Entrega:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(390, 160, 100, 16);

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
        obrigatorioSupplier.setBounds(710, 30, 40, 16);

        btn_save.setText("Salvar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save);
        btn_save.setBounds(780, 350, 90, 36);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(668, 350, 90, 36);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 890, 400);

        setSize(new java.awt.Dimension(922, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

    }//GEN-LAST:event_btn_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btn_save;
    private javax.swing.JFormattedTextField camp_Buyprice;
    private javax.swing.JFormattedTextField camp_Code;
    private javax.swing.JFormattedTextField camp_Deliverydate;
    private javax.swing.JTextPane camp_Description;
    private javax.swing.JTextField camp_ProductName;
    private javax.swing.JFormattedTextField camp_Qnt;
    private javax.swing.JFormattedTextField camp_Sellprice;
    private javax.swing.JComboBox<String> comboBox_Size;
    private javax.swing.JComboBox<String> comboBox_Supplier;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel obrigatorioDate;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioPriceBuy;
    private javax.swing.JLabel obrigatorioPriceSell;
    private javax.swing.JLabel obrigatorioQnt;
    private javax.swing.JLabel obrigatorioSupplier;
    // End of variables declaration//GEN-END:variables

    private void editProduct() {

    }

    public void loadingCampos() {

        // ADICIONA OS ATRIBUTOS DO ITEM NOS CAMPOS PARA SER EDITADOS;
        
        
        camp_ProductName.setText(produto.getNome());
        camp_Code.setText(produto.getCodigo().toString());
        camp_Buyprice.setText(produto.getValor_compra().toString());
        camp_Sellprice.setText(produto.getValor_venda().toString());
        camp_Qnt.setText(String.valueOf(produto.getQnt()));
        camp_Description.setText(produto.getDescricao());
        camp_Deliverydate.setText("");
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
