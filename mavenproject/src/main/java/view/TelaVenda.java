package view;

import br.com.configuracao.Teclas;
import br.com.configuracao.TeclasPermitidas;
import model.Produto;
import conexao.Conexao;
import model.Cliente;
import model.FormaPagamento;
import model.ItensVenda;
import model.Venda;
import static view.MainScreen.jDesktopPane1;
import static view.FinalizarVenda.camp_cliente;
import static view.FinalizarVenda.jLabelQuantidadeItens;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TelaVenda extends javax.swing.JPanel {

    TelaBuscaProduto s = new TelaBuscaProduto();
    Conexao bancoMariaDB = new Conexao();
    public static List<Produto> produtos = new ArrayList<>(new HashSet());
    public static Produto produto;
    public static Cliente cliente = new Cliente();
    boolean tt = true;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        TelaVenda.cliente = cliente;
    }

    public TelaVenda() {
        initComponents();
        field_preco.setEnabled(false);
        field_qnt.setEnabled(false);
        camp_buscarProduto.setDocument(new Teclas());
        camp_nomeCliente.setDocument(new Teclas());
        field_qnt.setDocument(new TeclasPermitidas());

        TableColumn colCodigo = jTable_produto.getColumnModel().getColumn(0);
        TableColumn colNome = jTable_produto.getColumnModel().getColumn(1);
        TableColumn colCor = jTable_produto.getColumnModel().getColumn(2);
        TableColumn colPreço = jTable_produto.getColumnModel().getColumn(3);
        TableColumn colQuant = jTable_produto.getColumnModel().getColumn(4);

        colCodigo.setPreferredWidth(5);
        colNome.setPreferredWidth(150);
        colCor.setPreferredWidth(30);
        colPreço.setPreferredWidth(30);
        colQuant.setPreferredWidth(5);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_produto = new javax.swing.JTable();
        camp_total = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_finalizar = new javax.swing.JButton();
        btn_removerItem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_Cliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_venda = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        camp_nomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_totalVenda = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        field_qnt = new javax.swing.JFormattedTextField();
        field_preco = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_buscarProduto = new javax.swing.JButton();
        camp_buscarProduto = new javax.swing.JTextField();
        btn_adcionar = new javax.swing.JButton();
        camp_Cor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        camp_tamanho = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_limpa = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field_observacao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        field_itensQnt = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jTable_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo_item", "Nome:", "Cor:", "Valor:", "Qtde:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_produtoMouseClicked(evt);
            }
        });
        jTable_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_produtoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_produto);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(220, 250, 500, 190);

        camp_total.setEditable(false);
        camp_total.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel3.add(camp_total);
        camp_total.setBounds(220, 460, 150, 40);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Total:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(220, 440, 100, 20);

        btn_finalizar.setBackground(new java.awt.Color(255, 252, 0));
        btn_finalizar.setText("Finalizar");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_finalizar);
        btn_finalizar.setBounds(590, 460, 130, 40);

        btn_removerItem.setText("Remover ");
        btn_removerItem.setEnabled(false);
        btn_removerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerItemActionPerformed(evt);
            }
        });
        jPanel3.add(btn_removerItem);
        btn_removerItem.setBounds(430, 460, 130, 40);

        jPanel1.setBackground(new java.awt.Color(60, 205, 186));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        btn_Cliente.setBackground(new java.awt.Color(1, 1, 1));
        btn_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cliente.setText("Clientes");
        btn_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ClienteMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Cliente);
        btn_Cliente.setBounds(0, 0, 160, 40);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(560, 10, 160, 40);

        jPanel2.setBackground(new java.awt.Color(208, 208, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        btn_venda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_venda.setText("Vendas");
        btn_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vendaMouseClicked(evt);
            }
        });
        jPanel2.add(btn_venda);
        btn_venda.setBounds(0, 0, 160, 40);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(280, 10, 160, 40);

        jPanel7.setBackground(new java.awt.Color(29, 32, 232));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 251, 251));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAIXA");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 40);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(10, 10, 160, 40);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(10, 60, 710, 10);

        camp_nomeCliente.setEditable(false);
        camp_nomeCliente.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        camp_nomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camp_nomeClienteMouseClicked(evt);
            }
        });
        jPanel3.add(camp_nomeCliente);
        camp_nomeCliente.setBounds(110, 160, 490, 40);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 170, 130, 30);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 710, 10);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jPanel8);
        jPanel8.setBounds(10, 250, 200, 190);

        add(jPanel3);
        jPanel3.setBounds(10, 10, 730, 510);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL DA VENDA R$");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 0, 330, 60);

        jlabel_totalVenda.setFont(new java.awt.Font("Ubuntu", 0, 28)); // NOI18N
        jlabel_totalVenda.setForeground(new java.awt.Color(255, 0, 0));
        jlabel_totalVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_totalVenda.setText("0,00");
        jPanel4.add(jlabel_totalVenda);
        jlabel_totalVenda.setBounds(60, 60, 260, 30);

        add(jPanel4);
        jPanel4.setBounds(750, 10, 380, 100);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        field_qnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        field_qnt.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        field_qnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_qntMouseClicked(evt);
            }
        });
        field_qnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_qntActionPerformed(evt);
            }
        });
        jPanel5.add(field_qnt);
        field_qnt.setBounds(150, 110, 110, 40);

        field_preco.setEditable(false);
        field_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        field_preco.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel5.add(field_preco);
        field_preco.setBounds(10, 110, 110, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Localize o produto / serviço abaixo");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 10, 350, 20);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Tamanho:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(190, 170, 100, 20);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Cor:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 170, 80, 20);

        btn_buscarProduto.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btn_buscarProduto.setText("...");
        btn_buscarProduto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_buscarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProdutoActionPerformed(evt);
            }
        });
        jPanel5.add(btn_buscarProduto);
        btn_buscarProduto.setBounds(340, 40, 30, 40);

        camp_buscarProduto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        camp_buscarProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                camp_buscarProdutoFocusLost(evt);
            }
        });
        camp_buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_buscarProdutoActionPerformed(evt);
            }
        });
        jPanel5.add(camp_buscarProduto);
        camp_buscarProduto.setBounds(10, 40, 320, 40);

        btn_adcionar.setText("ADICIONAR ITEM");
        btn_adcionar.setEnabled(false);
        btn_adcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adcionarActionPerformed(evt);
            }
        });
        jPanel5.add(btn_adcionar);
        btn_adcionar.setBounds(10, 280, 360, 50);

        camp_Cor.setEditable(false);
        camp_Cor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel5.add(camp_Cor);
        camp_Cor.setBounds(10, 190, 160, 40);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Preço unitario:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 90, 120, 20);

        camp_tamanho.setEditable(false);
        camp_tamanho.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPanel5.add(camp_tamanho);
        camp_tamanho.setBounds(190, 190, 170, 40);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("Qnt:");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(150, 90, 100, 20);

        btn_limpa.setText("LIMPAR CAMPOS");
        btn_limpa.setEnabled(false);
        btn_limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_limpa);
        btn_limpa.setBounds(10, 340, 360, 50);

        add(jPanel5);
        jPanel5.setBounds(750, 120, 380, 400);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setText("Observações:");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(10, 10, 130, 21);

        field_observacao.setColumns(20);
        field_observacao.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        field_observacao.setRows(5);
        jScrollPane2.setViewportView(field_observacao);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(130, 10, 590, 90);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel11.setText("Itens / Qnt.:");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(810, 50, 160, 30);

        field_itensQnt.setEditable(false);
        field_itensQnt.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jPanel6.add(field_itensQnt);
        field_itensQnt.setBounds(960, 46, 130, 40);

        add(jPanel6);
        jPanel6.setBounds(10, 530, 1120, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerItemActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();

        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto().equals(tableDefault.getValueAt(posicao, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                produtos.remove(produtos.get(i)); // remove o item;
                adicionarItens();
                //limpa os campos
                camp_buscarProduto.setText("");
                field_preco.setText("0,00");
                field_qnt.setText("0");
                field_qnt.setEnabled(false);
                break;
            }
        }
        btn_removerItem.setEnabled(false);
    }//GEN-LAST:event_btn_removerItemActionPerformed

    private void jTable_produtoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_produtoKeyReleased
        carregaCampoSelecionado();
    }//GEN-LAST:event_jTable_produtoKeyReleased

    private void jTable_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_produtoMouseClicked
        carregaCampoSelecionado();
        btn_removerItem.setEnabled(true);
        field_qnt.setEnabled(true);
        btn_limpa.setEnabled(true);
    }//GEN-LAST:event_jTable_produtoMouseClicked

    private void btn_buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProdutoActionPerformed
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                s.setVisible(true);
                s.carregaCampos();
                s.setVariavelProduto(produto);
                s.field_nome.setText("");
                btn_removerItem.setEnabled(false);
                carregando.dispose();
            }

        };
        t.start();


    }//GEN-LAST:event_btn_buscarProdutoActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        FinalizarVenda fv = new FinalizarVenda();
        String observacao = field_observacao.getText();
        camp_cliente.requestFocus();
        btn_removerItem.setEnabled(false);
        jDesktopPane1.removeAll();

        Venda venda = new Venda();
        fv.setLocation(0, 0);
        fv.setSize(1140, 650);
        fv.setVisible(true);
        fv.carregarComboBox();
        fv.valorTotal();
        fv.setLista(produtos);
        fv.setVenda(venda);
        fv.setCliente(cliente);
        fv.camp_Acrescimo.setText("0,00");
        try {
            fv.camp_cliente.setText(cliente.getNome());
        } catch (Exception e) {
            System.out.println("sem cliente");
        }
        fv.setObservacaoVenda(observacao);
        fv.dataVenda.setDate(new Date()); // sempre adiciona a data atual
        fv.camp_qtdeParcelas.setVisible(false);
        fv.camp_valorParcelas.setVisible(false);
        jDesktopPane1.add(fv);

    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void field_qntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_qntActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;
        try {
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                if (bancoMariaDB.productBook().get(i).getIdProduto().equals(tableDefault.getValueAt(posicao, 0))) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                    int quantidade = bancoMariaDB.productBook().get(i).getQnt(); // pega quantidade que tem em estoque;

                    if (Integer.parseInt(field_qnt.getText()) > quantidade) {
                        field_qnt.setText(String.valueOf(produtos.get(posicao).getQnt()));
                        JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">ITEM SÓ CONTÉM " + quantidade + " EM ESTOQUE</font></html>");
                    } else {
                        produtos.get(posicao).setQnt(Integer.parseInt(field_qnt.getText()));
                        adicionarItens();
                        field_qnt.setText("");
                        camp_buscarProduto.setText("");
                        field_preco.setText("");
                    }
                    camp_total.requestFocus(); // muda o foco do cursor do mouse
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "SELECIONE O ITEM NA TABELA");
        }

    }//GEN-LAST:event_field_qntActionPerformed

    private void field_qntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_qntMouseClicked
        btn_removerItem.setEnabled(false);
    }//GEN-LAST:event_field_qntMouseClicked

    private void camp_buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_buscarProdutoActionPerformed
        String pesquisa = camp_buscarProduto.getText();
        List<Produto> listaProduto = bancoMariaDB.filtrarProdutoNome(pesquisa);

        for (Produto produto1 : listaProduto) {
            if (produto1.isStatus()) {
                produto = produto1;
            }

        }

        try {
            System.out.println(produto.getNome());
            camp_buscarProduto.setText(produto.getNome());
            camp_Cor.setText(produto.getCor());
            camp_tamanho.setText(produto.getTamanho());
            field_preco.setText("" + produto.getValor_venda());
            field_qnt.setText("" + 1);
            field_qnt.setEnabled(true);
            btn_adcionar.setEnabled(true);
            btn_limpa.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Item não encontrado!");
        }

    }//GEN-LAST:event_camp_buscarProdutoActionPerformed

    private void camp_buscarProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camp_buscarProdutoFocusLost
        if (camp_buscarProduto.getText().length() <= 0) {
            camp_Cor.setText("");
            camp_tamanho.setText("");
            field_preco.setText("");
            field_qnt.setText("");
            btn_adcionar.setEnabled(false);
            field_qnt.setEnabled(false);
        }
    }//GEN-LAST:event_camp_buscarProdutoFocusLost

    private void btn_adcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adcionarActionPerformed
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();

        try {
            for (int i = 0; i < bancoMariaDB.productBook().size(); i++) {
                if (bancoMariaDB.productBook().get(i).getIdProduto().equals(produto.getIdProduto())) {// VERIFICA SE O ID DO OBJETO CONTEM NO BANCO DE DADOS
                    int quantidade = bancoMariaDB.productBook().get(i).getQnt(); // pega quantidade que tem em estoque;

                    if (Integer.parseInt(field_qnt.getText()) > quantidade) {
                        field_qnt.setText(String.valueOf(produto.getQnt()));
                        JOptionPane.showMessageDialog(null, "<html><font color=\"#FF0000\">ITEM SÓ CONTÉM " + quantidade + " EM ESTOQUE</font></html>");
                    } else {
                        for (Produto produto2 : produtos) {
                            // faz a comparação do item se ja tem na lista, e só atualiza a quantidade de item;
                            if (produto2.getIdProduto() == produto.getIdProduto() & (Integer.parseInt(field_qnt.getText()) + produto2.getQnt() <= produto.getQnt())) {

                                produto2.setQnt(Integer.parseInt(field_qnt.getText()) + produto2.getQnt()); // adiciona o produto + a quantidade que ele ja tinha;
                                produto.setCor(camp_Cor.getText());
                                produto.setTamanho(camp_tamanho.getText());
                                adicionarItens(); // adiciona os itens na tabela de itens na tela vendas;
                                camp_buscarProduto.setText("");
                                camp_Cor.setText("");
                                camp_tamanho.setText("");
                                field_preco.setText("");
                                field_qnt.setText("");
                                field_qnt.setEnabled(false);
                                btn_adcionar.setEnabled(false);
                                tt = false; // impedi de repetir o item na tebela;
                                break;
                            }

                        }
                        if (tt) {
                            produto.setQnt(Integer.parseInt(field_qnt.getText()));
                            produto.setCor(camp_Cor.getText());
                            produto.setTamanho(camp_tamanho.getText());
                            produtos.add(produto);
                            camp_buscarProduto.setText("");
                            camp_Cor.setText("");
                            camp_tamanho.setText("");
                            field_preco.setText("");
                            field_qnt.setText("");
                            field_qnt.setEnabled(false);
                            btn_adcionar.setEnabled(false);
                            adicionarItens();
                        }
                        tt = true;
                    }
                    camp_total.requestFocus(); // muda o foco do cursor do mouse
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "SELECIONE O ITEM NA TABELA");
        }

        adicionarItens();
    }//GEN-LAST:event_btn_adcionarActionPerformed

    private void btn_limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpaActionPerformed
        camp_buscarProduto.setText("");
        camp_Cor.setText("");
        camp_tamanho.setText("");
        field_preco.setText("");
        field_qnt.setText("");
        field_qnt.setEnabled(false);
        btn_adcionar.setEnabled(false);
        btn_limpa.setEnabled(false);
    }//GEN-LAST:event_btn_limpaActionPerformed

    private void btn_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClienteMouseClicked
        TelaCadastroCliente cc = new TelaCadastroCliente();
        jDesktopPane1.removeAll();
        cc.setLocation(0, 0);
        cc.setSize(1140, 650);
        cc.setVisible(true);
        jDesktopPane1.add(cc);
    }//GEN-LAST:event_btn_ClienteMouseClicked

    private void btn_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendaMouseClicked
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

    }//GEN-LAST:event_btn_vendaMouseClicked

    private void camp_nomeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camp_nomeClienteMouseClicked
        TelaBuscarCliente tbp = new TelaBuscarCliente();
        tbp.setVisible(true);
        tbp.carregarTabelaCliente();
        tbp.setClient(cliente);
    }//GEN-LAST:event_camp_nomeClienteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        TelaCaixa caixa = new TelaCaixa();
        jDesktopPane1.removeAll();
        caixa.setLocation(0, 0);
        caixa.setSize(1140, 650);
        caixa.setVisible(true);
        jDesktopPane1.add(caixa);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Cliente;
    public static javax.swing.JButton btn_adcionar;
    public static javax.swing.JButton btn_buscarProduto;
    private javax.swing.JButton btn_finalizar;
    public static javax.swing.JButton btn_limpa;
    private javax.swing.JButton btn_removerItem;
    private javax.swing.JLabel btn_venda;
    public static javax.swing.JTextField camp_Cor;
    public static javax.swing.JTextField camp_buscarProduto;
    public static javax.swing.JTextField camp_nomeCliente;
    public static javax.swing.JTextField camp_tamanho;
    public static javax.swing.JTextField camp_total;
    public static javax.swing.JTextField field_itensQnt;
    private javax.swing.JTextArea field_observacao;
    public static javax.swing.JFormattedTextField field_preco;
    public static javax.swing.JFormattedTextField field_qnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_produto;
    public static javax.swing.JLabel jlabel_totalVenda;
    // End of variables declaration//GEN-END:variables

    public static void adicionarItens() {
        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();

        try {
            Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

            int y = 0;
            int x = 0;
            int z = 0;
            tableDefault.setNumRows(0); // LIMPA OS NOMES DA PESQUISA ENTERIOR
            for (Produto produto : produtos) {
                // faz o calculo da quantidade de itens;
                x = produto.getQnt();
                y = z + x;
                z = y;
                tableDefault.addRow(new Object[]{produto.getIdProduto(), produto.getNome(), produto.getCor(), dinheiro.format(produto.getValor_venda()), produto.getQnt()});
                field_preco.setText(String.valueOf(dinheiro.format(produto.getValor_venda())));// colocar o valor do item no campo preco;             

                field_qnt.setText(String.valueOf(produto.getQnt()));
            }
            calculoValorTotal();
            field_itensQnt.setText("" + z);
            jLabelQuantidadeItens.setText("" + z);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void calculoValorTotal() {
        double y = 0;
        double x = 0;
        double z = 0;
        for (int i = 0; i < produtos.size(); i++) {
            x = produtos.get(i).getValor_venda() * produtos.get(i).getQnt();
            y = z + x;
            z = y;
        }
        Locale localeBR = new Locale("pt", "BR"); //declaração da variável do tipo Locale, responsável por definir o idioma e localidade a serem utilizados nas formatações;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        camp_total.setText(dinheiro.format(z)); //valor total dos itens
        jlabel_totalVenda.setText(dinheiro.format(z)); //valor total dos itens

    }

    public static void carregaCampoSelecionado() {

        DefaultTableModel tableDefault = (DefaultTableModel) jTable_produto.getModel();
        int posicao = jTable_produto.getSelectedRow(); // pegar a posição na linha selecionada;

        camp_buscarProduto.setText(tableDefault.getValueAt(posicao, 1).toString()); //Nome do produto
        field_preco.setText(tableDefault.getValueAt(posicao, 3).toString()); // preco do produto
        field_qnt.setText(tableDefault.getValueAt(posicao, 4).toString()); //quantidade do item

    }

    public static void carregaCampos(Produto pp) {
        produto = pp;
        camp_buscarProduto.setText(produto.getNome());
        camp_tamanho.setText(produto.getTamanho());
        camp_Cor.setText(produto.getCor());
        field_preco.setText("" + produto.getValor_venda());
        field_qnt.setText("" + 1);
        btn_adcionar.setEnabled(true);
        btn_limpa.setEnabled(true);
        field_qnt.setEnabled(true);
    }

}
