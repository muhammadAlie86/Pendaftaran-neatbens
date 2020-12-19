
package controller;

import javax.swing.JOptionPane;
import view.RegisterView;


public class RegisterControler {
   
    private final RegisterView view;
   
        public RegisterControler(RegisterView frame){
            this.view = frame;
            }

   
        public void cekRegister(){
        
        
            String namaDepan = view.getTxtNama().getText();
            String namaBelakang = view.getTxtNamaBelakang().getText();
            String Username = view.getTxtUsername().getText();
            String password = view.getTxtPassword().getText();
            String konfirmasiPassword = view.getTxtKonfirmasiPassword().getText();
       
                if ((namaDepan.trim().equals(""))|| 
                    (namaBelakang.trim().equals(""))||
                    (password.trim().equals(""))||  
                    (Username.trim().equals("")) ||
                    (konfirmasiPassword.trim().equals(""))){
                
                        JOptionPane.showMessageDialog(view, "isi yang benar pak");
            
                }else if (password.equals(konfirmasiPassword)){
                        JOptionPane.showMessageDialog(view, "data berhasil disimpan");
           
                        new RegisterView().setVisible(true);

                }else{
                         JOptionPane.showMessageDialog(view, "pasword salah");
            
                }
        
        }
}



