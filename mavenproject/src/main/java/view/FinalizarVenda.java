/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.Teclas;
import util.TeclasPermitidas;
import model.Cliente;
import model.FormaPagamento;
import model.Produto;
import model.Venda;
import conexao.Conexao;
import static java.awt.image.ImageObserver.HEIGHT;
import model.Estado;
import static view.MainScreen.jDesktopPane1;
import static view.TelaVenda.produtos;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Caixa;

/**
 *
 * @author user
 */
public class FinalizarVenda extends javax.swing.JPanel {

    List<Produto> lista;
    TelaVenda telaVenda;
    Conexao bancoMariaDB = new Conexao();
    Cliente client;
    TelaVenda s = new TelaVenda();
    Venda venda;

    public String observacaoVenda;

    public String getObservacaoVenda() {
        return observacaoVenda;
    }

    public void setObservacaoVenda(String observacaoVenda) {
        this.observacaoVenda = observacaoVenda;
    }

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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public FinalizarVenda() {
        initComponents();
        carregarComboBox();

        camp_qtdeParcelas.setVisible(false);
        camp_valorParcelas.setVisible(false);
        jListdatasparceladas.setVisible(false);
        camp_cliente.setDocument(new Teclas());
        camp_qtdeParcelas.setDocument(new TeclasPermitidas());
        camp_desconto.setDocument(new TeclasPermitidas());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboBOX_FormaPagamento = new javax.swing.JComboBox<>();
        camp_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_finalizarvenda = new javax.swing.JButton();
        btn_cancelarVenda = new javax.swing.JButton();
        jLabelQuantidadeItens = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        campTroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camp_valorParcelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListdatasparceladas = new javax.swing.JList<>();
        camp_qtdeParcelas = new javax.swing.JTextField();
        dataVenda = new com.toedter.calendar.JDateChooser();
        jLabeldatavenda = new javax.swing.JLabel();
        campvalorPago = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        camp_desconto = new javax.swing.JTextField();
        camptotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        camp_Acrescimo = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabelValorTotal.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(255, 0, 0));
        jLabelValorTotal.setText("TOTAL");
        jPanel2.add(jLabelValorTotal);
        jLabelValorTotal.setBounds(830, 30, 270, 40);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setText("TOTAL DA VENDA:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(780, 0, 330, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 10, 1120, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("FORMA DE PAGAMENTO:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 10, 320, 30);

