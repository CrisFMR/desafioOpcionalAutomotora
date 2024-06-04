package cl.praxis.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//1-. Se crea LibroVenta con atributos solicitados.
public class LibroVenta{
    private String nombreVenta;
    private String fechaVenta;

    //--Contructor--
    public LibroVenta() {
    }
//2-.Se crea el Contructor con parámetros

    public LibroVenta(String fechaVenta, String nombreVenta) {
        this.fechaVenta = fechaVenta;
        this.nombreVenta = nombreVenta;
    }

//3-. se crean los Getter and Setter--


    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

//4-. Se crea la operacion llamada guardarVenta.
//5-. Se crea tambien los Ficheros con atributos e indicaciones solicitadas.
    //Nota: en Main se puede realizar la prueba de la implementacion
    // de los archivos .txt y sus correspondientes excepciones.
    public void guardarVenta(Vehiculo vehiculo, Cliente cliente) {

        File directorio = new File("src/cl/praxis/model/ficheros/");
        File archivo = new File("src/cl/praxis/model/ficheros/" + nombreVenta + ".txt");

        //Try para guardar fecha como numero.
        try {
            int number = Integer.parseInt(getFechaVenta());
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        if (!directorio.exists()) {
            try {
                if (directorio.mkdirs()) {
                    System.out.printf("Directorio creado como %s\n", directorio.getName());
                }else {
                    System.out.println("Error al crear directorio!");
                    return;
                }
            } catch (Exception e) {
                System.out.printf("Archivo creado con nombre %s\n", archivo.getName());
                e.printStackTrace();
            }
        }else {
            System.out.println("El directorio ya existe!");
        }
        if (!archivo.exists()) {

            try {
                archivo.createNewFile();
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);

                ArrayList<String> ingresoDatos = new ArrayList<String>();

                ingresoDatos.add("Patente: " + vehiculo.getPatente());
                ingresoDatos.add("Edad Cliente: " + cliente.getEdad());
                ingresoDatos.add("Fecha Venta: " + getFechaVenta());
                ingresoDatos.add("Nombre Venta: " + getNombreVenta());

                Iterator<String> it = ingresoDatos.iterator();
                while (it.hasNext()) {
                    bw.write(it.next());
                    bw.newLine();
                }
                bw.close();
                System.out.printf("Se ha creado el archivo %s\n", archivo.getName());
                System.out.println("La venta ha sido registrada correctamente");

            } catch (IOException e) {
                System.out.println("Error al crear archivo!");
                e.printStackTrace();

            }

        }else{
            System.out.println("El archivo ya existe!");
        }
    }
}
