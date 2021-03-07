/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Cliente;
import model.Endereco;
import model.FormaPagamento;
import model.Venda;
import conexao.Conexao;
import model.Estado;
import model.ItensVenda;
import model.Produto;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class MainScreen extends javax.swing.JFrame {

    Color standardColor;
    TelaFornecedor r = new TelaFornecedor();
    TelaCadastroCliente cc = new TelaCadastroCliente();

    public MainScreen() {
        initComponents();
        standardColor = new Color(240, 240, 240);
        data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        horariodoSystema = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuICancelarVenda = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jVendaHIstoricos = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        horariodoSystema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horariodoSystema.setText("jLabel6");
        jPanel1.add(horariodoSystema);
        horariodoSystema.setBounds(1250, 0, 110, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 50);

        menuLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuLateral.setLayout(null);

        jPanel5.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconeCadastrar.png"))); // NOI18N
        jLabel4.setText("Clientes");
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoMouse(evt);
            }
        });
        jPanel5.add(jLabel4);
        jLabel4.setBounds(10, 0, 190, 30);

        menuLateral.add(jPanel5);
        jPanel5.setBounds(10, 290, 200, 30);

        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Venda");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoMouse(evt);
            }
        });
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 0, 190, 30);

        menuLateral.add(jPanel4);
        jPanel4.setBounds(10, 240, 200, 30);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fornecedor");
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoMouse(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 0, 190, 30);

        menuLateral.add(jPanel3);
        jPanel3.setBounds(10, 190, 200, 30);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produtos");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoMouse(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 190, 30);

        menuLateral.add(jPanel2);
        jPanel2.setBounds(10, 140, 200, 30);
        menuLateral.add(jSeparator1);
        jSeparator1.setBounds(10, 320, 200, 10);
        menuLateral.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 200, 10);
        menuLateral.add(jSeparator3);
        jSeparator3.setBounds(10, 220, 200, 10);
        menuLateral.add(jSeparator4);
        jSeparator4.setBounds(10, 270, 200, 10);

        getContentPane().add(menuLateral);
        menuLateral.setBounds(0, 50, 220, 650);

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoMouse(evt);
            }
        });
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(220, 50, 1140, 650);

        jMenu1.setText("Configuração");

        jMenu3.setText("Produto");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Excluidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenu4.setText("Venda");

        jMenuICancelarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuICancelarVenda.setText("Cancelar Venda");
        jMenuICancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuICancelarVendaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuICancelarVenda);

        jMenuItem4.setText("Editar");
        jMenu4.add(jMenuItem4);

        jMenu1.add(jMenu4);

        jMenu5.setText("Fornecedor");

        jMenuItem2.setText("Desativados");
        jMenu5.add(jMenuItem2);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Venda");

        jVendaHIstoricos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jVendaHIstoricos.setText("Historicos");
        jVendaHIstoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVendaHIstoricosActionPerformed(evt);
            }
        });
        jMenu2.add(jVendaHIstoricos);

        jMenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuCliente.setText("Clientes");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCliente);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1370, 732));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FocoMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FocoMouse
        if (evt.getSource() == jLabel1) {
            jPanel2.setBackground(Color.white);
        } else {
            jPanel2.setBackground(standardColor);
        }
        if (evt.getSource() == jLabel2) {
            jPanel3.setBackground(Color.white);
        } else {
            jPanel3.setBackground(standardColor);
        }
        if (evt.getSource() == jLabel3) {
            jPanel4.setBackground(Color.white);
        } else {
            jPanel4.setBackground(standardColor);
        }
        if (evt.getSource() == jLabel4) {
            jPanel5.setBackground(Color.white);
        } else {
            jPanel5.setBackground(standardColor);
        }
    }//GEN-LAST:event_FocoMouse

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        TelaProdutos p = new TelaProdutos();
        jDesktopPane1.removeAll();
        p.setLocation(0, 0);
        p.setSize(1140, 650);
        p.setVisible(true);
        p.btn_ToEdit.setEnabled(false);
        p.btn_Deactivate.setEnabled(false);
        p.loadingCampos();
        jDesktopPane1.add(p);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jDesktopPane1.removeAll();
        r.setLocation(0, 0);
        r.setSize(1140, 650);
        r.setVisible(true);
        r.preencherjlistaForncedor();
        jDesktopPane1.add(r);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        TelaVenda s = new TelaVenda();
        jDesktopPane1.removeAll();
        s.setLocation(0, 0);
        s.setSize(1140, 650);
        s.setVisible(true);
        jDesktopPane1.add(s);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jDesktopPane1.removeAll();
        cc.setLocation(0, 0);
        cc.setSize(1140, 650);
        cc.setCc(cc);
        cc.setVisible(true);
        jDesktopPane1.add(cc);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaItensDesativados tela = new TelaItensDesativados();
        jDesktopPane1.removeAll();
        tela.setLocation(0, 0);
        tela.setSize(1140, 650);
        tela.setVisible(true);
        tela.carregarProduto();
        jDesktopPane1.add(tela);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jVendaHIstoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVendaHIstoricosActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                TelaHistorico sH = new TelaHistorico();
                jDesktopPane1.removeAll();
                sH.setLocation(0, 0);
                sH.setSize(1140, 650);
                sH.setVisible(true);
                sH.carregarTabelaVendas();
                jDesktopPane1.add(sH);
                carregando.dispose();
            }

        };
        t.start();

    }//GEN-LAST:event_jVendaHIstoricosActionPerformed

    private void jMenuICancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuICancelarVendaActionPerformed
        String codigo = JOptionPane.showInputDialog("CODIGO da Venda que deseja Cancelar!");
        int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem Certeza que Deseja Cancelar a Venda de Numero " + codigo, "Cancelar a Venda?", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            final TelaLoading carregando = new TelaLoading();
            carregando.setVisible(true);
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        Integer id = Integer.parseInt(codigo);
                        Conexao banco = new Conexao();
                        Venda venda = banco.getVenda(id);
                        venda.setEstado(Estado.CANCELADO);
                        venda.setStatus(false);
                        banco.update(venda);
                        // ESTORNA OS ITENS DA VENDA CANCELADA PARA O ESTOQUE
                        for (ItensVenda listaIten : venda.listaItens()) {
                            Produto produto = banco.getProduto(listaIten.getItems().getIdProduto());
                            produto.setQnt(listaIten.getQnt() + produto.getQnt());
                            produto.setDataRegistro(new Date());
                            banco.update(produto);
                        }
                        JOptionPane.showMessageDialog(null, "Venda Cancelada!");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    carregando.dispose();
                }

            };
            t.start();

        }

    }//GEN-LAST:event_jMenuICancelarVendaActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed

        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                jDesktopPane1.removeAll();
                cc.setLocation(0, 0);
                cc.setSize(1140, 650);
                cc.setCc(cc);
                cc.setVisible(true);
                jDesktopPane1.add(cc);
                carregando.dispose();
            }

        };
        t.start();


    }//GEN-LAST:event_jMenuClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel horariodoSystema;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuICancelarVenda;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem jVendaHIstoricos;
    private javax.swing.JPanel menuLateral;
    // End of variables declaration//GEN-END:variables

    public void data() {
        //-------------Data----------------\\
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        horariodoSystema.setText(formato.format(dataSistema));

        Conexao bancoDAO = new Conexao();
        if (bancoDAO.list_Cliente().size() <= 0) {
            Cliente consumidor = new Cliente();
            Endereco end = new Endereco();
            end.setCep(0);
            end.setNumeroCasa(SOMEBITS);
            consumidor.setNome("CONSUMIDOR");
            consumidor.setEndereco(end);
            consumidor.setStatus(true);
            consumidor.setCpf(Long.MIN_VALUE);
            consumidor.setClienteDesde(new Date()); // DATA QUE O CLIENTE FOI CADASTRADO;
            bancoDAO.save(consumidor);
        }

        if (bancoDAO.listFormPagamento().size() <= 0) {
            FormaPagamento formapagamento = new FormaPagamento();
            formapagamento.setDescricao("DINHEIRO A VISTA");
            bancoDAO.save(formapagamento);
            FormaPagamento formapagamento1 = new FormaPagamento();
            formapagamento1.setDescricao("CARTÃO DE DEBITO");
            bancoDAO.save(formapagamento1);
            FormaPagamento formapagamento2 = new FormaPagamento();
            formapagamento2.setDescricao("CARTÃO DE CREDITO");
            bancoDAO.save(formapagamento2);
            FormaPagamento formapagamento3 = new FormaPagamento();
            formapagamento3.setDescricao("A PRAZO");
            bancoDAO.save(formapagamento3);
            FormaPagamento formapagamento4 = new FormaPagamento();
            formapagamento4.setDescricao("TRANSFERENCIA");
            bancoDAO.save(formapagamento4);
            FormaPagamento formapagamento5 = new FormaPagamento();
            formapagamento5.setDescricao("PARCELADO");
            bancoDAO.save(formapagamento5);

        }
    }

}
