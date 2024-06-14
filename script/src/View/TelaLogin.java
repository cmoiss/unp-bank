package View;

import Control.DAO.LoginDAO;
import Control.TipoPessoa;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    private String login = null;
    private String senha = null;
    private TipoPessoa tipoPessoa = null;

    public TelaLogin(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        caixaTextoLogin = new javax.swing.JTextField();
        logotipoUNPBANK = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botEfetuarLogin = new javax.swing.JButton();
        caixaTextoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelTelaLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("LOGIN DE " + tipoPessoa));

        jLabel3.setText("Senha:");

        caixaTextoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoLoginActionPerformed(evt);
            }
        });

        logotipoUNPBANK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/media/unp banco.png"))); // NOI18N
        logotipoUNPBANK.setText("jLabel1");

        jLabel2.setText("Login:");

        botEfetuarLogin.setText("Efetuar Login");
        botEfetuarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEfetuarLoginMouseClicked(evt);
            }
        });
        botEfetuarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEfetuarLoginActionPerformed(evt);
            }
        });

        caixaTextoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTelaLoginLayout = new javax.swing.GroupLayout(painelTelaLogin);
        painelTelaLogin.setLayout(painelTelaLoginLayout);
        painelTelaLoginLayout.setHorizontalGroup(
            painelTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(painelTelaLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(caixaTextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTelaLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)
                        .addComponent(caixaTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botEfetuarLogin)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaLoginLayout.createSequentialGroup()
                        .addComponent(logotipoUNPBANK, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        painelTelaLoginLayout.setVerticalGroup(
            painelTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logotipoUNPBANK, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caixaTextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caixaTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(botEfetuarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaTextoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoSenhaActionPerformed
        this.senha = caixaTextoSenha.getText();
    }//GEN-LAST:event_caixaTextoSenhaActionPerformed

    private void caixaTextoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoLoginActionPerformed
        this.login = caixaTextoLogin.getText();
    }//GEN-LAST:event_caixaTextoLoginActionPerformed

    private void botEfetuarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarLoginActionPerformed
        efetuarLogin();
    }//GEN-LAST:event_botEfetuarLoginActionPerformed

    private void botEfetuarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarLoginMouseClicked
        efetuarLogin();
    }//GEN-LAST:event_botEfetuarLoginMouseClicked

    private void efetuarLogin() {
        LoginDAO loginDAO = new LoginDAO(tipoPessoa);
        
        if (loginDAO.LoginCheck(login, senha) == true) {
            if (tipoPessoa == TipoPessoa.GERENTE) {
            this.dispose();
            new TelaPesquisaPessoa().setVisible(true);
        } 
        
        } else {
            JOptionPane.showMessageDialog(null, "Usuário/senha não identificados! Por favor, tente novamente", "Erro no login!", JOptionPane.ERROR_MESSAGE);
        } 
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin(TipoPessoa.CLIENTE).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEfetuarLogin;
    private javax.swing.JTextField caixaTextoLogin;
    private javax.swing.JPasswordField caixaTextoSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logotipoUNPBANK;
    private javax.swing.JPanel painelTelaLogin;
    // End of variables declaration//GEN-END:variables
}
