package view;

import util.Teclas;
import model.Cliente;
import model.dao.Conexao;
import conexao.NewHibernateUtil;
import model.Endereco;
import model.Fornecedor;
import model.Produto;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static view.TelaProdutos.connectbanco;

public class TelaFornecedor extends javax.swing.JPanel {

    Fornecedor f = null;
    Fornecedor fornecedor;

    public TelaFornecedor() {
        initComponents();
        preencherTableSupplier();
        preencherjlistaForncedor();
        btn_editar.setVisible(false);
        // tela fornecedor;
        btn_edit.setEnabled(false); //botao editar da tela fornecedor;
        btn_save.setEnabled(false); // botao salvar da tela fornecedor;
        btn_cancelar.setEnabled(false); // botao cancelar da tela fornecedor;
        camp_SupplierName.setDocument(new Teclas());
        camp_SupplierName1.setDocument(new Teclas());

        // modifica a largura das colunas da tabela.
        TableColumn colCodigo = table_Product.getColumnModel().getColumn(0);
        TableColumn colNome = table_Product.getColumnModel().getColumn(1);
        TableColumn colCor = table_Product.getColumnModel().getColumn(2);
        TableColumn colQuantidade = table_Product.getColumnModel().getColumn(3);
        TableColumn colPreço = table_Product.getColumnModel().getColumn(4);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(350);
        colCor.setPreferredWidth(10);
        colQuantidade.setPreferredWidth(5);
        colPreço.setPreferredWidth(20);
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
        btn_Register = new javax.swing.JButton();
        btn_limpall = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        fieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
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
        jScrollPane5 = new javax.swing.JScrollPane();
        camp_ComplementSupplier1 = new javax.swing.JTextPane();
        btn_edit = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        camp_contato = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Product = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        checke_produtosDesativado = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_editar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        camp_descricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qtdeProdutos = new javax.swing.JTextField();
        camp_precoCusto = new javax.swing.JTextField();
        camp_categoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        camp_tamanho = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        camp_apelido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        camp_cor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jPanel1.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));
        jPanel8.setLayout(null);
        jPanel8.add(camp_SupplierName);
        camp_SupplierName.setBounds(20, 50, 830, 26);

        try {
            camp_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CNPJ.setText("00.000.000/0000-00");
        jPanel8.add(camp_CNPJ);
        camp_CNPJ.setBounds(630, 170, 250, 26);

        try {
            camp_cpfSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfSupplier.setText("000.000.000-00");
        jPanel8.add(camp_cpfSupplier);
        camp_cpfSupplier.setBounds(360, 170, 250, 26);
        jPanel8.add(camp_EmailSupplier);
        camp_EmailSupplier.setBounds(20, 110, 280, 26);
        jPanel8.add(camp_HomePageSupplier);
        camp_HomePageSupplier.setBounds(20, 170, 280, 26);

        try {
            camp_ContactSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_ContactSupplier.setText("0000000000000");
        jPanel8.add(camp_ContactSupplier);
        camp_ContactSupplier.setBounds(360, 110, 130, 26);

        jLabel27.setText("Nome:");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(20, 30, 80, 16);

        jLabel28.setText("Contato:");
        jPanel8.add(jLabel28);
        jLabel28.setBounds(360, 90, 130, 16);

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
        camp_AddressRuaSupplier.setBounds(20, 40, 490, 26);

        try {
            camp_CEPSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CEPSupplier.setText("00000-000");
        jPanel9.add(camp_CEPSupplier);
        camp_CEPSupplier.setBounds(540, 40, 150, 26);
        jPanel9.add(camp_CitySupplier);
        camp_CitySupplier.setBounds(20, 110, 220, 26);
        jPanel9.add(camp_StateSupplier);
        camp_StateSupplier.setBounds(330, 110, 100, 26);
        jPanel9.add(camp_BairroSupplier);
        camp_BairroSupplier.setBounds(20, 180, 270, 26);

        camp_NumbleHouseSupplier.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_NumbleHouseSupplier.setText("00000000");
        jPanel9.add(camp_NumbleHouseSupplier);
        camp_NumbleHouseSupplier.setBounds(330, 180, 100, 26);

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

        jPanel1.add(jPanel9);
        jPanel9.setBounds(10, 250, 1090, 260);

        btn_Register.setText("Cadastrar");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register);
        btn_Register.setBounds(988, 550, 110, 30);

        btn_limpall.setText("Limpar Tudo");
        btn_limpall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpallActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpall);
        btn_limpall.setBounds(848, 550, 110, 30);

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fornecedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N
        jPanel4.setLayout(null);

        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, ""},
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
        jScrollPane1.setBounds(20, 100, 1040, 100);

        fieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldSearchKeyReleased(evt);
            }
        });
        jPanel4.add(fieldSearch);
        fieldSearch.setBounds(20, 50, 680, 26);

        jLabel1.setText("Nome:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 30, 50, 16);

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-48.png"))); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_update);
        btn_update.setBounds(710, 30, 50, 50);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 0, 1080, 210);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(null);

        jpanelSupplier.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Fornecedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jpanelSupplier.setLayout(null);

        camp_SupplierName1.setEnabled(false);
        jpanelSupplier.add(camp_SupplierName1);
        camp_SupplierName1.setBounds(20, 50, 380, 26);

        try {
            camp_CNPJ1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CNPJ1.setText("00.000.000/0000-00");
        camp_CNPJ1.setEnabled(false);
        jpanelSupplier.add(camp_CNPJ1);
        camp_CNPJ1.setBounds(20, 170, 190, 26);

        try {
            camp_cpfSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfSupplier1.setText("000.000.000-00");
        camp_cpfSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_cpfSupplier1);
        camp_cpfSupplier1.setBounds(240, 170, 160, 26);

        camp_EmailSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_EmailSupplier1);
        camp_EmailSupplier1.setBounds(20, 110, 190, 26);

        camp_HomePageSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_HomePageSupplier1);
        camp_HomePageSupplier1.setBounds(240, 110, 160, 26);

        jLabel40.setText("Nome:");
        jpanelSupplier.add(jLabel40);
        jLabel40.setBounds(20, 30, 80, 16);

        jLabel41.setText("Contato:");
        jpanelSupplier.add(jLabel41);
        jLabel41.setBounds(20, 210, 110, 16);

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
            camp_CEPSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_CEPSupplier1.setText("00000-000");
        camp_CEPSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_CEPSupplier1);
        camp_CEPSupplier1.setBounds(760, 40, 120, 26);

        jLabel47.setText("CEP:");
        jpanelSupplier.add(jLabel47);
        jLabel47.setBounds(760, 20, 50, 16);

        camp_StateSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_StateSupplier1);
        camp_StateSupplier1.setBounds(690, 100, 100, 26);

        camp_NumbleHouseSupplier1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_NumbleHouseSupplier1.setText("0000");
        camp_NumbleHouseSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_NumbleHouseSupplier1);
        camp_NumbleHouseSupplier1.setBounds(900, 40, 100, 26);

        jLabel48.setText("Numero da Casa:");
        jpanelSupplier.add(jLabel48);
        jLabel48.setBounds(900, 20, 130, 20);

        jLabel49.setText("Estado:");
        jpanelSupplier.add(jLabel49);
        jLabel49.setBounds(690, 80, 80, 16);

        camp_AddressRuaSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_AddressRuaSupplier1);
        camp_AddressRuaSupplier1.setBounds(450, 40, 290, 26);

        jLabel50.setText("Rua:");
        jpanelSupplier.add(jLabel50);
        jLabel50.setBounds(450, 20, 50, 16);

        jLabel51.setText("Cidade:");
        jpanelSupplier.add(jLabel51);
        jLabel51.setBounds(450, 80, 70, 16);

        camp_CitySupplier1.setEnabled(false);
        jpanelSupplier.add(camp_CitySupplier1);
        camp_CitySupplier1.setBounds(450, 100, 220, 26);

        camp_BairroSupplier1.setEnabled(false);
        jpanelSupplier.add(camp_BairroSupplier1);
        camp_BairroSupplier1.setBounds(810, 100, 220, 26);

        jLabel52.setText("Bairro:");
        jpanelSupplier.add(jLabel52);
        jLabel52.setBounds(810, 80, 70, 16);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jpanelSupplier.add(jSeparator4);
        jSeparator4.setBounds(430, 20, 10, 270);

        camp_ComplementSupplier1.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento:"));
        camp_ComplementSupplier1.setEnabled(false);
        jScrollPane5.setViewportView(camp_ComplementSupplier1);

        jpanelSupplier.add(jScrollPane5);
        jScrollPane5.setBounds(450, 150, 360, 100);

        btn_edit.setText("Editar");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_edit);
        btn_edit.setBounds(950, 260, 90, 30);

        btn_save.setText("Salvar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_save);
        btn_save.setBounds(730, 260, 90, 30);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jpanelSupplier.add(btn_cancelar);
        btn_cancelar.setBounds(840, 260, 90, 30);

        try {
            camp_contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_contato.setEnabled(false);
        jpanelSupplier.add(camp_contato);
        camp_contato.setBounds(20, 236, 170, 30);

        jPanel10.add(jpanelSupplier);
        jpanelSupplier.setBounds(10, 10, 1060, 330);

        jPanel3.add(jPanel10);
        jPanel10.setBounds(10, 230, 1080, 350);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(10, 220, 1080, 10);

        jTabbedPane1.addTab("Fornecedores", jPanel3);

        jPanel2.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUTOS DO FORNECEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel5.setLayout(null);

        table_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Cor:", "Qtde", "Preço:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        table_Product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_ProductKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_Product);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 800, 220);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jList1);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(840, 70, 230, 190);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(820, 40, 10, 230);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Fornecedor:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(840, 36, 170, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 60, 1090, 280);

        checke_produtosDesativado.setText("Produtos desativados");
        checke_produtosDesativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checke_produtosDesativadoActionPerformed(evt);
            }
        });
        jPanel2.add(checke_produtosDesativado);
        checke_produtosDesativado.setBounds(840, 40, 170, 22);

        jLabel3.setText("Filtro:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(840, 10, 44, 16);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(840, 30, 250, 10);

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_editar);
        btn_editar.setBounds(980, 360, 110, 40);

        camp_descricao.setEditable(false);
        camp_descricao.setColumns(20);
        camp_descricao.setRows(5);
        jScrollPane6.setViewportView(camp_descricao);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(10, 490, 380, 82);

        jLabel4.setText("Descrição:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 470, 90, 16);

        jLabel5.setText("Qtde Produtos:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(620, 40, 100, 16);

        qtdeProdutos.setEditable(false);
        jPanel2.add(qtdeProdutos);
        qtdeProdutos.setBounds(720, 30, 80, 26);

        camp_precoCusto.setEditable(false);
        jPanel2.add(camp_precoCusto);
        camp_precoCusto.setBounds(10, 370, 150, 26);

        camp_categoria.setEditable(false);
        jPanel2.add(camp_categoria);
        camp_categoria.setBounds(190, 370, 340, 26);

        jLabel6.setText("Preço Custo:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 350, 90, 16);

        jLabel7.setText("Categoria:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(190, 350, 80, 16);

        camp_tamanho.setEditable(false);
        jPanel2.add(camp_tamanho);
        camp_tamanho.setBounds(10, 430, 340, 26);

        jLabel8.setText("Tamanho:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 410, 80, 16);

        camp_apelido.setEditable(false);
        jPanel2.add(camp_apelido);
        camp_apelido.setBounds(370, 430, 180, 26);

        jLabel9.setText("Apelido:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(370, 410, 60, 16);

        camp_cor.setEditable(false);
        jPanel2.add(camp_cor);
        camp_cor.setBounds(550, 370, 270, 26);

        jLabel10.setText("Cor:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(550, 350, 50, 16);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator6);
        jSeparator6.setBounds(830, 350, 10, 230);

        jTabbedPane1.addTab("Produtos", jPanel2);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        RegisterSupplier();
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_limpallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpallActionPerformed
        //            LIMPA OS CAMPOS DE TEXTOS
        camp_SupplierName.setText(""); // name do fornecedor
        camp_AddressRuaSupplier.setText(""); // rua do fornecedor
        camp_EmailSupplier.setText(""); // email do fornecedor
        camp_HomePageSupplier.setText(""); // home page do fornecedor
        camp_CEPSupplier.setText("00000000"); // cep do fornecedor
        camp_ContactSupplier.setText("(00)00000-0000"); // contato do fornecedor
        camp_CNPJ.setText("00000000000000"); // CNPJ do fornecedor
        camp_cpfSupplier.setText("00000000000"); // CPF do fornecedor
        camp_BairroSupplier.setText("");// Bairro do fornecedor
        camp_NumbleHouseSupplier.setText("00000000"); // Numero da Casa ou loja do fornecedor
        camp_StateSupplier.setText(""); // Estado UF do fornecedor
        camp_CitySupplier.setText(""); // cidade do forncedor
        camp_ComplementSupplier.setText(""); // complemento do fornecedor

    }//GEN-LAST:event_btn_limpallActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                preencherTableSupplier();
                preencherjlistaForncedor();
                CleanFieldSupplier();
                desableFieldSupplier();
                btn_edit.setEnabled(false);
                carregando.dispose();
            }

        };
        t.start();

    }//GEN-LAST:event_btn_updateActionPerformed

    private void tableSupplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSupplierKeyReleased
        loadingFieldSupplier();
        desableFieldSupplier();
        btn_edit.setEnabled(true); // deixa o botao editar habilitado;
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_tableSupplierKeyReleased

    private void tableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseClicked
        loadingFieldSupplier();
        desableFieldSupplier();
        btn_edit.setEnabled(true); // deixa o botao editar habilitado;
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
    }//GEN-LAST:event_tableSupplierMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        habilitarcamposSupplier();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        loadingFieldSupplier(); // carrega os campos com as informações de antes;
        desableFieldSupplier(); // desabilita dos campos novamente;
        CleanFieldSupplier();
        preencherTableSupplier();
        btn_cancelar.setEnabled(false); // desabilita o botao cancelar;
        btn_edit.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        updateSupplier();
        preencherTableSupplier();
        desableFieldSupplier();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void fieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSearchKeyReleased
        preencherTableSupplier();
        desableFieldSupplier();
        CleanFieldSupplier();
        btn_edit.setEnabled(false);
    }//GEN-LAST:event_fieldSearchKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        btn_editar.setVisible(false);
        Conexao banco = new Conexao();
        fornecedor = banco.list_Fornecedores().get(jList1.getSelectedIndex());
        if (checke_produtosDesativado.isSelected()) {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            int y = 0;
            int x = 0;
            int z = 0;

            // juntando duas tabelas do banco de dados;
            String sql = "FROM Produto as v INNER JOIN v.fornecedor";
            List<Object[]> query = (List<Object[]>) session.createQuery(sql).list();
            DefaultTableModel tabela = (DefaultTableModel) table_Product.getModel();
            tabela.setNumRows(0);
            for (Object[] objects : query) {
                Produto produto = (Produto) objects[0];
                Fornecedor forne = (Fornecedor) objects[1];

                if (forne.getIdFornecedor().equals(fornecedor.getIdFornecedor())) {
                    if (!produto.isStatus()) {
                        tabela.addRow(new Object[]{
                            produto.getIdProduto(),
                            produto.getNome(),
                            produto.getCor(),
                            produto.getQnt(),
                            dinheiro.format(produto.getValor_venda())});
                        x = 1;
                        y = z + x;
                        z = y;
                    }
                }
                qtdeProdutos.setText(z + "");

            }
        } else {
            produtosFornecedor();
        }

    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyReleased
        btn_editar.setVisible(false);
        Conexao banco = new Conexao();
        fornecedor = banco.list_Fornecedores().get(jList1.getSelectedIndex());
        if (checke_produtosDesativado.isSelected()) {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            // juntando duas tabelas do banco de dados;
            String sql = "FROM Produto as v INNER JOIN v.fornecedor";
            List<Object[]> query = (List<Object[]>) session.createQuery(sql).list();
            DefaultTableModel tabela = (DefaultTableModel) table_Product.getModel();
            tabela.setNumRows(0);
            for (Object[] objects : query) {
                Produto produto = (Produto) objects[0];
                Fornecedor forne = (Fornecedor) objects[1];

                if (forne.getIdFornecedor().equals(fornecedor.getIdFornecedor())) {
                    if (!produto.isStatus()) {
                        tabela.addRow(new Object[]{
                            produto.getIdProduto(),
                            produto.getNome(),
                            produto.getCor(),
                            produto.getQnt(),
                            dinheiro.format(produto.getValor_venda())});
                    }
                }

            }
        } else {
            produtosFornecedor();
        }
    }//GEN-LAST:event_jList1KeyReleased

    private void table_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ProductMouseClicked
        btn_editar.setVisible(true);
        DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();
        int linha = table_Product.getSelectedRow();
        for (int i = 0; i < connectbanco.productBook().size(); i++) {
            if (connectbanco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                Produto item = connectbanco.productBook().get(i);
                camp_descricao.setText(item.getDescricao());
                camp_cor.setText(item.getCor());
                camp_categoria.setText(item.getCategoria());
                camp_precoCusto.setText("R$ "+item.getValor_compra());
                camp_apelido.setText(item.getApelido());
                camp_tamanho.setText(item.getTamanho());               
                
            }
        }
    }//GEN-LAST:event_table_ProductMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
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
        btn_editar.setVisible(false);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void checke_produtosDesativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checke_produtosDesativadoActionPerformed
        btn_editar.setVisible(false);
        Conexao banco = new Conexao();
        fornecedor = banco.list_Fornecedores().get(jList1.getSelectedIndex());
        if (checke_produtosDesativado.isSelected()) {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            // juntando duas tabelas do banco de dados;
            String sql = "FROM Produto as v INNER JOIN v.fornecedor";
            List<Object[]> query = (List<Object[]>) session.createQuery(sql).list();
            DefaultTableModel tabela = (DefaultTableModel) table_Product.getModel();
            tabela.setNumRows(0);
            for (Object[] objects : query) {
                Produto produto = (Produto) objects[0];
                Fornecedor forne = (Fornecedor) objects[1];

                if (forne.getIdFornecedor().equals(fornecedor.getIdFornecedor())) {
                    if (!produto.isStatus()) {
                        tabela.addRow(new Object[]{
                            produto.getIdProduto(),
                            produto.getNome(),
                            produto.getQnt(),
                            dinheiro.format(produto.getValor_venda())});
                    }
                }

            }
        } else {
            produtosFornecedor();
        }
    }//GEN-LAST:event_checke_produtosDesativadoActionPerformed

    private void table_ProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_ProductKeyReleased
        btn_editar.setVisible(true);
        DefaultTableModel tableDefault = (DefaultTableModel) table_Product.getModel();
        int linha = table_Product.getSelectedRow();
        for (int i = 0; i < connectbanco.productBook().size(); i++) {
            if (connectbanco.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                Produto item = connectbanco.productBook().get(i);
                camp_descricao.setText(item.getDescricao());
                camp_cor.setText(item.getCor());
                camp_categoria.setText(item.getCategoria());
                camp_precoCusto.setText("R$ "+item.getValor_compra());
                camp_apelido.setText(item.getApelido());
                camp_tamanho.setText(item.getTamanho()); 
            }
        }
    }//GEN-LAST:event_table_ProductKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_limpall;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JTextField camp_apelido;
    private javax.swing.JTextField camp_categoria;
    private javax.swing.JFormattedTextField camp_contato;
    private javax.swing.JTextField camp_cor;
    private javax.swing.JFormattedTextField camp_cpfSupplier;
    private javax.swing.JFormattedTextField camp_cpfSupplier1;
    private javax.swing.JTextArea camp_descricao;
    private javax.swing.JTextField camp_precoCusto;
    private javax.swing.JTextField camp_tamanho;
    private javax.swing.JCheckBox checke_produtosDesativado;
    private javax.swing.JTextField fieldSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanelSupplier;
    private javax.swing.JLabel obrigatorioName;
    private javax.swing.JTextField qtdeProdutos;
    private javax.swing.JTable tableSupplier;
    private javax.swing.JTable table_Product;
    // End of variables declaration//GEN-END:variables

    private void RegisterSupplier() {

        Fornecedor supplier = new Fornecedor(); // cria um novo fornecedor;
        Endereco end = new Endereco(); // cria um novo endereço;
        List<Produto> produtos = new ArrayList<>();

        /*      FAZ UMA VERIFICAÇÃO SE TODOS OS CAMPOS OBRIGATORIOS ESTÃO PREENCHIDOS;*/
        if (camp_SupplierName.getText().length() > 0) {
            obrigatorioName.setVisible(false);
        } else {
            obrigatorioName.setVisible(true);
        }
//        if (camp_AddressRuaSupplier.getText().length() > 0) {
//            obrigatorioRua.setVisible(false);
//        } else {
//            obrigatorioRua.setVisible(true);
//        }

        if ((camp_SupplierName.getText().length() > 0)) {

            Long cnpj = Long.parseLong(camp_CNPJ.getText().replace(".", "").replace(".", "").replace("/", "").replace("-", ""));
            Long cpf = Long.parseLong(camp_cpfSupplier.getText().replace(".", "").replace(".", "").replace("-", ""));

            //--------------------------------- Dados Fornecedor ------------------------------------//
            supplier.setNome(camp_SupplierName.getText());
            supplier.setCnpj(cnpj);
            supplier.setEmail(camp_EmailSupplier.getText());
            supplier.setHomePage(camp_HomePageSupplier.getText());
            supplier.setCpf(cpf);
            supplier.setDataCadastro(new Date()); // data em que o fornecedor foi cadastrado;
            supplier.setStatus(true);
            //--------------------------------- numero de contato -----------------------------------//
            Long numeroContato = Long.parseLong(camp_ContactSupplier.getText().replace("(", "").replace(")", "").replaceAll("-", ""));
            supplier.setContato(numeroContato);

            //--------------------------------- Endereço -----------------------------------//
            int cep = Integer.parseInt(camp_CEPSupplier.getText().replaceAll("-", ""));
            int numbleHouse = Integer.parseInt(camp_NumbleHouseSupplier.getText());

            end.setRua(camp_AddressRuaSupplier.getText());
            end.setCep(cep);
            end.setNumeroCasa(numbleHouse);
            end.setBairro(camp_BairroSupplier.getText());
            end.setEstadoUf(camp_StateSupplier.getText());
            end.setComplemento(camp_ComplementSupplier.getText());

            //----------------------- Relacionamento entre objetos ---------------------------//
            supplier.setEndereco(end); // adiciona o endereço ao forncedor;
            end.setFornecedors(supplier); // adiciona o fornecedor ao endereco;
            supplier.setList_Produto(produtos); // adiciona lista produtos;
            Conexao connectbanco = new Conexao(); // abre conexao com o banco;
            connectbanco.save(supplier); // salva a classe Pai

//            LIMPA OS CAMPOS DE TEXTOS
            camp_SupplierName.setText(""); // name do fornecedor
            camp_AddressRuaSupplier.setText(""); // rua do fornecedor
            camp_EmailSupplier.setText(""); // email do fornecedor
            camp_HomePageSupplier.setText(""); // home page do fornecedor
            camp_CEPSupplier.setText("00000000"); // cep do fornecedor
            camp_ContactSupplier.setText("(00)00000-0000"); // contato do fornecedor
            camp_CNPJ.setText("00000000000000"); // CNPJ do fornecedor
            camp_cpfSupplier.setText("00000000000"); // CPF do fornecedor
            camp_BairroSupplier.setText("");// Bairro do fornecedor
            camp_NumbleHouseSupplier.setText("00000000"); // Numero da Casa ou loja do fornecedor
            camp_StateSupplier.setText(""); // Estado UF do fornecedor
            camp_CitySupplier.setText(""); // cidade do forncedor
            camp_ComplementSupplier.setText(""); // complemento do fornecedor

            JOptionPane.showMessageDialog(null, "Fornecedor Registrado Com Sucesso!");

        } else {
            JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">*PREENCHA AS INFORMAÇÕES OBRIGATORIAS*</font></html>");
        }

    }

    private void preencherTableSupplier() {

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
                if (f.isStatus()) {
                    tabela.addRow(new Object[]{f.getIdFornecedor(), f.getNome(), f.getHomePage(), f.getContato()});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Item não encontrado!!>\n " + e);
        }
    }

    public void preencherjlistaForncedor() {
        DefaultListModel jlista = new DefaultListModel();
        Conexao banco = new Conexao();
        for (Fornecedor fornecedor : banco.list_Fornecedores()) {
            jlista.addElement(fornecedor.getNome());
            jList1.setModel(jlista);
        }

    }

    public void loadingFieldSupplier() {

        jpanelSupplier.setVisible(true); // deixa visivel os campos;
        Conexao banco = new Conexao(); // abre conexao com o banco de dados;
        DefaultTableModel tabela = (DefaultTableModel) tableSupplier.getModel();
        int linha = tableSupplier.getSelectedRow();// pega a posição da linha que esta selecionada;

        for (int i = 0; i < banco.list_Fornecedores().size(); i++) {
            if (banco.list_Fornecedores().get(i).getIdFornecedor().equals(tabela.getValueAt(linha, 0))) { // VERIFICA SE O ID DO OBJETO CONTEM NA LISTA DE FORNECEDORES DO BANCO DE DADOS
                f = banco.list_Fornecedores().get(i);

                camp_SupplierName1.setText(f.getNome());
                camp_EmailSupplier1.setText(f.getEmail());
                camp_HomePageSupplier1.setText(f.getHomePage());
                camp_CNPJ1.setText(f.getCnpj().toString());
                camp_cpfSupplier1.setText(f.getCpf().toString());
                camp_contato.setText(f.getContato().toString());

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

    private void habilitarcamposSupplier() {

        camp_SupplierName1.setEnabled(true);
        camp_EmailSupplier1.setEnabled(true);
        camp_HomePageSupplier1.setEnabled(true);
        camp_CNPJ1.setEnabled(true);
        camp_cpfSupplier1.setEnabled(true);
        camp_contato.setEnabled(true);
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

    private void desableFieldSupplier() {

        camp_SupplierName1.setEnabled(false);
        camp_EmailSupplier1.setEnabled(false);
        camp_HomePageSupplier1.setEnabled(false);
        camp_CNPJ1.setEnabled(false);
        camp_cpfSupplier1.setEnabled(false);
        camp_contato.setEnabled(false);

//              ENDERECO;                
        camp_AddressRuaSupplier1.setEnabled(false);
        camp_CEPSupplier1.setEnabled(false);
        camp_CitySupplier1.setEnabled(false);
        camp_StateSupplier1.setEnabled(false);
        camp_BairroSupplier1.setEnabled(false);
        camp_NumbleHouseSupplier1.setEnabled(false);
        camp_ComplementSupplier1.setEnabled(false);
        btn_save.setEnabled(false);
        btn_cancelar.setEnabled(false);
    }

    private void updateSupplier() {

        int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja Realmente <html><font color=\"#FF0000\">*ALTERAR OS DADOS DO FORNECEDOR*?</font></html></html>", "Salvar?", JOptionPane.YES_NO_OPTION);

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
            try {
                f.setContato(Long.parseLong(camp_contato.getText().replace("(", "").replace(")", "").replaceAll("-", "")));
            } catch (Exception e) {
                System.out.println("Erro \n" + e);
            }

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
            f.getEndereco().setCidade(camp_CitySupplier1.getText());
            f.getEndereco().setComplemento(camp_ComplementSupplier1.getText());

            Conexao connectbanco = new Conexao(); // abre conexao com o banco;
            connectbanco.update(f); // salva e atualiza classe Pai
            JOptionPane.showMessageDialog(null, "Dados Alterado com Sucesso!");
        }

    }

    private void CleanFieldSupplier() {

        camp_SupplierName1.setText(""); // name do fornecedor
        camp_AddressRuaSupplier1.setText(""); // rua do fornecedor
        camp_EmailSupplier1.setText(""); // email do fornecedor
        camp_HomePageSupplier1.setText(""); // home page do fornecedor
        camp_CEPSupplier1.setText("00000000"); // cep do fornecedor
        camp_contato.setText("(00)00000-0000"); // contato do fornecedor
        camp_CNPJ1.setText("00000000000000"); // CNPJ do fornecedor
        camp_cpfSupplier1.setText("00000000000"); // CPF do fornecedor
        camp_BairroSupplier1.setText("");// Bairro do fornecedor
        camp_NumbleHouseSupplier1.setText("00000000"); // Numero da Casa ou loja do fornecedor
        camp_StateSupplier1.setText(""); // Estado UF do fornecedor
        camp_CitySupplier1.setText(""); // cidade do forncedor
        camp_ComplementSupplier1.setText(""); // complemento do fornecedor 

    }

    public void produtosFornecedor() {

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        int x = 0;
        int y = 0;
        int z = 0;
        
        // juntando duas tabelas do banco de dados;
        String sql = "FROM Produto as v INNER JOIN v.fornecedor";
        List<Object[]> query = (List<Object[]>) session.createQuery(sql).list();
        DefaultTableModel tabela = (DefaultTableModel) table_Product.getModel();
        tabela.setNumRows(0);
        for (Object[] objects : query) {
            Produto produto = (Produto) objects[0];
            Fornecedor forne = (Fornecedor) objects[1];
            if (forne.getIdFornecedor().equals(fornecedor.getIdFornecedor())) {
                System.out.println(fornecedor.getNome() + "----" + produto.getNome());
                tabela.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getCor(),
                    produto.getQnt(),
                    dinheiro.format(produto.getValor_venda())});
                x = 1;
                y = z + x;
                z = y;
            }qtdeProdutos.setText(""+z);

        }
    }
}
