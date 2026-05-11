
package view;


public class EditarDesbravador extends javax.swing.JFrame {
    
      model.Desbravador desbravador = new model.Desbravador("", "", "", "", "", "", "");
    

   
    public EditarDesbravador() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomeCompleto = new java.awt.TextField();
        DesCpf = new java.awt.Label();
        NomeCompleto = new java.awt.Label();
        email = new java.awt.TextField();
        dataNasc = new java.awt.TextField();
        Cpf = new java.awt.TextField();
        Email = new java.awt.Label();
        MaeNome = new java.awt.Label();
        PiaNome = new java.awt.Label();
        DescRg = new java.awt.Label();
        DataNasc = new java.awt.Label();
        Rg = new java.awt.TextField();
        NomePai = new java.awt.TextField();
        NomeMae = new java.awt.TextField();
        Proximo = new javax.swing.JToggleButton();
        voltar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        nomeCompleto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeCompletoFocusLost(evt);
            }
        });
        nomeCompleto.addActionListener(this::nomeCompletoActionPerformed);

        DesCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DesCpf.setText("CPF");

        NomeCompleto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NomeCompleto.setText("Nome Completo");

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(this::emailActionPerformed);

        dataNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataNascFocusLost(evt);
            }
        });
        dataNasc.addActionListener(this::dataNascActionPerformed);

        Cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CpfFocusLost(evt);
            }
        });
        Cpf.addActionListener(this::CpfActionPerformed);

        Email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Email.setText("E -mail");

        MaeNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MaeNome.setText("Nome Mãe ");

        PiaNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PiaNome.setText("Nome Pai");

        DescRg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DescRg.setText("RG");

        DataNasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DataNasc.setText("Data Nasc");

        Rg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RgFocusLost(evt);
            }
        });
        Rg.addActionListener(this::RgActionPerformed);

        NomePai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NomePaiFocusLost(evt);
            }
        });
        NomePai.addActionListener(this::NomePaiActionPerformed);

        NomeMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NomeMaeFocusLost(evt);
            }
        });
        NomeMae.addActionListener(this::NomeMaeActionPerformed);

        Proximo.setText("Proximo");
        Proximo.addActionListener(this::ProximoActionPerformed);

        voltar.setText("Voltar");
        voltar.addActionListener(this::voltarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DesCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescRg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Proximo))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PiaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescRg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PiaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proximo)
                    .addComponent(voltar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCompletoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCompletoFocusLost

        String nome = nomeCompleto.getText().trim();

        if (!nome.isEmpty()) {
            desbravador.setNomeCompleto(nome);
            System.out.print(desbravador.getNomeCompleto());
        }
    }//GEN-LAST:event_nomeCompletoFocusLost

    private void nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompletoActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:,

        String emailValue = email.getText().trim();

        if (!emailValue.isEmpty()) {
            desbravador.setEmail(emailValue);
            System.out.print(desbravador.getEmail());
        }

    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void dataNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascFocusLost
        // TODO add your handling code here:

        String dataNascTexto = dataNasc.getText().trim();

        if (!dataNascTexto.isEmpty()) {
            desbravador.setDataNascimento(dataNascTexto);
            System.out.print(desbravador.getDataNascimento());

        }
    }//GEN-LAST:event_dataNascFocusLost

    private void dataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascActionPerformed

    private void CpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CpfFocusLost
        // TODO add your handling code here:

        String cpfTexto = Cpf.getText().trim();

        if (!cpfTexto.isEmpty()) {
            desbravador.setCpf(cpfTexto);
            System.out.print(desbravador.getCpf());
        }
    }//GEN-LAST:event_CpfFocusLost

    private void CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpfActionPerformed

    private void RgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RgFocusLost
        // TODO add your handling code here:
        String rgTexto = Rg.getText().trim();

        if (!rgTexto.isEmpty()) {
            desbravador.setRg(rgTexto);
            System.out.print(desbravador.getRg());
        }
    }//GEN-LAST:event_RgFocusLost

    private void RgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RgActionPerformed

    private void NomePaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomePaiFocusLost
        // TODO add your handling code here:
        String nomePaiTexto = NomePai.getText().trim();

        if (!nomePaiTexto.isEmpty()) {
            desbravador.setNomePai(nomePaiTexto);
            System.out.println(desbravador.getNomePai());
        }

    }//GEN-LAST:event_NomePaiFocusLost

    private void NomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomePaiActionPerformed

    private void NomeMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeMaeFocusLost

        String nomeMaeTexto = NomeMae.getText().trim();

        if (!nomeMaeTexto.isEmpty()) {
            desbravador.setNomeMae(nomeMaeTexto);
            System.out.println(desbravador.getNomeMae());

        }
    }//GEN-LAST:event_NomeMaeFocusLost

    private void NomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeMaeActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        System.out.println("Proxímo");

        desbravador.setNomeCompleto(nomeCompleto.getText());
        desbravador.setEmail(email.getText());
        desbravador.setDataNascimento(dataNasc.getText());
        desbravador.setCpf(Cpf.getText());
        desbravador.setRg(Rg.getText());
        desbravador.setNomePai(NomePai.getText());
        desbravador.setNomeMae(NomeMae.getText());

        desbravador.cadastrarDesbravador();

        System.out.println("Desbravador salvo com sucesso");

        // 1. Pega a janela que contém este painel
        javax.swing.JFrame janela = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        // 2. Cria o novo painel que você quer mostrar (ex: Menu)
        view.CadastroSucesso novoPainel = new view.CadastroSucesso();

        // 3. Substitui o conteúdo da janela
        janela.getContentPane().removeAll(); // Remove o painel atual (Start)
        janela.getContentPane().add(novoPainel); // Adiciona o novo (Menu)

        // 4. Atualiza a interface
        janela.revalidate();
        janela.repaint();

    }//GEN-LAST:event_ProximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        {
            javax.swing.JFrame janela = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

            // 2. Cria o novo painel (Menu)
            view.Menu novoPainel = new view.Menu();

            // 3. Remove o painel atual e adiciona o novo
            janela.getContentPane().removeAll();
            janela.getContentPane().add(novoPainel);

            // 4. Atualiza a tela
            janela.revalidate();
            janela.repaint();
        }
    }//GEN-LAST:event_voltarActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new EditarDesbravador().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Cpf;
    private java.awt.Label DataNasc;
    private java.awt.Label DesCpf;
    private java.awt.Label DescRg;
    private java.awt.Label Email;
    private java.awt.Label MaeNome;
    private java.awt.Label NomeCompleto;
    private java.awt.TextField NomeMae;
    private java.awt.TextField NomePai;
    private java.awt.Label PiaNome;
    private javax.swing.JToggleButton Proximo;
    private java.awt.TextField Rg;
    private java.awt.TextField dataNasc;
    private java.awt.TextField email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField nomeCompleto;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
}
