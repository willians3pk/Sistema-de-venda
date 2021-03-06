/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.dao.Conexao;
import model.Produto;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Categoria;

/**
 *
 * @author user
 */
public class TelaItensDesativados extends javax.swing.JPanel {

    /**
     * Creates new form TelaItensDesativados
     */
    public TelaItensDesativados() {
        initComponents();
        btn_ativar.setVisible(false);
        carregarProduto();
        carregarCategorias();
        btn_excluir.setEnabled(false);
        
        TableColumn colCodigo = tabela_produto.getColumnModel().getColumn(0);
        TableColumn colNome = tabela_produto.getColumnModel().getColumn(1);
        TableColumn colQuantidade = tabela_produto.getColumnModel().getColumn(2);
        TableColumn colPreco = tabela_produto.getColumnModel().getColumn(3);
        TableColumn colApelido = tabela_produto.getColumnModel().getColumn(4);
        TableColumn colCategoria = tabela_produto.getColumnModel().getColumn(5);
        TableColumn colTamanho = tabela_produto.getColumnModel().getColumn(6);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(200);
        colQuantidade.setPreferredWidth(10);
        colPreco.setPreferredWidth(35);
        colApelido.setPreferredWidth(100);
        colCategoria.setPreferredWidth(100);
        colTamanho.setPreferredWidth(25);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_ativar = new javax.swing.JButton();
        btn_filtrar = new javax.swing.JButton();
        camp_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        tabela_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo:", "Nome:", "Qtde:", "Preço:", "Apelido:", "Categoria:", "Tamanho:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_produto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 740, 190);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUTOS DESATIVADOS:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 410, 20);

        btn_ativar.setText("Ativar");
        btn_ativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ativarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ativar);
        btn_ativar.setBounds(660, 10, 90, 40);

        add(jPanel1);
        jPanel1.setBounds(20, 130, 760, 260);

        btn_filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-48.png"))); // NOI18N
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });
        add(btn_filtrar);
        btn_filtrar.setBounds(720, 30, 50, 40);

        camp_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                camp_nomeKeyReleased(evt);
            }
        });
        add(camp_nome);
        camp_nome.setBounds(20, 40, 690, 30);

        jLabel2.setText("Nome:");
        add(jLabel2);
        jLabel2.setBounds(20, 20, 50, 16);
        add(jSeparator1);
        jSeparator1.setBounds(20, 90, 760, 10);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 70, 170, 180);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Categorias:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 20, 180, 29);

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_excluir);
        btn_excluir.setBounds(250, 220, 80, 30);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 50, 320, 10);

        add(jPanel2);
        jPanel2.setBounds(790, 130, 340, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtoMouseClicked
        btn_ativar.setVisible(true);
    }//GEN-LAST:event_tabela_produtoMouseClicked

    private void btn_ativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ativarActionPerformed
        int row = tabela_produto.getSelectedRow();
        DefaultTableModel tabela = (DefaultTableModel) tabela_produto.getModel();
        Conexao banco = new Conexao();
        try {
            int confirmacao = JOptionPane.showConfirmDialog(null, "<html>Você Deseja Ativar <html><font color=\"#FF0000\">*O ITEM SELECIONADO*?</font></html></html>", "Ativar", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_NO_OPTION) {
                for (Produto produto : banco.productBook()) {
                    if (produto.getIdProduto().equals(tabela_produto.getValueAt(row, 0))) {
                        produto.setStatus(true);
                        produto.setDataRegistro(new Date());
                        banco.update(produto);
                        break;
                    }
                }
            }
            carregarProduto();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }


    }//GEN-LAST:event_btn_ativarActionPerformed

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                btn_ativar.setVisible(false);
                Conexao banco = new Conexao();
                String nome = camp_nome.getText();
                DefaultTableModel tabela = (DefaultTableModel) tabela_produto.getModel();
                tabela.setNumRows(0);

                for (Produto produto : banco.filtrarProdutoDesativado(nome)) {
                    if (!produto.isStatus()) {
                        tabela.addRow(new Object[]{
                            produto.getIdProduto(),
                            produto.getNome(),
                            produto.getQnt(),
                            produto.getValor_venda(),
                            produto.getApelido(),
                            produto.getCategoria(),
                            produto.getTamanho()

                        });

                    }
                }
                carregando.dispose();
            }

        };
        t.start();


    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void camp_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camp_nomeKeyReleased
        btn_ativar.setVisible(false);
        Conexao banco = new Conexao();
        String nome = camp_nome.getText();
        DefaultTableModel tabela = (DefaultTableModel) tabela_produto.getModel();
        tabela.setNumRows(0);
        List<Produto> lista = banco.filtrarProdutoDesativado(nome);

        for (Produto produto : lista) {
            if (!produto.isStatus()) {
                tabela.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getQnt(),
                    produto.getValor_venda(),
                    produto.getApelido(),
                    produto.getCategoria(),
                    produto.getTamanho()

                });

            }
        }


    }//GEN-LAST:event_camp_nomeKeyReleased

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
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione uma Categoria! \n" + "Erro: " + e);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ativar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabela_produto;
    // End of variables declaration//GEN-END:variables

    public void carregarProduto() {

        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        Conexao banco = new Conexao();
        DefaultTableModel tabela = (DefaultTableModel) tabela_produto.getModel();
        tabela.setNumRows(0);
        for (Produto produto : banco.productBook()) {
            if (!produto.isStatus()) {
                tabela.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getQnt(),
                    dinheiro.format(produto.getValor_venda()),
                    produto.getApelido(),
                    produto.getCategoria(),
                    produto.getTamanho()

                });

            }
        }

    }

    public void carregarCategorias() {
        try {
            DefaultListModel jlist = new DefaultListModel();
            for (Categoria categoria : Conexao.lista_Categoria()) {
                jlist.addElement(categoria.getTipo_Categoria());
                jList1.setModel(jlist);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
