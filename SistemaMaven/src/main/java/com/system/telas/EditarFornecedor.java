/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.telas;

import com.system.conexao.Conexao;
import com.system.sistemamaven.Endereco;
import com.system.sistemamaven.Fornecedor;
import com.system.sistemamaven.NumeroContato;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class EditarFornecedor extends javax.swing.JFrame {

    Fornecedor fornecedor;

    public EditarFornecedor() {
        initComponents();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        camp_complementoForncedor = new javax.swing.JTextArea();
        camp_nomeFornecedor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camp_cnpj = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btn_salvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        camp_emailFornecedor = new javax.swing.JTextField();
        camp_homepage = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        camp_ruaFornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        camp_bairroFornecedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        camp_numerocasaFornecedor = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        camp_cidadeFornecedor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        camp_cepFornecedor = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        camp_contatoFornecedor = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        camp_EstadoFornecedor = new javax.swing.JTextField();
        jLabelObrigatorionome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        camp_dddFornecedor = new javax.swing.JFormattedTextField();
        camp_cpfFornecedor = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Editar Fornecedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camp_complementoForncedor.setColumns(20);
        camp_complementoForncedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        camp_complementoForncedor.setRows(5);
        jScrollPane2.setViewportView(camp_complementoForncedor);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 470, 90));

        camp_nomeFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_nomeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 790, 10));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Nome:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("CPF:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        try {
            camp_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(camp_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 170, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("CNPJ:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 10, 280));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 363, 800, 10));

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 90, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Home-Page:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("E-mail:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        camp_emailFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_emailFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        camp_homepage.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, -1));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setText("Rua:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        camp_ruaFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_ruaFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, -1));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setText("Bairro:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        camp_bairroFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_bairroFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 140, -1));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel14.setText("Nª (casa):");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        camp_numerocasaFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        camp_numerocasaFornecedor.setText("00000000");
        jPanel2.add(camp_numerocasaFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, -1));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel15.setText("Complemento:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel16.setText("Estado:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel17.setText("Cidade:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        camp_cidadeFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_cidadeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 200, -1));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel18.setText("CEP:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        try {
            camp_cepFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cepFornecedor.setText("00000-000");
        jPanel2.add(camp_cepFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        jLabel33.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel33.setText("DDD");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        try {
            camp_contatoFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(camp_contatoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 90, -1));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel34.setText("Contato:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        camp_EstadoFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel2.add(camp_EstadoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 90, -1));

        jLabelObrigatorionome.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObrigatorionome.setText("*");
        jPanel2.add(jLabelObrigatorionome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        try {
            camp_dddFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_dddFornecedor.setText("00");
        jPanel2.add(camp_dddFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, -1));

        try {
            camp_cpfFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_cpfFornecedor.setText("000.000.000-00");
        jPanel2.add(camp_cpfFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jTabbedPane1.addTab("Fornecedor", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 870, 490));

        setSize(new java.awt.Dimension(934, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        Salvar();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField camp_EstadoFornecedor;
    private javax.swing.JTextField camp_bairroFornecedor;
    private javax.swing.JFormattedTextField camp_cepFornecedor;
    private javax.swing.JTextField camp_cidadeFornecedor;
    private javax.swing.JFormattedTextField camp_cnpj;
    private javax.swing.JTextArea camp_complementoForncedor;
    private javax.swing.JFormattedTextField camp_contatoFornecedor;
    private javax.swing.JFormattedTextField camp_cpfFornecedor;
    private javax.swing.JFormattedTextField camp_dddFornecedor;
    private javax.swing.JTextField camp_emailFornecedor;
    private javax.swing.JTextField camp_homepage;
    private javax.swing.JTextField camp_nomeFornecedor;
    private javax.swing.JFormattedTextField camp_numerocasaFornecedor;
    private javax.swing.JTextField camp_ruaFornecedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelObrigatorionome;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public void CarregarCampos() {

//        VARIAREIS 
        String cep = String.valueOf(this.fornecedor.endereco().getCep());
        String ddd = String.valueOf(this.fornecedor.getcontato().getDdd());
        String fone = String.valueOf(fornecedor.getcontato().getFone());
        String cnpj = String.valueOf(fornecedor.getCnpj());
        String cpf = String.valueOf(fornecedor.getCpf());
        String numerocasa = String.valueOf(fornecedor.endereco().getNumeroCasa());

        camp_nomeFornecedor.setText(fornecedor.getNome());
        camp_ruaFornecedor.setText(fornecedor.endereco().getRua());
        camp_cepFornecedor.setText(cep);
        camp_dddFornecedor.setText(ddd);
        camp_contatoFornecedor.setText(fone);
        camp_emailFornecedor.setText(fornecedor.getEmail());
        camp_homepage.setText(fornecedor.getHomePage());
        camp_cnpj.setText(cnpj);
        camp_cpfFornecedor.setText(cpf);
        camp_bairroFornecedor.setText(fornecedor.endereco().getBairro());
        camp_numerocasaFornecedor.setText(numerocasa);
        camp_cidadeFornecedor.setText(fornecedor.endereco().getCidade());
        camp_EstadoFornecedor.setText(fornecedor.endereco().getEstadoUf());
        camp_complementoForncedor.setText(fornecedor.endereco().getComplemento());

    }

    private void Salvar() {
        try {
            int cep = Integer.parseInt(camp_cepFornecedor.getText().replace("-", "")); // REMOVE AS STRING
            int ddd = Integer.parseInt(camp_dddFornecedor.getText());
            int fone = Integer.parseInt(camp_contatoFornecedor.getText().replace("-", "")); // REMOVE AS STRING
            Long cnpj = Long.parseLong(camp_cnpj.getText().replace(".", "").replace(".", "").replace("/", "").replace("-", "")); // REMOVE AS STRING
            Long cpf = Long.parseLong(camp_cpfFornecedor.getText().replace(".", "").replace(".", "").replace("-", "")); // REMOVE AS STRING
            int numerocasa = Integer.parseInt(camp_numerocasaFornecedor.getText());

            NumeroContato contato = fornecedor.getcontato();
            Endereco end = fornecedor.endereco();

            fornecedor.setNome(camp_nomeFornecedor.getText());
            end.setRua(camp_ruaFornecedor.getText());
            end.setCep(cep);
            contato.setDdd(ddd);
            contato.setFone(fone);
            fornecedor.setEmail(camp_emailFornecedor.getText());
            fornecedor.setHomePage(camp_homepage.getText());
            fornecedor.setCnpj(cnpj);
            fornecedor.setCpf(cpf);
            end.setBairro(camp_bairroFornecedor.getText());
            end.setNumeroCasa(numerocasa);
            end.setCidade(camp_cidadeFornecedor.getText());
            end.setEstadoUf(camp_EstadoFornecedor.getText());
            end.setComplemento(camp_complementoForncedor.getText());

            Conexao banco = new Conexao();
            banco.update(fornecedor);
            banco.update(contato);
            banco.update(end);

//            LIMPAR CAMPOS
            camp_nomeFornecedor.setText("");
            camp_ruaFornecedor.setText("");
            camp_cepFornecedor.setText("00000000");
            camp_dddFornecedor.setText("00");
            camp_contatoFornecedor.setText("000000000");
            camp_emailFornecedor.setText("");
            camp_homepage.setText("");
            camp_cnpj.setText("0000000000000");
            camp_cpfFornecedor.setText("00000000000");
            camp_bairroFornecedor.setText("");
            camp_numerocasaFornecedor.setText("000000");
            camp_cidadeFornecedor.setText("");
            camp_EstadoFornecedor.setText("");
            camp_complementoForncedor.setText("");

            JOptionPane.showMessageDialog(null, "Informações Salvas com Sucesso!");
            
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Os campos Cep, ddd, Contato, cnpj, cpf, numerocasa, nao podem estar em branco (vazio)");
        }

    }

}
