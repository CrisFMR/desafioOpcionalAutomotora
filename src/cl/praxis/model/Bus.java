package cl.praxis.model;

//--CLASSE EXTENDDA DESDE VEHICULO--
public class Bus extends Vehiculo{
    private int cantidadDeAsientos;

    public Bus(){
    }

    //--CONSTRUCTOR + SUPER CLASS--
    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    // ATRIBUTO CANTIDAD DE ASIENTOS
    public Bus(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    //--GETTER--
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }
    //--SETTER--
    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    //--ASIENTOS DISPONIBLES--
    public int asientosDisponibles(){
        return getCantidadDeAsientos();
    }
}
