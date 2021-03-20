/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import service.CaixaService;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import model.Despesa;
import model.Log;
import model.dao.LogDAO;
import service.DespesaService;

/**
 *
 * @author user
 */
public class TelaMovimentacao extends javax.swing.JPanel {

    /**
     * Creates new form Caixa
     */
    public TelaMovimentacao() {
        initComponents();
        botoesDevolucao(true, false, false);
        botoesDespesas(true, false, false);
        habilitarCamposDespesas(false, false, false, false, false, false);
        habilitaCamposDevolucao(false, false, false);
        
        // ajusta tamanho das colunas da tabela;
        TableColumn colCodigo = jTable1Despesas.getColumnModel().getColumn(0);
        TableColumn colData = jTable1Despesas.getColumnModel().getColumn(1);
        TableColumn colValor = jTable1Despesas.getColumnModel().getColumn(2);
        TableColumn colTipo = jTable1Despesas.getColumnModel().getColumn(3);
        TableColumn colDescricao = jTable1Despesas.getColumnModel().getColumn(4);

        colCodigo.setPreferredWidth(5);
        colData.setPreferredWidth(30);
        colValor.setPreferredWidth(20);
        colTipo.setPreferredWidth(30);
        colDescricao.setPreferredWidth(270);
        
    }

    public void botoesDevolucao(boolean novo, boolean registrar, boolean cancelar) {
        btn_NovoRegistroDevolucao.setEnabled(novo);
        btn_RegistrarDevolucao.setEnabled(registrar);
        btn_cancelarDevolucao.setEnabled(cancelar);
    }

    public void botoesDespesas(boolean novo, boolean registrar, boolean cancelar) {
        btn_novaDespesa.setEnabled(novo);
        btn_RegistrarDespesas.setEnabled(registrar);
        btn_cancelarDespesas.setEnabled(cancelar);
    }

    public void habilitarCamposDespesas(boolean campoData, boolean campoValor, boolean campoDescricaoDespesa, boolean comBoxTipo, boolean campTipo, boolean btnAdicionaTipo) {
        this.campTipo.setEnabled(campTipo);
        this.camp_Data.setEnabled(campoData);
        this.camp_Valor.setEnabled(campoValor);
        this.camp_DescricaoDespesas.setEnabled(campoDescricaoDespesa);
    }

    public void habilitaCamposDevolucao(boolean campID, boolean campValor, boolean campMotivo) {
        this.camp_codigoVenda.setEnabled(campID);
        this.camp_valorEstornado.setEnabled(campValor);
        this.camp_MotivoDevolucao.setEnabled(campMotivo);
    }

    public void limparCamposDespesas() {
        this.campTipo.setText("");
        this.camp_Data.setText("");
        this.camp_Valor.setText("");
        this.camp_DescricaoDespesas.setText("");
    }
    
    public void limparCamposDevolucao(){
        this.camp_codigoVenda.setText("");
        this.camp_valorEstornado.setText("");
        this.camp_MotivoDevolucao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        camp_totalcaixa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        camp_despesas = new javax.swing.JTextField();
        camp_receber = new javax.swing.JTextField();
        camp_valorLiguido = new javax.swing.JTextField();
        camp_valorBruto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1Despesas = new javax.swing.JTable();
        camp_dataPesquisa = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_consultarDespesas = new javax.swing.JButton();
        camp_valorTotaldespesas = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camp_codigoVenda = new javax.swing.JTextField();
        btn_RegistrarDevolucao = new javax.swing.JButton();
        btn_cancelarDevolucao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        camp_MotivoDevolucao = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_novaDespesa = new javax.swing.JButton();
        campTipo = new javax.swing.JTextField();
        btn_RegistrarDespesas = new javax.swing.JButton();
        btn_cancelarDespesas = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn_NovoRegistroDevolucao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        camp_DescricaoDespesas = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        camp_Valor = new javax.swing.JFormattedTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        camp_Data = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        camp_valorEstornado = new javax.swing.JFormattedTextField();
        camp_nomeCliente = new javax.swing.JTextField();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALOR CAIXA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 350, 30);

