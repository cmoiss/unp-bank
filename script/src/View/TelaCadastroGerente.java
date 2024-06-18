package View;

import Control.Idade;
import Control.CPF;
import Control.TipoPessoa;
import Model.Gerente;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroGerente extends javax.swing.JFrame {

    public TelaCadastroGerente() {
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
        caixaTextoCPF = new javax.swing.JTextField();
        painelDadosContato = new javax.swing.JPanel();
        caixaTextoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        caixaTextoCelular = new javax.swing.JTextField();
        painelDadosSenha3 = new javax.swing.JPanel();
        caixaTextoSenha = new javax.swing.JPasswordField();
        caixaTextoLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botEfetuarCadastro = new javax.swing.JButton();
        botVoltarMenuPesquisa = new javax.swing.JButton();
        botLimparDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE GERENTE");

        labelNome.setText("Nome ");

        caixaTextoNome.setFont(new java.awt.Font("Liberation Sans", 0, 13)); // NOI18N
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

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });

        labelCPF.setText("CPF");

        caixaTextoCPF.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaTextoCPF.setText("Digite o cpf aqui (apenas números)");
        caixaTextoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCPFActionPerformed(evt);
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
                    .addComponent(caixaTextoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSexo)
                    .addComponent(comboBoxSexo, 0, 92, Short.MAX_VALUE))
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
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexo)
                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        caixaTextoSenha.setText("jPasswordField1");

        caixaTextoLogin.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaTextoLogin.setText("Digite o login aqui...");
        caixaTextoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        javax.swing.GroupLayout painelDadosSenha3Layout = new javax.swing.GroupLayout(painelDadosSenha3);
        painelDadosSenha3.setLayout(painelDadosSenha3Layout);
        painelDadosSenha3Layout.setHorizontalGroup(
            painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosSenha3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caixaTextoSenha)
                    .addComponent(caixaTextoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        painelDadosSenha3Layout.setVerticalGroup(
            painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosSenha3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaTextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(painelDadosSenha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
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
        botEfetuarCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botEfetuarCadastroKeyPressed(evt);
            }
        });

        botVoltarMenuPesquisa.setText("Voltar");
        botVoltarMenuPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botVoltarMenuPesquisaMouseClicked(evt);
            }
        });
        botVoltarMenuPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVoltarMenuPesquisaActionPerformed(evt);
            }
        });
        botVoltarMenuPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botVoltarMenuPesquisaKeyPressed(evt);
            }
        });

        botLimparDados.setText("Limpar dados");
        botLimparDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botLimparDadosMouseClicked(evt);
            }
        });
        botLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimparDadosActionPerformed(evt);
            }
        });
        botLimparDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botLimparDadosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(botVoltarMenuPesquisa)
                        .addGap(117, 117, 117)
                        .addComponent(botEfetuarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botLimparDados)
                        .addGap(42, 42, 42))
                    .addComponent(painelDadosSenha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosSenha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEfetuarCadastro)
                    .addComponent(botVoltarMenuPesquisa)
                    .addComponent(botLimparDados))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void caixaTextoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCPFActionPerformed

    private void caixaTextoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoEmailActionPerformed

    private void caixaTextoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCelularActionPerformed

    private void botEfetuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEfetuarCadastroActionPerformed
        try {
            efetuarCadastro();
        } catch (SQLException ex) {
            erroCadastroNoBD();
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botEfetuarCadastroActionPerformed

    private void botEfetuarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEfetuarCadastroMouseClicked
        try {
            efetuarCadastro();
        } catch (SQLException ex) {
            erroCadastroNoBD();
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botEfetuarCadastroMouseClicked

    private void botEfetuarCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botEfetuarCadastroKeyPressed
        try {
            efetuarCadastro();
        } catch (SQLException ex) {
            erroCadastroNoBD();
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botEfetuarCadastroKeyPressed

    private void botVoltarMenuPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botVoltarMenuPesquisaMouseClicked
        voltarMenuPesquisa();
    }//GEN-LAST:event_botVoltarMenuPesquisaMouseClicked

    private void botVoltarMenuPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVoltarMenuPesquisaActionPerformed
        voltarMenuPesquisa();
    }//GEN-LAST:event_botVoltarMenuPesquisaActionPerformed

    private void botVoltarMenuPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botVoltarMenuPesquisaKeyPressed
        voltarMenuPesquisa();
    }//GEN-LAST:event_botVoltarMenuPesquisaKeyPressed

    private void botLimparDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botLimparDadosMouseClicked
        limparDados();
    }//GEN-LAST:event_botLimparDadosMouseClicked

    private void botLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimparDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botLimparDadosActionPerformed

    private void botLimparDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botLimparDadosKeyPressed
        limparDados();
    }//GEN-LAST:event_botLimparDadosKeyPressed

    private void caixaTextoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoLoginActionPerformed

    private void efetuarCadastro() throws SQLException, ParseException {
        String nome = caixaTextoNome.getText();
        String cpf = caixaTextoCPF.getText();
        String dataNascimentoString = caixaTextoDataNascimento.getText();
        String email = caixaTextoEmail.getText();
        String login = caixaTextoLogin.getText();
        String senha = caixaTextoSenha.getText();
        String genero = (String) comboBoxSexo.getSelectedItem();

        Idade idade = new Idade();

        Gerente cadastro = new Gerente(null, null, null, null, null, null, null, null);

        //Tratamentos pré-cadastro
        //Verifica se o cpf é válido
        CPF validar = new CPF();
        if (validar.getValidarCPF(cpf) == false) {
            //CPF inválido
            JOptionPane.showMessageDialog(null, "CPF Inválido! Digite novamente", "CPF Inválido", JOptionPane.ERROR_MESSAGE);
        } else {
            //Verifica se o CPF já existe no BD
            if (cadastro.getVerificarPessoaEXistente(cpf) == true) {
                mensagemCPFExistente();
            } else {
                //Verifica se o email é válido
                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(null, "Email Inválido! Digite novamente", "Email Inválido", JOptionPane.ERROR_MESSAGE);
                } else {
                    //Verifica se a data de nascimento é válida
                    if (!dataNascimentoString.matches("^([0-2][0-9]|3[0-1])/([0][1-9]|1[0-2])/([1-2][0-9]{3})$")) {
                        JOptionPane.showMessageDialog(null, "Formato de data inválido! Digite no formato dd/mm/yyyy", "Data inválida", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //Tratamento da data de nascimento e idade
                        idade.getFormatarDataNascimento(dataNascimentoString);
                        idade.getCalcularIdade();

                        //Verifica se a idade é válida
                        if (!idade.getVerificarIdade()) {
                            JOptionPane.showMessageDialog(null, "Idade inválida! Por favor, digite novamente", "Idade inválida", JOptionPane.ERROR_MESSAGE);
                        } else {
                            cadastro.getCadastrarGerente(nome, cpf, idade.getDataNascimento(), idade.getIdade(), email, login, senha, genero);
                            mensagemCadastroConcluido();
                            limparDados();
                        }
                    }
                }
            }
        }
    }

    private void mensagemCadastroConcluido() {
        JOptionPane.showMessageDialog(null, "Cadastro concluído com sucesso!", "Cadastro concluído", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mensagemCPFExistente() {
        JOptionPane.showMessageDialog(null, "CPF já cadastrado no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void erroCadastroNoBD() {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar gerente no banco de dados! Tente novamente mais tarde.", "Erro no cadastro com banco de dados", JOptionPane.ERROR_MESSAGE);
    }

    private void voltarMenuPesquisa() {
        this.dispose();
        new TelaPesquisaPessoa().setVisible(true);
    }

    private void limparDados() {
        caixaTextoNome.setText("");
        caixaTextoCelular.setText("");
        caixaTextoCPF.setText("");
        caixaTextoDataNascimento.setText("");
        caixaTextoEmail.setText("");
        caixaTextoLogin.setText("");
        caixaTextoSenha.setText("");
        comboBoxSexo.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEfetuarCadastro;
    private javax.swing.JButton botLimparDados;
    private javax.swing.JButton botVoltarMenuPesquisa;
    private javax.swing.JTextField caixaTextoCPF;
    private javax.swing.JTextField caixaTextoCelular;
    private javax.swing.JFormattedTextField caixaTextoDataNascimento;
    private javax.swing.JTextField caixaTextoEmail;
    private javax.swing.JTextField caixaTextoLogin;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JPasswordField caixaTextoSenha;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelDadosContato;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelDadosSenha3;
    // End of variables declaration//GEN-END:variables
}
