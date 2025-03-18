package org.example.Normalito;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        UsuarioDao usuarioDao=new UsuarioDao();

        //usuarioDao.agregarPersona("pedro","Luorheber37@gmail.com");

        //usuarioDao.bucarPersonaPorId(1);
        //usuarioDao.modificarPersona(1,"Pedro","Pedrito@gmial.com");
        usuarioDao.bucarPersonaPorId(5);

        //usuarioDao.EliminarPersona(2);

        List<String> listaUsuarios = usuarioDao.ObtenerUsuarios();

        for (String usuario: listaUsuarios){
            System.out.println(usuario);
        }
    }
}
