package TourFrancia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private byte id;
    private String nombre;
    private String pais;
    private List<Corredor> corredores;

    public Equipo() {}

    public Equipo(byte id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.corredores = new ArrayList<>();
    }
    public void inscribirCorredores (Corredor corredor1, Corredor corredor2, Corredor corredor3, Corredor corredor4, Corredor corredor5, Corredor corredor6, Corredor corredor7){
        corredores.add(corredor1);
        corredores.add(corredor2);
        corredores.add(corredor3);
        corredores.add(corredor4);
        corredores.add(corredor5);
        corredores.add(corredor6);
        corredores.add(corredor7);
    }

    public List<Corredor> getCorredoresOrdenados(){
        if (this.nombre.equals(nombre)){
            List<Corredor> corredoresOrdenados = new ArrayList<>();
            Collections.sort(corredores);
            corredoresOrdenados.addAll(corredores);
            return corredoresOrdenados;
        }
        else {
            List<Corredor> o = null;
            return o;
        }
    }

    public byte getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

}
