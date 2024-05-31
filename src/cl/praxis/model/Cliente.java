package cl.praxis.model;

//--CLASSE EXTENDDA DESDE PERSONA--
public class Cliente extends Persona{
    public Cliente(){
    }
    //--CONSTRUCTOR + SUPER CLASS--
//--no pude encontrar la forma de colocar solo edad como salia en el requerimiento asi que incorporo la super clase completa--
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
    }

}
