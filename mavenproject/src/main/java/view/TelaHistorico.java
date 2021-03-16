package view;

import util.TableRendererVendas;
import model.Venda;
import conexao.Conexao;
import conexao.NewHibernateUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Estado;
import static view.MainScreen.jDesktopPane1;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TelaHistorico extends javax.swing.JPanel {

    Conexao bancoMariaDB = new Conexao();

    public TelaHistorico() {
        initComponents();
        jlabelAviso.setVisible(false);
        jtable_vendas.setDefaultRenderer(Object.class, new TableRendererVendas());

        TableColumn colCodigo = jtable_vendas.getColumnModel().getColumn(0);
        TableColumn colDataVenda = jtable_vendas.getColumnModel().getColumn(1);
        TableColumn colNome = jtable_vendas.getColumnModel().getColumn(2);
        TableColumn colFormaPagamento = jtable_vendas.getColumnModel().getColumn(3);
        TableColumn colDescrição = jtable_vendas.getColumnModel().getColumn(4);
        TableColumn colTotalVenda = jtable_vendas.getColumnModel().getColumn(5);
        TableColumn colEstado = jtable_vendas.getColumnModel().getColumn(6);

        colCodigo.setPreferredWidth(5);
        colDataVenda.setPreferredWidth(30);
        colNome.setPreferredWidth(200);
        colFormaPagamento.setPreferredWidth(70);
        colDescrição.setPreferredWidth(200);
        colTotalVenda.setPreferredWidth(5);
        colEstado.setPreferredWidth(5);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_vendas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_pesquisar = new javax.swing.JButton();
        btn_filtrar = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        camp_dataInicio = new javax.swing.JFormattedTextField();
        camp_dataFim = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        camp_quantidadeVenda = new javax.swing.JTextField();
        btn_detalhes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtotalVendas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jlabelAviso = new javax.swing.JLabel();
        camp_nomeCliente = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_gerarRelatorio = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jtable_vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data da Venda", "Cliente", "Forma de Pagamento", "Descrição", "Total da Venda", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtable_vendas);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 1080, 280);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 230, 1100, 330);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel1.setText("Data Final:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(270, 10, 80, 20);

        jLabel2.setText("Data Inicio:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 20);

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_pesquisar);
        btn_pesquisar.setBounds(470, 30, 90, 30);

        btn_filtrar.setText("Filtrar");
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_filtrar);
        btn_filtrar.setBounds(1020, 40, 70, 30);

        jCheckBox2.setText("Contas a Receber");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox2);
        jCheckBox2.setBounds(870, 50, 140, 22);

        jCheckBox1.setText("Vendas A Prazo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1);
        jCheckBox1.setBounds(870, 30, 140, 22);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(600, 12, 10, 60);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("até");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(210, 40, 44, 16);

        try {
            camp_dataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(camp_dataInicio);
        camp_dataInicio.setBounds(10, 30, 180, 30);

        try {
            camp_dataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(camp_dataFim);
        camp_dataFim.setBounds(270, 30, 180, 30);

        jLabel4.setText("Ano/Dia/Mes");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(370, 10, 80, 16);

        jLabel6.setText("Ano/Mes/Dia:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(110, 10, 90, 16);

        jCheckBox3.setText("Vendas PAGO");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox3);
        jCheckBox3.setBounds(870, 10, 190, 22);

        jLabel8.setText("Qtde Vendas:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(620, 20, 90, 16);

        camp_quantidadeVenda.setEditable(false);
        camp_quantidadeVenda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel4.add(camp_quantidadeVenda);
        camp_quantidadeVenda.setBounds(620, 40, 80, 31);

        btn_detalhes.setBackground(new java.awt.Color(68, 255, 0));
        btn_detalhes.setText("Vizualizar ");
        btn_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesActionPerformed(evt);
            }
        });
        jPanel4.add(btn_detalhes);
        btn_detalhes.setBounds(740, 30, 110, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 120, 1100, 80);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 1100, 10);

        jLabel5.setText("Total em Vendas:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(960, 560, 110, 20);

        jtotalVendas.setEditable(false);
        jtotalVendas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel1.add(jtotalVendas);
        jtotalVendas.setBounds(960, 580, 150, 40);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HISTORICOS DE VENDAS REALIZADAS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 10, 650, 60);

        jlabelAviso.setForeground(new java.awt.Color(255, 0, 0));
        jlabelAviso.setText("Vendas canceladas não se inclui nesse resultado:");
        jPanel1.add(jlabelAviso);
        jlabelAviso.setBounds(640, 600, 330, 16);

        camp_nomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_nomeClienteKeyReleased(evt);
            }
        });
        jPanel1.add(camp_nomeCliente);
        camp_nomeCliente.setBounds(220, 80, 680, 26);

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPanel8);
        jPanel8.setBounds(920, 50, 10, 10);

        jPanel5.setBackground(new java.awt.Color(33, 33, 33));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPanel5);
        jPanel5.setBounds(920, 70, 10, 10);

        jLabel11.setText("Vendas que Foram Pagas:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(940, 70, 180, 16);

        jLabel10.setText("Vendas que Falta Receber:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(940, 50, 170, 16);

        jPanel9.setBackground(new java.awt.Color(254, 182, 1));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPanel9);
        jPanel9.setBounds(920, 90, 10, 10);

        jLabel12.setText("Vendas Canceladas:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(940, 90, 130, 16);

        btn_gerarRelatorio.setBackground(new java.awt.Color(241, 235, 81));
        btn_gerarRelatorio.setText("Gerar Relatorio");
        btn_gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarRelatorioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gerarRelatorio);
        btn_gerarRelatorio.setBounds(10, 80, 130, 30);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesActionPerformed
        DefaultTableModel tabelaVendas = (DefaultTableModel) jtable_vendas.getModel();
        int linha = jtable_vendas.getSelectedRow();
        List<Venda> vendas = new ArrayList<>();
        vendas = bancoMariaDB.lista_Vendas();
        try {
            for (Venda venda : vendas) {
                if (venda.getIdvenda().equals(tabelaVendas.getValueAt(linha, 0))) {
                    TelaDetalhesVenda dv = new TelaDetalhesVenda();
                    jDesktopPane1.removeAll();
                    dv.setLocation(0, 0);
                    dv.setSize(1140, 650);
                    dv.setVisible(true);
                    dv.setVenda(venda);
                    dv.carregarCampos();
                    jDesktopPane1.add(dv);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione a Venda que voce que visualizar!");
        }

    }//GEN-LAST:event_btn_detalhesActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed

        Conexao banco = new Conexao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Venda where dataVenda BETWEEN ('" + camp_dataInicio.getText() + "')" + "and" + "('" + camp_dataFim.getText() + "')";
        Query query = session.createQuery(hql);
        List<Venda> results = query.list();

        DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        double y = 0;
        double x = 0;
        double z = 0;

        tabela.setNumRows(0);
        for (Venda venda : results) {
            x = venda.getValorTotal();

            tabela.addRow(new Object[]{
                venda.getIdvenda(),
                formato.format(venda.getDataVenda()),
                venda.getCliente().getNome(),
                venda.FormaPagamento(), venda.getDescricao(),
                dinheiro.format(venda.getValorTotal()),
                venda.getEstado().getDescricao()});
            
            // a linha abaixo só calcula as vendas que nao são canceladas;
            if (venda.isStatus()) {
                // soma todos os valores total de cada venda;
                y = z + x;
                z = y;
            }
        }
        jlabelAviso.setVisible(true);
        jtotalVendas.setText(dinheiro.format(z));

    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                if (jCheckBox1.isSelected()) {

                    List<Venda> vendas = new ArrayList<>();
                    DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

                    Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
                    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

                    vendas = bancoMariaDB.lista_Vendas();

                    double y = 0;
                    double x = 0;
                    double z = 0;

                    tabela.setNumRows(0);
                    for (Venda venda : vendas) {

                        if (venda.isStatus() && venda.FormaPagamento().equals("A PRAZO")) {
                            x = venda.getValorTotal();
                            tabela.addRow(new Object[]{
                                venda.getIdvenda(),
                                formato.format(venda.getDataVenda()),
                                venda.getCliente().getNome(),
                                venda.FormaPagamento(), venda.getDescricao(),
                                dinheiro.format(venda.getValorTotal()),
                                venda.getEstado().getDescricao()});
                            // soma todos os valores total de cada venda;
                            y = z + x;
                            z = y;
                        }
                    }
                    camp_quantidadeVenda.setText(vendas.size() + "");
                    jlabelAviso.setVisible(false);
                    jtotalVendas.setText(dinheiro.format(z));

                } else if (jCheckBox2.isSelected()) {
                    List<Venda> vendas = new ArrayList<>();
                    DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

                    Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
                    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

                    vendas = bancoMariaDB.lista_Vendas();

                    double y = 0;
                    double x = 0;
                    double z = 0;

                    tabela.setNumRows(0);
                    for (Venda venda : vendas) {

                        if (venda.isStatus() && venda.getEstado().equals(Estado.PENDENTE)) {
                            x = venda.getValorTotal();
                            tabela.addRow(new Object[]{
                                venda.getIdvenda(),
                                formato.format(venda.getDataVenda()),
                                venda.getCliente().getNome(),
                                venda.FormaPagamento(), venda.getDescricao(),
                                dinheiro.format(venda.getValorTotal()),
                                venda.getEstado().getDescricao()});

                            // soma todos os valores total de cada venda;
                            y = z + x;
                            z = y;
                        }
                    }
                    camp_quantidadeVenda.setText(vendas.size() + "");
                    jlabelAviso.setVisible(false);
                    jtotalVendas.setText(dinheiro.format(z));
                } else if (jCheckBox3.isSelected()) {
                    List<Venda> vendas = new ArrayList<>();
                    DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

                    Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
                    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

                    vendas = bancoMariaDB.lista_Vendas();

                    double y = 0;
                    double x = 0;
                    double z = 0;

                    tabela.setNumRows(0);
                    for (Venda venda : vendas) {

                        if (venda.isStatus() && venda.getEstado().equals(Estado.PAGO)) {
                            x = venda.getValorTotal();
                            tabela.addRow(new Object[]{
                                venda.getIdvenda(),
                                formato.format(venda.getDataVenda()),
                                venda.getCliente().getNome(),
                                venda.FormaPagamento(), venda.getDescricao(),
                                dinheiro.format(venda.getValorTotal()),
                                venda.getEstado().getDescricao()});
                            // soma todos os valores total de cada venda;
                            y = z + x;
                            z = y;
                        }
                    }
                    camp_quantidadeVenda.setText(vendas.size() + "");
                    jlabelAviso.setVisible(false);
                    jtotalVendas.setText(dinheiro.format(z));

                } else {
                    carregarTabelaVendas();
                }
                carregando.dispose();
            }

        };
        t.start();

    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jCheckBox1.setSelected(false);
        jCheckBox3.setSelected(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void btn_gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarRelatorioActionPerformed
        try {

            Map<String, Object> parameters = new HashMap<String, Object>();
            // a linha abaixo adiciona as datas como parametro no relatorio
            parameters.put("datainicio",camp_dataInicio.getText());
            parameters.put("datafim",camp_dataFim.getText());
            
            // a linha abaixo cria a conexao com o banco de dados
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "wsmint", "Ws@12345");
            String caminho = "/home/user/JaspersoftWorkspace/MyReports/Venda.jrxml";
            JasperReport pathjrxml = JasperCompileManager.compileReport(caminho);
            JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, parameters, conexao);

            // a linha abaixo exibe o relatorio atraves da classe jasperview
            JasperViewer.viewReport(printReport, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());;
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_gerarRelatorioActionPerformed

    private void camp_nomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_nomeClienteKeyReleased
        String pesquisa = camp_nomeCliente.getText();
        List<Venda> vendas = new ArrayList<>();
        DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

        vendas = bancoMariaDB.lista_Vendas();

        double y = 0;
        double x = 0;
        double z = 0;

        tabela.setNumRows(0);
        for (Venda venda : vendas) {

            if (venda.getCliente().getNome().contains(pesquisa)) {

                x = venda.getValorTotal();
                tabela.addRow(new Object[]{
                    venda.getIdvenda(),
                    formato.format(venda.getDataVenda()),
                    venda.getCliente().getNome(),
                    venda.FormaPagamento(),
                    venda.getDescricao(),
                    dinheiro.format(venda.getValorTotal()),
                    venda.getEstado().getDescricao()});

                // soma todos os valores total de cada venda;
                y = z + x;
                z = y;
            }

        }
        camp_quantidadeVenda.setText(vendas.size() + "");
        jlabelAviso.setVisible(false);
        jtotalVendas.setText(dinheiro.format(z));

    }//GEN-LAST:event_camp_nomeClienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detalhes;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JButton btn_gerarRelatorio;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JFormattedTextField camp_dataFim;
    private javax.swing.JFormattedTextField camp_dataInicio;
    private javax.swing.JTextField camp_nomeCliente;
    private javax.swing.JTextField camp_quantidadeVenda;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlabelAviso;
    public static javax.swing.JTable jtable_vendas;
    private javax.swing.JTextField jtotalVendas;
    // End of variables declaration//GEN-END:variables

    public void carregarTabelaVendas() {

        List<Venda> vendas = new ArrayList<>();
        DefaultTableModel tabela = (DefaultTableModel) jtable_vendas.getModel();

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // formata o tipo date

        vendas = bancoMariaDB.lista_Vendas();

        double y = 0;
        double x = 0;
        double z = 0;

        tabela.setNumRows(0);
        for (Venda venda : vendas) {

            if (venda.isStatus()) {
                x = venda.getValorTotal();
                tabela.addRow(new Object[]{
                    venda.getIdvenda(),
                    formato.format(venda.getDataVenda()),
                    venda.getCliente().getNome(),
                    venda.FormaPagamento(),
                    venda.getDescricao(),
                    dinheiro.format(venda.getValorTotal()),
                    venda.getEstado().getDescricao()});

                // soma todos os valores total de cada venda;
                y = z + x;
                z = y;
            }
        }
        camp_quantidadeVenda.setText(vendas.size() + "");
        jlabelAviso.setVisible(false);
        jtotalVendas.setText(dinheiro.format(z));

    }

}
