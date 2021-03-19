package DispensadoraDulces;

import java.util.ArrayList;
import java.util.List;


public class MaquinaDispensadoraDulces {
    private List<Producto> productos;

    public MaquinaDispensadoraDulces() {
        this.productos = new ArrayList<>();

    }

    public void cargarProducto(Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6, Producto producto7, Producto producto8, Producto producto9, Producto producto10) {
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);
    }

    public void cargarInventario(String codigo, byte cantidad) {
        boolean existeProductox = false;
        Producto producto = new Producto();
        for (Producto productox : productos) {
            if (productox.getCodigo().equals(codigo)) {
                existeProductox = true;
                producto = productox;
            }
        }
        if (existeProductox) {
            if ((producto.getCantidadActual() + cantidad) > producto.getCantidadMaxima()) {
                producto.setCantidadActual((byte) 8);
            } else {
                byte cantidadActual = (byte) (producto.getCantidadActual() + cantidad);
                producto.setCantidadActual(cantidadActual);
            }
        }
    }

    //sacar producto por el nombre.
    public void sacarProducto(String nombre, short dinero) {
        boolean existeProductox = false;
        Producto producto = new Producto();
        for (Producto productox : productos) {
            if (productox.getNombre().equals(nombre)) {
                existeProductox = true;
                producto = productox;
            }
        }
        if (existeProductox) {
            if (producto.getNombre().equals(nombre) && producto.getCantidadActual() > 0 && producto.getPrecio() <= dinero) {
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Disfrute su " + producto.getNombre() + " su cambio es de: " + (dinero - producto.getPrecio()) + " pesos");

            } else {
                System.out.println("Producto no disponible, su cambio es de: " + dinero + " pesos");
            }
        } else {
            System.out.println("Producto no disponible, su cambio es de: " + dinero + " pesos");
        }
    }

    public void sacarProductoCodigo(String codigo, short dinero) {
        boolean existeproductox = false;
        Producto producto = new Producto();
        for (Producto productox : productos) {
            if (productox.getCodigo().equals(codigo)) {
                existeproductox = true;
                producto = productox;
            }
        }
        if (existeproductox) {
            if (producto.getCodigo().equals(codigo) && producto.getCantidadActual() > 0 && producto.getPrecio() <= dinero) {
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Disfrute su " + producto.getNombre() + " su cambio es de: " + (dinero - producto.getPrecio()) + " pesos");
            } else {
                System.out.println("Producto no disponible, su cambio es de: " + dinero + " pesos");
            }
        } else {
            System.out.println("Producto no disponible, su cambio es de: " + dinero + " pesos");
        }
    }

    public List<Producto> consultarProductosAgotados() {
        List<Producto> productosAgotados = new ArrayList<>();
        productos.forEach(producto -> {
            if (producto.getCantidadActual() == 0) {
                productosAgotados.add(producto);
            }
        });
        return productosAgotados;
    }

    // consultar unidades de un producto
    public Producto consultarUnidades(String codigo) {
        Producto productox = new Producto();
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productox = producto;
                break;
            }
        }
        return productox;
    }
    // consultar total de unidades de todos los productos
    public List<Producto> consultarTotalUnidades(){
        List<Producto > inventarioTotal = new ArrayList<>();
        productos.forEach(producto -> {
            inventarioTotal.add(producto);
        });
        return inventarioTotal;
    }
}

