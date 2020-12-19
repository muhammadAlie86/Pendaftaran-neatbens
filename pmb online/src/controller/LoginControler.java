
package controller;


import javax.swing.JOptionPane;
import view.LoginView;



public class LoginControler {

    private final LoginView view;
        
        public LoginControler(LoginView frame){
       
                 this.view = frame;
            }

         public boolean cekLogin(){
                
        
            String username = view.getTxtUsername().getText();
            String password = view.getTxtPassword().getText(); 
       
        
                if(username.trim().equals("username")){
                    JOptionPane.showMessageDialog(view, "enter your username");
                    return false;
                }
            
                if(password.trim().equals("*********")){
                    JOptionPane.showMessageDialog(view, "enter your password");
                    return false;     
                }
              
                if(username.equals("muhammad alie")&&(password.equals("1234"))){
                    return false;
                }
       
                else {
                    JOptionPane.showMessageDialog(view, "username/password salah");
          
                    return false;
                }
                
    }
}
            
  
      

      
     
