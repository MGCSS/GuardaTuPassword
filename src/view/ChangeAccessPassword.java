package view;

//import java.awt.Color;

import controller.Session;
import javax.swing.JOptionPane;


public class ChangeAccessPassword extends javax.swing.JFrame 
{
    private Session session;

    public ChangeAccessPassword(Session session) 
    {
        this.session = session;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMainPanel = new javax.swing.JPanel();
        jlblAppIcon = new javax.swing.JLabel();
        jlblUserID = new javax.swing.JLabel();
        jlblUserPassword = new javax.swing.JLabel();
        jpassUserPassword = new javax.swing.JPasswordField();
        jpassUserPassword_conf = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnUpdatePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar contraseña");
        setResizable(false);

        jpnlMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jlblAppIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblAppIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GTPLogo.PNG"))); // NOI18N
        jlblAppIcon.setToolTipText("");

        jlblUserID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserID.setText("Nueva contraseña:");

        jlblUserPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblUserPassword.setText("Confirmar contraseña:");

        jbtnUpdatePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnUpdatePassword.setText("Aceptar");
        jbtnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlMainPanelLayout = new javax.swing.GroupLayout(jpnlMainPanel);
        jpnlMainPanel.setLayout(jpnlMainPanelLayout);
        jpnlMainPanelLayout.setHorizontalGroup(
            jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                        .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblUserID)
                            .addComponent(jlblUserPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpassUserPassword_conf, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpassUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnUpdatePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpnlMainPanelLayout.setVerticalGroup(
            jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlblAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUserID)
                    .addComponent(jpassUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassUserPassword_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblUserPassword))
                .addGap(46, 46, 46)
                .addComponent(jbtnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbtnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdatePasswordActionPerformed
        // TODO add your handling code here:
        if(String.valueOf(jpassUserPassword.getPassword()).isEmpty() ||  String.valueOf(jpassUserPassword_conf.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar espacios en blanco", "Error de usuario", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(String.valueOf(jpassUserPassword.getPassword()).equals(String.valueOf(jpassUserPassword_conf.getPassword())))
            {
                // Everything is ok!
                boolean updateAccessPassword;
                
                updateAccessPassword = this.session.updateAccessPassword(String.valueOf(jpassUserPassword.getPassword()));
                if(!updateAccessPassword)
                {
                    JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error. Inténtelo de nuevo", "Error de sistema", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    jpassUserPassword.setText("");
                    jpassUserPassword_conf.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Contraeña actualizada correctamente.", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Las contraseñas deben coincidir", "Error de usuario", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtnUpdatePasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnUpdatePassword;
    private javax.swing.JLabel jlblAppIcon;
    private javax.swing.JLabel jlblUserID;
    private javax.swing.JLabel jlblUserPassword;
    private javax.swing.JPasswordField jpassUserPassword;
    private javax.swing.JPasswordField jpassUserPassword_conf;
    private javax.swing.JPanel jpnlMainPanel;
    // End of variables declaration//GEN-END:variables
}
