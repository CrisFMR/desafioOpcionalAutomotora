package cl.praxis.model;

//--CLASSE EXTENDDA DESDE BUS--
public class MiniBus extends Bus{
    private String tipoViaje;

    public MiniBus(){
    }
    //--CONSTRUCTOR + SUPER CLASS--
    public MiniBus(String color, String patente, int cantidadDeAsiento, String tipoViaje) {
        super(color, patente, cantidadDeAsiento);
        this.tipoViaje = tipoViaje;
    }
    //--GETTER--
    public String getTipoViaje() {
        return tipoViaje;
    }
    //--SETTER--
    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
    //--SOUT IMPRIME CARACTERISTICAS DE MINIBUS--
    public String imprimeBus(){
        return String.format(
                "Color: %s\n" + "Patente: %s\n" + "Cantidad de Asientos: %s\n" + "Asientos Disponibles: %d\n" + "Tipo de Viaje: %s\n",
                super.getColor(),super.getPatente(),super.getCantidadDeAsientos(),super.asientosDisponibles(),tipoViaje);
    }
}
