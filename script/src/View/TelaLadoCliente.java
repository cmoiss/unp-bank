package View;

import Control.DAO.CRUD.PegarCliente;
import Control.DAO.Conta.BuscarIDConta;
import Model.ContaBancaria;

public class TelaLadoCliente extends javax.swing.JFrame {
    String cpf = null;
    
    public TelaLadoCliente(String cpf) {
        initComponents();
        
        this.cpf = cpf;
        
        mostrarSaldo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLadoCliente = new javax.swing.JPanel();
        painelFotoCliente = new javax.swing.JPanel();
        labelNomeCliente = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelSaldoAtual = new javax.swing.JLabel();
        botEfetuarDepósito = new javax.swing.JButton();
        botEfetuarTransferência = new javax.swing.JButton();
        botAdicionarFoto = new javax.swing.JButton();
        butSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelLadoCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelLadoCliente.setPreferredSize(new java.awt.Dimension(500, 300));

        painelFotoCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelFotoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelFotoClienteLayout = new javax.swing.GroupLayout(painelFotoCliente);
        painelFotoCliente.setLayout(painelFotoClienteLayout);
        painelFotoClienteLayout.setHorizontalGroup(
            painelFotoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        painelFotoClienteLayout.setVerticalGroup(
            painelFotoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

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

        botAdicionarFoto.setText("Adicionar foto");
        botAdicionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdicionarFotoActionPerformed(evt);
            }
        });

        butSaque.setText("Efetuar Saque");
        butSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLadoClienteLayout = new javax.swing.GroupLayout(painelLadoCliente);
        painelLadoCliente.setLayout(painelLadoClienteLayout);
        painelLadoClienteLayout.setHorizontalGroup(
            painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLadoClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botEfetuarTransferência, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botEfetuarDepósito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(butSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLadoClienteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(painelFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                                .addComponent(labelSaldo)
                                .addGap(18, 18, 18)
                                .addComponent(labelSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelLadoClienteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(botAdicionarFoto)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painelLadoClienteLayout.setVerticalGroup(
            painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLadoClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFotoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLadoClienteLayout.createSequentialGroup()
                        .addComponent(labelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSaldo)
                            .addComponent(labelSaldoAtual))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botAdicionarFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(painelLadoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEfetuarDepósito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butSaque))
                .addGap(26, 26, 26)
                .addComponent(botEfetuarTransferência)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelLadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botEfetuarDepósitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarDepósitoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botEfetuarDepósitoMouseClicked

    private void botEfetuarDepósitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarDepósitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botEfetuarDepósitoActionPerformed

    private void botEfetuarTransferênciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarTransferênciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botEfetuarTransferênciaMouseClicked

    private void botEfetuarTransferênciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarTransferênciaActionPerformed

    }//GEN-LAST:event_botEfetuarTransferênciaActionPerformed

    private void botAdicionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdicionarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botAdicionarFotoActionPerformed

    private void butSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butSaqueActionPerformed

    private void mostrarSaldo() {
        labelSaldoAtual.setText("R$" + buscarSaldo());
    }
    
    private double buscarSaldo() {
        double saldoAtual;
        String id = buscarIDContaCliente(this.cpf);
        
        PegarCliente cliente = new PegarCliente();
        ContaBancaria saldo = new ContaBancaria(null, 0);
        
        saldoAtual = saldo.getVerificarSaldo(id);
        
        return saldoAtual;
    }
    
    private String buscarIDContaCliente(String cpf) {
        String id = null;
        
        BuscarIDConta buscaID = new BuscarIDConta();
        
        return buscaID.getBuscarIdConta(cpf);
    }
    
    private void buscarCliente() {
        PegarCliente cliente = new PegarCliente();
        cliente.getPegarClienteUnico(this.cpf);
    }
    
    private void buscarConta() {
        BuscarIDConta buscarID = new BuscarIDConta();
        buscarID.getBuscarIdConta(cpf);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAdicionarFoto;
    private javax.swing.JButton botEfetuarDepósito;
    private javax.swing.JButton botEfetuarTransferência;
    private javax.swing.JButton butSaque;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaldoAtual;
    private javax.swing.JPanel painelFotoCliente;
    private javax.swing.JPanel painelLadoCliente;
    // End of variables declaration//GEN-END:variables
}
