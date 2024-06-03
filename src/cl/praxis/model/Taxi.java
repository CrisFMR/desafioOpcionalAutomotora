package cl.praxis.model;

public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi(){
    }

    //--CONSTRUCTOR--
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }
    //--GETTER--
    public int getValorPasaje() {
        return valorPasaje;
    }
    //--SETTER--
    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    //--VUELTO Y PAGO--
    public int pagarPasaje(int monto) {

        if (monto >= valorPasaje) {
            return monto - valorPasaje;

        }
             return monto;
    }
}

