
package view;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.PendaftarControler;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;



public class PendaftaranView extends javax.swing.JFrame {
     
  PendaftarControler ctrl;//properti 
 
  
    public PendaftaranView() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(this);
        rbPria.setActionCommand("Pria");
        rbWanita.setActionCommand("Wanita");
        ctrl = new PendaftarControler(this);//mengubungkan ctrl dan view
        
        
    }
    
    public JLabel getLblNamaPendaftar() {//method getter
        return lblNamaPendaftar;//mengembalikan nama
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }
    

    public JTextField getTxtAgama() {
        return TxtAgama;
    }

    public ButtonGroup getBgJenisKelamin() {
        return bgJenisKelamin;
    }

    public JRadioButton getRbPria() {
        return rbPria;
    }

    public void setRbPria(JRadioButton rbPria) {
        this.rbPria = rbPria;
    }

    public JRadioButton getRbWanita() {
        return rbWanita;
    }

    public void setRbWanita(JRadioButton rbWanita) {
        this.rbWanita = rbWanita;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }
    
    public JTextField getTxtNoHp() {
        return TxtNoHp;
    }

    public JTextField getTxtTanggal() {
        return TxtTanggal;
    }

    public JTextField getTxtTempat() {
        return TxtTempat;
    }

    public JComboBox getCbBulan() {
        return cbBulan;
    }

    public JComboBox getCbJurusan() {
        return cbJurusan;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtProgram() {
        return txtProgram;
    }

    public JTextField getTxtTahun() {
        return txtTahun;
    }

    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgJenisKelamin = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cbJurusan = new javax.swing.JComboBox();
        TxtNoHp = new javax.swing.JTextField();
        txtProgram = new javax.swing.JTextField();
        TxtAgama = new javax.swing.JTextField();
        rbWanita = new javax.swing.JRadioButton();
        rbPria = new javax.swing.JRadioButton();
        txtTahun = new javax.swing.JTextField();
        cbBulan = new javax.swing.JComboBox();
        TxtTanggal = new javax.swing.JTextField();
        TxtTempat = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnDaftar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNamaPendaftar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Form Pendaftaran");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 30, 220, 50);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(540, 470, 300, 30);

        cbJurusan.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Jurusan", "S1 Teknik Informatika", "S1 Teknik Industri", "S1 Tenik Sipil" }));
        getContentPane().add(cbJurusan);
        cbJurusan.setBounds(540, 370, 210, 30);
        getContentPane().add(TxtNoHp);
        TxtNoHp.setBounds(540, 420, 300, 30);
        getContentPane().add(txtProgram);
        txtProgram.setBounds(540, 320, 300, 30);

        TxtAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAgamaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtAgama);
        TxtAgama.setBounds(540, 270, 300, 30);

        bgJenisKelamin.add(rbWanita);
        rbWanita.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        rbWanita.setText("Wanita");
        getContentPane().add(rbWanita);
        rbWanita.setBounds(750, 230, 90, 30);

        bgJenisKelamin.add(rbPria);
        rbPria.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        rbPria.setText("Pria");
        getContentPane().add(rbPria);
        rbPria.setBounds(540, 230, 80, 30);
        getContentPane().add(txtTahun);
        txtTahun.setBounds(690, 190, 60, 30);

        cbBulan.setFont(new java.awt.Font("Tekton Pro Ext", 0, 12)); // NOI18N
        cbBulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Bulan", "January", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        getContentPane().add(cbBulan);
        cbBulan.setBounds(590, 190, 90, 30);
        getContentPane().add(TxtTanggal);
        TxtTanggal.setBounds(540, 190, 40, 30);
        getContentPane().add(TxtTempat);
        TxtTempat.setBounds(540, 150, 300, 30);

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(540, 110, 300, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(540, 70, 300, 30);

        btnDaftar.setBackground(new java.awt.Color(0, 0, 204));
        btnDaftar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Daftar");
        btnDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDaftarMouseClicked(evt);
            }
        });
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftar);
        btnDaftar.setBounds(540, 510, 300, 23);

        jLabel13.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("E-Mail            ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(340, 470, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No . Handphone ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 420, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jurusan                   ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 370, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Program Studi ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 320, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agama                     ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 270, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kelamin    ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 230, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Lahir      ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 190, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tempat Lahir      ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 150, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat                     ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 110, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama lengkap     ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 70, 130, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selamat Datang :");

        lblNamaPendaftar.setBackground(new java.awt.Color(51, 51, 51));
        lblNamaPendaftar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        lblNamaPendaftar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblNamaPendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 751, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNamaPendaftar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\unindra3.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1180, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
       
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void TxtAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAgamaActionPerformed
        
    }//GEN-LAST:event_TxtAgamaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
      
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        ctrl.cekPendaftar();
    
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseClicked

    }//GEN-LAST:event_btnDaftarMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new LoginView().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new PendaftaranView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAgama;
    private javax.swing.JTextField TxtNoHp;
    private javax.swing.JTextField TxtTanggal;
    private javax.swing.JTextField TxtTempat;
    private javax.swing.ButtonGroup bgJenisKelamin;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JComboBox cbBulan;
    private javax.swing.JComboBox cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblNamaPendaftar;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables

}
