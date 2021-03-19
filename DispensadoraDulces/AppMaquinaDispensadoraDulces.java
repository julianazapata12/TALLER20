package DispensadoraDulces;

public class AppMaquinaDispensadoraDulces {

    public static void main(String[] args) {
        MaquinaDispensadoraDulces maquina;
        maquina= new MaquinaDispensadoraDulces();

        Producto minichips = new Producto("A","minichips",(short) 1800);
        Producto takis = new Producto("B","takis",(short) 3800);
        Producto chicles = new Producto("C","chicles",(short)1000);
        Producto mani = new Producto("D","mani",(short)1200);
        Producto golochips = new Producto("E","golochips",(short)2000);
        Producto doritos = new Producto("F","doritos",(short)1800);
        Producto choclitos = new Producto("G","choclitos",(short)1500);
        Producto papas = new Producto("H","papas",(short)1000);
        Producto mentas = new Producto("I","mentas",(short)1200);
        Producto juguito= new Producto("J","juguito",(short)1200);

        maquina.cargarProducto(minichips, takis, chicles, mani, golochips, doritos, choclitos, papas, mentas, juguito);

        maquina.cargarInventario ("A", (byte)10);
        maquina.cargarInventario("B", (byte) 8);
        maquina.cargarInventario("C", (byte) 5);
        maquina.cargarInventario("D", (byte) 7);
        maquina.cargarInventario("E", (byte) 8);
        maquina.cargarInventario("F", (byte) 4);
        maquina.cargarInventario("G", (byte) 9);
        maquina.cargarInventario("H", (byte) 7);
        maquina.cargarInventario("I", (byte) 7);
        maquina.cargarInventario("J", (byte) 0);

        System.out.println();
        System.out.println("Sacar producto según nombre o codigo:");

        maquina.sacarProductoCodigo("A",(short) 1800);
        System.out.println();
        maquina.sacarProducto("choclitos",(short) 1500);
        System.out.println();
        maquina.sacarProductoCodigo("F" , (short) 1800);
        System.out.println();
        maquina.sacarProducto("juguito", (short) 1200);

        //Lista de productos agotados
        System.out.println();
        System.out.println("Lista de productos agotados:");

        maquina.consultarProductosAgotados().forEach(p ->{
            System.out.println("El producto " + p.getNombre() + " está agotado");
        });

        //Inventario producto determinado
        System.out.println();
        System.out.println("Inventario de un producto determinado");

        String codigo = "A";
        System.out.println("El producto " + maquina.consultarUnidades(codigo).getNombre() + " tiene en inventario: " + maquina.consultarUnidades(codigo).getCantidadActual() + " unidades");

        //Inventario todos los productos
        System.out.println();
        System.out.println("Consultar las unidades de todos los productos:");

        maquina.consultarTotalUnidades().forEach(p ->{
            System.out.println("el producto" + p.getNombre() + "tiene en inventario:" + p.getCantidadActual() +"unidades");

        });

    }
}


