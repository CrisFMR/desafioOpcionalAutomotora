package cl.praxis.model;

public class Vehiculo {
    private String color;
    private String patente;

    public Vehiculo(){}

    //--CONSTRUCTOR--
    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }
    //--GETTER--
    public String getColor() {
        return color;
    }

    public String getPatente() {
        return patente;
    }
    //--SETTER--
    public void setColor(String color) {
        this.color = color;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
