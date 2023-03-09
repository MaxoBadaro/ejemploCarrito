package ar.edu.utn;

import java.time.LocalDate;

public class Producto {

    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;

    private static final Double miPrecio = 0.1; //Atributo de clase o estático, se comparten entre todos los obj de la clase

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = miPrecio;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
