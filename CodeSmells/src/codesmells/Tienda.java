/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells;

import codesmells.FeatureEnvyPrimitiveObsession.Persona;
import java.util.ArrayList;

/**
 *
 * @author Jimmy Leon
 */ 
//public class Tienda {                                     - Long Class
//    private ArrayList<Producto> productos;                - Tecnica Extract Subclass
//    protected ArrayList<Ventas> ventas;                   - New Class Inventario
//                                                          -
//    public Tienda(Inventario storage) {                   -
//        ventas=new ArrayList<>();                         -
//    }
//    public boolean VerificarStock(Producto producto,int cantidad){
//        if(!productos.contains(producto)){
//            return false;}
//        return producto.getCantidad() >= cantidad;}
//    public boolean GenerarVenta(ArrayList<Producto> productos,ArrayList<Integer> cantidades){
//        float total=0;
//        for(int i =0;i<productos.size();i++){
//            if(!VerificarStock(productos.get(i),cantidades.get(i))){
//               return false;}
//            total=productos.get(i).getPrecio()*cantidades.get(i);}
//        Ventas v = new Ventas("0"+ventas.size(),total,productos,cantidades);
//        return true;
//    }
//    public void reabastecerce(){
//        for(int i =0;i<productos.size();i++){
//            if(VerificarStock(productos.get(i),25)){
//                int actual= productos.get(i).getCantidad();
//                productos.get(i).setCantidad(50+actual);}      
//        }}
//}
public class Tienda {
    private Inventario storage;
    protected ArrayList<Ventas> ventas;

    public Tienda(Inventario storage) {
        ventas=new ArrayList<>();
    }    
//    public boolean GenerarVenta(ArrayList<Producto> productos,ArrayList<Integer> cantidades){ //- Shotgun Surgery/Move Field
    public boolean GenerarVenta(ArrayList<Producto> productos,Persona persona){    
        float total=0;
        for(int i =0;i<productos.size();i++){
            if(!storage.VerificarStock(productos.get(i),productos.get(i).getCantidad())){
               return false;                 
            }
            total=productos.get(i).Total();
        }
//        Ventas v = new Ventas("0"+ventas.size(),total,productos,cantidades); - Shotgun Surgery/Move Field
        Ventas v = new Ventas("0"+ventas.size(),productos,persona);
        return true;
    }   
}
