package cl.praxis.model;

//--CLASSE EXTENDDA DESDE PERSONA--
public class Cliente extends Persona{
    //--CONSTRUCTOR--
    public Cliente(){
    }

    //--SUPER CLASS--
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
    }

}
