/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells;

import java.util.ArrayList;

/**
 *
 * @author Jimmy Leon
 */
public class Inventario {
    private ArrayList<Producto> productos;
//    private ArrayList<Integer> cantidades;    Shotgun Surgery / Move Field
    
    public Inventario() {
        productos= new ArrayList<>();
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public boolean VerificarStock(Producto producto,int cantidad){
        if(productos.contains(producto)){
            return false;
        }
        return producto.getCantidad() >= cantidad;
    }
    public void reabastecerce(){
        for(int i =0;i<productos.size();i++){
            if(VerificarStock(productos.get(i),25)){
                int actual= productos.get(i).getCantidad();
                productos.get(i).setCantidad(50+actual);
            }      
        }        
    }
}
