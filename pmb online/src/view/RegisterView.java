
package view;

import controller.RegisterControler;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegisterView extends javax.swing.JFrame {

    RegisterControler ctr;
    
    public RegisterView() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(this);
        ctr = new RegisterControler(this);
        
    }

    public JPasswordField getTxtKonfirmasiPassword() {
        return txtKonfirmasiPassword;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtNamaBelakang() {
        return txtNamaBelakang;
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

        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        txtKonfirmasiPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        txtNamaBelakang = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Reset");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(590, 450, 90, 23);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Back to Login");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 480, 100, 13);

        btnSimpan.setBackground(new java.awt.Color(0, 51, 153));
        btnSimpan.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(470, 450, 100, 23);

        txtKonfirmasiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKonfirmasiPasswordActionPerformed(evt);
            }
        });
        txtKonfirmasiPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKonfirmasiPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtKonfirmasiPassword);
        txtKonfirmasiPassword.setBounds(470, 400, 240, 30);

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(470, 350, 240, 30);

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(470, 300, 240, 30);

        txtNamaBelakang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBelakangActionPerformed(evt);
            }
        });
        txtNamaBelakang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaBelakangKeyPressed(evt);
            }
        });
        getContentPane().add(txtNamaBelakang);
        txtNamaBelakang.setBounds(470, 250, 240, 30);

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(470, 210, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 400, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 350, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 300, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 250, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 200, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register form");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 130, 220, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\unindra3.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, -10, 1210, 300);

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\unindra3.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1210, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaBelakangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBelakangActionPerformed
      
    }//GEN-LAST:event_txtNamaBelakangActionPerformed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        
      
        
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtNamaBelakangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBelakangKeyPressed
        
       
    }//GEN-LAST:event_txtNamaBelakangKeyPressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        
       
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtKonfirmasiPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKonfirmasiPasswordKeyPressed

    }//GEN-LAST:event_txtKonfirmasiPasswordKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        ctr.cekRegister(); 
       
            
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtKonfirmasiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKonfirmasiPasswordActionPerformed
       
    }//GEN-LAST:event_txtKonfirmasiPasswordActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         this.dispose();
         new LoginView().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
       
        
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
        new RegisterView().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
       
        
    }//GEN-LAST:event_btnSimpanMouseClicked

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtKonfirmasiPassword;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaBelakang;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
