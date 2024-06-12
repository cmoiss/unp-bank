package View;

public class TelaCadastro extends javax.swing.JFrame {
    private String tipoUsuario = null;
    
    public TelaCadastro(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastro = new javax.swing.JPanel();
        painelDadosPessoais = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        caixaTextoNome = new javax.swing.JTextField();
        caixaTextoDataNascimento = new javax.swing.JFormattedTextField();
        labelData = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        comboBoxSexo = new javax.swing.JComboBox<>();
        labelCPF = new javax.swing.JLabel();
        caixaTextoNome1 = new javax.swing.JTextField();
        painelDadosContato = new javax.swing.JPanel();
        caixaTextoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        caixaTextoCelular = new javax.swing.JTextField();
        painelDadosSenha3 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        botEfetuarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de " + this.tipoUsuario, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        labelNome.setText("Nome ");

        caixaTextoNome.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaTextoNome.setText("Digite o nome aqui...");
        caixaTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoNomeActionPerformed(evt);
            }
        });

        caixaTextoDataNascimento.setText("dd/mm/aaaa");
        caixaTextoDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoDataNascimentoActionPerformed(evt);
            }
        });

        labelData.setText("Data");

        labelSexo.setText("Sexo");

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino ", "Feminino" }));
        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });

        labelCPF.setText("CPF");

        caixaTextoNome1.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaTextoNome1.setText("Digite o cpf aqui (apenas números)");
        caixaTextoNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoNome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCPF)
                    .addComponent(caixaTextoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSexo)
                    .addComponent(comboBoxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(caixaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelData)
                        .addComponent(caixaTextoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexo)
                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNome)
                        .addComponent(labelData))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(caixaTextoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caixaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        painelDadosContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        caixaTextoEmail.setText("Digite o email aqui...");
        caixaTextoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoEmailActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

        labelCelular.setText("Celular");

        caixaTextoCelular.setText("dddxxxxxxxx");
        caixaTextoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosContatoLayout = new javax.swing.GroupLayout(painelDadosContato);
        painelDadosContato.setLayout(painelDadosContatoLayout);
        painelDadosContatoLayout.setHorizontalGroup(
            painelDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(caixaTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosContatoLayout.setVerticalGroup(
            painelDadosContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosContatoLayout.createSequentialGroup()
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaTextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        painelDadosSenha3.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout painelDadosSenha3Layout = new javax.swing.GroupLayout(painelDadosSenha3);
        painelDadosSenha3.setLayout(painelDadosSenha3Layout);
        painelDadosSenha3Layout.setHorizontalGroup(
            painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSenha3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosSenha3Layout.setVerticalGroup(
            painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSenha3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        botEfetuarCadastro.setText("Cadastrar");
        botEfetuarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEfetuarCadastroMouseClicked(evt);
            }
        });
        botEfetuarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEfetuarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosSenha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(botEfetuarCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosSenha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botEfetuarCadastro)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoNomeActionPerformed

    private void caixaTextoDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoDataNascimentoActionPerformed

    private void comboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoActionPerformed

    private void caixaTextoNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoNome1ActionPerformed

    private void caixaTextoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoEmailActionPerformed

    private void caixaTextoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCelularActionPerformed

    private void botEfetuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botEfetuarCadastroActionPerformed

    private void botEfetuarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarCadastroMouseClicked
                
    }//GEN-LAST:event_botEfetuarCadastroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEfetuarCadastro;
    private javax.swing.JTextField caixaTextoCelular;
    private javax.swing.JFormattedTextField caixaTextoDataNascimento;
    private javax.swing.JTextField caixaTextoEmail;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JTextField caixaTextoNome1;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelDadosContato;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelDadosSenha;
    private javax.swing.JPanel painelDadosSenha1;
    private javax.swing.JPanel painelDadosSenha2;
    private javax.swing.JPanel painelDadosSenha3;
    // End of variables declaration//GEN-END:variables
}
