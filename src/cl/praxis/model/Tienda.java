package cl.praxis.model;

public class Tienda {
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;

    //--CONSTRUCTOR--
    public Tienda(){
    }

    //--CONSTRUCTOR CON PARÁMETROS--
    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }
    //--GETTERS--
    public Vendedor getVendedor() {
        return vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getStock() {
        return stock;
    }
    //--SETTERS--
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //--SOUT CANTIDAD DE STOCK--
    public String existeStock(){
        return "Cantidad de stock es " + getStock() ;
    }
}
