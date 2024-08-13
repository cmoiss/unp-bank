package View;

import Control.BuscasContaBancaria;
import Control.MovimentacoesBancarias;
import Control.TipoPessoa;
import Model.ContaBancaria;

public class TelaLadoCliente extends javax.swing.JFrame {

    String cpf = null;

    ContaBancaria contaBancaria = new ContaBancaria(null, 0);
    MovimentacoesBancarias movimentacoesBancarias;
    BuscasContaBancaria buscar;

    public TelaLadoCliente(String cpf) {
        initComponents();

        setTitle("Menu de Pesquisa");
        //setIconImage();
        setResizable(false);
        setLocationRelativeTo(null);

        this.cpf = cpf;
        this.movimentacoesBancarias = new MovimentacoesBancarias(cpf, contaBancaria, labelSaldoAtual);

        buscar = new BuscasContaBancaria(contaBancaria);
        setLabelNomeCliente();
        buscar.buscarIDContaCliente(cpf);

        movimentacoesBancarias.atualizarSaldo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLadoCliente = new javax.swing.JPanel();
        labelNomeCliente = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelSaldoAtual = new javax.swing.JLabel();
        botEfetuarDepósito = new javax.swing.JButton();
        botEfetuarTransferência = new javax.swing.JButton();
        butSaque = new javax.swing.JButton();
        botAtualizar = new javax.swing.JButton();
        botVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelLadoCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelLadoCliente.setPreferredSize(new java.awt.Dimension(500, 300));

        labelNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeCliente.setText("Olá, [Nome do Cliente da Silva Neto da Cunha Lima]");
        labelNomeCliente.setToolTipText("");

        labelSaldo.setText("Saldo:");

        labelSaldoAtual.setBackground(new java.awt.Color(204, 204, 204));
        labelSaldoAtual.setText("R$0000,00");
        labelSaldoAtual.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botEfetuarDepósito.setText("Efetuar Depósito");
        botEfetuarDepósito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEfetuarDepósitoMouseClicked(evt);
            }
        });
        botEfetuarDepósito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEfetuarDepósitoActionPerformed(evt);
            }
        });
        botEfetuarDepósito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botEfetuarDepósitoKeyPressed(evt);
            }
        });

        botEfetuarTransferência.setText("Transferência bancária");
        botEfetuarTransferência.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEfetuarTransferênciaMouseClicked(evt);
            }
        });
        botEfetuarTransferência.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEfetuarTransferênciaActionPerformed(evt);
            }
        });
        botEfetuarTransferência.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botEfetuarTransferênciaKeyPressed(evt);
            }
        });

        butSaque.setText("Efetuar Saque");
        butSaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSaqueMouseClicked(evt);
            }
        });
        butSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaqueActionPerformed(evt);
            }
        });
        butSaque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                butSaqueKeyPressed(evt);
            }
        });

        botAtualizar.setText("Atualizar");
        botAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botAtualizarMouseClicked(evt);
            }
        });
        botAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAtualizarActionPerformed(evt);
            }
        });
        botAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botAtualizarKeyPressed(evt);
            }
        });

        botVoltar.setText("Voltar");
        botVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botVoltarMouseClicked(evt);
            }
        });
        botVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarActionPerformed(evt);
            }
        });
        botVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botVoltarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painelLadoClienteLayout = new javax.swing.GroupLayout(painelLadoCliente);
        painelLadoCliente.setLayout(painelLadoClienteLayout);
        painelLadoClienteLayout.setHorizontalGroup(
            painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLadoClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelLadoClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                                .addComponent(labelSaldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botEfetuarTransferência, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botEfetuarDepósito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLadoClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botEfetuarDepósito, botEfetuarTransferência, butSaque});

        painelLadoClienteLayout.setVerticalGroup(
            painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaldo)
                    .addComponent(labelSaldoAtual)
                    .addComponent(botAtualizar))
                .addGap(18, 18, 18)
                .addComponent(botEfetuarDepósito)
                .addGap(18, 18, 18)
                .addComponent(butSaque)
                .addGap(18, 18, 18)
                .addComponent(botEfetuarTransferência)
                .addGap(18, 18, 18)
                .addComponent(botVoltar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLadoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelLadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botAtualizarKeyPressed
        movimentacoesBancarias.atualizarSaldo();
    }//GEN-LAST:event_botAtualizarKeyPressed

    private void botAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAtualizarActionPerformed
        movimentacoesBancarias.atualizarSaldo();
    }//GEN-LAST:event_botAtualizarActionPerformed

    private void botAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botAtualizarMouseClicked
        movimentacoesBancarias.atualizarSaldo();
    }//GEN-LAST:event_botAtualizarMouseClicked

    private void butSaqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butSaqueKeyPressed
        sacar();
    }//GEN-LAST:event_butSaqueKeyPressed

    private void butSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaqueActionPerformed
        sacar();
    }//GEN-LAST:event_butSaqueActionPerformed

    private void butSaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSaqueMouseClicked
        sacar();
    }//GEN-LAST:event_butSaqueMouseClicked

    private void botEfetuarTransferênciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botEfetuarTransferênciaKeyPressed
        transferir();
    }//GEN-LAST:event_botEfetuarTransferênciaKeyPressed

    private void botEfetuarTransferênciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarTransferênciaActionPerformed
        transferir();
    }//GEN-LAST:event_botEfetuarTransferênciaActionPerformed

    private void botEfetuarTransferênciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarTransferênciaMouseClicked
        transferir();
    }//GEN-LAST:event_botEfetuarTransferênciaMouseClicked

    private void botEfetuarDepósitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botEfetuarDepósitoKeyPressed
        depositar();
    }//GEN-LAST:event_botEfetuarDepósitoKeyPressed

    private void botEfetuarDepósitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarDepósitoActionPerformed
        depositar();
    }//GEN-LAST:event_botEfetuarDepósitoActionPerformed

    private void botEfetuarDepósitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarDepósitoMouseClicked
        depositar();
    }//GEN-LAST:event_botEfetuarDepósitoMouseClicked

    private void botVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botVoltarMouseClicked
        voltar();
    }//GEN-LAST:event_botVoltarMouseClicked

    private void botVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_botVoltarActionPerformed

    private void botVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botVoltarKeyPressed
        voltar();
    }//GEN-LAST:event_botVoltarKeyPressed

    private void depositar() {
        movimentacoesBancarias.depositar();
    }

    private void sacar() {
        movimentacoesBancarias.sacar();
    }

    private void transferir() {
        movimentacoesBancarias.transferir();
    }

    private void voltar() {
        this.dispose();
        new TelaLogin(TipoPessoa.CLIENTE).setVisible(true);
    }

    private void setLabelNomeCliente() {
        labelNomeCliente.setText("Olá, " + buscar.buscarNomeCliente(cpf));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAtualizar;
    private javax.swing.JButton botEfetuarDepósito;
    private javax.swing.JButton botEfetuarTransferência;
    private javax.swing.JButton botVoltar;
    private javax.swing.JButton butSaque;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaldoAtual;
    private javax.swing.JPanel painelLadoCliente;
    // End of variables declaration//GEN-END:variables
}
