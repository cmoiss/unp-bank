package View;

import Control.TipoPessoa;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaInicial = new javax.swing.JPanel();
        botSouCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botSouGerente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaInicial.setName("tela login"); // NOI18N
        painelTelaInicial.setPreferredSize(new java.awt.Dimension(500, 300));

        botSouCliente.setText("Sou cliente");
        botSouCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botSouClienteMouseClicked(evt);
            }
        });
        botSouCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSouClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/media/unp banco.png"))); // NOI18N

        botSouGerente.setText("Sou gerente");
        botSouGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botSouGerenteMouseClicked(evt);
            }
        });
        botSouGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSouGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTelaInicialLayout = new javax.swing.GroupLayout(painelTelaInicial);
        painelTelaInicial.setLayout(painelTelaInicialLayout);
        painelTelaInicialLayout.setHorizontalGroup(
            painelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaInicialLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(painelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(botSouCliente)
                    .addComponent(botSouGerente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );
        painelTelaInicialLayout.setVerticalGroup(
            painelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaInicialLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(painelTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelTelaInicialLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(botSouCliente)
                        .addGap(25, 25, 25)
                        .addComponent(botSouGerente))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botSouGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSouGerenteActionPerformed
        chamarTelaLogin(TipoPessoa.GERENTE);
    }//GEN-LAST:event_botSouGerenteActionPerformed

    private void botSouClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSouClienteActionPerformed
        chamarTelaLogin(TipoPessoa.CLIENTE);
    }//GEN-LAST:event_botSouClienteActionPerformed

    private void botSouClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botSouClienteMouseClicked
        chamarTelaLogin(TipoPessoa.CLIENTE);
    }//GEN-LAST:event_botSouClienteMouseClicked

    private void botSouGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botSouGerenteMouseClicked
        chamarTelaLogin(TipoPessoa.GERENTE);
    }//GEN-LAST:event_botSouGerenteMouseClicked

    private void chamarTelaLogin(TipoPessoa tipoPessoa) {
        this.dispose(); //fecha tela atual
        new TelaLogin(tipoPessoa).setVisible(true); //abre tela de login
    }

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botSouCliente;
    private javax.swing.JButton botSouGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelTelaInicial;
    // End of variables declaration//GEN-END:variables
}
