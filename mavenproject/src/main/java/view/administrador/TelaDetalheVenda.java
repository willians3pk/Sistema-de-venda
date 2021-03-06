/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.administrador;

import util.TableRendererAPrazo;
import model.dao.Conexao;
import java.awt.Color;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Estado;
import model.FormaPagamento;
import model.ItensVenda;
import model.Parcelas;
import model.Venda;
import static view.MainScreen.jDesktopPane1;

/**
 *
 * @author user
 */
public class TelaDetalheVenda extends javax.swing.JPanel {

    public Venda venda;
    Conexao connectbanco = new Conexao();

    public TelaDetalheVenda() {
        initComponents();
        checkbox.setVisible(false);

        TableColumn colCodigo = jtableVenda.getColumnModel().getColumn(0);
        TableColumn colNome = jtableVenda.getColumnModel().getColumn(1);
        TableColumn colCor = jtableVenda.getColumnModel().getColumn(2);
        TableColumn calQtde = jtableVenda.getColumnModel().getColumn(3);
        TableColumn colCategoria = jtableVenda.getColumnModel().getColumn(4);
        TableColumn colTotal = jtableVenda.getColumnModel().getColumn(5);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(280);
        colCor.setPreferredWidth(50);
        calQtde.setPreferredWidth(5);
        colCategoria.setPreferredWidth(45);
        colTotal.setPreferredWidth(5);

        TableColumn colData = tableAPrazo.getColumnModel().getColumn(0);
        TableColumn colValor = tableAPrazo.getColumnModel().getColumn(1);
        TableColumn colStatus = tableAPrazo.getColumnModel().getColumn(2);

        colData.setPreferredWidth(50);
        colValor.setPreferredWidth(10);
        colStatus.setPreferredWidth(5);

    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        jLabel6 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        jlabelValorPago = new javax.swing.JLabel();
        camp_CodigoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkbox = new javax.swing.JCheckBox();
        btn_receber = new javax.swing.JButton();
        btn_removerItem = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        camp_desconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        camp_acrescimo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        estadoVenda = new javax.swing.JTextField();
        camp_parcelasRestantes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        camp_totalvenda = new javax.swing.JFormattedTextField();
        camp_valorentrada = new javax.swing.JFormattedTextField();
        comboxFormaPagmento = new javax.swing.JComboBox<>();
        jComboBoxEstadoVenda = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxAtivarVenda = new javax.swing.JCheckBox();

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo:", "Nome:", "Cor:", "Qtde:", "Categoria:", "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableVenda.setEnabled(false);
        jScrollPane1.setViewportView(jtableVenda);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 740, 110);

