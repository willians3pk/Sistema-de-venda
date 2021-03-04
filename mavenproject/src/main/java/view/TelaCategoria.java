package view;

import br.com.configuracao.Categoria;
import conexao.Conexao;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaCategoria extends javax.swing.JFrame {

    public TelaCategoria() {
        initComponents();
        carregarCategorias();
        btn_excluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camp_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_excluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(camp_nome);
        camp_nome.setBounds(60, 10, 260, 30);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 60, 16);

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 10, 80, 30);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 170, 80);

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir);
        btn_excluir.setBounds(200, 130, 80, 30);

        jLabel3.setText("Categorias:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 100, 16);

        setSize(new java.awt.Dimension(434, 200));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String categoria = camp_nome.getText();
            Categoria c = new Categoria();
            c.setTipo_Categoria(categoria);
            Conexao banco = new Conexao();
            banco.save(c);
            camp_nome.setText("");
            carregarCategorias();
            TelaProdutos.loadingCampos();
            JOptionPane.showMessageDialog(null, "Categoria Criada!");
            dispose();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        btn_excluir.setEnabled(true);
    }//GEN-LAST:event_jList1MouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        try {
            int linhaSelecionada = jList1.getSelectedIndex();
            Categoria categoria = Conexao.lista_Categoria().get(linhaSelecionada);
            Conexao banco = new Conexao();
            int confirmacao = JOptionPane.showConfirmDialog(null, "Voce deseja realmente excluir a categoria?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                banco.delete(categoria);
                JOptionPane.showMessageDialog(null, "Categoria Deletada!");
                TelaProdutos.loadingCampos();
                carregarCategorias();
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione uma Categoria! \n" + "Erro: " + e);
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
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluir;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void carregarCategorias() {
        try {
            for (Categoria categoria : Conexao.lista_Categoria()) {
                DefaultListModel jlist = new DefaultListModel();
                jlist.addElement(categoria.getTipo_Categoria());
                jList1.setModel(jlist);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
