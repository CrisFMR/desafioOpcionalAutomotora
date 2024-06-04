package cl.praxis.model;

public abstract class Persona {
    private String rut;
    private String nombre;
    private int edad;

    public Persona(){
    }
    //--CONSTRUCTOR--
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }
    //--GETTER
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    //--SETTER--
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}