        camp_totalcaixa.setEditable(false);
        camp_totalcaixa.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_totalcaixa.setForeground(new java.awt.Color(255, 0, 0));
        camp_totalcaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(camp_totalcaixa);
        camp_totalcaixa.setBounds(20, 50, 370, 60);

        add(jPanel1);
        jPanel1.setBounds(718, 12, 410, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        camp_despesas.setEditable(false);
        camp_despesas.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel2.add(camp_despesas);
        camp_despesas.setBounds(390, 40, 130, 40);

        camp_receber.setEditable(false);
        camp_receber.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_receber.setForeground(new java.awt.Color(247, 236, 18));
        jPanel2.add(camp_receber);
        camp_receber.setBounds(200, 40, 160, 40);

        camp_valorLiguido.setEditable(false);
        camp_valorLiguido.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_valorLiguido.setForeground(new java.awt.Color(26, 19, 242));
        jPanel2.add(camp_valorLiguido);
        camp_valorLiguido.setBounds(540, 40, 150, 40);

        camp_valorBruto.setEditable(false);
        camp_valorBruto.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_valorBruto.setForeground(new java.awt.Color(247, 8, 8));
        jPanel2.add(camp_valorBruto);
        camp_valorBruto.setBounds(10, 40, 160, 40);

        jLabel2.setText("Despesas:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(390, 20, 80, 16);

        jLabel3.setText("Dinheiro a Receber:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 20, 140, 16);

        jLabel4.setText("Valor Bruto:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 90, 16);

        jLabel5.setText("Valor liguído:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(540, 20, 90, 20);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 90, 680, 10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("__");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(360, 40, 30, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("=");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(520, 50, 20, 16);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);
        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 140, 680, 230);

        jTable1Despesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Data", "Valor", "Tipo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1Despesas);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 460, 680, 160);

        try {
            camp_dataPesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_dataPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_dataPesquisaActionPerformed(evt);
            }
        });
        jPanel2.add(camp_dataPesquisa);
        camp_dataPesquisa.setBounds(130, 430, 120, 26);

        jLabel16.setText("Digite uma Data:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 426, 120, 30);

        btn_consultarDespesas.setText("Consultar");
        btn_consultarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarDespesasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_consultarDespesas);
        btn_consultarDespesas.setBounds(594, 430, 90, 30);
        jPanel2.add(camp_valorTotaldespesas);
        camp_valorTotaldespesas.setBounds(450, 430, 100, 26);

