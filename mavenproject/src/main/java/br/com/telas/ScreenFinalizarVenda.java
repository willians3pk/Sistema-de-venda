package br.com.telas;

import br.com.classes.FormaPagamento;
import br.com.classes.ItensVenda;
import br.com.classes.Produto;
import br.com.classes.Venda;
import br.com.conexao.Conexao;
import static br.com.telas.ScreenSell.btn_buscarProduto;
import static br.com.telas.ScreenSell.field_preco;
import static br.com.telas.ScreenSell.field_qnt;
import static br.com.telas.ScreenSell.produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ScreenFinalizarVenda extends javax.swing.JFrame {

    List<Produto> lista;
    ScreenSell telaVenda;
    Conexao bancoMariaDB = new Conexao();

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }

    public ScreenFinalizarVenda() {
        initComponents();
        carregarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campvalorPago = new javax.swing.JFormattedTextField();
        btn_cancelarVenda = new javax.swing.JButton();
        btn_finalizarvenda = new javax.swing.JButton();
        camptotal = new javax.swing.JTextField();
        dataVenda = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        campTroco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        comboBOX_FormaPagamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("TROCO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 200, 150, 30);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("TOTAL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 120, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("VALOR PAGO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 80, 180, 30);

        campvalorPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campvalorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campvalorPagoKeyReleased(evt);
            }
        });
        jPanel1.add(campvalorPago);
        campvalorPago.setBounds(180, 80, 210, 40);

        btn_cancelarVenda.setText("CANCELAR VENDA");
        btn_cancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarVendaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelarVenda);
        btn_cancelarVenda.setBounds(480, 210, 160, 40);

        btn_finalizarvenda.setText("FINALIZAR VENDA");
        btn_finalizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarvendaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_finalizarvenda);
        btn_finalizarvenda.setBounds(480, 160, 160, 40);

        camptotal.setEditable(false);
        camptotal.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        camptotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(camptotal);
        camptotal.setBounds(180, 20, 210, 40);
        jPanel1.add(dataVenda);
        dataVenda.setBounds(440, 40, 190, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("DATA DA VENDA:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 10, 170, 29);
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(180, 140, 210, 40);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("DESCONTO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 140, 140, 30);

        campTroco.setEditable(false);
        campTroco.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jPanel1.add(campTroco);
        campTroco.setBounds(180, 200, 210, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(11, 124, 660, 260);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        comboBOX_FormaPagamento.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        comboBOX_FormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboBOX_FormaPagamento);
        comboBOX_FormaPagamento.setBounds(340, 50, 290, 40);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("FORMA DE PAGAMENTO:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(340, 20, 310, 30);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 46, 250, 40);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setText("CLIENTE:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 10, 140, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 660, 100);

        setSize(new java.awt.Dimension(693, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_finalizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarvendaActionPerformed
        try {
            if (campvalorPago.getText().length() > 0 & !dataVenda.getDate().equals("") & lista.size() > 0) {
                finalizarVenda();
            } else {
                JOptionPane.showMessageDialog(null, "Digite Valor Pago!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite data da Venda!");
        }

    }//GEN-LAST:event_btn_finalizarvendaActionPerformed

    private void btn_cancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarVendaActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarVendaActionPerformed

    private void campvalorPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campvalorPagoKeyReleased
        double valortotal = Double.parseDouble(camptotal.getText().replace("R$", ""));
        double valorPago = Double.parseDouble(campvalorPago.getText().replace(",", "."));
        double troco = valorPago - valortotal;
        campTroco.setText(String.valueOf(troco));
    }//GEN-LAST:event_campvalorPagoKeyReleased

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
    private javax.swing.JTextField campTroco;
    private javax.swing.JTextField camptotal;
    private javax.swing.JFormattedTextField campvalorPago;
    private javax.swing.JComboBox<String> comboBOX_FormaPagamento;
    private com.toedter.calendar.JDateChooser dataVenda;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
        camptotal.setText("R$ " + z);
    }

    private void finalizarVenda() {
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
        venda.setValor_pago(Double.valueOf(campvalorPago.getText().replace(",", ".")));
        venda.setTroco(troco);
        venda.setFormaPagamento(listaPagamento);
        venda.getFormaPagamento().add(bancoMariaDB.listFormPagamento().get(comboBOX_FormaPagamento.getSelectedIndex()));

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
        telaVenda.adicionarItens();
        btn_buscarProduto.setText("");
        field_preco.setText("0,00");
        field_qnt.setText("0");

        dispose();
    }

    public void carregarComboBox() {

        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        List<FormaPagamento> listaPagamento;
        listaPagamento = bancoMariaDB.listFormPagamento();
        
        for (FormaPagamento formPagamento : listaPagamento) { // PEGA OS FORMAPAGAMENTO CADASTRADOS NO BANCO DE DADOS;
            comboBox.addElement(formPagamento.getDescricao());
            comboBOX_FormaPagamento.setModel(comboBox);           // ADICIONA OS FORMAPAGAMENTO NA COMBOBOX;
        }

    }

}
