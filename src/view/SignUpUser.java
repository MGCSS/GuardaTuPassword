package view;

//import java.awt.Color;

import controller.Session;
import javax.swing.JOptionPane;
import model.User;


public class SignUpUser extends javax.swing.JFrame 
{
    private Session session;

    public SignUpUser() 
    {
        this.session = new Session();
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
        jSeparator1 = new javax.swing.JSeparator();
        jbtnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar usuario");
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

        jbtnSignUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnSignUp.setText("Regístrate");
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
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
                        .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        // TODO add your handling code here:
        //Signing up user in the app...
        System.out.println("Registrando usuario...");
        // Do something...
        if(jtxtUserID.getText().isEmpty() || String.valueOf(jpassUserPassword.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar espacios en blanco", "Error de usuario", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            User newUser;
            
            newUser = new User(jtxtUserID.getText(), String.valueOf(jpassUserPassword.getPassword()));
            if (this.session.storeUser_(newUser))
            {
                JOptionPane.showMessageDialog(rootPane, "Usuario creado correctamente.", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error. Inténtelo de nuevo", "Error de sistema", JOptionPane.ERROR_MESSAGE);
            }
            MainWindow main;
            
            main = new MainWindow();
            main.setLocationRelativeTo(null);
            main.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbtnSignUpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JLabel jlblAppIcon;
    private javax.swing.JLabel jlblUserID;
    private javax.swing.JLabel jlblUserPassword;
    private javax.swing.JPasswordField jpassUserPassword;
    private javax.swing.JPanel jpnlMainPanel;
    private javax.swing.JTextField jtxtUserID;
    // End of variables declaration//GEN-END:variables
}
