package br.com.telas;

import br.com.classes.Venda;
import br.com.conexao.Conexao;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ScreenHistorico extends javax.swing.JPanel {

    Conexao bancoMariaDB = new Conexao();

    public ScreenHistorico() {
        initComponents();

        TableColumn colCodigo = jtable_vendas.getColumnModel().getColumn(0);
        TableColumn colDataVenda = jtable_vendas.getColumnModel().getColumn(1);
        TableColumn colNome = jtable_vendas.getColumnModel().getColumn(2);
        TableColumn colFormaPagamento = jtable_vendas.getColumnModel().getColumn(3);
        TableColumn colDescrição = jtable_vendas.getColumnModel().getColumn(4);
        TableColumn colTotalVenda = jtable_vendas.getColumnModel().getColumn(5);

        colCodigo.setPreferredWidth(5);
        colDataVenda.setPreferredWidth(30);
        colNome.setPreferredWidth(200);
        colFormaPagamento.setPreferredWidth(50);
        colDescrição.setPreferredWidth(200);
        colTotalVenda.setPreferredWidth(5);

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
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtotalVendas = new javax.swing.JTextField();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jtable_vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data da Venda", "Cliente", "Forma de Pagamento", "Descrição", "Total da Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_vendasMouseClicked(evt);
            }
        });
        jtable_vendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtable_vendasKeyReleased(evt);
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

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(270, 30, 180, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(10, 30, 180, 30);

        jLabel2.setText("Data Inicio:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 20);

        jButton1.setText("Pesquisar");
        jPanel4.add(jButton1);
        jButton1.setBounds(470, 30, 90, 30);

        jButton2.setText("Filtrar");
        jPanel4.add(jButton2);
        jButton2.setBounds(1020, 40, 70, 30);
        jPanel4.add(jCheckBox2);
        jCheckBox2.setBounds(890, 50, 96, 22);

        jCheckBox1.setText("Vendas A Prazo");
        jPanel4.add(jCheckBox1);
        jCheckBox1.setBounds(750, 50, 140, 22);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(600, 12, 10, 60);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("até");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(210, 40, 44, 16);

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

        add(jPanel1);
        jPanel1.setBounds(10, 10, 1120, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void jtable_vendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_vendasMouseClicked

    }//GEN-LAST:event_jtable_vendasMouseClicked

    private void jtable_vendasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtable_vendasKeyReleased

    }//GEN-LAST:event_jtable_vendasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
            x = venda.getValorTotal();
            
            tabela.addRow(new Object[]{
                venda.getIdvenda(),
                formato.format(venda.getDataVenda()),
                venda.getCliente().getNome(),
                venda.FormaPagamento(), venda.getDescricao(),
                dinheiro.format(venda.getValorTotal())});

            // soma todos os valores total de cada venda;
            y = z + x;
            z = y;
        }
        jtotalVendas.setText(dinheiro.format(z));

    }

}
