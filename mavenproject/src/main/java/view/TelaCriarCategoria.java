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
public class TelaCriarCategoria extends javax.swing.JFrame {

    public TelaCriarCategoria() {
        initComponents();
        btn_excluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camp_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_gravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        jPanel1.add(camp_nome);
        camp_nome.setBounds(10, 60, 260, 30);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 60, 16);

        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gravar);
        btn_gravar.setBounds(180, 100, 90, 30);

        jLabel2.setText("ADICIONAR CATEGORIA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 10, 160, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 30, 430, 10);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 50, 160, 100);

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_excluir);
        btn_excluir.setBounds(84, 100, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 450, 160);

        setSize(new java.awt.Dimension(485, 215));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        if (camp_nome.getText().length() > 0) {
            Config categoria = new Config();
            categoria.setCategoriaProduto(camp_nome.getText());
            Conexao banco = new Conexao();
            banco.save(categoria);
            loadingCampos();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Digite a categoria do Produto!");
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        btn_excluir.setEnabled(true);
    }//GEN-LAST:event_jList1MouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        try {
            Conexao banco = new Conexao();
            Config categoria = banco.lista_Config().get(jList1.getSelectedIndex());
            banco.delete(categoria);
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
            java.util.logging.Logger.getLogger(TelaCriarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void carregarCampos() {
        DefaultListModel categoria = new DefaultListModel();
        for (Config config : connectbanco.lista_Config()) {
            categoria.addElement(config.getCategoriaProduto());
            jList1.setModel(categoria);            // ADICIONA AS CATEGORIAS NA jList1
        }
    }

}
