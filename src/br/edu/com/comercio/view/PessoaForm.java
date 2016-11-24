package br.edu.com.comercio.view;

import br.com.comercio.database.DataBase;
import br.com.comercio.database.MovimentoDAO;
import br.com.comercio.database.PessoaDAO;
import br.com.comercio.modelo.Movimento;
import br.com.comercio.modelo.Pessoa;
import br.com.comercio.modelo.QuantidadeInvalidaException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PessoaForm extends javax.swing.JFrame {

    public PessoaForm() {
        initComponents();
        inicializar();
    }

    private void inicializar() {
        try {
            pessoaDAO = new PessoaDAO(DataBase.getConnection());
            movimentoDAO = new MovimentoDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        pessoas = new ArrayList<>();
        movimentos = new ArrayList<>();
        pessoaTableModel = new PessoaTableModel(pessoas);
        movimentoTableModel = new MovimentoTableModel(movimentos);
        tbPessoas.setModel(pessoaTableModel);
        tbMovimentos.setModel(movimentoTableModel);

        btPesquisar.setEnabled(true);
        btMovimento.setEnabled(false);
        btNovo.setEnabled(true);
        btGravar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmpesquisar = new javax.swing.JFrame();
        painelPesquisar = new javax.swing.JPanel();
        lblNomePesquisa = new javax.swing.JLabel();
        edNomePesquisa = new javax.swing.JTextField();
        btPesquisarPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPessoas = new javax.swing.JTable();
        frmmovimentos = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edQuantidade = new javax.swing.JTextField();
        rbtDepositar = new javax.swing.JRadioButton();
        rbtSacar = new javax.swing.JRadioButton();
        btGravarMov = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMovimentos = new javax.swing.JTable();
        lblHistoricoMov = new javax.swing.JLabel();
        ftfData = new javax.swing.JFormattedTextField();
        lblSaldoMov = new javax.swing.JLabel();
        edSaldoMov = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        edId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        edSaldo = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btMovimento = new javax.swing.JButton();

        frmpesquisar.setTitle("Pesquisar Pessoa");
        frmpesquisar.setSize(new java.awt.Dimension(500, 400));

        lblNomePesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNomePesquisa.setText("Nome:");

        edNomePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edNomePesquisaKeyPressed(evt);
            }
        });

        btPesquisarPesquisar.setText("Pesquisar");
        btPesquisarPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarPesquisarActionPerformed(evt);
            }
        });

        tbPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPessoasMouseClicked(evt);
            }
        });
        tbPessoas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPessoasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbPessoas);

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomePesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edNomePesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisarPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPesquisarPesquisar)
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edNomePesquisa)
                            .addComponent(lblNomePesquisa))
                        .addGap(2, 2, 2)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmpesquisarLayout = new javax.swing.GroupLayout(frmpesquisar.getContentPane());
        frmpesquisar.getContentPane().setLayout(frmpesquisarLayout);
        frmpesquisarLayout.setHorizontalGroup(
            frmpesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmpesquisarLayout.setVerticalGroup(
            frmpesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmmovimentos.setSize(new java.awt.Dimension(500, 400));

        jLabel1.setText("Data:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Operação:");

        buttonGroup1.add(rbtDepositar);
        rbtDepositar.setText("Depositar");

        buttonGroup1.add(rbtSacar);
        rbtSacar.setText("Sacar");

        btGravarMov.setText("Gravar Movimento");
        btGravarMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarMovActionPerformed(evt);
            }
        });

        tbMovimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMovimentos.setToolTipText("");
        tbMovimentos.setName(""); // NOI18N
        jScrollPane2.setViewportView(tbMovimentos);
        tbMovimentos.getAccessibleContext().setAccessibleName("");

        lblHistoricoMov.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHistoricoMov.setText("Histórico de Movimentos");

        try {
            ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblSaldoMov.setText("Saldo:");

        edSaldoMov.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtDepositar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtSacar))
                            .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSaldoMov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edSaldoMov))
                            .addComponent(btGravarMov, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblHistoricoMov)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaldoMov)
                            .addComponent(edSaldoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbtDepositar)
                            .addComponent(rbtSacar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btGravarMov, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblHistoricoMov)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout frmmovimentosLayout = new javax.swing.GroupLayout(frmmovimentos.getContentPane());
        frmmovimentos.getContentPane().setLayout(frmmovimentosLayout);
        frmmovimentosLayout.setHorizontalGroup(
            frmmovimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmmovimentosLayout.setVerticalGroup(
            frmmovimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comércio de Soja");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        lblId.setText("Id:");

        edId.setEditable(false);

        lblNome.setText("Nome:");

        lblSaldo.setText("Saldo:");

        edSaldo.setEditable(false);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btMovimento.setText("Movimento");
        btMovimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGravar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMovimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(btNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblId, lblNome, lblSaldo});

        painelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btExcluir, btGravar, btMovimento, btNovo, btPesquisar});

        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMovimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblId, lblNome, lblSaldo});

        painelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCancelar, btExcluir, btGravar, btMovimento, btNovo, btPesquisar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarPesquisarActionPerformed
        pesquisaPessoa();
    }//GEN-LAST:event_btPesquisarPesquisarActionPerformed

    private void tbPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPessoasMouseClicked
        if (evt.getClickCount() == 2) {
            selecionarPessoa();
        }
    }//GEN-LAST:event_tbPessoasMouseClicked

    private void btGravarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarMovActionPerformed
        Date data = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            data = df.parse(ftfData.getText());
            movimento = new Movimento();
            movimento.setData(data);
            movimento.setQuant(Integer.parseInt(edQuantidade.getText()));
            if (rbtDepositar.isSelected()) {
                movimento.setOpe("D");
                pessoa.depositar(movimento.getQuant());
            } else {
                movimento.setOpe("S");
                pessoa.sacar(movimento.getQuant());
            }

            movimento.setId_pessoa(Integer.parseInt(edId.getText()));
            Integer id = movimentoDAO.create(movimento);
            pessoaDAO.update(pessoa);
            edSaldo.setText(pessoa.getSaldo().toString());
            movimento.setId(id);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (QuantidadeInvalidaException qi) {
            ///Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, qi);
            JOptionPane.showMessageDialog(this, qi.getMessage(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ///Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gravar pessoa", "Erro", JOptionPane.ERROR);
        } catch (ParseException ex) {
            //Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Data invalida", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            ftfData.setText("");
            // data inválida
        }

        ftfData.setText("");
        edQuantidade.setText("");
        rbtDepositar.setSelected(false);
        rbtSacar.setSelected(false);

        frmmovimentos.setLocationRelativeTo(null);
        frmmovimentos.setVisible(true);
        try {
            movimentos = movimentoDAO.findyById_pessoa(Integer.parseInt(edId.getText()));
            movimentoTableModel.setMovimentos(movimentos);
            movimentoTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btGravarMovActionPerformed

    private void btMovimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoActionPerformed
        frmmovimentos.setLocationRelativeTo(null);
        edSaldoMov.setText(pessoa.getSaldo().toString());
        frmmovimentos.setVisible(true);
        try {
            movimentos = movimentoDAO.findyById_pessoa(Integer.parseInt(edId.getText()));
            movimentoTableModel.setMovimentos(movimentos);
            movimentoTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMovimentoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resultado == 0) {
            try {
                pessoaDAO.delete(pessoa);
                movimentoDAO.delete(pessoa.getId());
                edId.setText("");
                edNome.setText("");
                edSaldo.setText("");

                btPesquisar.setEnabled(true);
                btMovimento.setEnabled(false);
                btNovo.setEnabled(true);
                btGravar.setEnabled(false);
                btExcluir.setEnabled(false);
                btCancelar.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao excluir", "Erro", JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        pessoa = null;
        edId.setText("");
        edNome.setText("");
        edSaldo.setText("");

        btNovo.setEnabled(true);
        btGravar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        btPesquisar.setEnabled(true);
        btMovimento.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        if (edId.getText() != null && !edId.getText().isEmpty()) {
            pessoa.setId(Integer.parseInt(edId.getText()));
            pessoa.setSaldo(Integer.parseInt(edSaldo.getText()));
        } else {
            pessoa.setSaldo(0);
        }
        pessoa.setNome(edNome.getText());

        try {
            if (pessoa.getId() == null || pessoa.getId() == 0) {
                Integer id = pessoaDAO.create(pessoa);
                pessoa.setId(id);
                edId.setText(id.toString());
            } else {
                pessoaDAO.update(pessoa);
            }

            btNovo.setEnabled(true);
            btPesquisar.setEnabled(true);
            btMovimento.setEnabled(true);
            btExcluir.setEnabled(true);
            btCancelar.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gravar pessoa", "Erro", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btGravarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        edNomePesquisa.setText("");
        edNomePesquisa.grabFocus();
        pessoaTableModel.limpar();
        frmpesquisar.setLocationRelativeTo(null);
        frmpesquisar.setVisible(true);
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        pessoa = new Pessoa();
        edId.setText("");
        edNome.setText("");
        edNome.grabFocus();

        edNome.setEnabled(true);
        btNovo.setEnabled(false);
        btPesquisar.setEnabled(false);
        btMovimento.setEnabled(false);
        btGravar.setEnabled(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void edNomePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edNomePesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisaPessoa();
        }
    }//GEN-LAST:event_edNomePesquisaKeyPressed

    private void tbPessoasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPessoasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionarPessoa();
        }
    }//GEN-LAST:event_tbPessoasKeyPressed

    private void selecionarPessoa() {
        pessoa = pessoas.get(tbPessoas.getSelectedRow());
        edId.setText(pessoa.getId().toString());
        edNome.setText(pessoa.getNome());
        edSaldo.setText(pessoa.getSaldo().toString());

        frmpesquisar.setVisible(false);
        edNome.setEnabled(true);
        btPesquisar.setEnabled(true);
        btMovimento.setEnabled(true);
        btNovo.setEnabled(false);
        btGravar.setEnabled(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
    }

    private void pesquisaPessoa() {
        try {
            pessoas = pessoaDAO.findByNome(edNomePesquisa.getText());
            pessoaTableModel.setPessoas(pessoas);
            pessoaTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        tbPessoas.grabFocus();                     //da foco na tabela
        tbPessoas.addRowSelectionInterval(0, 0);  //seleciona a primeira linha
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btGravarMov;
    private javax.swing.JButton btMovimento;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edId;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNomePesquisa;
    private javax.swing.JTextField edQuantidade;
    private javax.swing.JTextField edSaldo;
    private javax.swing.JTextField edSaldoMov;
    private javax.swing.JFrame frmmovimentos;
    private javax.swing.JFrame frmpesquisar;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHistoricoMov;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomePesquisa;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoMov;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JRadioButton rbtDepositar;
    private javax.swing.JRadioButton rbtSacar;
    private javax.swing.JTable tbMovimentos;
    private javax.swing.JTable tbPessoas;
    // End of variables declaration//GEN-END:variables
    private Pessoa pessoa;
    private Movimento movimento;
    private PessoaDAO pessoaDAO;
    private MovimentoDAO movimentoDAO;
    private List<Pessoa> pessoas;
    private List<Movimento> movimentos;
    private PessoaTableModel pessoaTableModel;
    private MovimentoTableModel movimentoTableModel;
}