        comboBOX_FormaPagamento.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        comboBOX_FormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBOX_FormaPagamentoActionPerformed(evt);
            }
        });
        jPanel4.add(comboBOX_FormaPagamento);
        comboBOX_FormaPagamento.setBounds(10, 40, 320, 40);

        camp_cliente.setEditable(false);
        camp_cliente.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel4.add(camp_cliente);
        camp_cliente.setBounds(460, 40, 610, 40);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel10.setText("CLIENTE:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(460, 10, 130, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 10, 1100, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        btn_finalizarvenda.setBackground(new java.awt.Color(11, 206, 0));
        btn_finalizarvenda.setText("FINALIZAR VENDA");
        btn_finalizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarvendaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_finalizarvenda);
        btn_finalizarvenda.setBounds(840, 10, 250, 60);

        btn_cancelarVenda.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelarVenda.setText("CANCELAR VENDA");
        btn_cancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarVendaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_cancelarVenda);
        btn_cancelarVenda.setBounds(550, 10, 250, 60);

        jLabelQuantidadeItens.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabelQuantidadeItens.setText("0");
        jPanel5.add(jLabelQuantidadeItens);
        jLabelQuantidadeItens.setBounds(150, 30, 50, 50);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel11.setText("Qtde itens:");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(10, 30, 130, 50);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 460, 1100, 80);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 43, 255));
        jTextField1.setText("TOTAL PAGO ..............");
        jPanel6.add(jTextField1);
        jTextField1.setBounds(10, 270, 210, 40);

        campTroco.setEditable(false);
        campTroco.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jPanel6.add(campTroco);
        campTroco.setBounds(240, 270, 450, 40);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Qtde Parcelas.:");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(730, 220, 140, 30);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Valor Parcelas:");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(730, 270, 140, 30);

        camp_valorParcelas.setEditable(false);
        camp_valorParcelas.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel6.add(camp_valorParcelas);
        camp_valorParcelas.setBounds(880, 270, 100, 30);

        jScrollPane1.setViewportView(jListdatasparceladas);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(990, 220, 100, 80);

        camp_qtdeParcelas.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_qtdeParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_qtdeParcelasKeyReleased(evt);
            }
        });
        jPanel6.add(camp_qtdeParcelas);
        camp_qtdeParcelas.setBounds(880, 220, 100, 30);
        jPanel6.add(dataVenda);
        dataVenda.setBounds(660, 40, 230, 40);

        jLabeldatavenda.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabeldatavenda.setText("DATA DA VENDA:");
        jPanel6.add(jLabeldatavenda);
        jLabeldatavenda.setBounds(660, 10, 220, 29);

        campvalorPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campvalorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campvalorPagoKeyReleased(evt);
            }
        });
        jPanel6.add(campvalorPago);
        campvalorPago.setBounds(320, 70, 300, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("VALOR DO PAGAMENTO:");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(20, 80, 300, 30);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 12, 244));
        jLabel7.setText("ACRESCIMO:");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(20, 130, 170, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("%");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(310, 170, 30, 30);

        camp_desconto.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_desconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_descontoKeyReleased(evt);
            }
        });
        jPanel6.add(camp_desconto);
        camp_desconto.setBounds(180, 160, 120, 40);

        camptotal.setEditable(false);
        camptotal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        camptotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel6.add(camptotal);
        camptotal.setBounds(320, 20, 220, 40);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setText("TOTAL A RECEBER:");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(20, 30, 240, 30);

        camp_Acrescimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel6.add(camp_Acrescimo);
        camp_Acrescimo.setBounds(180, 116, 120, 40);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 9, 0));
        jLabel12.setText("DESCONTO:");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(20, 170, 170, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(10, 130, 1100, 320);

        add(jPanel1);
        jPanel1.setBounds(10, 90, 1120, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBOX_FormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBOX_FormaPagamentoActionPerformed
        if (comboBOX_FormaPagamento.getSelectedIndex() == 5) {
            camp_qtdeParcelas.setVisible(true);
            camp_qtdeParcelas.setText("1");
            geraParcela();
            valorTotal();
            camp_desconto.setEnabled(false);
            camp_desconto.setText("0");
            camp_valorParcelas.setVisible(true);
            jListdatasparceladas.setVisible(true);
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() <= 2) {
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            camp_desconto.setEnabled(true);
            valorTotal();
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() == 3) {
            jLabeldatavenda.setText("DATA DO PAGAMENTO:");
            valorTotal();
            campvalorPago.setText("0,00");
            camp_desconto.setEnabled(false);
            camp_desconto.setText("0");
            campvalorPago.setEnabled(false);
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            campTroco.setText("0.0");
            jListdatasparceladas.setVisible(false);
        }
        if (comboBOX_FormaPagamento.getSelectedIndex() == 4) {
            camp_qtdeParcelas.setVisible(false);
            camp_valorParcelas.setVisible(false);
            jListdatasparceladas.setVisible(false);
            camp_desconto.setEnabled(true);
            valorTotal();
            jLabeldatavenda.setText("DATA DA VENDA:");
            campvalorPago.setEnabled(true);
        }
    }//GEN-LAST:event_comboBOX_FormaPagamentoActionPerformed

    private void campvalorPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campvalorPagoKeyReleased

        try {
            int qtdeParce = Integer.parseInt(camp_qtdeParcelas.getText());
            double total = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", ".").trim());
            double valorEntrada = Double.parseDouble(campvalorPago.getText().replace(",", ".").replace(",", ".").trim());
            DecimalFormat dinheiro = new DecimalFormat("0.00");

            double valorRestante = total - valorEntrada;
            if (valorRestante > 0) {
                jTextField1.setText("FALTA PAGAR ...........");
            } else if (valorRestante < 0) {
                jTextField1.setText("TROCO ..............");
            }

            double valorParcela = valorRestante / qtdeParce; // valor da parcela;
            camp_valorParcelas.setText("" + dinheiro.format(valorParcela));
            campTroco.setText(String.valueOf(dinheiro.format(valorRestante)));
            //----------------------------------------------------------------------------
            // gera as datas da parcela;
            GregorianCalendar gc = new GregorianCalendar();
            Date diaAtual = dataVenda.getDate();
            DefaultListModel datasparcelas = new DefaultListModel();
            for (int i = 0; i < Integer.parseInt(camp_qtdeParcelas.getText()); i++) {
                gc.setTime(diaAtual);
                gc.roll(GregorianCalendar.MONTH, i + 1);
                Date d = gc.getTime();

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                datasparcelas.addElement(df.format(d));
                jListdatasparceladas.setModel(datasparcelas);
            }
        } catch (Exception e) {
            System.out.println("Campo quantidade parcelas deve ser digitado apenas numeros;");
        }
    }//GEN-LAST:event_campvalorPagoKeyReleased

    private void btn_finalizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarvendaActionPerformed

        try {
            int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja <html><font color=\"#FF0000\">*FINALIZAR A VENDA*?</font></html></html>", "FINALIZAR A VENDA", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                if (campvalorPago.getText().length() > 0 & !dataVenda.getDate().equals("") & lista.size() > 0 & comboBOX_FormaPagamento.getSelectedIndex() <= 2) {
                    cartaoVenda();
                } else if (comboBOX_FormaPagamento.getSelectedIndex() == 5 & camp_qtdeParcelas.getText().length() > 0 & lista.size() > 0) {
                    vendaParcelada();
                } else if (comboBOX_FormaPagamento.getSelectedIndex() == 3 & lista.size() > 0) {
                    vendaAprazo();
                } else if (campvalorPago.getText().length() > 0 & !dataVenda.getDate().equals("") & lista.size() > 0 & comboBOX_FormaPagamento.getSelectedIndex() == 4) {
                    transferenciaVenda();
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha os Campos relevantes a Forma de Pagamento!");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Preencha os Campos relevantes!");
        }
    }//GEN-LAST:event_btn_finalizarvendaActionPerformed

    private void btn_cancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarVendaActionPerformed
        lista.clear();
        Cliente client = new Cliente();
        DefaultListModel datasparcelas = new DefaultListModel();
        jListdatasparceladas.setModel(datasparcelas);
        camp_valorParcelas.setText("0,00");
        camp_qtdeParcelas.setVisible(false);
        camp_valorParcelas.setVisible(false);
        jListdatasparceladas.setVisible(false);
        TelaVenda.setCliente(client);
        telaVenda.adicionarItens();
        telaVenda.btn_buscarProduto.setText("");
        camp_cliente.setText("");
        telaVenda.field_preco.setText("0,00");
        telaVenda.field_qnt.setText("0");

        jDesktopPane1.removeAll();
        s.setLocation(0, 0);
        s.setSize(1140, 650);
        s.setVisible(true);
        jDesktopPane1.add(s);
    }//GEN-LAST:event_btn_cancelarVendaActionPerformed

    private void camp_qtdeParcelasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_qtdeParcelasKeyReleased
        try {
            int qtdeParce = Integer.parseInt(camp_qtdeParcelas.getText());
            double total = Double.parseDouble(camptotal.getText().replace("R$", ""));
            double valorEntrada = Double.parseDouble(campvalorPago.getText().replace(",", "."));

            DecimalFormat decimal = new DecimalFormat("0.00");
            double valorRestante = total - valorEntrada;
            double valorParcela = valorRestante / qtdeParce; // valor da parcela;
            camp_valorParcelas.setText("" + decimal.format(valorParcela));
            //----------------------------------------------------------------------------
            // gera as datas da parcela;
            GregorianCalendar gc = new GregorianCalendar();
            Date diaAtual = dataVenda.getDate();
            DefaultListModel datasparcelas = new DefaultListModel();
            for (int i = 0; i < Integer.parseInt(camp_qtdeParcelas.getText()); i++) {
                gc.setTime(diaAtual);
                gc.roll(GregorianCalendar.MONTH, i + 1);
                Date d = gc.getTime();

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                datasparcelas.addElement(df.format(d));
                jListdatasparceladas.setModel(datasparcelas);
            }
        } catch (Exception e) {
            System.out.println("Campo quantidade parcelas deve ser digitado apenas numeros;");
        }
    }//GEN-LAST:event_camp_qtdeParcelasKeyReleased

    private void camp_descontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_descontoKeyReleased
        try {
            DecimalFormat valor = new DecimalFormat("0.00");
            Integer variavel = Integer.parseInt(camp_desconto.getText());
            double valortotal = Double.parseDouble(jLabelValorTotal.getText().replace("R$", "").replace(",", ".").trim());
            double resultado = venda.calcularDesconto(variavel, valortotal);
            campvalorPago.setText("" + valor.format(resultado));
            camptotal.setText("R$ " + valor.format(resultado));

            double valorTotal = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", ".").trim());
            double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", ".").replace(",", ".").trim());
            double troco = valorPago - valorTotal;
            campTroco.setText(String.valueOf(troco));
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_camp_descontoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarVenda;
    private javax.swing.JButton btn_finalizarvenda;
    private javax.swing.JTextField campTroco;
    public javax.swing.JFormattedTextField camp_Acrescimo;
    public static javax.swing.JTextField camp_cliente;
    public javax.swing.JTextField camp_desconto;
    public static javax.swing.JTextField camp_qtdeParcelas;
    public javax.swing.JTextField camp_valorParcelas;
    private javax.swing.JTextField camptotal;
    public javax.swing.JFormattedTextField campvalorPago;
    private javax.swing.JComboBox<String> comboBOX_FormaPagamento;
    public com.toedter.calendar.JDateChooser dataVenda;
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
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelQuantidadeItens;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabeldatavenda;
    private javax.swing.JList<String> jListdatasparceladas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
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
        DecimalFormat valor = new DecimalFormat("0.00");

        camptotal.setText("R$ " + z);
        jLabelValorTotal.setText("R$ " + valor.format(z));
        campvalorPago.setText("" + z);
        camp_desconto.setText("0");
        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valorPago - valortotal;
        campTroco.setText(String.valueOf(troco));

    }

    private void cartaoVenda() {
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                Caixa caixa = new Caixa();
                double valortotal = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", "."));
                double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", ".").replace(",", "."));
                double troco = valortotal - valorPago;

                if (!camp_desconto.getText().isEmpty() && !camp_Acrescimo.getText().isEmpty()) {
                    venda.setStatus(true);
                    venda.setDataVenda(dataVenda.getDate()); // data da venda
                    venda.setAcrescimo(Double.parseDouble(camp_Acrescimo.getText().replace(",", ".")));
                    venda.setDesconto(Float.parseFloat(camp_desconto.getText()));
                    venda.setValorTotal(valortotal + Double.parseDouble(camp_Acrescimo.getText().replace(",", "."))); // valor total da venda
                    venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor que foi pago na venda;
                    venda.setTroco(troco); // troco da venda;
                    venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));// pega a forma de pagamento da venda;
                    venda.setDescricao(observacaoVenda);
                    venda.setEstado(Estado.PAGO);

                    if (camp_cliente.getText().length() > 0) {
                        System.out.println("Cliente: " + client.getNome());
                        venda.setCliente(client); // adiciona o cliente na venda;
                        client.getVendas().add(venda); // adiciona a venda na lista de vendas do cliente;
                        bancoMariaDB.save_update(client);
                    } else {
                        Cliente consumidor = bancoMariaDB.list_Cliente().get(0);
                        System.out.println("Cliente: " + consumidor.getNome());
                        venda.setCliente(consumidor); // adiciona o cliente na venda;
                        consumidor.getVendas().add(venda); // adiciona a venda na lista de vendas do cliente;
                        bancoMariaDB.save_update(consumidor);
                    }

                    venda.adicionarItens(lista, venda); // salva os itens da venda;
                    caixa.setVenda(venda);
                    caixa.setEntradaDinheiro(venda.getValorTotal());
                    caixa.setData(venda.getDataVenda());
                    bancoMariaDB.save(caixa);
                    
                    // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
                    for (int i = 0;
                            i < bancoMariaDB.productBook()
                                    .size(); i++) {
                        for (Produto produto : lista) {
                            if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                                Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                                int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;

                                item.setQnt(qnt_Atualizada); // adicionar a subtração;
                                bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;
                                double totalValor = item.getQnt() * item.getValor_venda();
                                item.setValor_total(totalValor);
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
                    jListdatasparceladas.setVisible(false);
                    telaVenda.adicionarItens();

                    Cliente client = new Cliente();
                    TelaVenda.setCliente(client); // limpa o objeto cliente;
                    telaVenda.camp_buscarProduto.setText("");
                    telaVenda.field_preco.setText("0,00");
                    telaVenda.field_qnt.setText("0");
                    JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");
                    TelaVenda s = new TelaVenda();

                    jDesktopPane1.removeAll();
                    s.setLocation(0, 0);
                    s.setSize(1140, 650);
                    s.setVisible(true);
                    jDesktopPane1.add(s);

                } else {
                    JOptionPane.showMessageDialog(null, "Campo Desconto da Venda e Acrescimo não pode ficar em branco!", "ATENÇÂO" , HEIGHT);
                }
                carregando.dispose();
            }

        };
        t.start();
    }

    private void transferenciaVenda() {
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                Caixa caixa = new Caixa();
                double valortotal = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", "."));
                double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", ".").replace(",", "."));
                double troco = valortotal - valorPago;

                if (!camp_desconto.getText().isEmpty() && !camp_Acrescimo.getText().isEmpty()) {
                    venda.setStatus(true);
                    venda.setDataVenda(dataVenda.getDate()); // data da venda
                    venda.setAcrescimo(Double.parseDouble(camp_Acrescimo.getText().replace(",", ".")));
                    venda.setDesconto(Float.parseFloat(camp_desconto.getText()));
                    venda.setValorTotal(valortotal + Double.parseDouble(camp_Acrescimo.getText().replace(",", "."))); // valor total da venda
                    venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor que foi pago na venda;
                    venda.setTroco(troco); // troco da venda;
                    venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));// pega a forma de pagamento da venda;
                    venda.setDescricao(observacaoVenda);
                    venda.setEstado(Estado.PAGO);

                    if (camp_cliente.getText().length() > 0) {
                        System.out.println("Cliente: " + client.getNome());
                        venda.setCliente(client); // adiciona o cliente na venda;
                        client.getVendas().add(venda); // adiciona a venda na lista de vendas do cliente;
                        bancoMariaDB.save_update(client);
                    } else {
                        Cliente consumidor = bancoMariaDB.list_Cliente().get(0);
                        System.out.println("Cliente: " + consumidor.getNome());
                        venda.setCliente(consumidor); // adiciona o cliente na venda;
                        consumidor.getVendas().add(venda); // adiciona a venda na lista de vendas do cliente;
                        bancoMariaDB.save_update(consumidor);
                    }

                    venda.adicionarItens(lista, venda); // salva os itens da venda;
                    caixa.setVenda(venda);
                    caixa.setEntradaDinheiro(venda.getValorTotal());
                    caixa.setData(venda.getDataVenda());
                    bancoMariaDB.save(caixa);
                    
                    // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
                    for (int i = 0;
                            i < bancoMariaDB.productBook()
                                    .size(); i++) {
                        for (Produto produto : lista) {
                            if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                                Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                                int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;

                                item.setQnt(qnt_Atualizada); // adicionar a subtração;
                                bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;
                                double totalValor = item.getQnt() * item.getValor_venda();
                                item.setValor_total(totalValor);
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
                    jListdatasparceladas.setVisible(false);
                    telaVenda.adicionarItens();

                    Cliente client = new Cliente();
                    TelaVenda.setCliente(client); // limpa o objeto cliente;
                    telaVenda.camp_buscarProduto.setText("");
                    telaVenda.field_preco.setText("0,00");
                    telaVenda.field_qnt.setText("0");
                    JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");
                    TelaVenda s = new TelaVenda();

                    jDesktopPane1.removeAll();
                    s.setLocation(0, 0);
                    s.setSize(1140, 650);
                    s.setVisible(true);
                    jDesktopPane1.add(s);

                } else {
                    JOptionPane.showMessageDialog(null, "Campo Desconto da Venda e Acrescimo não pode ficar em branco!", "ATENÇÂO" , HEIGHT);
                }
                carregando.dispose();
            }

        };
        t.start();
    }

    public void vendaParcelada() {
        
        Caixa caixa = new Caixa();
        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", "."));
        double valorEntrada = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double valorRestante = valortotal - valorEntrada;
        double parcela = valorRestante / Integer.parseInt(camp_qtdeParcelas.getText()); // valor da parcela;

        venda.setStatus(true);
        venda.setDataVenda(dataVenda.getDate()); // data da venda
        venda.setAcrescimo(Double.parseDouble(camp_Acrescimo.getText().replace(",", ".")));
        venda.setDesconto(Float.parseFloat(camp_desconto.getText()));
        venda.setValorTotal(valortotal + Double.parseDouble(camp_Acrescimo.getText().replace(",", "."))); // valor total da venda
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor pago na venda;
        venda.setTroco(valorRestante);
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));
        venda.setDescricao(this.observacaoVenda);
        venda.setEstado(Estado.PENDENTE);
        venda.setDesconto(Float.parseFloat(camp_desconto.getText().replace("R$", "").trim()));

        if (camp_cliente.getText().length() > 0 & !camp_cliente.getText().equals("CONSUMIDOR")) {

            // se o valor do textfield está vazia ou for zero;
            if (camp_qtdeParcelas.getText().isEmpty() || camp_qtdeParcelas.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Por favor, digite a quantidade de parcelas!", "ATENÇÃO!!", HEIGHT);
            } else {
                venda.setCliente(client); // adiciona o cliente na venda;
                client.getVendas().add(venda); // adiciona a venda na lista de cliente;
                System.out.println("Cliente: " + client.getNome());
                bancoMariaDB.save_update(client);
                venda.adicionarItens(lista, venda);// salva os itens da venda;
                venda.gerarParcelas(Integer.parseInt(camp_qtdeParcelas.getText()), venda, parcela);

                caixa.setVenda(venda);
                caixa.setEntradaDinheiro(venda.getValorTotal());
                caixa.setData(venda.getDataVenda());
                bancoMariaDB.save(caixa);

                // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
                for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                    for (Produto produto : lista) {
                        if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                            Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                            int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;
                            item.setQnt(qnt_Atualizada); // adicionar a subtração;
                            bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;
                            double totalValor = item.getQnt() * item.getValor_venda();
                            item.setValor_total(totalValor);
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
                jListdatasparceladas.setVisible(false);
                Cliente client = new Cliente();
                TelaVenda.setCliente(client); // limpa o objeto cliente;
                telaVenda.adicionarItens();
                telaVenda.camp_buscarProduto.setText("");
                telaVenda.field_preco.setText("0,00");
                telaVenda.field_qnt.setText("0");
                JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");

                TelaVenda s = new TelaVenda();
                jDesktopPane1.removeAll();
                s.setLocation(0, 0);
                s.setSize(1140, 650);
                s.setVisible(true);
                jDesktopPane1.add(s);
            }

        } else {
            JOptionPane.showMessageDialog(null, "ATENÇÃO vendas Parceladas precisa de um cliente cadastrado.", "ATENÇÃO!!", HEIGHT);
        }
    }

    public void vendaAprazo() {
        Caixa caixa = new Caixa();
        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", "").replace(",", "."));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valortotal - valorPago;

        venda.setStatus(true);
        venda.setDataVenda(new Date()); // data da venda
        venda.setAcrescimo(Double.parseDouble(camp_Acrescimo.getText().replace(",", ".")));
        venda.setDesconto(Float.parseFloat(camp_desconto.getText()));
        venda.setValorTotal(valortotal + Double.parseDouble(camp_Acrescimo.getText().replace(",", ".")));// valor total da venda
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", "."))); // valor pago na venda;
        venda.setTroco(troco);
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));
        venda.setDescricao(this.observacaoVenda);
        venda.setEstado(Estado.PENDENTE);
        venda.setDesconto(Float.parseFloat(camp_desconto.getText().replace("R$", "").trim()));

        if (camp_cliente.getText().length() > 0 & !camp_cliente.getText().equals("CONSUMIDOR")) {
            venda.setCliente(client); // adiciona o cliente na venda;
            client.getVendas().add(venda); // adiciona a venda na lista de cliente;
            bancoMariaDB.save_update(client);

            venda.adicionarItens(lista, venda); // salva os itens da venda;
            venda.gerarParcelasAprazo(1, venda, valortotal, dataVenda.getDate());

            caixa.setVenda(venda);
            caixa.setEntradaDinheiro(venda.getValorTotal());
            caixa.setData(venda.getDataVenda());
            bancoMariaDB.save(caixa);
            
            // ATUALIZAR O ESTOQUE DE PRODUTO NO BANCO DE DADOS
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                for (Produto produto : lista) {
                    if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {
                        Produto item = bancoMariaDB.productBook().get(i); // pega o produto do banco de dados
                        int qnt_Atualizada = item.getQnt() - produto.getQnt(); // subtrair a quantidade do produto que foi vendido;
                        item.setQnt(qnt_Atualizada); // adicionar a subtração;
                        bancoMariaDB.update(item); // atualiza a quantidade do produto no banco;
                        double totalValor = item.getQnt() * item.getValor_venda();
                        item.setValor_total(totalValor);
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
            jListdatasparceladas.setVisible(false);
            Cliente client = new Cliente();
            TelaVenda.setCliente(client); // limpa o objeto cliente;
            telaVenda.adicionarItens();
            telaVenda.camp_buscarProduto.setText("");
            telaVenda.field_preco.setText("0,00");
            telaVenda.field_qnt.setText("0");
            JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!");

            TelaVenda s = new TelaVenda();
            jDesktopPane1.removeAll();
            s.setLocation(0, 0);
            s.setSize(1140, 650);
            s.setVisible(true);
            jDesktopPane1.add(s);
        } else {
            JOptionPane.showMessageDialog(null, "ATENÇÃO vendas A PRAZO precisa de um cliente cadastrado.", "ATENÇÃO!!", HEIGHT);
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

    public void geraParcela() {
        try {
            int qtdeParce = Integer.parseInt(camp_qtdeParcelas.getText());
            double total = Double.parseDouble(camptotal.getText().replace("R$", ""));
            double valorEntrada = Double.parseDouble(campvalorPago.getText().replace(",", "."));

            double valorRestante = total - valorEntrada;
            double valorParcela = valorRestante / qtdeParce; // valor da parcela;
            camp_valorParcelas.setText("" + valorParcela);
//----------------------------------------------------------------------------
            // gera as datas da parcela;
            GregorianCalendar gc = new GregorianCalendar();
            Date diaAtual = dataVenda.getDate();
            DefaultListModel datasparcelas = new DefaultListModel();
            for (int i = 0; i < Integer.parseInt(camp_qtdeParcelas.getText()); i++) {
                gc.setTime(diaAtual);
                gc.roll(GregorianCalendar.MONTH, i + 1);
                Date d = gc.getTime();

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                datasparcelas.addElement(df.format(d));
                jListdatasparceladas.setModel(datasparcelas);
            }
        } catch (Exception e) {
            System.out.println("Campo quantidade parcelas deve ser digitado apenas numeros;");
        }

    }
}
