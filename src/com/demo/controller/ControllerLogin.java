
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;

public class ControllerLogin extends Controller {
  
    public ControllerLogin(){
    }
        public boolean logIn(String usuario, String clave){
        boolean band = false;
        
        Usuario user = new Usuario(usuario, clave);
        
      band =  ModeloUsuario.logIn(user);
        return band;
        
        }
     public long logUp(){
       long status = 0;
       return status;
        }
        
        public long RecuperarClave(){
       long status = 0;
       return status;
        }
        
        
}
