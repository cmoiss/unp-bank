/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.DAO.CRUD_DAO;
import Control.TipoPessoa;
import Control.ValidarCPF;
import javax.swing.JOptionPane;

/**
 *
 * @author caio
 */
public class TelaPesquisaPessoa extends javax.swing.JFrame {

    private TipoPessoa tipoPessoa = null;

    public TelaPesquisaPessoa() {
        initComponents();
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
        botEditarItem = new javax.swing.JButton();
        botExcluirItem = new javax.swing.JButton();
        botCadastrarNovoItem = new javax.swing.JButton();
        caixaPesquisaUsuario = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        botEditarItem.setText("Editar");
        botEditarItem.setPreferredSize(new java.awt.Dimension(88, 25));
        botEditarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEditarItemMouseClicked(evt);
            }
        });
        botEditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEditarItemActionPerformed(evt);
            }
        });

        botExcluirItem.setText("Excluir");
        botExcluirItem.setPreferredSize(new java.awt.Dimension(88, 25));
        botExcluirItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botExcluirItemMouseClicked(evt);
            }
        });
        botExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirItemActionPerformed(evt);
            }
        });

        botCadastrarNovoItem.setText("Cadastrar");
        botCadastrarNovoItem.setPreferredSize(new java.awt.Dimension(88, 25));
        botCadastrarNovoItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botCadastrarNovoItemNovoItemMouseClicked(evt);
            }
        });
        botCadastrarNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCadastrarNovoItemActionPerformed(evt);
            }
        });
        botCadastrarNovoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botCadastrarNovoItemKeyPressed(evt);
            }
        });

        caixaPesquisaUsuario.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaPesquisaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        caixaPesquisaUsuario.setText("Digite o CPF...");
        caixaPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPesquisaUsuarioActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Gerente" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(55, 266));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(caixaPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botCadastrarNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botEditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botCadastrarNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botEditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEditarItemActionPerformed
        editar();
    }//GEN-LAST:event_botEditarItemActionPerformed

    private void botCadastrarNovoItemNovoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemNovoItemMouseClicked
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemNovoItemMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botCadastrarNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemActionPerformed
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemActionPerformed

    private void caixaPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaPesquisaUsuarioActionPerformed
        // Recebe o CPF digitado na caixa de pesquisa
        String cpf = caixaPesquisaUsuario.getText();
        ValidarCPF validador = new ValidarCPF();

        if (validador.getValidarCPF(cpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF inválido! Por favor, digite novamente.", "Validador de CPF", JOptionPane.ERROR_MESSAGE);
        } else {
            CRUD_DAO crud = new CRUD_DAO();
            crud.pesquisarTblCliente(cpf);
        }
    }//GEN-LAST:event_caixaPesquisaUsuarioActionPerformed

    private void botExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botExcluirItemActionPerformed

    private void botExcluirItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botExcluirItemMouseClicked
        int opçao = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir esse usuário?", "Excluir usuário", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        switch (opçao) {
            case JOptionPane.YES_OPTION -> {
                //Excluir item
                //Confirmação de exclusão
            }

            case JOptionPane.NO_OPTION -> {
                //Não excluir
            }

            default ->
                throw new AssertionError();
        }
    }//GEN-LAST:event_botExcluirItemMouseClicked

    private void botEditarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEditarItemMouseClicked
        editar();
    }//GEN-LAST:event_botEditarItemMouseClicked

    private void botCadastrarNovoItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemKeyPressed
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemKeyPressed

    private void editar() {
        // botão editar 
    }

    private void chamarTelaCadastro() {
        TipoPessoa pessoa = null;

        // Pergunta quem quer cadastrar
        int opçao = JOptionPane.showConfirmDialog(null,
                "Deseja cadastrar um cliente ou gerente?",
                "Selecionar tipo de cadastro",
                JOptionPane.YES_NO_OPTION);

        switch (opçao) {
            case JOptionPane.YES_OPTION -> {
                // Cadastrar cliente
                pessoa = TipoPessoa.CLIENTE;
            }

            case JOptionPane.NO_OPTION -> {
                // Cadastrar gerente
                pessoa = TipoPessoa.GERENTE;
            }

            default ->
                throw new AssertionError();
        }

        this.dispose();

        if (pessoa.equals(TipoPessoa.CLIENTE)) {
            new TelaCadastroCliente(pessoa).setVisible(true);
        } else if (pessoa.equals(TipoPessoa.GERENTE)) {
            new TelaCadastroGerente(pessoa).setVisible(true);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCadastrarNovoItem;
    private javax.swing.JButton botEditarItem;
    private javax.swing.JButton botExcluirItem;
    private javax.swing.JTextField caixaPesquisaUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
