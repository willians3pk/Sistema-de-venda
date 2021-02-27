/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import br.com.configuracao.Config;
import conexao.Conexao;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static view.TelaProdutos.connectbanco;
import static view.TelaProdutos.loadingCampos;

/**
 *
 * @author user
 */
public class TelaCriarTamanho extends javax.swing.JFrame {

    /**
     * Creates new form CriarTamanho
     */
    public TelaCriarTamanho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_gravar = new javax.swing.JButton();
        camp_tamanh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gravar);
        btn_gravar.setBounds(190, 100, 80, 30);
        jPanel1.add(camp_tamanh);
        camp_tamanh.setBounds(10, 60, 260, 30);

        jLabel1.setText("Tamanho:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 80, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 20, 430, 10);

        jLabel2.setText("ADICIONAR TAMANHO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 0, 170, 20);

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_excluir);
        btn_excluir.setBounds(94, 100, 80, 30);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 40, 150, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(12, 12, 451, 161);

        setSize(new java.awt.Dimension(485, 215));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        if (camp_tamanh.getText().length() > 0) {
            Config tamanho = new Config();
            tamanho.setCategoriaProduto(camp_tamanh.getText());
            Conexao banco = new Conexao();
            banco.save(tamanho);
            loadingCampos();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Digite a tamanho do Produto!");
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        try {
            Conexao banco = new Conexao();
            Config tamanho = banco.lista_Config().get(jList1.getSelectedIndex());
            banco.delete(tamanho);
            carregarCampos();
            loadingCampos();
            btn_excluir.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }

    }//GEN-LAST:event_btn_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriarTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarTamanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarTamanho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JTextField camp_tamanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    public void carregarCampos() {
        DefaultListModel tamanho = new DefaultListModel();
        for (Config config : connectbanco.lista_Config()) {
            tamanho.addElement(config.getTamanho());
            jList1.setModel(tamanho);            // ADICIONA AS CATEGORIAS NA jList1
        }
    }

}
