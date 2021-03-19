package DispensadoraDulces;

public class Producto {
    private String codigo;
    private String nombre;
    private short precio;
    private byte cantidadActual;
    private byte cantidadMaxima;

    public Producto() {}

    public Producto(String codigo, String nombre, short precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadActual = 0;
        this.cantidadMaxima = 8;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public short getPrecio() {
        return precio;
    }
    public void setPrecio(short precio) {
        this.precio = precio;
    }

    public byte getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(byte cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public byte getCantidadMaxima() {
        return cantidadMaxima;
    }
}

