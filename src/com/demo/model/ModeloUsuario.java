package com.demo.model;

import com.demo.model.entity.Usuario;

public class ModeloUsuario extends Model {

    static public boolean logIn(Usuario user) {
        boolean band = false;

        if (user.getEmail().compareTo("admin@gmail.com") == 0
                && user.getClave().compareTo("123456") == 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }

}
