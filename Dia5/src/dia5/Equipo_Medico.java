package dia5;

import java.util.ArrayList;


public class Equipo_Medico {
    private int id;
    private ArrayList<Integer> id_integrantes=new ArrayList<>();
    private int lider_equipo;

    public Equipo_Medico(int id,int lider_equipo) {
        this.id=id;
        this.lider_equipo = lider_equipo;
    }
    
    public void AgregarIntegrante(int id_integrante){
        this.id_integrantes.add(id_integrante);
    }

    @Override
    public String toString() {
        StringBuilder integrantes=new StringBuilder();
        for (Integer integrante : id_integrantes) {
            integrantes.append(integrante+" ");
        }
        return "ID de integrantes: " + integrantes + "\nID lider de equipo: " + lider_equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Integer> getId_integrantes() {
        return id_integrantes;
    }

    public void setId_integrantes(ArrayList<Integer> id_integrantes) {
        this.id_integrantes = id_integrantes;
    }

    public int getLider_equipo() {
        return lider_equipo;
    }

    public void setLider_equipo(int lider_equipo) {
        this.lider_equipo = lider_equipo;
    }   
}
