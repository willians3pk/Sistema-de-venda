package br.com.telas;

import br.com.classes.Cliente;
import br.com.conexao.Conexao;
import br.com.classes.Endereco;
import br.com.classes.Fornecedor;
import br.com.classes.NumeroContato;
import br.com.classes.Pessoa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrationScreen extends javax.swing.JPanel {

    Fornecedor f = null;

    public RegistrationScreen() {
        initComponents();
        preencherTable();
        jpanelSupplier.setVisible(false);
        btn_edit.setEnabled(false);
        btn_save.setEnabled(false);
        btn_cancelar.setEnabled(false);
    }

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
        btn_limpall = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        field_Name = new javax.swing.JTextField();
        field_cpf = new javax.swing.JFormattedTextField();
        filed_Email = new javax.swing.JTextField();
        field_homePage = new javax.swing.JTextField();
        field_contact = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        field_DDD = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        field_date = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        field_Rua = new javax.swing.JTextField();
        field_cep = new javax.swing.JFormattedTextField();
        field_cidade = new javax.swing.JTextField();
        field_estado = new javax.swing.JTextField();
        field_bairro = new javax.swing.JTextField();
        field_numeroCasa = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field_complement = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        btn_limpAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jpanelSupplier = new javax.swing.JPanel();
        camp_SupplierName1 = new javax.swing.JTextField();
        camp_CNPJ1 = new javax.swing.JFormattedTextField();
        camp_cpfSupplier1 = new javax.swing.JFormattedTextField();
        camp_EmailSupplier1 = new javax.swing.JTextField();
        camp_HomePageSupplier1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        camp_DDDSupplier1 = new javax.swing.JFormattedTextField();
        jLabel46 = new javax.swing.JLabel();
        camp_CEPSupplier1 = new javax.swing.JFormattedTextField();
        jLabel47 = new javax.swing.JLabel();
        camp_StateSupplier1 = new javax.swing.JTextField();
        camp_NumbleHouseSupplier1 = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        camp_AddressRuaSupplier1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        camp_CitySupplier1 = new javax.swing.JTextField();
        camp_BairroSupplier1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListContato = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        camp_ComplementSupplier1 = new javax.swing.JTextPane();
        btn_edit = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
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
        jPanel9.setBounds(10, 250, 1090, 260);

        btn_Register.setText("Cadastrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register);
        btn_Register.setBounds(988, 550, 110, 36);

        btn_limpall.setText("Limpar Tudo");
        btn_limpall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpallActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpall);
        btn_limpall.setBounds(848, 550, 110, 36);

        jTabbedPane1.addTab("Fornecedor:", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 240, 1090, 10);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        jPanel6.setLayout(null);
        jPanel6.add(field_Name);
        field_Name.setBounds(20, 50, 830, 32);

        try {
            field_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_cpf.setText("000.000.000-00");
        jPanel6.add(field_cpf);
        field_cpf.setBounds(360, 170, 250, 32);
        jPanel6.add(filed_Email);
        filed_Email.setBounds(20, 110, 280, 32);
        jPanel6.add(field_homePage);
        field_homePage.setBounds(20, 170, 280, 32);

        try {
            field_contact.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_contact.setText("000000000");
        jPanel6.add(field_contact);
        field_contact.setBounds(440, 110, 130, 32);

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
            field_DDD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_DDD.setText("00");
        jPanel6.add(field_DDD);
        field_DDD.setBounds(360, 110, 60, 32);

        jLabel20.setText("DDD:");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(360, 90, 60, 16);

        try {
            field_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(field_date);
        field_date.setBounds(630, 170, 100, 32);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* obrigatorio");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(70, 30, 90, 16);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 10, 1090, 220);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        jPanel7.setLayout(null);
        jPanel7.add(field_Rua);
        field_Rua.setBounds(20, 40, 490, 32);

        try {
            field_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_cep.setText("00000-000");
        jPanel7.add(field_cep);
        field_cep.setBounds(540, 40, 150, 32);
        jPanel7.add(field_cidade);
        field_cidade.setBounds(20, 110, 220, 32);
        jPanel7.add(field_estado);
        field_estado.setBounds(330, 110, 100, 32);
        jPanel7.add(field_bairro);
        field_bairro.setBounds(20, 180, 270, 32);

        field_numeroCasa.setText("0000");
        jPanel7.add(field_numeroCasa);
        field_numeroCasa.setBounds(330, 180, 100, 32);

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

        field_complement.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        jScrollPane2.setViewportView(field_complement);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(540, 100, 520, 110);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 250, 1090, 250);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(988, 550, 110, 36);

        btn_limpAll.setText("Limpar Tudo");
        btn_limpAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpAllActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpAll);
        btn_limpAll.setBounds(848, 550, 110, 36);

        jTabbedPane1.addTab("Cliente", jPanel2);

        jPanel3.setLayout(null);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedores"));
        jPanel4.setLayout(null);

        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod_Fornecedor", "Nome", "Home-Page", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSupplierMouseClicked(evt);
            }
        });
        tableSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableSupplierKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplier);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 1040, 100);
        jPanel4.add(fieldSearch);
        fieldSearch.setBounds(20, 40, 680, 32);

        jLabel1.setText("Nome:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 20, 50, 16);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_buscar);
        btn_buscar.setBounds(720, 40, 90, 36);

        jInternalFrame1.getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 10, 1080, 200);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(null);

        jpanelSupplier.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));
        jpanelSupplier.setLayout(null);

        camp_SupplierName1.setEnabled(false);
        jpanelSupplier.add(camp_SupplierName1);
        camp_SupplierName1.setBounds(20, 50, 380, 32);

        try {
            camp_CNPJ1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CNPJ1.setText("00.000.000/0000-00");
        camp_CNPJ1.setEnabled(false);
        jpanelSupplier.add(camp_CNPJ1);
        camp_CNPJ1.setBounds(20, 170, 190, 32);

        try {
            camp_cpfSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfSupplier1.setText("000.000.000-00");
        camp_cpfSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_cpfSupplier1);
        camp_cpfSupplier1.setBounds(240, 170, 160, 32);

        camp_EmailSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_EmailSupplier1);
        camp_EmailSupplier1.setBounds(20, 110, 190, 32);

        camp_HomePageSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_HomePageSupplier1);
        camp_HomePageSupplier1.setBounds(240, 110, 160, 32);

        jLabel40.setText("Nome:");
        jpanelSupplier.add(jLabel40);
        jLabel40.setBounds(20, 30, 80, 16);

        jLabel41.setText("Contato:");
        jpanelSupplier.add(jLabel41);
        jLabel41.setBounds(240, 220, 110, 16);

        jLabel42.setText("CPF:");
        jpanelSupplier.add(jLabel42);
        jLabel42.setBounds(240, 150, 70, 16);

        jLabel43.setText("CNPJ:");
        jpanelSupplier.add(jLabel43);
        jLabel43.setBounds(20, 150, 70, 16);

        jLabel44.setText("E-mail:");
        jpanelSupplier.add(jLabel44);
        jLabel44.setBounds(20, 90, 80, 16);

        jLabel45.setText("Home Page:");
        jpanelSupplier.add(jLabel45);
        jLabel45.setBounds(240, 90, 110, 20);

        try {
            camp_DDDSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_DDDSupplier1.setText("00");
        camp_DDDSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_DDDSupplier1);
        camp_DDDSupplier1.setBounds(20, 240, 60, 32);

        jLabel46.setText("DDD:");
        jpanelSupplier.add(jLabel46);
        jLabel46.setBounds(20, 220, 60, 16);

        try {
            camp_CEPSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CEPSupplier1.setText("00000-000");
        camp_CEPSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_CEPSupplier1);
        camp_CEPSupplier1.setBounds(760, 40, 120, 32);

        jLabel47.setText("CEP:");
        jpanelSupplier.add(jLabel47);
        jLabel47.setBounds(760, 20, 50, 16);

        camp_StateSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_StateSupplier1);
        camp_StateSupplier1.setBounds(690, 100, 100, 32);

        camp_NumbleHouseSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_NumbleHouseSupplier1.setText("0000");
        camp_NumbleHouseSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_NumbleHouseSupplier1);
        camp_NumbleHouseSupplier1.setBounds(900, 40, 100, 32);

        jLabel48.setText("Numero da Casa:");
        jpanelSupplier.add(jLabel48);
        jLabel48.setBounds(900, 20, 130, 20);

        jLabel49.setText("Estado:");
        jpanelSupplier.add(jLabel49);
        jLabel49.setBounds(690, 80, 80, 16);

        camp_AddressRuaSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_AddressRuaSupplier1);
        camp_AddressRuaSupplier1.setBounds(450, 40, 290, 32);

        jLabel50.setText("Rua:");
        jpanelSupplier.add(jLabel50);
        jLabel50.setBounds(450, 20, 50, 16);

        jLabel51.setText("Cidade:");
        jpanelSupplier.add(jLabel51);
        jLabel51.setBounds(450, 80, 70, 16);

        camp_CitySupplier1.setEnabled(false);
        jpanelSupplier.add(camp_CitySupplier1);
        camp_CitySupplier1.setBounds(450, 100, 220, 32);

        camp_BairroSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_BairroSupplier1);
        camp_BairroSupplier1.setBounds(810, 100, 220, 32);

        jLabel52.setText("Bairro:");
        jpanelSupplier.add(jLabel52);
        jLabel52.setBounds(810, 80, 70, 16);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpanelSupplier.add(jSeparator4);
        jSeparator4.setBounds(430, 20, 10, 270);

        jListContato.setEnabled(false);
        jScrollPane4.setViewportView(jListContato);

        jpanelSupplier.add(jScrollPane4);
        jScrollPane4.setBounds(240, 240, 140, 50);

        camp_ComplementSupplier1.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        camp_ComplementSupplier1.setEnabled(false);
        jScrollPane5.setViewportView(camp_ComplementSupplier1);

        jpanelSupplier.add(jScrollPane5);
        jScrollPane5.setBounds(450, 150, 360, 90);

        btn_edit.setText("Editar");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_edit);
        btn_edit.setBounds(950, 260, 90, 36);

        btn_save.setText("Salvar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_save);
        btn_save.setBounds(730, 260, 90, 36);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_cancelar);
        btn_cancelar.setBounds(840, 260, 90, 36);

        jPanel10.add(jpanelSupplier);
        jpanelSupplier.setBounds(10, 10, 1060, 310);

        jInternalFrame1.getContentPane().add(jPanel10);
        jPanel10.setBounds(10, 230, 1080, 330);
        jInternalFrame1.getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 220, 1080, 10);

        jPanel3.add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 1110, 600);

        jTabbedPane1.addTab("Cadastros", jPanel3);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        RegisterSupplier();
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegisterPerson();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_limpAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpAllActionPerformed
        //            LIMPA OS CAMPOS DO FORMULARIO
        // pessoa
        field_Name.setText("");
        field_cpf.setText("000.000.000-00");
        filed_Email.setText("");
        field_date.setText("");
        field_homePage.setText("");
        // contato
        field_DDD.setText("00");
        field_contact.setText("000000000");
        // endereco
        field_Rua.setText("");
        field_cep.setText("00000-000");
        field_bairro.setText("");
        field_numeroCasa.setText("");
        field_cidade.setText("");
        field_estado.setText("");
        field_complement.setText("");
    }//GEN-LAST:event_btn_limpAllActionPerformed

    private void btn_limpallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpallActionPerformed
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

    }//GEN-LAST:event_btn_limpallActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        preencherTable();
        jpanelSupplier.setVisible(false);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tableSupplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSupplierKeyReleased
        loadingField();
        desabilitarCampos();
        btn_edit.setEnabled(true); // deixa o botao editar habilitado;
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_tableSupplierKeyReleased

    private void tableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseClicked
        loadingField();
        desabilitarCampos();
        btn_edit.setEnabled(true); // deixa o botao editar habilitado;
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_tableSupplierMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        habilitarcampos();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        loadingField(); // carrega os campos com as informações de antes;
        desabilitarCampos(); // desabilita dos campos novamente;
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        update();
        preencherTable();
        desabilitarCampos();
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_limpAll;
    private javax.swing.JButton btn_limpall;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField camp_AddressRuaSupplier;
    private javax.swing.JTextField camp_AddressRuaSupplier1;
    private javax.swing.JTextField camp_BairroSupplier;
    private javax.swing.JTextField camp_BairroSupplier1;
    private javax.swing.JFormattedTextField camp_CEPSupplier;
    private javax.swing.JFormattedTextField camp_CEPSupplier1;
    private javax.swing.JFormattedTextField camp_CNPJ;
    private javax.swing.JFormattedTextField camp_CNPJ1;
    private javax.swing.JTextField camp_CitySupplier;
    private javax.swing.JTextField camp_CitySupplier1;
    private javax.swing.JTextPane camp_ComplementSupplier;
    private javax.swing.JTextPane camp_ComplementSupplier1;
    private javax.swing.JFormattedTextField camp_ContactSupplier;
    private javax.swing.JFormattedTextField camp_DDDSupplier;
    private javax.swing.JFormattedTextField camp_DDDSupplier1;
    private javax.swing.JTextField camp_EmailSupplier;
    private javax.swing.JTextField camp_EmailSupplier1;
    private javax.swing.JTextField camp_HomePageSupplier;
    private javax.swing.JTextField camp_HomePageSupplier1;
    private javax.swing.JFormattedTextField camp_NumbleHouseSupplier;
    private javax.swing.JFormattedTextField camp_NumbleHouseSupplier1;
    private javax.swing.JTextField camp_StateSupplier;
    private javax.swing.JTextField camp_StateSupplier1;
    private javax.swing.JTextField camp_SupplierName;
    private javax.swing.JTextField camp_SupplierName1;
    private javax.swing.JFormattedTextField camp_cpfSupplier;
    private javax.swing.JFormattedTextField camp_cpfSupplier1;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JFormattedTextField field_DDD;
    private javax.swing.JTextField field_Name;
    private javax.swing.JTextField field_Rua;
    private javax.swing.JTextField field_bairro;
    private javax.swing.JFormattedTextField field_cep;
    private javax.swing.JTextField field_cidade;
    private javax.swing.JTextPane field_complement;
    private javax.swing.JFormattedTextField field_contact;
    private javax.swing.JFormattedTextField field_cpf;
    private javax.swing.JFormattedTextField field_date;
    private javax.swing.JTextField field_estado;
    private javax.swing.JTextField field_homePage;
    private javax.swing.JFormattedTextField field_numeroCasa;
    private javax.swing.JTextField filed_Email;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JList<String> jListContato;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanelSupplier;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JLabel obrigatorioRua;
    private javax.swing.JTable tableSupplier;
    // End of variables declaration//GEN-END:variables

    private void RegisterSupplier() {

        Fornecedor supplier = new Fornecedor(); // cria um novo fornecedor;
        Endereco end = new Endereco(); // cria um novo endereço;
        NumeroContato contact = new NumeroContato(); // cria um novo numero de contato;

        /*      FAZ UMA VERIFICAÇÃO SE TODOS OS CAMPOS OBRIGATORIOS ESTÃO PREENCHIDOS;*/
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
            List<NumeroContato> phoneBook = new ArrayList<>();
            supplier.setContatos(phoneBook);

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

            //----------------------- Reacionamento entre objetos ---------------------------//
            supplier.setEndereco(end); // adiciona o endereço ao forncedor;
            end.setFornecedors(supplier); // adiciona o fornecedor ao endereco;
            supplier.getContatos().add(contact); // adiciona o contato a lista de contatos;

            Conexao connectbanco = new Conexao(); // abre conexao com o banco;
            connectbanco.save(supplier); // salva a classe Pai

            /*          
            connectbanco.save(end); 
            connectbanco.save(contact);
            NÃO A NECESSIDADE DE SALVAR O ENDERECO E NEM "CONTATO", POIS A CLASSE ESTÁ MAPEADA COMO CASCADE, ENTAO SÓ PRECISA
            SALVAR A CLASS PAI QUE AUTOMATICAMENTO SALVA A CLASSE FILHO 
             */
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

    private void RegisterPerson() {

        Conexao banco = new Conexao();

        if ((field_Name.getText().length() > 0)) {

            Cliente cliente = new Cliente();
            cliente.setNome(field_Name.getText());
            Long cpf = Long.parseLong(field_cpf.getText().replace(".", "").replace(".", "").replace("-", ""));
            cliente.setCpf(cpf);
            cliente.setEmail(filed_Email.getText());
//            cliente.setDataNascimento(new Date(field_date.getText()));  NAO ESQUECER DE ARRUMAR ESSA LINHA DE CODIGO

// ---------- ENDEREÇO -----------------
            Endereco end = new Endereco();

            end.setRua(field_Rua.getText());
            end.setCidade(field_cidade.getText());
            int cep = Integer.parseInt(field_cep.getText().replace("-", ""));
            end.setCep(cep);
            end.setComplemento(field_complement.getText());
            int numeroCasa = Integer.parseInt(field_numeroCasa.getText());
            end.setNumeroCasa(numeroCasa);
            end.setPessoas(cliente);
            cliente.setEndereco(end);

            // NUMERO DE CONTATO 
            NumeroContato contact = new NumeroContato();

            int ddd = Integer.parseInt(field_DDD.getText());
            int fone = Integer.parseInt(field_contact.getText());
            contact.setDdd(ddd);
            contact.setFone(fone);
            contact.setCpf(cpf);
            contact.setPessoa(cliente);

            List<NumeroContato> listContato = new ArrayList<>();
            cliente.setNumeroContatos(listContato);
            cliente.getNumeroContatos().add(contact);

            /*          NÃO A NECESSIDADE DE SALVAR O ENDERECO E NEM "CONTATO", POIS A CLASSE ESTÁ MAPEADA COMO CASCADE, ENTAO SÓ PRECISA
            SALVAR A CLASS PAI QUE AUTOMATICAMENTO SALVA A CLASSE FILHO */
            banco.save(cliente);

//            LIMPA OS CAMPOS DO FORMULARIO
            // pessoa
            field_Name.setText("");
            field_cpf.setText("000.000.000-00");
            filed_Email.setText("");
            field_date.setText("");
            field_homePage.setText("");
            // contato
            field_DDD.setText("00");
            field_contact.setText("000000000");
            // endereco
            field_Rua.setText("");
            field_cep.setText("00000-000");
            field_bairro.setText("");
            field_numeroCasa.setText("0000000");
            field_cidade.setText("");
            field_estado.setText("");
            field_complement.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Preencha as Informações relevantes");
        }
    }

    private void preencherTable() {

        String pesquisa = fieldSearch.getText();
        List<Fornecedor> forne = new ArrayList<>();
        Conexao banco = new Conexao();

        for (int i = 0; i < banco.list_Fornecedores().size(); i++) {
            if (banco.list_Fornecedores().get(i).getNome().contains(pesquisa)) {   // VERIFICA SE O NOME CONTEM NO BANCO DE DADOS
                Fornecedor f = banco.list_Fornecedores().get(i);
                forne.add(f);
            }
        }

        DefaultTableModel tabela = (DefaultTableModel) tableSupplier.getModel();
        try {
            tabela.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Fornecedor f : forne) {
                tabela.addRow(new Object[]{f.getIdFornecedor(), f.getNome(), f.getHomePage(), f.getContatos().get(0).getFone()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Item não encontrado!!>");
        }
    }

    private void loadingField() {

        jpanelSupplier.setVisible(true); // deixa visivel os campos;
        Conexao banco = new Conexao(); // abre conexao com o banco de dados;
        DefaultTableModel tabela = (DefaultTableModel) tableSupplier.getModel();
        int linha = tableSupplier.getSelectedRow();// pega a posição da linha que esta selecionada;

        for (int i = 0; i < banco.list_Fornecedores().size(); i++) {
            if (banco.list_Fornecedores().get(i).getIdFornecedor().equals(tabela.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NA LISTA DE FORNECEDORES DO BANCO DE DADOS
                f = banco.list_Fornecedores().get(i);

                DefaultListModel listContato = new DefaultListModel();
//              PERCORRE TODA A LISTA DE CONTATO DE FORNECEDOR E ADICIONA EM UMA jList
                for (NumeroContato contato : f.getContatos()) {
                    listContato.addElement(contato.getFone());
                    jListContato.setModel(listContato);
                }

                camp_SupplierName1.setText(f.getNome());
                camp_EmailSupplier1.setText(f.getEmail());
                camp_HomePageSupplier1.setText(f.getHomePage());
                camp_CNPJ1.setText(f.getCnpj().toString());
                camp_cpfSupplier1.setText(f.getCpf().toString());
//                camp_DDDSupplier1.setText();

//              CONVERTE OS VALORES DO TIPO INTEIRO PRA STRING;
                String cep = String.valueOf(f.getEndereco().getCep());
                String numbleHouse = String.valueOf(f.getEndereco().getNumeroCasa());

//              ENDERECO;                
                camp_AddressRuaSupplier1.setText(f.getEndereco().getRua());
                camp_CEPSupplier1.setText(cep);
                camp_CitySupplier1.setText(f.getEndereco().getCidade());
                camp_StateSupplier1.setText(f.getEndereco().getEstadoUf());
                camp_BairroSupplier1.setText(f.getEndereco().getBairro());
                camp_NumbleHouseSupplier1.setText(numbleHouse);
                camp_ComplementSupplier1.setText(f.getEndereco().getComplemento());

            }
        }

    }

    private void habilitarcampos() {

        camp_SupplierName1.setEnabled(true);
        camp_EmailSupplier1.setEnabled(true);
        camp_HomePageSupplier1.setEnabled(true);
        camp_CNPJ1.setEnabled(true);
        camp_cpfSupplier1.setEnabled(true);
//                camp_DDDSupplier1.setEnabled(true);
//              ENDERECO;                
        camp_AddressRuaSupplier1.setEnabled(true);
        camp_CEPSupplier1.setEnabled(true);
        camp_CitySupplier1.setEnabled(true);
        camp_StateSupplier1.setEnabled(true);
        camp_BairroSupplier1.setEnabled(true);
        camp_NumbleHouseSupplier1.setEnabled(true);
        camp_ComplementSupplier1.setEnabled(true);

        btn_save.setEnabled(true);
        btn_cancelar.setEnabled(true);

    }

    private void desabilitarCampos() {

        camp_SupplierName1.setEnabled(false);
        camp_EmailSupplier1.setEnabled(false);
        camp_HomePageSupplier1.setEnabled(false);
        camp_CNPJ1.setEnabled(false);
        camp_cpfSupplier1.setEnabled(false);
//                camp_DDDSupplier1.setEnabled(true);
//              ENDERECO;                
        camp_AddressRuaSupplier1.setEnabled(false);
        camp_CEPSupplier1.setEnabled(false);
        camp_CitySupplier1.setEnabled(false);
        camp_StateSupplier1.setEnabled(false);
        camp_BairroSupplier1.setEnabled(false);
        camp_NumbleHouseSupplier1.setEnabled(false);
        camp_ComplementSupplier1.setEnabled(false);
        btn_save.setEnabled(false);
    }

    private void update() {

        int confirmacao = JOptionPane.showConfirmDialog(null, "Você Deseja Realmente alterar *OS DADOS DO FORNECEDOR*?", "Salvar?", JOptionPane.YES_NO_OPTION);

        //--------------------------------- Dados Fornecedor ------------------------------------//
        if (confirmacao == JOptionPane.YES_OPTION) {
            long cnpj = 0;
            long cpf = 0;
            try {
                cnpj = Long.parseLong(camp_CNPJ1.getText().replace(".", "").replace(".", "").replace("/", "").replace("-", ""));
                cpf = Long.parseLong(camp_cpfSupplier1.getText().replace(".", "").replace(".", "").replace("-", ""));
            } catch (Exception e) {
                System.out.println("Campo CPF e CNPJ não podem estár vazios");
            }

            f.setNome(camp_SupplierName1.getText());
            f.setCnpj(cnpj);
            f.setEmail(camp_EmailSupplier1.getText());
            f.setHomePage(camp_HomePageSupplier1.getText());
            f.setCpf(cpf);

            //--------------------------------- numero de contato -----------------------------------//
            //--------------------------------- Endereço -----------------------------------//
            int cep = 0;
            int numbleHouse = 0;
            try {
                cep = Integer.parseInt(camp_CEPSupplier1.getText().replaceAll("-", ""));
                numbleHouse = Integer.parseInt(camp_NumbleHouseSupplier1.getText());
            } catch (Exception e) {
                System.out.println("Os Campos CEP  e 'Numero da Casa' não podem está vazios!");
            }

            f.getEndereco().setRua(camp_AddressRuaSupplier1.getText());
            f.getEndereco().setCep(cep);
            f.getEndereco().setNumeroCasa(numbleHouse);
            f.getEndereco().setBairro(camp_BairroSupplier1.getText());
            f.getEndereco().setEstadoUf(camp_StateSupplier1.getText());
            f.getEndereco().setComplemento(camp_ComplementSupplier1.getText());

            Conexao connectbanco = new Conexao(); // abre conexao com o banco;
            connectbanco.update(f); // salva e atualiza classe Pai
        }else{
            
        }
        JOptionPane.showMessageDialog(null, "Dados Alterado com Sucesso!");
    }

}
