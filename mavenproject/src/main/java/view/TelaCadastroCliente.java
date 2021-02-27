package view;

import br.com.configuracao.Teclas;
import controle.Cliente;
import controle.Endereco;
import controle.Venda;
import conexao.Conexao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroCliente extends javax.swing.JPanel {

    Cliente cliente = null;

    public TelaCadastroCliente() {
        initComponents();

        //      tela cliente;        
        btn_edit1.setEnabled(false); // botao editar da tela cliente;
        btn_save1.setEnabled(false); // botao editar da tela cliente;
        btn_cancelar1.setEnabled(false); // botao editar da tela cancelar;

        field_Name.setDocument(new Teclas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        field_Name = new javax.swing.JTextField();
        field_cpf = new javax.swing.JFormattedTextField();
        filed_Email = new javax.swing.JTextField();
        field_contact = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        field_date = new com.toedter.calendar.JDateChooser();
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
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        fieldSearch1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_update1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jpanelSupplier1 = new javax.swing.JPanel();
        camp_ClientName = new javax.swing.JTextField();
        camp_cpfClient = new javax.swing.JFormattedTextField();
        camp_EmailClient = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        camp_CEPClient = new javax.swing.JFormattedTextField();
        jLabel60 = new javax.swing.JLabel();
        camp_StateClient = new javax.swing.JTextField();
        camp_NumbleHouseClient = new javax.swing.JFormattedTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        camp_AddressRuaClient = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        camp_CityClient = new javax.swing.JTextField();
        camp_BairroClient = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        camp_ComplementClient = new javax.swing.JTextPane();
        btn_edit1 = new javax.swing.JButton();
        btn_save1 = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        camp_DataNascimento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        camp_contato = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setLayout(null);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 240, 1090, 10);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));
        jPanel6.setLayout(null);
        jPanel6.add(field_Name);
        field_Name.setBounds(20, 50, 830, 26);

        try {
            field_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_cpf.setText("0000000000000000000000");
        jPanel6.add(field_cpf);
        field_cpf.setBounds(320, 110, 250, 26);
        jPanel6.add(filed_Email);
        filed_Email.setBounds(20, 110, 280, 26);

        try {
            field_contact.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_contact.setText("00000000000");
        jPanel6.add(field_contact);
        field_contact.setBounds(20, 170, 130, 26);

        jLabel14.setText("Nome:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(20, 30, 80, 16);

        jLabel15.setText("Contato:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(20, 150, 130, 16);

        jLabel16.setText("CPF:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(320, 90, 70, 16);

        jLabel17.setText("Data Nascimento:");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(590, 90, 160, 16);

        jLabel18.setText("E-mail:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(20, 90, 80, 16);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* obrigatorio");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(70, 30, 90, 16);
        jPanel6.add(field_date);
        field_date.setBounds(590, 110, 190, 27);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 10, 1090, 220);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));
        jPanel7.setLayout(null);
        jPanel7.add(field_Rua);
        field_Rua.setBounds(20, 40, 490, 26);

        try {
            field_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        field_cep.setText("00000-000");
        jPanel7.add(field_cep);
        field_cep.setBounds(540, 40, 150, 26);
        jPanel7.add(field_cidade);
        field_cidade.setBounds(20, 110, 220, 26);
        jPanel7.add(field_estado);
        field_estado.setBounds(330, 110, 100, 26);
        jPanel7.add(field_bairro);
        field_bairro.setBounds(20, 180, 270, 26);

        field_numeroCasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        field_numeroCasa.setText("00000000");
        jPanel7.add(field_numeroCasa);
        field_numeroCasa.setBounds(330, 180, 100, 26);

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
        jPanel7.setBounds(10, 250, 1090, 290);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(988, 550, 110, 30);

        btn_limpAll.setText("Limpar Tudo");
        btn_limpAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpAllActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpAll);
        btn_limpAll.setBounds(848, 550, 110, 30);

        jTabbedPane1.addTab("Cliente", jPanel2);

        jPanel5.setLayout(null);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N
        jPanel11.setLayout(null);

        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod_Cliente", "Nome", "Cliente Desde", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientMouseClicked(evt);
            }
        });
        tableClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableClientKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tableClient);

        jPanel11.add(jScrollPane6);
        jScrollPane6.setBounds(20, 100, 1040, 100);

        fieldSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSearch1KeyReleased(evt);
            }
        });
        jPanel11.add(fieldSearch1);
        fieldSearch1.setBounds(20, 50, 680, 26);

        jLabel3.setText("Nome:");
        jPanel11.add(jLabel3);
        jLabel3.setBounds(20, 30, 50, 16);

        btn_update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-48.png"))); // NOI18N
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        jPanel11.add(btn_update1);
        btn_update1.setBounds(710, 40, 50, 50);

        jPanel5.add(jPanel11);
        jPanel11.setBounds(10, 0, 1090, 220);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setLayout(null);

        jpanelSupplier1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jpanelSupplier1.setLayout(null);

        camp_ClientName.setEnabled(false);
        jpanelSupplier1.add(camp_ClientName);
        camp_ClientName.setBounds(20, 50, 380, 26);

        try {
            camp_cpfClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfClient.setText("000.000.000-00");
        camp_cpfClient.setEnabled(false);
        jpanelSupplier1.add(camp_cpfClient);
        camp_cpfClient.setBounds(20, 170, 160, 26);

        camp_EmailClient.setEnabled(false);
        jpanelSupplier1.add(camp_EmailClient);
        camp_EmailClient.setBounds(20, 110, 190, 26);

        jLabel53.setText("Nome:");
        jpanelSupplier1.add(jLabel53);
        jLabel53.setBounds(20, 30, 80, 16);

        jLabel54.setText("Contato:");
        jpanelSupplier1.add(jLabel54);
        jLabel54.setBounds(210, 150, 110, 20);

        jLabel55.setText("CPF:");
        jpanelSupplier1.add(jLabel55);
        jLabel55.setBounds(20, 150, 70, 16);

        jLabel57.setText("E-mail:");
        jpanelSupplier1.add(jLabel57);
        jLabel57.setBounds(20, 90, 80, 16);

        try {
            camp_CEPClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CEPClient.setText("00000-000");
        camp_CEPClient.setEnabled(false);
        jpanelSupplier1.add(camp_CEPClient);
        camp_CEPClient.setBounds(760, 40, 120, 26);

        jLabel60.setText("CEP:");
        jpanelSupplier1.add(jLabel60);
        jLabel60.setBounds(760, 20, 50, 16);

        camp_StateClient.setEnabled(false);
        jpanelSupplier1.add(camp_StateClient);
        camp_StateClient.setBounds(690, 100, 100, 26);

        camp_NumbleHouseClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_NumbleHouseClient.setText("0000");
        camp_NumbleHouseClient.setEnabled(false);
        jpanelSupplier1.add(camp_NumbleHouseClient);
        camp_NumbleHouseClient.setBounds(900, 40, 100, 26);

        jLabel61.setText("Numero da Casa:");
        jpanelSupplier1.add(jLabel61);
        jLabel61.setBounds(900, 20, 130, 20);

        jLabel62.setText("Estado:");
        jpanelSupplier1.add(jLabel62);
        jLabel62.setBounds(690, 80, 80, 16);

        camp_AddressRuaClient.setEnabled(false);
        jpanelSupplier1.add(camp_AddressRuaClient);
        camp_AddressRuaClient.setBounds(450, 40, 290, 26);

        jLabel63.setText("Rua:");
        jpanelSupplier1.add(jLabel63);
        jLabel63.setBounds(450, 20, 50, 16);

        jLabel64.setText("Cidade:");
        jpanelSupplier1.add(jLabel64);
        jLabel64.setBounds(450, 80, 70, 16);

        camp_CityClient.setEnabled(false);
        jpanelSupplier1.add(camp_CityClient);
        camp_CityClient.setBounds(450, 100, 220, 26);

        camp_BairroClient.setEnabled(false);
        jpanelSupplier1.add(camp_BairroClient);
        camp_BairroClient.setBounds(810, 100, 220, 26);

        jLabel65.setText("Bairro:");
        jpanelSupplier1.add(jLabel65);
        jLabel65.setBounds(810, 80, 70, 16);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpanelSupplier1.add(jSeparator5);
        jSeparator5.setBounds(430, 20, 10, 270);

        camp_ComplementClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        camp_ComplementClient.setEnabled(false);
        jScrollPane8.setViewportView(camp_ComplementClient);

        jpanelSupplier1.add(jScrollPane8);
        jScrollPane8.setBounds(450, 150, 360, 100);

        btn_edit1.setText("Editar");
        btn_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit1ActionPerformed(evt);
            }
        });
        jpanelSupplier1.add(btn_edit1);
        btn_edit1.setBounds(950, 260, 90, 30);

        btn_save1.setText("Salvar");
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });
        jpanelSupplier1.add(btn_save1);
        btn_save1.setBounds(730, 260, 90, 30);

        btn_cancelar1.setText("Cancelar");
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });
        jpanelSupplier1.add(btn_cancelar1);
        btn_cancelar1.setBounds(840, 260, 90, 30);

        camp_DataNascimento.setEnabled(false);
        jpanelSupplier1.add(camp_DataNascimento);
        camp_DataNascimento.setBounds(240, 110, 160, 27);

        jLabel4.setText("Data Nascimento:");
        jpanelSupplier1.add(jLabel4);
        jLabel4.setBounds(240, 90, 130, 16);

        try {
            camp_contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_contato.setText("(00)00000-0000");
        camp_contato.setEnabled(false);
        jpanelSupplier1.add(camp_contato);
        camp_contato.setBounds(210, 170, 190, 26);

        jPanel12.add(jpanelSupplier1);
        jpanelSupplier1.setBounds(10, 10, 1060, 310);

        jPanel5.add(jPanel12);
        jPanel12.setBounds(10, 250, 1090, 330);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(10, 230, 1090, 10);

        jTabbedPane1.addTab("Cadastros/Clientes", jPanel5);

        jPanel1.setLayout(null);
        jTabbedPane1.addTab("Vendas", jPanel1);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegisterClient();
        preencherTableClient();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_limpAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpAllActionPerformed
        //            LIMPA OS CAMPOS DO FORMULARIO
        // pessoa
        field_Name.setText("");
        field_cpf.setText("000.000.000-00");
        filed_Email.setText("");
        //        field_date.setName("");

        // contato
        field_contact.setText("(00)00000-0000");

        // endereco
        field_Rua.setText("");
        field_cep.setText("00000-000");
        field_bairro.setText("");
        field_numeroCasa.setText("00000000");
        field_cidade.setText("");
        field_estado.setText("");
        field_complement.setText("");
    }//GEN-LAST:event_btn_limpAllActionPerformed

    private void tableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientMouseClicked
        loadingFieldClient();
        btn_edit1.setEnabled(true);
    }//GEN-LAST:event_tableClientMouseClicked

    private void tableClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableClientKeyReleased
        loadingFieldClient();
        btn_edit1.setEnabled(true);
    }//GEN-LAST:event_tableClientKeyReleased

    private void fieldSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSearch1KeyReleased
        preencherTableClient();
        desabilitarfieldClient();
        CleanFieldClient();
        btn_edit1.setEnabled(false);
    }//GEN-LAST:event_fieldSearch1KeyReleased

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        preencherTableClient();
        CleanFieldClient();
        desabilitarfieldClient();
        btn_edit1.setEnabled(false);
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit1ActionPerformed
        habilitarcamposClient();
    }//GEN-LAST:event_btn_edit1ActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        AtualizarCliente();
        preencherTableClient();
        desabilitarfieldClient();
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        preencherTableClient();
        desabilitarfieldClient();
        CleanFieldClient();
        btn_cancelar1.setEnabled(false);
        btn_edit1.setEnabled(false);
    }//GEN-LAST:event_btn_cancelar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_edit1;
    private javax.swing.JButton btn_limpAll;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton btn_update1;
    private javax.swing.JTextField camp_AddressRuaClient;
    private javax.swing.JTextField camp_BairroClient;
    private javax.swing.JFormattedTextField camp_CEPClient;
    private javax.swing.JTextField camp_CityClient;
    private javax.swing.JTextField camp_ClientName;
    private javax.swing.JTextPane camp_ComplementClient;
    private com.toedter.calendar.JDateChooser camp_DataNascimento;
    private javax.swing.JTextField camp_EmailClient;
    private javax.swing.JFormattedTextField camp_NumbleHouseClient;
    private javax.swing.JTextField camp_StateClient;
    private javax.swing.JFormattedTextField camp_contato;
    private javax.swing.JFormattedTextField camp_cpfClient;
    private javax.swing.JTextField fieldSearch1;
    private javax.swing.JTextField field_Name;
    private javax.swing.JTextField field_Rua;
    private javax.swing.JTextField field_bairro;
    private javax.swing.JFormattedTextField field_cep;
    private javax.swing.JTextField field_cidade;
    private javax.swing.JTextPane field_complement;
    private javax.swing.JFormattedTextField field_contact;
    private javax.swing.JFormattedTextField field_cpf;
    private com.toedter.calendar.JDateChooser field_date;
    private javax.swing.JTextField field_estado;
    private javax.swing.JFormattedTextField field_numeroCasa;
    private javax.swing.JTextField filed_Email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanelSupplier1;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables

    private void RegisterClient() {
        Conexao banco = new Conexao();
        List<Venda> vendas = new ArrayList<>();
        if ((field_Name.getText().length() > 0)) {

            Cliente cliente = new Cliente();
            cliente.setNome(field_Name.getText());
            Long cpf = Long.parseLong(field_cpf.getText().replace(".", "").replace(".", "").replace("-", ""));
            cliente.setCpf(cpf);
            cliente.setEmail(filed_Email.getText());
            cliente.setStatus(true);
            cliente.setClienteDesde(new Date()); // DATA QUE O CLIENTE FOI CADASTRADO;
            cliente.setDataNascimento(field_date.getDate());
            cliente.setVendas(vendas);
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
            Long fone = Long.parseLong(field_contact.getText().replace("(", "").replace(")", "").replaceAll("-", ""));
            cliente.setContato(fone);
            
            banco.save(cliente);

//            LIMPA OS CAMPOS DO FORMULARIO
            // pessoa
            field_Name.setText("");
            field_cpf.setText("000.000.000-00");
            filed_Email.setText("");
            field_date.setName("");
            // contato
            field_contact.setText("(00)00000-0000");
            // endereco
            field_Rua.setText("");
            field_cep.setText("00000-000");
            field_bairro.setText("");
            field_numeroCasa.setText("0000000");
            field_cidade.setText("");
            field_estado.setText("");
            field_complement.setText("");
            JOptionPane.showMessageDialog(null, "Cliente Registrado com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">*PREENCHA AS INFORMAÇÕES RELEVANTES*</font></html>");
        }
    }

    private void loadingFieldClient() {
        Conexao banco = new Conexao(); // abre conexao com o banco de dados;
        DefaultTableModel tabela = (DefaultTableModel) tableClient.getModel();
        int linha = tableClient.getSelectedRow();// pega a posição da linha que esta selecionada;

        for (int i = 0; i < banco.list_Cliente().size(); i++) {
            if (banco.list_Cliente().get(i).getIdpessoa().equals(tabela.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NA LISTA DE FORNECEDORES DO BANCO DE DADOS
                cliente = banco.list_Cliente().get(i);

                camp_ClientName.setText(cliente.getNome());
                camp_EmailClient.setText(cliente.getEmail());
                camp_cpfClient.setText(cliente.getCpf().toString());
                camp_DataNascimento.setDate(cliente.getDataNascimento());
                camp_contato.setText(cliente.getContato().toString());
                
//              CONVERTE OS VALORES DO TIPO INTEIRO PRA STRING;
                String cep = String.valueOf(cliente.getEndereco().getCep());
                String numbleHouse = String.valueOf(cliente.getEndereco().getNumeroCasa());

//              ENDERECO;                
                camp_AddressRuaClient.setText(cliente.getEndereco().getRua());
                camp_CEPClient.setText(cep);
                camp_CityClient.setText(cliente.getEndereco().getCidade());
                camp_StateClient.setText(cliente.getEndereco().getEstadoUf());
                camp_BairroClient.setText(cliente.getEndereco().getBairro());
                camp_NumbleHouseClient.setText(numbleHouse);
                camp_ComplementClient.setText(cliente.getEndereco().getComplemento());

            }
        }
    }

    private void preencherTableClient() {
        Conexao banco = new Conexao();
        String pesquisa = fieldSearch1.getText();
        List<Cliente> client = new ArrayList<Cliente>();

        for (int i = 0; i < banco.list_Cliente().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE CLIENTES E VERIFICA O STATUS DO CLIENTE;
            if (banco.list_Cliente().get(i).getNome().contains(pesquisa) && banco.list_Cliente().get(i).isStatus()) {
                Cliente c = banco.list_Cliente().get(i);
                client.add(c); // ADICIONA NA LISTA CLIENT;
            }
        }

        DefaultTableModel tabela = (DefaultTableModel) tableClient.getModel();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date
        try {
            tabela.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR;
            // PEGA TODOS OS CLIENTES QUE SÃO ADICIONADO NA LISTA CLIENT;
            // E ADICIONA NA TABELA 
            for (Cliente c : client) {
                tabela.addRow(new Object[]{c.getIdpessoa(), c.getNome(), formato.format(c.getClienteDesde())});
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro no Codigo");
        }
    }

    private void desabilitarfieldClient() {
        camp_ClientName.setEnabled(false);
        camp_EmailClient.setEnabled(false);
        camp_cpfClient.setEnabled(false);
        camp_contato.setEnabled(false);
        camp_DataNascimento.setEnabled(false);
//              ENDERECO;                
        camp_AddressRuaClient.setEnabled(false);
        camp_CEPClient.setEnabled(false);
        camp_CityClient.setEnabled(false);
        camp_StateClient.setEnabled(false);
        camp_BairroClient.setEnabled(false);
        camp_NumbleHouseClient.setEnabled(false);
        camp_ComplementClient.setEnabled(false);
        btn_save1.setEnabled(false);
        btn_cancelar1.setEnabled(false);
    }

    private void CleanFieldClient() {
        //            LIMPA OS CAMPOS DO FORMULARIO
        // pessoa
        camp_ClientName.setText("");
        camp_cpfClient.setText("00000000000");
        camp_EmailClient.setText("");

        // contato
        camp_contato.setText("(00)00000-0000"); // contato do CLIENTE

        // endereco
        camp_AddressRuaClient.setText("");
        camp_CEPClient.setText("00000000");
        camp_BairroClient.setText("");
        camp_NumbleHouseClient.setText("00000000");
        camp_CityClient.setText("");
        camp_StateClient.setText("");
        camp_ComplementClient.setText("");
    }

    private void habilitarcamposClient() {
        camp_ClientName.setEnabled(true);
        camp_EmailClient.setEnabled(true);
        camp_cpfClient.setEnabled(true);

        camp_contato.setEnabled(true);
        camp_DataNascimento.setEnabled(true);
//              ENDERECO;                
        camp_AddressRuaClient.setEnabled(true);
        camp_CEPClient.setEnabled(true);
        camp_CityClient.setEnabled(true);
        camp_StateClient.setEnabled(true);
        camp_BairroClient.setEnabled(true);
        camp_NumbleHouseClient.setEnabled(true);
        camp_ComplementClient.setEnabled(true);

        btn_save1.setEnabled(true);
        btn_cancelar1.setEnabled(true);
    }

    private void AtualizarCliente() {
        int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja Realmente <html><font color=\"#FF0000\">*ALTERAR OS DADOS DO CLIENTE*?</font></html></html>", "Salvar?", JOptionPane.YES_NO_OPTION);

        //--------------------------------- Dados Fornecedor ------------------------------------//
        if (confirmacao == JOptionPane.YES_OPTION) {
            long cpf = 0;
            try {
                cpf = Long.parseLong(camp_cpfClient.getText().replace(".", "").replace(".", "").replace("-", ""));
            } catch (Exception e) {
                System.out.println("Campo CPF não podem estár vazios");
            }
            
            long contato = 0;
            try {
                contato = Long.parseLong(camp_contato.getText().replace("(", "").replace(")", "").replaceAll("-", ""));
            } catch (Exception e) {
                System.out.println("Campo Contato nao pode estár vazio");
            }
            
            cliente.setNome(camp_ClientName.getText());
            cliente.setEmail(camp_EmailClient.getText());
            cliente.setCpf(cpf);
            cliente.setDataNascimento(camp_DataNascimento.getDate());
            cliente.setContato(contato);
            //--------------------------------- Endereço -----------------------------------//
            int cep = 0;
            int numbleHouse = 0;
            try {
                cep = Integer.parseInt(camp_CEPClient.getText().replaceAll("-", ""));
                numbleHouse = Integer.parseInt(camp_NumbleHouseClient.getText());
            } catch (Exception e) {
                System.out.println("Os Campos CEP  e 'Numero da Casa' não podem está vazios!");
            }

            cliente.getEndereco().setRua(camp_AddressRuaClient.getText());
            cliente.getEndereco().setCep(cep);
            cliente.getEndereco().setNumeroCasa(numbleHouse);
            cliente.getEndereco().setBairro(camp_BairroClient.getText());
            cliente.getEndereco().setEstadoUf(camp_StateClient.getText());
            cliente.getEndereco().setCidade(camp_CityClient.getText());
            cliente.getEndereco().setComplemento(camp_ComplementClient.getText());

            Conexao connectbanco = new Conexao(); // abre conexao com o banco;
            connectbanco.update(cliente); // salva e atualiza classe Pai
            JOptionPane.showMessageDialog(null, "<html><font color=\"#0000FF\">DADOS ALTERADO COM SUCESSO!</font></html>");
        }
    }
}
