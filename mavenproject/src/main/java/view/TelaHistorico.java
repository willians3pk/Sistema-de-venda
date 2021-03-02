package view;

import controle.Venda;
import conexao.Conexao;
import conexao.NewHibernateUtil;
import controle.Estado;
import static view.MainScreen.jDesktopPane1;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TelaHistorico extends javax.swing.JPanel {

    Conexao bancoMariaDB = new Conexao();

    public TelaHistorico() {
        initComponents();
        jlabelAviso.setVisible(false);
        
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtotalVendas = new javax.swing.JTextField();
        btn_detalhes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlabelAviso = new javax.swing.JLabel();

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
        jPanel2.setBounds(10, 200, 1100, 330);

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
        jCheckBox1.setBounds(700, 50, 140, 22);

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

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 90, 1100, 80);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 180, 1100, 10);

        jLabel5.setText("Total em Vendas:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(960, 560, 110, 20);

        jtotalVendas.setEditable(false);
        jtotalVendas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel1.add(jtotalVendas);
        jtotalVendas.setBounds(960, 580, 150, 40);

        btn_detalhes.setText("Vizualizar Detalhes");
        btn_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_detalhes);
        btn_detalhes.setBounds(950, 40, 160, 40);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HISTORICOS DE VENDAS REALIZADAS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 20, 650, 60);

        jlabelAviso.setForeground(new java.awt.Color(255, 0, 0));
        jlabelAviso.setText("Vendas canceladas não se inclui nesse resultado:");
        jPanel1.add(jlabelAviso);
        jlabelAviso.setBounds(640, 600, 330, 16);

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
            // só calcula as vendas que nao são canceladas;
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

                        if (venda.isStatus() && venda.getEstado().equals(Estado.RECEBER)) {
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
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detalhes;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JFormattedTextField camp_dataFim;
    private javax.swing.JFormattedTextField camp_dataInicio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
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
        jlabelAviso.setVisible(false);
        jtotalVendas.setText(dinheiro.format(z));

    }

}
