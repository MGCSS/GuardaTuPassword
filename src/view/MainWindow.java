package view;

//import java.awt.Color;
import controller.Session;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    // Variables declaration
    private Session session;

    public MainWindow() {
        initComponents();
    }

    /* private Usuario signIn(String usuario, String password) {
        return usuarios.stream().filter(user -> user.getDni().equals(usuario) && user.getContrasena().equals(password)).findAny().orElse(null);
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMainPanel = new javax.swing.JPanel();
        jlblAppIcon = new javax.swing.JLabel();
        jlblUserID = new javax.swing.JLabel();
        jlblUserPassword = new javax.swing.JLabel();
        jtxtUserID = new javax.swing.JTextField();
        jpassUserPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnSignIn = new javax.swing.JButton();
        jlblSignUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GuardaTuPassword");
        setResizable(false);

        jpnlMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jlblAppIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblAppIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GTPLogo.PNG"))); // NOI18N
        jlblAppIcon.setToolTipText("");

        jlblUserID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserID.setText("dni:");

        jlblUserPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserPassword.setText("contraseña:");

        jbtnSignIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnSignIn.setText("Iniciar sesión");
        jbtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignInActionPerformed(evt);
            }
        });

        jlblSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSignUp.setForeground(new java.awt.Color(0, 102, 255));
        jlblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSignUp.setText("¿No tienes una cuenta? Regístrate");
        jlblSignUp.setToolTipText("Registrarse");
        jlblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnlMainPanelLayout = new javax.swing.GroupLayout(jpnlMainPanel);
        jpnlMainPanel.setLayout(jpnlMainPanelLayout);
        jpnlMainPanelLayout.setHorizontalGroup(
            jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1)
                        .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                            .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblUserID)
                                .addComponent(jlblUserPassword))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtUserID)
                                .addComponent(jpassUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jlblSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jbtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSignUp)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSignUpMouseClicked
        //Not implemented
        SignUpUser signUpUser;
        
        signUpUser = new SignUpUser();
        signUpUser.setLocationRelativeTo(null);
        signUpUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlblSignUpMouseClicked

    private void jbtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignInActionPerformed
        // TODO add your handling code here:
        if (jtxtUserID.getText().isEmpty() || String.valueOf(jpassUserPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar espacios en blanco", "Error de usuario", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            this.session = new Session(jtxtUserID.getText(), String.valueOf(jpassUserPassword.getPassword()));
            if (session.existsUser()) 
            {
                //Next window
                UserAccounts userAccounts;

                userAccounts = new UserAccounts(this.session);
                userAccounts.setLocationRelativeTo(null);
                userAccounts.setVisible(true);
                this.dispose();
            } 
            else //Usuario inexistente
            {
                //Show error...
                JOptionPane.showMessageDialog(rootPane, "No existe este usuario. Inténtelo de nuevo", "Error de usuario", JOptionPane.ERROR_MESSAGE);
                this.jtxtUserID.setText("");
                this.jpassUserPassword.setText("");
            }
        }


    }//GEN-LAST:event_jbtnSignInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnSignIn;
    private javax.swing.JLabel jlblAppIcon;
    private javax.swing.JLabel jlblSignUp;
    private javax.swing.JLabel jlblUserID;
    private javax.swing.JLabel jlblUserPassword;
    private javax.swing.JPasswordField jpassUserPassword;
    private javax.swing.JPanel jpnlMainPanel;
    private javax.swing.JTextField jtxtUserID;
    // End of variables declaration//GEN-END:variables
}
