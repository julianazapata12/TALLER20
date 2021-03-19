package TourFrancia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tour {
    private final List<Etapa> etapas;
    private final List<Equipo> equipos;

    public Tour() {
        this.etapas = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }
    public void etapasTour (Etapa etapa1, Etapa etapa2, Etapa etapa3, Etapa etapa4, Etapa etapa5, Etapa etapa6, Etapa etapa7, Etapa etapa8, Etapa etapa9, Etapa etapa10, Etapa etapa11, Etapa etapa12, Etapa etapa13, Etapa etapa14, Etapa etapa15, Etapa etapa16, Etapa etapa17, Etapa etapa18, Etapa etapa19, Etapa etapa20, Etapa etapa21){
        etapas.add(etapa1);
        etapas.add(etapa2);
        etapas.add(etapa3);
        etapas.add(etapa4);
        etapas.add(etapa5);
        etapas.add(etapa6);
        etapas.add(etapa7);
        etapas.add(etapa8);
        etapas.add(etapa9);
        etapas.add(etapa10);
        etapas.add(etapa11);
        etapas.add(etapa12);
        etapas.add(etapa13);
        etapas.add(etapa14);
        etapas.add(etapa15);
        etapas.add(etapa16);
        etapas.add(etapa17);
        etapas.add(etapa18);
        etapas.add(etapa19);
        etapas.add(etapa20);
        etapas.add(etapa21);
    }

    public void inscribirEquiposTour (Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4, Equipo equipo5){
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
    }

    public List<Equipo> getEquipos(){
        List<Equipo> equiposTour = new ArrayList<>();
        equipos.forEach(equipo -> {
            equiposTour.add(equipo);
        });
        return equiposTour;
    }

    private List<Corredor> getEquipo(){
        List<Corredor> corredores = new ArrayList<>();
        equipos.forEach(equipo -> {
            corredores.addAll(equipo.getCorredores());
        });
        return corredores;
    }

    public List<Corredor> getTop10(){
        List<Corredor> corredor = new ArrayList<>();
        List<Corredor> top10 = new ArrayList<>();
        Set<Byte> randomNum = new HashSet<>();

        while (randomNum.size()<10){
            byte aleatorio = (byte) (Math.random() * 35+1);
            if (!randomNum.contains(aleatorio)){
                randomNum.add(aleatorio);
            }
        }
        getEquipo().forEach(corredor1 -> {
            if (randomNum.contains(corredor1.getId())) {
                top10.add(corredor1);
            }
        });
        return top10;
    }
}
