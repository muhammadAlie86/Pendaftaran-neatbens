
package view;

import controller.LoginControler;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static view.PendaftaranView.lblNamaPendaftar;


public class LoginView extends javax.swing.JFrame {

    LoginControler ctr;
    
    public LoginView  (){
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(this);
        ctr = new LoginControler(this);
    }
        
    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnLogin.setBackground(new java.awt.Color(0, 0, 204));
        btnLogin.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(530, 360, 260, 30);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("*********");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(530, 320, 260, 30);

        txtUsername.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.setText("Username");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(530, 280, 260, 30);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 320, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 280, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\web10.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 270, 490, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\unindra3.jpg")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1500, 1500));
        jLabel2.setPreferredSize(new java.awt.Dimension(3000, 2000));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        this.dispose();
        new PendaftaranView().setVisible(true);
        lblNamaPendaftar.setText(this.getTxtUsername().getText()); 
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ctr.cekLogin();
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
       if   (txtUsername.getText().trim().toLowerCase().equals("username")){
            txtUsername.setText("");
            txtUsername.setForeground(Color.black);
        }   
       
        
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
      if    (txtUsername.getText().trim().equals("")||
            (txtUsername.getText().trim().toLowerCase().equals("username"))){
            txtUsername.setText("username");
            txtUsername.setForeground(new Color(204,204,204));
        }
         
         
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if  (txtPassword.getText().trim().toLowerCase().equals("*********")){
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
           
       }
        
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if  (txtPassword.getText().trim().equals("")||
            (txtPassword.getText().trim().toLowerCase().equals("*********"))){
            txtPassword.setText("*********");
            txtPassword.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_txtPasswordFocusLost

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

  
   

    
}
