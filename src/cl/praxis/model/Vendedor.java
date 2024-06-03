package cl.praxis.model;

//--CLASE EXTENDIDAD DESDE PERSONA--
public class Vendedor extends Persona{
    private String direccion;

    //--CONSTRUCTOR--
    public Vendedor(){
    }

    //--SUPER CLASS--
    public Vendedor(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }
    //--GETTER--
    public String getDireccion() {
        return direccion;
    }
    //--SETTER--
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
