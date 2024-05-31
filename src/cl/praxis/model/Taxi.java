package cl.praxis.model;

public class Taxi {
    private int valorPasaje;

    //--CONSTRUCTOR--
    public Taxi(int valorPasaje) {
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
    public int pagarPasaje(int valorPagado) {

        if (valorPagado >= valorPasaje) {
            return (valorPagado - valorPasaje);

        } else {
             return valorPagado;
        }

    }
}

