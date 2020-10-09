/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

/**
 *
 * @author willian
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    CadastroItem telaPesq = new CadastroItem();
    CadastroFornecedor telaCad = new CadastroFornecedor();
    TelaItensDesativados telaItensDesativados = new TelaItensDesativados();
    TelaConfig telaconfig = new TelaConfig();
    TelaVenda telavenda = new TelaVenda();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuFazerVenda = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItems = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuConfigAvancadas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        areaTrabalho.setForeground(java.awt.Color.lightGray);
        getContentPane().add(areaTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1370, 650));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        jMenu4.setText("Vendas");

        jMenuFazerVenda.setText("Fazer uma venda");
        jMenuFazerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFazerVendaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuFazerVenda);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Relatorio");
        jMenuBar1.add(jMenu5);

        jMenuCadastrar.setText("Cadastros");

        jMenuItems.setText("Items");
        jMenuItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemsActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItems);

        jMenuItem2.setText("Fornecedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItem2);

        jMenuBar1.add(jMenuCadastrar);

        jMenu3.setText("Configurações");

        jMenuConfigAvancadas.setText("Config. Avançadas");
        jMenuConfigAvancadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConfigAvancadasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuConfigAvancadas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1378, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemsActionPerformed
        telaPesq.setVisible(true);
        telaPesq.AtualizarTabela();
        telaPesq.btn_editar.setVisible(false);
    }//GEN-LAST:event_jMenuItemsActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        telaCad.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuConfigAvancadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConfigAvancadasActionPerformed
        telaconfig.setVisible(true);
    }//GEN-LAST:event_jMenuConfigAvancadasActionPerformed

    private void jMenuFazerVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFazerVendaActionPerformed
        TelaVenda();
    }//GEN-LAST:event_jMenuFazerVendaActionPerformed

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuConfigAvancadas;
    private javax.swing.JMenuItem jMenuFazerVenda;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItems;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void TelaVenda(){
        
        areaTrabalho.removeAll();
        telavenda.setLocation(0, 0);
        telavenda.setSize(1360, 690);
        telavenda.setVisible(true);
        areaTrabalho.add(telavenda);
        
    }



}
