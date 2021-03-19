package TourFrancia;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private byte numeroEtapa;
    private String nombre;
    private String inicioEtapa;
    private String finalEtapa;
    private List<Equipo> equipos;

    public Etapa(byte numeroEtapa, String nombre, String inicioEtapa, String finalEtapa) {
        this.numeroEtapa = numeroEtapa;
        this.nombre = nombre;
        this.inicioEtapa = inicioEtapa;
        this.finalEtapa = finalEtapa;
        this.equipos = new ArrayList<>();
    }

    public void inscribirEquiposEtapa(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4, Equipo equipo5){
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
    }

    private List<Corredor> getEquipo(){
        List<Corredor> corredores = new ArrayList<>();
        equipos.forEach(equipo -> {
            corredores.addAll(equipo.getCorredores());
        });
        return corredores;
    }

    public Corredor resultadosEtapa(){
        Corredor corredor = new Corredor();
        byte aleatorio = 0;
        aleatorio = (byte) (Math.random() * 35+1);
        for (Corredor corredor1 : getEquipo()) {
            if (aleatorio == corredor1.getId()) {
                corredor = corredor1;
            }
        }
        return corredor;
    }

    public byte getNumeroEtapa() {
        return numeroEtapa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInicioEtapa() {
        return inicioEtapa;
    }

    public void setInicioEtapa(String inicioEtapa) {
        this.inicioEtapa = inicioEtapa;
    }

    public String getFinalEtapa() {
        return finalEtapa;
    }

    public void setFinalEtapa(String finalEtapa) {
        this.finalEtapa = finalEtapa;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
}