        jLabel18.setText("Valor Total:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(371, 436, 90, 20);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("__");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel20);
        jLabel20.setBounds(170, 40, 30, 30);

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 65, 247));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Despesas Cadastradas:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(230, 380, 210, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 10, 700, 630);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel9.setText("Codigo Venda:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 90, 110, 16);

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Valor Estornado ao Cliente:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 110, 200, 30);

        jLabel8.setText("Motivo da Devolução:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 140, 160, 16);

        camp_codigoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_codigoVendaActionPerformed(evt);
            }
        });
        jPanel3.add(camp_codigoVenda);
        camp_codigoVenda.setBounds(180, 80, 90, 26);

        btn_RegistrarDevolucao.setText("Registrar");
        btn_RegistrarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarDevolucaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_RegistrarDevolucao);
        btn_RegistrarDevolucao.setBounds(310, 170, 90, 30);

        btn_cancelarDevolucao.setText("Cancelar");
        btn_cancelarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarDevolucaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancelarDevolucao);
        btn_cancelarDevolucao.setBounds(310, 200, 90, 30);

        jScrollPane1.setViewportView(camp_MotivoDevolucao);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 260, 70);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(10, 240, 390, 10);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Registro de Devolução:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(120, 0, 230, 21);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(10, 20, 390, 10);

        btn_novaDespesa.setText("Novo");
        btn_novaDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novaDespesaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_novaDespesa);
        btn_novaDespesa.setBounds(320, 440, 80, 30);
        jPanel3.add(campTipo);
        campTipo.setBounds(10, 300, 230, 30);

        btn_RegistrarDespesas.setText("Registrar");
        btn_RegistrarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarDespesasActionPerformed(evt);
            }
        });
        jPanel3.add(btn_RegistrarDespesas);
        btn_RegistrarDespesas.setBounds(210, 440, 100, 30);

        btn_cancelarDespesas.setText("Cancelar");
        btn_cancelarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarDespesasActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancelarDespesas);
        btn_cancelarDespesas.setBounds(100, 440, 100, 30);

        jLabel12.setText("Tipo:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 280, 60, 16);

        btn_NovoRegistroDevolucao.setText("Novo");
        btn_NovoRegistroDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoRegistroDevolucaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_NovoRegistroDevolucao);
        btn_NovoRegistroDevolucao.setBounds(310, 140, 90, 30);

        jScrollPane3.setViewportView(camp_DescricaoDespesas);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 360, 230, 70);

        jLabel13.setText("Descrição da Despesa:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 340, 150, 16);

        jLabel14.setText("Valor:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(280, 340, 80, 16);

        camp_Valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel3.add(camp_Valor);
        camp_Valor.setBounds(280, 360, 100, 30);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(10, 270, 390, 10);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(59, 13, 245));
        jLabel15.setText("Registro de Despesas:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(120, 250, 200, 21);

        try {
            camp_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(camp_Data);
        camp_Data.setBounds(280, 300, 100, 30);

        jLabel17.setText("Data:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(280, 280, 60, 16);

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 62, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Ajuda?");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(340, 50, 60, 16);
        jPanel3.add(camp_valorEstornado);
        camp_valorEstornado.setBounds(180, 110, 90, 26);

        camp_nomeCliente.setEditable(false);
        jPanel3.add(camp_nomeCliente);
        camp_nomeCliente.setBounds(10, 50, 260, 26);

        add(jPanel3);
        jPanel3.setBounds(720, 160, 410, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NovoRegistroDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoRegistroDevolucaoActionPerformed
        botoesDevolucao(true, true, true);
        habilitaCamposDevolucao(true, true, true);
    }//GEN-LAST:event_btn_NovoRegistroDevolucaoActionPerformed

    private void btn_cancelarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarDevolucaoActionPerformed
        botoesDevolucao(true, false, false);
        habilitaCamposDevolucao(false, false, false);
    }//GEN-LAST:event_btn_cancelarDevolucaoActionPerformed

    private void btn_RegistrarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarDevolucaoActionPerformed
        try {
            boolean registrado = CaixaService.RegistrarDevolucao(Integer.parseInt(camp_codigoVenda.getText()), camp_valorEstornado.getText(), camp_MotivoDevolucao.getText());
            if (registrado) {
                limparCamposDevolucao();
                atualizarCaixa();
                botoesDevolucao(true, false, false);
                habilitaCamposDevolucao(false, false, false);
                JOptionPane.showMessageDialog(null, "Devolucao Registrada Com Sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
                
    }//GEN-LAST:event_btn_RegistrarDevolucaoActionPerformed

    private void btn_novaDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novaDespesaActionPerformed
        botoesDespesas(true, true, true);
        habilitarCamposDespesas(true, true, true, true, true, true);
    }//GEN-LAST:event_btn_novaDespesaActionPerformed

    private void btn_RegistrarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarDespesasActionPerformed
        Despesa despesa = null;
        try {
            despesa = DespesaService.RegistroDespesas(this.campTipo.getText(), this.camp_Data.getText(), this.camp_Valor.getText(), this.camp_DescricaoDespesas.getText());
        } catch (ParseException ex) {
            Logger.getLogger(TelaMovimentacao.class.getName()).log(Level.WARNING, null, ex);
        }

        if (despesa != null) {
            JOptionPane.showMessageDialog(null, "Despesa Registrada Com Sucesso!");
            DespesaService.CarregarTodasDespesas(jTable1Despesas);
            limparCamposDespesas();
            atualizarCaixa();
            botoesDespesas(true, false, false);
            habilitarCamposDespesas(false, false, false, false, false, false);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor Preencha Todos Os Campos!");
        }

    }//GEN-LAST:event_btn_RegistrarDespesasActionPerformed

    private void btn_cancelarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarDespesasActionPerformed
        botoesDespesas(true, false, false);
        limparCamposDespesas();
        habilitarCamposDespesas(false, false, false, false, false, false);
    }//GEN-LAST:event_btn_cancelarDespesasActionPerformed

    private void btn_consultarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarDespesasActionPerformed
        try {
            jTable1Despesas.setModel(DespesaService.PrencherTableDespesas(jTable1Despesas, camp_dataPesquisa.getText()));
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }
    }//GEN-LAST:event_btn_consultarDespesasActionPerformed

    private void camp_dataPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_dataPesquisaActionPerformed
        try {
            jTable1Despesas.setModel(DespesaService.PrencherTableDespesas(jTable1Despesas, camp_dataPesquisa.getText()));
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }
    }//GEN-LAST:event_camp_dataPesquisaActionPerformed

    private void camp_codigoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_codigoVendaActionPerformed
        
        try {
            camp_valorEstornado.setText(CaixaService.ValoresPagoDaVenda(Integer.parseInt(camp_codigoVenda.getText()))+"");
            camp_nomeCliente.setText(CaixaService.BuscaVendaPorId(Integer.parseInt(camp_codigoVenda.getText())).getCliente().getNome());
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }
        
    }//GEN-LAST:event_camp_codigoVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NovoRegistroDevolucao;
    private javax.swing.JButton btn_RegistrarDespesas;
    private javax.swing.JButton btn_RegistrarDevolucao;
    private javax.swing.JButton btn_cancelarDespesas;
    private javax.swing.JButton btn_cancelarDevolucao;
    private javax.swing.JButton btn_consultarDespesas;
    private javax.swing.JButton btn_novaDespesa;
    private javax.swing.JTextField campTipo;
    private javax.swing.JFormattedTextField camp_Data;
    private javax.swing.JTextPane camp_DescricaoDespesas;
    private javax.swing.JTextPane camp_MotivoDevolucao;
    private javax.swing.JFormattedTextField camp_Valor;
    private javax.swing.JTextField camp_codigoVenda;
    private javax.swing.JFormattedTextField camp_dataPesquisa;
    private javax.swing.JTextField camp_despesas;
    private javax.swing.JTextField camp_nomeCliente;
    private javax.swing.JTextField camp_receber;
    private javax.swing.JTextField camp_totalcaixa;
    private javax.swing.JTextField camp_valorBruto;
    private javax.swing.JFormattedTextField camp_valorEstornado;
    private javax.swing.JTextField camp_valorLiguido;
    private javax.swing.JTextField camp_valorTotaldespesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1Despesas;
    // End of variables declaration//GEN-END:variables

    public void atualizarCaixa() {
        DecimalFormat decimal = new DecimalFormat("0.00");
        camp_valorLiguido.setText("R$ " + decimal.format(CaixaService.ValorLiquido()));
        camp_receber.setText("R$ " + decimal.format(CaixaService.ValorParcelasPendentes()));
        camp_valorBruto.setText("R$ " + decimal.format(CaixaService.ValorTotalEntradas()));
        camp_totalcaixa.setText("R$ " + decimal.format(CaixaService.ValorLiquido()));
        camp_despesas.setText(DespesaService.ValorTotalDespesas()+"");
        DespesaService.CarregarTodasDespesas(jTable1Despesas);
    }

}
