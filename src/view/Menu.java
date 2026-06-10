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
        visualizarDesbravadores = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
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

        editarDesbravadoresbutton1.setBackground(new java.awt.Color(255, 255, 255));
        editarDesbravadoresbutton1.setLabel("Editar Desbravador ");
        editarDesbravadoresbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDesbravadoresbutton1ActionPerformed(evt);
            }
        });

        cadastroDeDesbravador.setActionCommand("Cadastro de Desbravador ");
        cadastroDeDesbravador.setBackground(new java.awt.Color(255, 255, 255));
        cadastroDeDesbravador.setLabel("Cadastro de Desbravador ");
        cadastroDeDesbravador.setName("Cadastro de Desbravador"); // NOI18N
        cadastroDeDesbravador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDeDesbravadorActionPerformed(evt);
            }
        });

        visualizarDesbravadores.setBackground(new java.awt.Color(255, 255, 255));
        visualizarDesbravadores.setLabel("Visualizar Desbravadores ");
        visualizarDesbravadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarDesbravadoresActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/img soldados  (.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroDeDesbravador, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visualizarDesbravadores, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarDesbravadoresbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(178, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(cadastroDeDesbravador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarDesbravadoresbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizarDesbravadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        cadastroDeDesbravador.getAccessibleContext().setAccessibleName("Ca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

        janela.getContentPane().removeAll();
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
        view.BuscarDesbravador buscarDesbravador = new view.BuscarDesbravador();

        // 3. Substitui o conteúdo da janela
        janela.getContentPane().removeAll(); // Remove o painel atual (Start)
        janela.getContentPane().add(buscarDesbravador); // Adiciona o novo (Menu)

        // 4. Atualiza a interface
        janela.revalidate();
        janela.repaint();
    }//GEN-LAST:event_editarDesbravadoresbutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button cadastroDeDesbravador;
    private java.awt.Button editarDesbravadoresbutton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label3;
    private java.awt.Button visualizarDesbravadores;
    // End of variables declaration//GEN-END:variables
}
