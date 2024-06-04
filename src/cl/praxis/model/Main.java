package cl.praxis.model;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*
        //Taxi
        Taxi taxi = new Taxi();
        System.out.println("========================TAXI=========");
        //Caso A: Paga más
        System.out.println("Su vuelto es de " + "$" + taxi.pagarPasaje(5000));
        //Caso B: Paga lo mismo
        System.out.println("Su vuelto es de " + "$" + taxi.pagarPasaje(1050));
        //Caso C: Paga menos
        System.out.println("Se devuelven " + "$" + taxi.pagarPasaje(1040));
        System.out.println("");


        //Bus
        Bus bus = new Bus();
        System.out.println("=========================BUS=========");
        //Disponibilidad de asientos
        bus.setCantidadDeAsientos(7);
        System.out.printf("Cantidad de Asientos disponibles:\n %d asientos", bus.getCantidadDeAsientos());
        System.out.println("\n");


        //Mini Bus
        MiniBus minibus = new MiniBus("Negro", "BZ-XS-79", 24, "Turismo");
        System.out.println("====================MINI BUS=========");
        //Conjunto de características del vehículo
        System.out.println("-Características del Minibus-\n" + minibus.imprimeBus());

        //Tienda
        Tienda tienda = new Tienda();
        System.out.println("================STOCK TIENDA=========");
        tienda.setStock(21);
        //Formato solicitado por requerimiento
        System.out.println(tienda.existeStock());
        System.out.println("\n");*/

        //testing code Desafio evaluado:

        System.out.println("===========REGISTRO DE VENTA=========");
        System.out.println();

        Cliente cliente = new Cliente("","",40);
        Vehiculo vehiculo = new Vehiculo("", "vz-rd-50");
        LibroVenta libroVenta = new LibroVenta("04062024", "Venta002");
        libroVenta.guardarVenta(vehiculo, cliente);




    }
}
