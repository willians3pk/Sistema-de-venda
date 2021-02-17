package br.com.telas;

import br.com.classes.Cliente;
import br.com.classes.FormaPagamento;
import br.com.classes.ItensVenda;
import br.com.classes.Parcelas;
import br.com.classes.Produto;
import br.com.classes.Venda;
import br.com.conexao.Conexao;
import static br.com.telas.ScreenSell.produtos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ScreenFinalizarVenda extends javax.swing.JFrame {

    List<Produto> lista;
    ScreenSell telaVenda;
    Conexao bancoMariaDB = new Conexao();
    Cliente client;

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }

    public Cliente getCliente() {
        return client;
    }

    public void setCliente(Cliente cliente) {
        this.client = cliente;
    }

    public ScreenFinalizarVenda() {
        initComponents();
        carregarComboBox();
        camp_qtdeParcelas.setVisible(false);
        camp_valorParcelas.setVisible(false);
        btn_gerarDatas.setVisible(false);
        jListdatasparceladas.setVisible(false);
//        jListpesquisaClientes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboBOX_FormaPagamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        camptotal = new javax.swing.JTextField();
        campvalorPago = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dataVenda = new com.toedter.calendar.JDateChooser();
        jLabeldatavenda = new javax.swing.JLabel();
        camp_valorParcelas = new javax.swing.JTextField();
        camp_qtdeParcelas = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListdatasparceladas = new javax.swing.JList<>();
        btn_gerarDatas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_finalizarvenda = new javax.swing.JButton();
        btn_cancelarVenda = new javax.swing.JButton();
        jLabelQuantidadeItens = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campTroco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        camp_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        comboBOX_FormaPagamento.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        comboBOX_FormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBOX_FormaPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(comboBOX_FormaPagamento);
        comboBOX_FormaPagamento.setBounds(20, 60, 290, 40);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("FORMA DE PAGAMENTO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 30, 310, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        camptotal.setEditable(false);
        camptotal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        camptotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(camptotal);
        camptotal.setBounds(180, 70, 130, 30);

        campvalorPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campvalorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campvalorPagoKeyReleased(evt);
            }
        });
        jPanel3.add(campvalorPago);
        campvalorPago.setBounds(180, 120, 130, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("VALOR PAGO:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 120, 180, 30);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setText("TOTAL:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 70, 120, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 190, 320, 190);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);
        jPanel4.add(dataVenda);
        dataVenda.setBounds(20, 40, 180, 30);

        jLabeldatavenda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabeldatavenda.setText("DATA DA VENDA:");
        jPanel4.add(jLabeldatavenda);
        jLabeldatavenda.setBounds(20, 10, 230, 29);

        camp_valorParcelas.setEditable(false);
        jPanel4.add(camp_valorParcelas);
        camp_valorParcelas.setBounds(150, 120, 80, 30);

        camp_qtdeParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_qtdeParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_qtdeParcelasKeyReleased(evt);
            }
        });
        jPanel4.add(camp_qtdeParcelas);
        camp_qtdeParcelas.setBounds(150, 80, 80, 30);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Qtde Parcelas.:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 80, 150, 30);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Valor Parcelas:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 120, 150, 30);

        jScrollPane1.setViewportView(jListdatasparceladas);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(240, 80, 130, 70);

        btn_gerarDatas.setText("Gerar datas");
        btn_gerarDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarDatasActionPerformed(evt);
            }
        });
        jPanel4.add(btn_gerarDatas);
        btn_gerarDatas.setBounds(220, 30, 120, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(340, 190, 390, 190);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        btn_finalizarvenda.setText("FINALIZAR VENDA");
        btn_finalizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarvendaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_finalizarvenda);
        btn_finalizarvenda.setBounds(810, 30, 160, 40);

        btn_cancelarVenda.setText("CANCELAR VENDA");
        btn_cancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarVendaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_cancelarVenda);
        btn_cancelarVenda.setBounds(640, 30, 160, 40);

        jLabelQuantidadeItens.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabelQuantidadeItens.setText("0");
        jPanel5.add(jLabelQuantidadeItens);
        jLabelQuantidadeItens.setBounds(430, 30, 50, 50);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel11.setText("Qtde itens:");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(290, 30, 130, 50);

        campTroco.setEditable(false);
        campTroco.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jPanel5.add(campTroco);
        campTroco.setBounds(140, 30, 130, 40);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("TROCO");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 40, 120, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 390, 980, 80);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 170, 970, 10);

        camp_cliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        camp_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                camp_clienteFocusLost(evt);
            }
        });
        camp_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_clienteActionPerformed(evt);
            }
        });
        camp_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_clienteKeyReleased(evt);
            }
        });
        jPanel1.add(camp_cliente);
        camp_cliente.setBounds(360, 60, 310, 40);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel10.setText("CLIENTE:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(360, 30, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 1000, 480);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel13.setText("Tela Finalizar venda");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(260, 20, 340, 30);

        jLabelValorTotal.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(255, 0, 0));
        jLabelValorTotal.setText("TOTAL");
        jPanel2.add(jLabelValorTotal);
        jLabelValorTotal.setBounds(740, 30, 210, 40);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setText("TOTAL DA VENDA:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(660, 0, 330, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 1000, 70);

        setSize(new java.awt.Dimension(1033, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_finalizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarvendaActionPerformed

        try {
            if (campvalorPago.getText().length() > 0 & !dataVenda.getDate().equals("") & lista.size() > 0 & comboBOX_FormaPagamento.getSelectedIndex() <= 2) {
                finalizarVenda();
            } else if (comboBOX_FormaPagamento.getSelectedIndex() == 5 & camp_qtdeParcelas.getText().length() > 0 & lista.size() > 0) {
                vendaParcelada();
            } else if (comboBOX_FormaPagamento.getSelectedIndex() == 3 & lista.size() > 0) {
                vendaAprazo();
            } else if (campvalorPago.getText().length() > 0 & !dataVenda.getDate().equals("") & lista.size() > 0 & comboBOX_FormaPagamento.getSelectedIndex() == 4) {
                finalizarVenda();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha os Campos relevantes a Forma de Pagamento!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos relevantes!");
        }

    }//GEN-LAST:event_btn_finalizarvendaActionPerformed

    private void btn_cancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarVendaActionPerformed
        lista.clear();
        DefaultListModel datasparcelas = new DefaultListModel();
        jListdatasparceladas.setModel(datasparcelas);
        camp_valorParcelas.setText("0,00");
        camp_qtdeParcelas.setVisible(false);
        camp_valorParcelas.setVisible(false);
        btn_gerarDatas.setVisible(false);
        jListdatasparceladas.setVisible(false);
        telaVenda.adicionarItens();
        telaVenda.btn_buscarProduto.setText("");
        camp_cliente.setText("");
        telaVenda.field_preco.setText("0,00");
        telaVenda.field_qnt.setText("0");
        dispose();
    }//GEN-LAST:event_btn_cancelarVendaActionPerformed

    private void campvalorPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campvalorPagoKeyReleased
        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valorPago - valortotal;
        campTroco.setText(String.valueOf(troco));
    }//GEN-LAST:event_campvalorPagoKeyReleased

    private void camp_qtdeParcelasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_qtdeParcelasKeyReleased
        int qtdeParce = Integer.parseInt(camp_qtdeParcelas.getText());
        double total = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorParcela = total / qtdeParce;
        camp_valorParcelas.setText("" + valorParcela);
        campvalorPago.setText("" + valorParcela);
    }//GEN-LAST:event_camp_qtdeParcelasKeyReleased

    private void comboBOX_FormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBOX_FormaPagamentoActionPerformed
        if (comboBOX_FormaPagamento.getSelectedIndex() == 5) {
            camp_qtdeParcelas.setVisible(true);
            camp_valorParcelas.setVisible(true);
            btn_gerarDatas.setVisible(true);
            jListdatasparceladas.setVisible(true);
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() <= 2) {
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            btn_gerarDatas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            valorTotal();
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() == 3) {
            jLabeldatavenda.setText("DATA DO PAGAMENTO:");
            campvalorPago.setText("0,00");
            campvalorPago.setEnabled(false);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() == 4) {
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            btn_gerarDatas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            valorTotal();
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
    }//GEN-LAST:event_comboBOX_FormaPagamentoActionPerformed

    private void btn_gerarDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarDatasActionPerformed
        GregorianCalendar gc = new GregorianCalendar();
        Date diaAtual = dataVenda.getDate();
        DefaultListModel datasparcelas = new DefaultListModel();
        for (int i = 0; i < Integer.parseInt(camp_qtdeParcelas.getText()); i++) {
            gc.setTime(diaAtual);
            gc.roll(GregorianCalendar.MONTH, i);
            Date d = gc.getTime();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            datasparcelas.addElement(df.format(d));
            jListdatasparceladas.setModel(datasparcelas);
        }


    }//GEN-LAST:event_btn_gerarDatasActionPerformed

    private void camp_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camp_clienteFocusLost
        try {
//            client = bancoMariaDB.list_Cliente().get(jListpesquisaClientes.getSelectedIndex());
            System.out.println(client.getNome() + " " + client.getIdpessoa());
//            camp_cliente.setText(client.getNome());
//            jListpesquisaClientes.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
//            jListpesquisaClientes.setVisible(false);
        }

    }//GEN-LAST:event_camp_clienteFocusLost

    private void camp_clienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_clienteKeyReleased

        String pesquisa = camp_cliente.getText();
        List<Cliente> listaClientes = new ArrayList<>();
        for (int i = 0; i < bancoMariaDB.list_Cliente().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE CLIENTE E VERIFICA O STATUS DO CLIENTE;
            if (bancoMariaDB.list_Cliente().get(i).getNome().contains(pesquisa) && bancoMariaDB.list_Cliente().get(i).isStatus()) {
                Cliente c = bancoMariaDB.list_Cliente().get(i);
                client = bancoMariaDB.list_Cliente().get(i);
                listaClientes.add(c); // ADICIONA NA LISTA CLIENTE;
            }
        }

        DefaultListModel jlista = new DefaultListModel();
        for (Cliente cliente : listaClientes) {
            jlista.addElement(cliente.getNome());
//            jListpesquisaClientes.setModel(jlista);
//            jListpesquisaClientes.setVisible(true);
        }
    }//GEN-LAST:event_camp_clienteKeyReleased

    private void camp_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_clienteActionPerformed
        String pesquisa = camp_cliente.getText();
        List<Cliente> listaClientes = new ArrayList<>();
        for (int i = 0; i < bancoMariaDB.list_Cliente().size(); i++) {
            // VERIFICA SE O NOME COMTEM NA LISTA DE CLIENTE E VERIFICA O STATUS DO CLIENTE;
            if (bancoMariaDB.list_Cliente().get(i).getNome().contains(pesquisa) && bancoMariaDB.list_Cliente().get(i).isStatus()) {
                Cliente c = bancoMariaDB.list_Cliente().get(i);
                client = bancoMariaDB.list_Cliente().get(i);
                listaClientes.add(c); // ADICIONA NA LISTA CLIENTE;
            }
        }

        DefaultListModel jlista = new DefaultListModel();
        for (Cliente cliente : listaClientes) {
            jlista.addElement(cliente.getNome());
//            jListpesquisaClientes.setModel(jlista);
//            jListpesquisaClientes.setVisible(true);
        }
        camp_cliente.setText(client.getNome());
