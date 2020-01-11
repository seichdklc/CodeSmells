/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells;

/**
 *
 * @author Jimmy Leon
 */
public class Producto {
    private String name;
    private int cantidad; // Agrege este campo nuevo lo cual ocasiona un shotgun surgery
    private float precioUnitario;

    public Producto(String name, float precio,int cantidad) {
        this.name = name;
        this.precioUnitario = precio;
        this.cantidad=cantidad;
    }

    public String getName() {
        return name;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precioUnitario;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecio(float precio) {
        this.precioUnitario = precio;
    }
    public float Total(){
        return precioUnitario*cantidad;
    }
}
