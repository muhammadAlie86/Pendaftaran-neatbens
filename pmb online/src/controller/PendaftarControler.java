
package controller;

import view.KartuView;
import view.PendaftaranView;
import javax.swing.JOptionPane;

public class PendaftarControler {
    private final PendaftaranView view;//atribut atau properti
  
   
   
public PendaftarControler(PendaftaranView frame){//untuk mengisi frame pendaftaran view
    this.view = frame;    //refernce kelas
    }
public boolean cekPendaftar(){
     //view class refernce untuk mengakses method di frame
      
    String  c = view.getCbBulan().getSelectedItem().toString();
    String  b = view.getCbJurusan().getSelectedItem().toString();
   
     
    
     
        if   ((view.getTxtNama().getText().trim().equals(""))        ||
              (view.getTxtAlamat().getText().trim().equals(""))      ||
              (view.getTxtTempat().getText().trim().equals(""))      ||
              (view.getTxtTanggal().getText().trim().equals(""))     ||
              (view.getCbBulan().getSelectedItem() == "Pilih Bulan") ||
              (view.getTxtTahun().getText().trim().equals(""))       ||
              (view.getTxtAgama().getText().trim().equals(""))       ||
              (view.getTxtProgram().getText().trim().equals(""))     ||
              (view.getCbJurusan().getSelectedItem() == "Pilih Jurusan")||
              (view.getTxtNoHp().getText().trim().equals("")         ||
              (view.getTxtEmail().getText().equals("")))){
          
            JOptionPane.showMessageDialog(view, "masih ada yang kosong");
            return false;
    
        }else{
            JOptionPane.showMessageDialog(view, "data berhasil disimpan");
        }
       

     
    

  KartuView a = new KartuView();
    
    KartuView.lblName.setText(view.getTxtNama().getText());
    KartuView.lblStudi.setText(view.getTxtProgram().getText());
    KartuView.lblKuliah.setText(b);
    KartuView.lblHp.setText(view.getTxtNoHp().getText());
    KartuView.lblTempat.setText(view.getTxtTempat().getText());
    KartuView.lblLahir.setText(view.getTxtTanggal().getText());
    KartuView.lblLahir1.setText(c);
    KartuView.lblLahir2.setText(view.getTxtTahun().getText());
    KartuView.lblNamaLengkap.setText(view.getTxtNama().getText());
    
  a.setVisible(true);     
        return false;
        
       
}   

}



  
    
        



