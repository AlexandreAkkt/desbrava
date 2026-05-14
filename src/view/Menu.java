
package view;


public class Menu extends javax.swing.JPanel {

    
    public Menu() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        button4 = new java.awt.Button();
        button3 = new java.awt.Button();
        label3 = new java.awt.Label();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        editarDesbravadoresbutton1 = new java.awt.Button();
        cadastroDeDesbravador = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        visualizarDesbravadores = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        button2.setLabel("button2");

        button4.setLabel("button1");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button3.setLabel("button1");

        label3.setText("label3");

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 600));

        jPanel1.setBackground(new java.awt.Color(230, 126, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 490));

        editarDesbravadoresbutton1.setBackground(new java.awt.Color(255, 102, 0));
        editarDesbravadoresbutton1.setLabel("Editar Desbravador ");
        editarDesbravadoresbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDesbravadoresbutton1ActionPerformed(evt);
            }
        });

        cadastroDeDesbravador.setActionCommand("Cadastro de Desbravador ");
        cadastroDeDesbravador.setBackground(new java.awt.Color(255, 102, 0));
        cadastroDeDesbravador.setLabel("Cadastro de Desbravador ");
        cadastroDeDesbravador.setName("Cadastro de Desbravador"); // NOI18N
        cadastroDeDesbravador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDeDesbravadorActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setLabel("Especialidades");

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setLabel("Ficha de Classes ");

        visualizarDesbravadores.setBackground(new java.awt.Color(255, 102, 0));
        visualizarDesbravadores.setLabel("Visualizar Desbravadores ");
        visualizarDesbravadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarDesbravadoresActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setText("Menu de Gestão.");

        label2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label2.setText("Bem vindo, Soladado de Gideão.");

        jTextField1.setBackground(new java.awt.Color(255, 204, 51));
        jTextField1.setText("Sair da conta");
        jTextField1.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img soldados  (.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cadastroDeDesbravador, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarDesbravadoresbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(visualizarDesbravadores, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroDeDesbravador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarDesbravadoresbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizarDesbravadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        cadastroDeDesbravador.getAccessibleContext().setAccessibleName("Ca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void visualizarDesbravadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarDesbravadoresActionPerformed
        // TODO add your handling code here:
        javax.swing.JFrame janela = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        ListaDesbravadores novoPainel = new ListaDesbravadores();
        System.out.print("tela aberta");

        janela.getContentPane().removeAll(); // ❌ PROBLEMA
        janela.getContentPane().add(novoPainel);

        janela.pack();
        janela.setLocationRelativeTo(null);

        janela.revalidate();
        janela.repaint();
    }//GEN-LAST:event_visualizarDesbravadoresActionPerformed

    private void cadastroDeDesbravadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDeDesbravadorActionPerformed
        javax.swing.JFrame janela = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        CadastroDesbravador novoPainel = new CadastroDesbravador();

        janela.getContentPane().removeAll(); // ❌ PROBLEMA
        janela.getContentPane().add(novoPainel);

        janela.pack();
        janela.setLocationRelativeTo(null);

        janela.revalidate();
        janela.repaint();
    }//GEN-LAST:event_cadastroDeDesbravadorActionPerformed

    private void editarDesbravadoresbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDesbravadoresbutton1ActionPerformed
        // TODO add your handling code here:

        // 1. Pega a janela que contém este painel
        javax.swing.JFrame janela = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);

        // 2. Cria o novo painel que você quer mostrar (ex: Menu)
        view.Start novoPainel = new view.Start();

        // 3. Substitui o conteúdo da janela
        janela.getContentPane().removeAll(); // Remove o painel atual (Start)
        janela.getContentPane().add(new CadastroDesbravador()); // Adiciona o novo (Menu)

        // 4. Atualiza a interface
        janela.revalidate();
        janela.repaint();
    }//GEN-LAST:event_editarDesbravadoresbutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button cadastroDeDesbravador;
    private java.awt.Button editarDesbravadoresbutton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Button visualizarDesbravadores;
    // End of variables declaration//GEN-END:variables
}
