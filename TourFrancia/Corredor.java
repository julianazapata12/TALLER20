package TourFrancia;

public class Corredor{
    private byte id;
    private  String nombre;
    private String pais;
    private byte edad;
    private Equipo equipo;

    public Corredor(){}

    public Corredor(byte id, String nombre, String pais, byte edad, Equipo equipo) {
        this.id= id;
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.equipo = equipo;
    }
    public byte getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public byte getEdad() {
        return edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int compareTo(Corredor c) {
        return this.edad - c.edad;
    }
}



