/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.conexao.Conexao;
import br.com.classes.Endereco;
import br.com.classes.Fornecedor;
import br.com.classes.NumeroContato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class RegistrationScreen extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationScreen
     */
    public RegistrationScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        camp_SupplierName = new javax.swing.JTextField();
        camp_CNPJ = new javax.swing.JFormattedTextField();
        camp_cpfSupplier = new javax.swing.JFormattedTextField();
        camp_EmailSupplier = new javax.swing.JTextField();
        camp_HomePageSupplier = new javax.swing.JTextField();
        camp_ContactSupplier = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        camp_DDDSupplier = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        obrigatorioName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        camp_AddressRuaSupplier = new javax.swing.JTextField();
        camp_CEPSupplier = new javax.swing.JFormattedTextField();
        camp_CitySupplier = new javax.swing.JTextField();
        camp_StateSupplier = new javax.swing.JTextField();
        camp_BairroSupplier = new javax.swing.JTextField();
        camp_NumbleHouseSupplier = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        camp_ComplementSupplier = new javax.swing.JTextPane();
        obrigatorioRua = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jFormattedTextField11 = new javax.swing.JFormattedTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jFormattedTextField12 = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(null);

        jPanel1.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));
        jPanel8.setLayout(null);
        jPanel8.add(camp_SupplierName);
        camp_SupplierName.setBounds(20, 50, 830, 32);

        try {
            camp_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CNPJ.setText("00.000.000/0000-00");
        jPanel8.add(camp_CNPJ);
        camp_CNPJ.setBounds(630, 170, 250, 32);

        try {
            camp_cpfSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfSupplier.setText("000.000.000-00");
        jPanel8.add(camp_cpfSupplier);
        camp_cpfSupplier.setBounds(360, 170, 250, 32);
        jPanel8.add(camp_EmailSupplier);
        camp_EmailSupplier.setBounds(20, 110, 280, 32);
        jPanel8.add(camp_HomePageSupplier);
        camp_HomePageSupplier.setBounds(20, 170, 280, 32);

        try {
            camp_ContactSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_ContactSupplier.setText("000000000");
        jPanel8.add(camp_ContactSupplier);
        camp_ContactSupplier.setBounds(440, 110, 130, 32);

        jLabel27.setText("Nome:");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(20, 30, 80, 16);

        jLabel28.setText("Contato:");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(440, 90, 130, 16);

        jLabel29.setText("CPF:");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(360, 150, 70, 16);

        jLabel30.setText("CNPJ:");
        jPanel8.add(jLabel30);
        jLabel30.setBounds(630, 150, 70, 16);

        jLabel31.setText("E-mail:");
        jPanel8.add(jLabel31);
        jLabel31.setBounds(20, 90, 80, 16);

        jLabel32.setText("Home Page:");
        jPanel8.add(jLabel32);
        jLabel32.setBounds(20, 150, 130, 20);

        try {
            camp_DDDSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_DDDSupplier.setText("00");
        jPanel8.add(camp_DDDSupplier);
        camp_DDDSupplier.setBounds(360, 110, 60, 32);

        jLabel33.setText("DDD:");
        jPanel8.add(jLabel33);
        jLabel33.setBounds(360, 90, 60, 16);

        obrigatorioName.setForeground(new java.awt.Color(254, 1, 1));
        obrigatorioName.setText("* obrigatorio");
        jPanel8.add(obrigatorioName);
        obrigatorioName.setBounds(70, 30, 90, 16);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(10, 10, 1090, 220);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 240, 1090, 10);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        jPanel9.setLayout(null);
        jPanel9.add(camp_AddressRuaSupplier);
        camp_AddressRuaSupplier.setBounds(20, 40, 490, 32);

        try {
            camp_CEPSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CEPSupplier.setText("00000-000");
        jPanel9.add(camp_CEPSupplier);
        camp_CEPSupplier.setBounds(540, 40, 150, 32);
        jPanel9.add(camp_CitySupplier);
        camp_CitySupplier.setBounds(20, 110, 220, 32);
        jPanel9.add(camp_StateSupplier);
        camp_StateSupplier.setBounds(330, 110, 100, 32);
        jPanel9.add(camp_BairroSupplier);
        camp_BairroSupplier.setBounds(20, 180, 270, 32);

        camp_NumbleHouseSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_NumbleHouseSupplier.setText("0000");
        jPanel9.add(camp_NumbleHouseSupplier);
        camp_NumbleHouseSupplier.setBounds(330, 180, 100, 32);

        jLabel34.setText("Rua:");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(20, 20, 50, 16);

        jLabel35.setText("CEP:");
        jPanel9.add(jLabel35);
        jLabel35.setBounds(540, 20, 70, 16);

        jLabel36.setText("Cidade:");
        jPanel9.add(jLabel36);
        jLabel36.setBounds(20, 90, 70, 16);

        jLabel37.setText("Estado:");
        jPanel9.add(jLabel37);
        jLabel37.setBounds(330, 90, 80, 16);

        jLabel38.setText("Bairro:");
        jPanel9.add(jLabel38);
        jLabel38.setBounds(20, 160, 70, 16);

        jLabel39.setText("Numero da Casa:");
        jPanel9.add(jLabel39);
        jLabel39.setBounds(330, 160, 190, 16);

        camp_ComplementSupplier.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        jScrollPane3.setViewportView(camp_ComplementSupplier);

        jPanel9.add(jScrollPane3);
        jScrollPane3.setBounds(540, 100, 520, 110);

        obrigatorioRua.setForeground(new java.awt.Color(254, 1, 1));
        obrigatorioRua.setText("* obrigatorio");
        jPanel9.add(obrigatorioRua);
        obrigatorioRua.setBounds(50, 20, 90, 16);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(10, 250, 1090, 240);

        btn_Register.setText("Cadastrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register);
        btn_Register.setBounds(988, 550, 110, 36);

        jButton3.setText("Limpar Tudo");
        jPanel1.add(jButton3);
        jButton3.setBounds(848, 550, 110, 36);

        jTabbedPane1.addTab("Fornecedor:", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 240, 1090, 10);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        jPanel6.setLayout(null);
        jPanel6.add(jTextField8);
        jTextField8.setBounds(20, 50, 830, 32);

        try {
            jFormattedTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField8.setText("000.000.000-00");
        jPanel6.add(jFormattedTextField8);
        jFormattedTextField8.setBounds(360, 170, 250, 32);
        jPanel6.add(jTextField9);
        jTextField9.setBounds(20, 110, 280, 32);
        jPanel6.add(jTextField10);
        jTextField10.setBounds(20, 170, 280, 32);

        try {
            jFormattedTextField9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField9.setText("000000000");
        jPanel6.add(jFormattedTextField9);
        jFormattedTextField9.setBounds(440, 110, 130, 32);

        jLabel14.setText("Nome:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(20, 30, 80, 16);

        jLabel15.setText("Contato:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(440, 90, 130, 16);

        jLabel16.setText("CPF:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(360, 150, 70, 16);

        jLabel17.setText("Data Nascimento:");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(630, 150, 160, 16);

        jLabel18.setText("E-mail:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(20, 90, 80, 16);

        jLabel19.setText("Home Page:");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(20, 150, 130, 20);

        try {
            jFormattedTextField10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField10.setText("00");
        jPanel6.add(jFormattedTextField10);
        jFormattedTextField10.setBounds(360, 110, 60, 32);

        jLabel20.setText("DDD:");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(360, 90, 60, 16);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(630, 170, 57, 32);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 10, 1090, 220);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        jPanel7.setLayout(null);
        jPanel7.add(jTextField11);
        jTextField11.setBounds(20, 40, 490, 32);

        try {
            jFormattedTextField11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField11.setText("00000-000");
        jPanel7.add(jFormattedTextField11);
        jFormattedTextField11.setBounds(540, 40, 150, 32);
        jPanel7.add(jTextField12);
        jTextField12.setBounds(20, 110, 220, 32);
        jPanel7.add(jTextField13);
        jTextField13.setBounds(330, 110, 100, 32);
        jPanel7.add(jTextField14);
        jTextField14.setBounds(20, 180, 270, 32);
        jPanel7.add(jFormattedTextField12);
        jFormattedTextField12.setBounds(330, 180, 100, 32);

        jLabel21.setText("Rua:");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(20, 20, 50, 16);

        jLabel22.setText("CEP:");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(540, 20, 70, 16);

        jLabel23.setText("Cidade:");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(20, 90, 70, 16);

        jLabel24.setText("Estado:");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(330, 90, 80, 16);

        jLabel25.setText("Bairro:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(20, 160, 70, 16);

        jLabel26.setText("Numero da Casa:");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(330, 160, 190, 16);

        jTextPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        jScrollPane2.setViewportView(jTextPane2);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(540, 100, 520, 110);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 250, 1090, 240);

        jButton2.setText("Cadastrar");
        jPanel2.add(jButton2);
        jButton2.setBounds(988, 550, 110, 36);

        jButton4.setText("Limpar Tudo");
        jPanel2.add(jButton4);
        jButton4.setBounds(848, 550, 110, 36);

        jTabbedPane1.addTab("Pessoa:", jPanel2);

        jPanel3.setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedores"));
        jPanel4.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 1040, 140);

        jTextField1.setText("jTextField1");
        jPanel4.add(jTextField1);
        jTextField1.setBounds(20, 60, 780, 32);

        jLabel1.setText("Nome:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 40, 50, 16);

        jButton5.setText("Buscar");
        jPanel4.add(jButton5);
        jButton5.setBounds(830, 60, 90, 36);

        jInternalFrame1.getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 10, 1080, 270);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(null);
        jInternalFrame1.getContentPane().add(jPanel10);
        jPanel10.setBounds(10, 300, 1080, 260);
        jInternalFrame1.getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 290, 1080, 10);

        jPanel3.add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 1110, 600);

        jTabbedPane1.addTab("Cadastros", jPanel3);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        RegisterSupplier();
    }//GEN-LAST:event_btn_RegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register;
    private javax.swing.JTextField camp_AddressRuaSupplier;
    private javax.swing.JTextField camp_BairroSupplier;
    private javax.swing.JFormattedTextField camp_CEPSupplier;
    private javax.swing.JFormattedTextField camp_CNPJ;
    private javax.swing.JTextField camp_CitySupplier;
    private javax.swing.JTextPane camp_ComplementSupplier;
    private javax.swing.JFormattedTextField camp_ContactSupplier;
    private javax.swing.JFormattedTextField camp_DDDSupplier;
    private javax.swing.JTextField camp_EmailSupplier;
    private javax.swing.JTextField camp_HomePageSupplier;
    private javax.swing.JFormattedTextField camp_NumbleHouseSupplier;
    private javax.swing.JTextField camp_StateSupplier;
    private javax.swing.JTextField camp_SupplierName;
    private javax.swing.JFormattedTextField camp_cpfSupplier;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField11;
    private javax.swing.JFormattedTextField jFormattedTextField12;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioRua;
    // End of variables declaration//GEN-END:variables

    private void RegisterSupplier() {

        Fornecedor supplier = new Fornecedor();
        Endereco end = new Endereco();
        NumeroContato contact = new NumeroContato();

        if (camp_SupplierName.getText().length() > 0) {
            obrigatorioName.setVisible(false);
        } else {
            obrigatorioName.setVisible(true);
        }
        if (camp_AddressRuaSupplier.getText().length() > 0) {
            obrigatorioRua.setVisible(false);
        } else {
            obrigatorioRua.setVisible(true);
        }

        if ((camp_SupplierName.getText().length() > 0) && (camp_AddressRuaSupplier.getText().length() > 0)) {

            Long cnpj = Long.parseLong(camp_CNPJ.getText().replace(".", "").replace(".", "").replace("/", "").replace("-", ""));
            Long cpf = Long.parseLong(camp_cpfSupplier.getText().replace(".", "").replace(".", "").replace("-", ""));

            //--------------------------------- Dados Fornecedor ------------------------------------//

            supplier.setNome(camp_SupplierName.getText());
            supplier.setCnpj(cnpj);
            supplier.setEmail(camp_EmailSupplier.getText());
            supplier.setHomePage(camp_HomePageSupplier.getText());
            supplier.setCpf(cpf);

            //--------------------------------- numero de contato -----------------------------------//
            int ddd = Integer.parseInt(camp_DDDSupplier.getText());
            int numeroContato = Integer.parseInt(camp_ContactSupplier.getText());

            contact.setDdd(ddd);
            contact.setFone(numeroContato);
            contact.setFornecedor(supplier);
            contact.setCpf(cpf);

            //--------------------------------- Endereço -----------------------------------//
            int cep = Integer.parseInt(camp_CEPSupplier.getText().replaceAll("-", ""));
            int numbleHouse = Integer.parseInt(camp_NumbleHouseSupplier.getText());

            end.setRua(camp_AddressRuaSupplier.getText());
            end.setCep(cep);
            end.setNumeroCasa(numbleHouse);
            end.setBairro(camp_BairroSupplier.getText());
            end.setEstadoUf(camp_StateSupplier.getText());
            end.setComplemento(camp_ComplementSupplier.getText());

            supplier.setEndereco(end); // adiciona o endereço ao forncedor;
            end.setFornecedors(supplier); // adiciona o fornecedor ao endereco;
            
            Conexao connectbanco = new Conexao();
            connectbanco.save(supplier);
            
/*          connectbanco.save(end); 
            connectbanco.save(contact);
            
NÃO A NECESSIDADE DE SALVAR O ENDERECO E NEM "CONTATO", POIS A CLASSE ESTÁ MAPEADA COMO CASCADE, ENTAO SÓ PRECISA
SALVAR A CLASS PAI QUE AUTOMATICAMENTO SALVA A CLASSE FILHO */

            
            
            
            
            
//            LIMPA OS CAMPOS DE TEXTOS
            camp_SupplierName.setText(""); // name do fornecedor
            camp_AddressRuaSupplier.setText(""); // rua do fornecedor
            camp_EmailSupplier.setText(""); // email do fornecedor
            camp_HomePageSupplier.setText(""); // home page do fornecedor
            camp_CEPSupplier.setText("00000000"); // cep do fornecedor
            camp_DDDSupplier.setText("00"); // DDD do fornecedor
            camp_ContactSupplier.setText("000000000"); // contato do fornecedor
            camp_CNPJ.setText("0000000000000"); // CNPJ do fornecedor
            camp_cpfSupplier.setText("00000000000"); // CPF do fornecedor
            camp_BairroSupplier.setText("");// Bairro do fornecedor
            camp_NumbleHouseSupplier.setText("00000000"); // Numero da Casa ou loja do fornecedor
            camp_StateSupplier.setText(""); // Estado UF do fornecedor
            camp_CitySupplier.setText(""); // cidade do forncedor
            camp_ComplementSupplier.setText(""); // complemento do fornecedor
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha as Informações Obrigatorias");
        }

    }

}