        tableAPrazo.setForeground(new java.awt.Color(33, 33, 30));
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

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(800, 10, 280, 110);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(770, 10, 10, 120);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 310, 1100, 150);

        camp_observacao.setColumns(20);
        camp_observacao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
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
        jSeparator2.setBounds(20, 300, 1100, 10);

        jLabel6.setText("Total da Venda:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 20, 100, 16);

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Left-48.png"))); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_voltar);
        btn_voltar.setBounds(1060, 10, 60, 30);

        jlabelValorPago.setText("Valor pago:");
        jPanel1.add(jlabelValorPago);
        jlabelValorPago.setBounds(320, 210, 90, 16);

        camp_CodigoCliente.setEditable(false);
        jPanel1.add(camp_CodigoCliente);
        camp_CodigoCliente.setBounds(720, 160, 80, 30);

        jLabel8.setText("Codigo Cliente:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(720, 140, 110, 16);

        checkbox.setText("Receber Parcela:");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox);
        checkbox.setBounds(820, 270, 140, 22);

        btn_receber.setText("Receber");
        btn_receber.setEnabled(false);
        btn_receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_receberActionPerformed(evt);
            }
        });
        jPanel1.add(btn_receber);
        btn_receber.setBounds(1020, 260, 80, 30);

        btn_removerItem.setText("Remover Item");
        btn_removerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerItemActionPerformed(evt);
            }
        });
        jPanel1.add(btn_removerItem);
        btn_removerItem.setBounds(660, 460, 130, 30);

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salvar);
        btn_salvar.setBounds(1040, 600, 80, 30);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(20, 120, 1100, 10);
        jPanel1.add(camp_desconto);
        camp_desconto.setBounds(440, 230, 70, 30);

        jLabel7.setText("Desconto:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 210, 80, 16);
        jPanel1.add(camp_acrescimo);
        camp_acrescimo.setBounds(530, 230, 70, 30);

        jLabel10.setText("Acrescimo:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(530, 210, 70, 16);

        estadoVenda.setEditable(false);
        estadoVenda.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        estadoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(estadoVenda);
        estadoVenda.setBounds(20, 90, 1100, 30);

        camp_parcelasRestantes.setEditable(false);
        camp_parcelasRestantes.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(camp_parcelasRestantes);
        camp_parcelasRestantes.setBounds(1000, 480, 120, 30);

        jLabel11.setText("Parcelas Restantes:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1000, 460, 130, 20);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADMINISTRADOR");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 30, 570, 40);

        camp_totalvenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(camp_totalvenda);
        camp_totalvenda.setBounds(320, 40, 90, 30);

        camp_valorentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel1.add(camp_valorentrada);
        camp_valorentrada.setBounds(320, 230, 90, 30);

        comboxFormaPagmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxFormaPagmentoActionPerformed(evt);
            }
        });
        jPanel1.add(comboxFormaPagmento);
        comboxFormaPagmento.setBounds(20, 230, 260, 30);

        jPanel1.add(jComboBoxEstadoVenda);
        jComboBoxEstadoVenda.setBounds(950, 160, 160, 30);

        jLabel12.setText("Estado:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(950, 140, 80, 16);

        jCheckBoxAtivarVenda.setText("Ativar/Cancelar:");
        jCheckBoxAtivarVenda.setEnabled(false);
        jPanel1.add(jCheckBoxAtivarVenda);
        jCheckBoxAtivarVenda.setBounds(950, 200, 130, 22);

        add(jPanel1);
        jPanel1.setBounds(6, 5, 1130, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaEditarVenda TH = new TelaEditarVenda();
        jDesktopPane1.removeAll();
        TH.setLocation(0, 0);
        TH.setSize(1140, 650);
        TH.setVisible(true);
        TH.carregarTabelaVendas();
        jDesktopPane1.add(TH);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        if (checkbox.isSelected()) {
            tableAPrazo.setEnabled(true);
            btn_receber.setEnabled(true);
        } else {
            tableAPrazo.setEnabled(false);
            btn_receber.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxActionPerformed

    private void btn_receberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_receberActionPerformed

        try {
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            int row = tableAPrazo.getSelectedRow();
            int confirmacao = JOptionPane.showInternalConfirmDialog(null, "Você deseja dar Baixa na PARCELA " + data.format(venda.getParcelas().get(row).getData()) + "?", "DAR BAIXA NA PARCELA", JOptionPane.YES_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                Conexao banco = new Conexao();
                venda.getParcelas().get(row).setPago(Estado.PAGO);
                btn_receber.setEnabled(false);
                checkbox.setSelected(false);
                tableAPrazo.setEnabled(false);

                // o comando abaixo impede de deixar todas as parcelas com Estado PAGO
                for (Parcelas parcela : venda.getParcelas()) {
                    if (parcela.getPago().equals(Estado.PAGO)) {
                        venda.setEstado(Estado.PAGO);
                        banco.update(venda);
                    }
                    if (parcela.getPago().equals(Estado.PENDENTE)) {
                        venda.setEstado(Estado.PENDENTE);
                        banco.update(venda);
                    }
                }

                carregarCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione uma Parcela! \n" + e);
        }
    }//GEN-LAST:event_btn_receberActionPerformed

    private void btn_removerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerItemActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) jtableVenda.getModel();
        Conexao banco = new Conexao();
        try {
            int confirmacao = JOptionPane.showInternalConfirmDialog(null, "Você tem certeza que deseja remover esse item?", "REMOVER ITEM", JOptionPane.YES_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                int row = jtableVenda.getSelectedRow();
                for (ItensVenda iten : venda.getItens()) {
                    System.out.println(iten.getIditensVenda() + " " + iten.getItems().getNome());
                    if (iten.getIditensVenda().equals(tabela.getValueAt(row, 0))) {
                        venda.getItens().remove(iten);
                        banco.update(venda);
                        carregarCampos();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione o Item que deseja remover! \n" + e);
        }
    }//GEN-LAST:event_btn_removerItemActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        Conexao banco = new Conexao();
        int confirmacao = JOptionPane.showInternalConfirmDialog(null, "Você deseja salvar as auterações da venda?", "SALVAR ALTERAÇÃO", JOptionPane.YES_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            venda.setValorTotal(Double.parseDouble(camp_totalvenda.getText().replace("R$", "").replace(",", ".").trim())); // valor total
            venda.setValor_pago(Double.parseDouble(camp_valorentrada.getText().replace("R$", "").replace(",", ".").trim()));// valor pago
            venda.setDesconto(Float.parseFloat(camp_desconto.getText().replace("%", "").replace(".", "")));
            venda.setAcrescimo(Double.parseDouble(camp_acrescimo.getText().replace("R$", "").replace(",", ".").trim()));

            FormaPagamento formapagamento;
            int posicao = comboxFormaPagmento.getSelectedIndex();
            formapagamento = connectbanco.listFormPagamento().get(posicao);

            if (jComboBoxEstadoVenda.getSelectedItem().toString().equals("CANCELADO")) {
                venda.setEstado(Estado.CANCELADO);
            } else if (jComboBoxEstadoVenda.getSelectedItem().toString().equals("PENDENTE")) {
                venda.setEstado(Estado.PENDENTE);
            } else {
                venda.setEstado(Estado.PAGO);
            }

            venda.getFormaPagamento().clear();
            venda.getFormaPagamento().add(formapagamento);
            venda.setDescricao(camp_observacao.getText());
            venda.setStatus(jCheckBoxAtivarVenda.isSelected());

            for (Parcelas parcela : venda.getParcelas()) {
                parcela.setStatus(true);
            }

            banco.update(venda);

            carregarCampos();
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void comboxFormaPagmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxFormaPagmentoActionPerformed
        camp_formaPagamento.setText(comboxFormaPagmento.getSelectedItem().toString());
    }//GEN-LAST:event_comboxFormaPagmentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_receber;
    private javax.swing.JButton btn_removerItem;
    private javax.swing.JButton btn_salvar;
    public javax.swing.JButton btn_voltar;
    private javax.swing.JTextField camp_CodigoCliente;
    private javax.swing.JTextField camp_acrescimo;
    private javax.swing.JTextField camp_codigovenda;
    private javax.swing.JFormattedTextField camp_datavenda;
    private javax.swing.JTextField camp_desconto;
    private javax.swing.JTextField camp_formaPagamento;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JTextArea camp_observacao;
    private javax.swing.JTextField camp_parcelasRestantes;
    private javax.swing.JFormattedTextField camp_totalvenda;
    private javax.swing.JFormattedTextField camp_valorentrada;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JComboBox<String> comboxFormaPagmento;
    private javax.swing.JTextField estadoVenda;
    private javax.swing.JCheckBox jCheckBoxAtivarVenda;
    private javax.swing.JComboBox<String> jComboBoxEstadoVenda;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlabelValorPago;
    private javax.swing.JTable jtableVenda;
    private javax.swing.JTable tableAPrazo;
    // End of variables declaration//GEN-END:variables

    public void carregarCampos() {

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        for (FormaPagamento formapagamento : connectbanco.listFormPagamento()) {
            comboBox.addElement(formapagamento.getDescricao());
            comboxFormaPagmento.setModel(comboBox);
        }

        List<Estado> arrayList = new ArrayList<Estado>();
        arrayList.add(Estado.CANCELADO);
        arrayList.add(Estado.PAGO);
        arrayList.add(Estado.PENDENTE);

        DefaultComboBoxModel comboBox1 = new DefaultComboBoxModel();
        for (Estado estado : arrayList) {
            comboBox1.addElement(estado.getDescricao());
            jComboBoxEstadoVenda.setModel(comboBox1);
        }

        if (jComboBoxEstadoVenda.getSelectedItem() == (venda.getEstado().getDescricao())) {
            jComboBoxEstadoVenda.setSelectedItem(venda.getEstado().getDescricao());
        } else {
            jComboBoxEstadoVenda.setSelectedItem(venda.getEstado().getDescricao());
        }

        if (venda.isStatus()) {
            jCheckBoxAtivarVenda.setSelected(true);
        } else {
            jCheckBoxAtivarVenda.setSelected(false);
        }

        camp_codigovenda.setText(venda.getIdvenda() + ""); // codigo da venda;
        camp_datavenda.setText(data.format(venda.getDataVenda()) + ""); // data da venda
        camp_totalvenda.setText(venda.getValorTotal() + ""); // valor total da venda;
        camp_nome.setText(venda.getCliente().getNome()); // nome do cliente
        camp_observacao.setText(venda.getDescricao()); // descrição da venda;
        camp_formaPagamento.setText(venda.FormaPagamento()); // forma de pagamento da venda;
        camp_CodigoCliente.setText(venda.getCliente().getIdpessoa() + "");
        camp_desconto.setText(venda.getDesconto() + "%");
        camp_acrescimo.setText("" + venda.getAcrescimo());
        estadoVenda.setText(venda.getEstado().getDescricao());
        camp_valorentrada.setText("" + venda.getValor_pago());

        // a linha abaixo seleciona na combobox a forma de pagamento da venda;
        if (comboxFormaPagmento.getSelectedItem() == (venda.FormaPagamento())) {
            comboxFormaPagmento.setSelectedItem(venda.FormaPagamento().toString());
        } else {
            comboxFormaPagmento.setSelectedItem(venda.FormaPagamento());
        }

        if (venda.getEstado().getDescricao().equals("PENDENTE")) {
            estadoVenda.setBackground(Color.red);
        } else if (venda.getEstado().getDescricao().equals("CANCELADO")) {
            estadoVenda.setBackground(Color.YELLOW);
        } else {
            estadoVenda.setBackground(Color.green);
        }

        DefaultTableModel tabelavenda = (DefaultTableModel) jtableVenda.getModel();
        tabelavenda.setNumRows(0);

        for (ItensVenda iten : venda.listaItens()) {
            tabelavenda.addRow(new Object[]{
                iten.getIditensVenda(),
                iten.getItems().getNome(),
                iten.getItems().getCor(),
                iten.getQnt(),
                iten.getItems().getCategoria(),
                dinheiro.format(iten.valortotal())
            });
        }

        if (venda.FormaPagamento().equals("A PRAZO")) {
            DefaultTableModel tabelaAprazo = (DefaultTableModel) tableAPrazo.getModel();
            jlabelValorPago.setText("Valor Pago:");
            camp_valorentrada.setText("" + venda.getValor_pago()); // valor da entrada;
            checkbox.setVisible(true);
            btn_receber.setVisible(true);
            tabelaAprazo.setNumRows(0);
            for (Parcelas parcela : venda.listaParcelas()) {
                tabelaAprazo.addRow(new Object[]{
                    data.format(parcela.getData()),
                    dinheiro.format(parcela.getValor()),
                    parcela.getPago()
                });
            }
            tableAPrazo.setDefaultRenderer(Object.class, new TableRendererAPrazo());

        }

        double x = 0;
        double y = 0;
        double ParcelasRestantes = 0;

        if (venda.FormaPagamento().equals("PARCELADO")) {
            DefaultTableModel tabelaParcelado = (DefaultTableModel) tableAPrazo.getModel();
            jlabelValorPago.setText("Valor Entrada:");
            camp_valorentrada.setText("" + venda.getValor_pago()); // valor da entrada;
            checkbox.setVisible(true);
            btn_receber.setVisible(true);

            tabelaParcelado.setNumRows(0);
            for (Parcelas parcela : venda.listaParcelas()) {
                if (parcela.isStatus()) {
                    tabelaParcelado.addRow(new Object[]{
                        data.format(parcela.getData()),
                        dinheiro.format(parcela.getValor()),
                        parcela.getPago()
                    });
                }
                if (parcela.getPago().getDescricao().equals("PENDENTE")) {
                    x = parcela.getValor();
                    y = ParcelasRestantes + x;
                    ParcelasRestantes = y;
                }

            }

            DecimalFormat decimal = new DecimalFormat("0.00");
            tableAPrazo.setDefaultRenderer(Object.class, new TableRendererAPrazo());
            camp_parcelasRestantes.setText("R$ " + decimal.format(ParcelasRestantes));
        } else {
            jlabelValorPago.setText("Valor Pago:");
        }
    }

}
