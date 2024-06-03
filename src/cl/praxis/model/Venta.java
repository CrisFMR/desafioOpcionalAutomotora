package cl.praxis.model;

public class Venta {
    public static void main(String[] args) {
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
        System.out.println("======================TIENDA=========");
        tienda.setStock(21);
        //Formato solicitado por requerimiento
        System.out.println(tienda.existeStock());


    }
}