//        jListpesquisaClientes.setVisible(false);
    }//GEN-LAST:event_camp_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenFinalizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarVenda;
    private javax.swing.JButton btn_finalizarvenda;
    private javax.swing.JButton btn_gerarDatas;
    private javax.swing.JTextField campTroco;
    public static javax.swing.JTextField camp_cliente;
    public javax.swing.JFormattedTextField camp_qtdeParcelas;
    public javax.swing.JTextField camp_valorParcelas;
    private javax.swing.JTextField camptotal;
    public javax.swing.JFormattedTextField campvalorPago;
    private javax.swing.JComboBox<String> comboBOX_FormaPagamento;
    public com.toedter.calendar.JDateChooser dataVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelQuantidadeItens;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabeldatavenda;
    private javax.swing.JList<String> jListdatasparceladas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    public void valorTotal() {
        double y = 0;
        double x = 0;
        double z = 0;
        for (int i = 0; i < produtos.size(); i++) {
            x = produtos.get(i).getValor_venda() * produtos.get(i).getQnt();
            y = z + x;
            z = y;
        }

        camptotal.setText("R$ " + z);
        jLabelValorTotal.setText("R$ " + z);
        campvalorPago.setText("" + z);

        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valorPago - valortotal;
        campTroco.setText(String.valueOf(troco));

    }

    private void finalizarVenda() {
        Venda venda = new Venda(); // cria uma nova venda;
        ItensVenda itensdaVenda = new ItensVenda(); // cria novo item venda;
        List<FormaPagamento> listaPagamento = new ArrayList<>(); // cria uma nova lista de pagamento;

        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valortotal - valorPago;

        System.out.println("Cliente: " + client.getNome());
        venda.setStatus(true);
        venda.setDataVenda(dataVenda.getDate()); // data da venda
        venda.setValorTotal(Double.parseDouble(camptotal.getText().replace("R$", "").trim())); // valor total da venda
        venda.setDescricao(ScreenSell.field_observacao.getText()); // observação da venda
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor que foi pago na venda;
        venda.setTroco(troco); // troco da venda;
        venda.setFormaPagamento(listaPagamento); // adiciona a lista de pagamento na venda;
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));// pega a forma de pagamento da venda;

        if (camp_cliente.getText().length() > 0) {
            venda.setCliente(client); // adiciona o cliente na venda;
            client.getVendas().add(venda); // adiciona a venda na lista de cliente;
            bancoMariaDB.update(client);
        } else {
            JOptionPane.showMessageDialog(null, "Venda sem Cliente");
        }

        for (Produto produto : lista) {
            itensdaVenda.setStatus(true);
            itensdaVenda.setItems(produto);
            itensdaVenda.setQnt(produto.getQnt());
            itensdaVenda.setVenda(venda);
            bancoMariaDB.save(itensdaVenda); // salva os itens da venda;
        }

        // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
        for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
            for (Produto produto : lista) {
                if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                    Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                    int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;
                    item.setQnt(qnt_Atualizada); // adicionar a subtração;
                    bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;

                }
            }
        }

        lista.clear(); // limpa a lista;
        DefaultListModel datasparcelas = new DefaultListModel();
        camp_cliente.setText("");
        jListdatasparceladas.setModel(datasparcelas);
        camp_valorParcelas.setText("0,00");
        camp_qtdeParcelas.setVisible(false);
        camp_valorParcelas.setVisible(false);
        btn_gerarDatas.setVisible(false);
        jListdatasparceladas.setVisible(false);
        telaVenda.adicionarItens();
        telaVenda.btn_buscarProduto.setText("");
        telaVenda.field_preco.setText("0,00");
        telaVenda.field_qnt.setText("0");
        dispose();
        JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");
    }

    public void vendaParcelada() {
        Venda venda = new Venda();

        ItensVenda itensdaVenda = new ItensVenda();
        List<FormaPagamento> listaPagamento = new ArrayList<>();
        List<Parcelas> listaParcelas = new ArrayList<>();

        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valortotal - valorPago;

        venda.setStatus(true);
        venda.setDataVenda(dataVenda.getDate()); // data da venda
        venda.setValorTotal(Double.parseDouble(camptotal.getText().replace("R$", "").trim())); // valor total da venda
        venda.setDescricao(ScreenSell.field_observacao.getText()); // observação da venda
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor pago na venda;
        venda.setTroco(troco);
        venda.setFormaPagamento(listaPagamento);
        venda.setParcelas(listaParcelas);
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));

        if (camp_cliente.getText().length() > 0) {
            venda.setCliente(client); // adiciona o cliente na venda;
//            client.setVendas(vendas); // adiciona uma lista de vendas para o cliente;
            client.getVendas().add(venda); // adiciona a venda na lista de cliente;
            bancoMariaDB.update(client);

            // ITENS DA VENDA
            for (Produto produto : lista) {
                itensdaVenda.setStatus(true);
                itensdaVenda.setItems(produto);
                itensdaVenda.setQnt(produto.getQnt());
                itensdaVenda.setVenda(venda);
                bancoMariaDB.save(itensdaVenda); // salva os itens da venda;
            }

            // https://www.guj.com.br/t/duvida-gerar-parcelas-com-data-resolvido/134893/2 forum que ajudou a criar as datas da parcela;
            int numeroParcela = 1;
            GregorianCalendar gc = new GregorianCalendar();
            int numPar = Integer.parseInt(camp_qtdeParcelas.getText());
            Date diaAtual = new Date();

            // PARCELAS DA VENDA
            for (int i = 0; i < Integer.parseInt(camp_qtdeParcelas.getText()); i++) {
                Parcelas parcela = new Parcelas();// FAZ COM QUE REGISTRA UMA NOVA PARCELA NO BANCO;

                gc.setTime(diaAtual);
                gc.roll(GregorianCalendar.MONTH, i);
                Date d = gc.getTime();

                venda.getParcelas().add(parcela);// ADICIONA AS PARCELAS
                parcela.setVenda(venda);
                parcela.setValor(Double.parseDouble(camp_valorParcelas.getText()));
                parcela.setParcela(numeroParcela + i);//  NUMERO DAS PARCELAS;
                parcela.setData(d);
                parcela.setStatus(true);
                bancoMariaDB.save(parcela); //SALVA A PARCELA NO BANCO DE DADOS;
            }

            // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                for (Produto produto : lista) {
                    if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                        Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                        int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;
                        item.setQnt(qnt_Atualizada); // adicionar a subtração;
                        bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;

                    }
                }
            }

            lista.clear(); // limpa a lista;
            camp_cliente.setText("");
            DefaultListModel datasparcelas = new DefaultListModel();
            jListdatasparceladas.setModel(datasparcelas);
            camp_valorParcelas.setText("0,00");
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            btn_gerarDatas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            telaVenda.adicionarItens();
            telaVenda.btn_buscarProduto.setText("");
            telaVenda.field_preco.setText("0,00");
            telaVenda.field_qnt.setText("0");
            dispose();
            JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "ATENÇÃO vendas Parceladas precisa de um cliente cadastrado.");
        }
    }

    public void vendaAprazo() {
        Venda venda = new Venda();
        ItensVenda itensdaVenda = new ItensVenda();
        List<FormaPagamento> listaPagamento = new ArrayList<>();

        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valortotal - valorPago;

        venda.setStatus(true);
        venda.setDataVenda(dataVenda.getDate()); // data da venda
        venda.setValorTotal(Double.parseDouble(camptotal.getText().replace("R$", "").trim())); // valor total da venda
        venda.setDescricao(ScreenSell.field_observacao.getText()); // observação da venda
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor pago na venda;
        venda.setTroco(troco);
        venda.setFormaPagamento(listaPagamento);
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));
        venda.setPrazo(dataVenda.getDate());

        if (camp_cliente.getText().length() > 0) {
            venda.setCliente(client); // adiciona o cliente na venda;
//            client.setVendas(vendas); // adiciona uma lista de vendas para o cliente;
            client.getVendas().add(venda); // adiciona a venda na lista de cliente;
            bancoMariaDB.save_update(client);

            // ITENS DA VENDA
            for (Produto produto : lista) {
                itensdaVenda.setStatus(true);
                itensdaVenda.setItems(produto);
                itensdaVenda.setQnt(produto.getQnt());
                itensdaVenda.setVenda(venda);
                bancoMariaDB.save(itensdaVenda); // salva os itens da venda e automaticamente salva a venda;
            }

            // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                for (Produto produto : lista) {
                    if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                        Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                        int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;
                        item.setQnt(qnt_Atualizada); // adicionar a subtração;
                        bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;

                    }
                }
            }

            lista.clear(); // limpa a lista;
            camp_cliente.setText("");
            DefaultListModel datasparcelas = new DefaultListModel();
            jListdatasparceladas.setModel(datasparcelas);
            camp_valorParcelas.setText("0,00");
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            btn_gerarDatas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            telaVenda.adicionarItens();
            telaVenda.btn_buscarProduto.setText("");
            telaVenda.field_preco.setText("0,00");
            telaVenda.field_qnt.setText("0");
            dispose();
            JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "ATENÇÃO vendas A PRAZO precisa de um cliente cadastrado.");
        }
    }

    public void carregarComboBox() {

        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        List<FormaPagamento> listaPagamento;
        listaPagamento = bancoMariaDB.listFormPagamento();

        for (FormaPagamento formPagamento : listaPagamento) { // PEGA OS FORMAPAGAMENTO CADASTRADOS NO BANCO DE DADOS;
            comboBox.addElement(formPagamento.getDescricao());
            comboBOX_FormaPagamento.setModel(comboBox);           // ADICIONA OS FORMAPAGAMENTO NA COMBOBOX;
        }

        camp_qtdeParcelas.setText("" + 0);
    }

}
