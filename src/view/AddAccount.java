package view;


import javax.swing.JOptionPane;
import model.Account;

public class AddAccount extends javax.swing.JFrame 
{
    private UserAccounts userAccounts;

    AddAccount(UserAccounts userAccounts) 
    {
        this.userAccounts = userAccounts;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMainPanel = new javax.swing.JPanel();
        jlblAppIcon = new javax.swing.JLabel();
        jlblUserID = new javax.swing.JLabel();
        jlblUserPassword = new javax.swing.JLabel();
        jtxtUserID = new javax.swing.JTextField();
        jpassUserPassword = new javax.swing.JPasswordField();
        jlblDescription = new javax.swing.JLabel();
        jtxtDescription = new javax.swing.JTextField();
        jlblPlatform = new javax.swing.JLabel();
        jbtnAddAccount = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtPlatform = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir cuenta");
        setResizable(false);

        jpnlMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jlblAppIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblAppIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GTPLogo.PNG"))); // NOI18N
        jlblAppIcon.setToolTipText("");

        jlblUserID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserID.setText("usuario:");

        jlblUserPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserPassword.setText("contraseña:");

        jlblDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblDescription.setText("descripción:");

        jlblPlatform.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblPlatform.setText("plataforma:");

        jbtnAddAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAddAccount.setText("Añadir");
        jbtnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlMainPanelLayout = new javax.swing.GroupLayout(jpnlMainPanel);
        jpnlMainPanel.setLayout(jpnlMainPanelLayout);
        jpnlMainPanelLayout.setHorizontalGroup(
            jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblDescription)
                                    .addComponent(jlblPlatform))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jtxtPlatform)))
                            .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                                    .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlblUserID)
                                        .addComponent(jlblUserPassword))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtUserID)
                                        .addComponent(jpassUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jlblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpnlMainPanelLayout.setVerticalGroup(
            jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPlatform)
                    .addComponent(jtxtPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddAccountActionPerformed
        // TODO add your handling code here:
        //Signing up user in the app...
        System.out.println("Añadiendo cuenta...");
        // Do something...
        if(jtxtUserID.getText().isEmpty() || String.valueOf(jpassUserPassword.getPassword()).isEmpty()
                                          || jtxtDescription.getText().isEmpty()
                                          || jtxtPlatform.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar espacios en blanco", "Error de usuario", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Account account;
    
            account = new Account();
            
            account.setUser(jtxtUserID.getText());
            account.setPassword(String.valueOf(jpassUserPassword.getPassword()));
            account.setDescription(jtxtDescription.getText());
            account.setPlatform(jtxtPlatform.getText());
            
            if (this.userAccounts.getSession().addAccount_(account))
            {
                JOptionPane.showMessageDialog(rootPane, "Cuenta añadida correctamente.", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error. Inténtelo de nuevo", "Error de sistema", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
            this.userAccounts.updateTable();         
        }
    }//GEN-LAST:event_jbtnAddAccountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAddAccount;
    private javax.swing.JLabel jlblAppIcon;
    private javax.swing.JLabel jlblDescription;
    private javax.swing.JLabel jlblPlatform;
    private javax.swing.JLabel jlblUserID;
    private javax.swing.JLabel jlblUserPassword;
    private javax.swing.JPasswordField jpassUserPassword;
    private javax.swing.JPanel jpnlMainPanel;
    private javax.swing.JTextField jtxtDescription;
    private javax.swing.JTextField jtxtPlatform;
    private javax.swing.JTextField jtxtUserID;
    // End of variables declaration//GEN-END:variables
}
