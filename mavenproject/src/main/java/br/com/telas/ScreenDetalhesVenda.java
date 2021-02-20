/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.classes.ItensVenda;
import br.com.classes.Venda;
import static br.com.telas.MainScreen.jDesktopPane1;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class ScreenDetalhesVenda extends javax.swing.JPanel {

    
    Venda venda;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
    public ScreenDetalhesVenda() {
        initComponents();
        
        TableColumn colCodigo = jtableVenda.getColumnModel().getColumn(0);
        TableColumn colNome = jtableVenda.getColumnModel().getColumn(1);
        TableColumn calQtde = jtableVenda.getColumnModel().getColumn(2);
        TableColumn colTotal = jtableVenda.getColumnModel().getColumn(3);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(300);
        calQtde.setPreferredWidth(5);
        colTotal.setPreferredWidth(5);
        
        TableColumn colData = tableAPrazo.getColumnModel().getColumn(0);
        TableColumn colValor = tableAPrazo.getColumnModel().getColumn(1);
        TableColumn colStatus = tableAPrazo.getColumnModel().getColumn(2);

        colData.setPreferredWidth(50);
        colValor.setPreferredWidth(10);
        colStatus.setPreferredWidth(5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camp_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        camp_formaPagamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        camp_datavenda = new javax.swing.JFormattedTextField();
        camp_codigovenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVenda = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAPrazo = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        camp_observacao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        camp_totalvenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        camp_quantidadeVendas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        camp_CodigoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        camp_nome.setEditable(false);
        jPanel1.add(camp_nome);
        camp_nome.setBounds(20, 160, 660, 30);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 140, 60, 16);

        camp_formaPagamento.setEditable(false);
        jPanel1.add(camp_formaPagamento);
        camp_formaPagamento.setBounds(20, 230, 240, 30);

        jLabel2.setText("Forma de Pagamento:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 210, 160, 20);

        camp_datavenda.setEditable(false);
        jPanel1.add(camp_datavenda);
        camp_datavenda.setBounds(140, 40, 140, 30);

        camp_codigovenda.setEditable(false);
        jPanel1.add(camp_codigovenda);
        camp_codigovenda.setBounds(20, 40, 90, 30);

        jLabel3.setText("Codigo Venda:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 120, 16);

        jLabel4.setText("Data da Venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 20, 100, 16);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jtableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo:", "Nome:", "Qtde:", "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableVenda);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 740, 110);

        tableAPrazo.setForeground(new java.awt.Color(255, 0, 0));
        tableAPrazo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data Pagamen.", "valor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAPrazo.setEnabled(false);
        jScrollPane3.setViewportView(tableAPrazo);
        if (tableAPrazo.getColumnModel().getColumnCount() > 0) {
            tableAPrazo.getColumnModel().getColumn(0).setResizable(false);
            tableAPrazo.getColumnModel().getColumn(1).setResizable(false);
            tableAPrazo.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(800, 10, 280, 110);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(770, 10, 10, 120);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 310, 1100, 150);

        camp_observacao.setEditable(false);
        camp_observacao.setColumns(20);
        camp_observacao.setRows(5);
        jScrollPane2.setViewportView(camp_observacao);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 520, 470, 100);

        jLabel5.setText("Observações da venda:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 500, 160, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 80, 1100, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(20, 290, 1100, 10);

        camp_totalvenda.setEditable(false);
        jPanel1.add(camp_totalvenda);
        camp_totalvenda.setBounds(320, 40, 100, 30);

        jLabel6.setText("Total da Venda:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 20, 100, 16);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_voltar);
        btn_voltar.setBounds(1020, 10, 100, 40);

        camp_quantidadeVendas.setEditable(false);
        jPanel1.add(camp_quantidadeVendas);
        camp_quantidadeVendas.setBounds(320, 230, 90, 30);

        jLabel7.setText("Quantidade de Vendas desse cliente:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 210, 240, 16);
        jPanel1.add(camp_CodigoCliente);
        camp_CodigoCliente.setBounds(720, 160, 80, 30);

        jLabel8.setText("Codigo Cliente:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(720, 140, 110, 16);

        add(jPanel1);
        jPanel1.setBounds(6, 5, 1130, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ScreenHistorico sH = new ScreenHistorico();
        jDesktopPane1.removeAll();
        sH.setLocation(0, 0);
        sH.setSize(1140, 650);
        sH.setVisible(true);
        sH.carregarTabelaVendas();
        jDesktopPane1.add(sH);
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField camp_CodigoCliente;
    private javax.swing.JTextField camp_codigovenda;
    private javax.swing.JFormattedTextField camp_datavenda;
    private javax.swing.JTextField camp_formaPagamento;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JTextArea camp_observacao;
    private javax.swing.JTextField camp_quantidadeVendas;
    private javax.swing.JTextField camp_totalvenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jtableVenda;
    private javax.swing.JTable tableAPrazo;
    // End of variables declaration//GEN-END:variables

    public void carregarCampos(){
        
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        camp_codigovenda.setText(venda.getIdvenda()+""); // codigo da venda;
        camp_datavenda.setText(data.format(venda.getDataVenda())+""); // data da venda
        camp_totalvenda.setText(dinheiro.format(venda.getValorTotal())+""); // valor total da venda;
        camp_nome.setText(venda.getCliente().getNome()); // nome do cliente
        camp_observacao.setText(venda.getDescricao()); // descrição da venda;
        camp_formaPagamento.setText(venda.FormaPagamento()); // forma de pagamento da venda;
        camp_CodigoCliente.setText(venda.getCliente().getIdpessoa()+"");
        
        DefaultTableModel tabelavenda = (DefaultTableModel) jtableVenda.getModel();
        
        tabelavenda.setNumRows(0);
        for (ItensVenda iten : venda.getItens()) {
            tabelavenda.addRow(new Object[]{
                iten.getItems().getIdProduto(),
                iten.getItems().getNome(),
                iten.getQnt(),
                dinheiro.format(iten.valortotal())
            });
        }
        
        DefaultTableModel tabelaAprazo = (DefaultTableModel) tableAPrazo.getModel();
        tabelaAprazo.setNumRows(0);
        tabelaAprazo.addRow(new Object[]{
            data.format(venda.getPrazo()),
            dinheiro.format(venda.getValorTotal()),
            venda.getPago()
        });
        
    }
    
}
