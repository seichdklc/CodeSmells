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
//Clase Inicial Sin Refactoring
//public class Ventas {
//    private String id;
//    private float ventatotal;
//    private ArrayList<String> productos;      - Data Clump / tecnica Extract Class (Producto)
//    private ArrayList<Integer> cantidades;    - Data Clump / tecnica Extract Class (Producto) - Shotgun Surgery/Move Field
//    private float precio;                     - Data Clump / tecnica Extract Class (Producto)
//
//    public Ventas(String id, float ventatotal, ArrayList<Producto> vendido, ArrayList<Integer> cantidades) { - Shotgun Surgery/Move Field
//        this.id = id;
//        this.ventatotal = ventatotal;
//        this.vendido = vendido;
//        this.cantidades = cantidades;
//    }   
//}
public class Ventas {
    private String id;
    private float ventatotal;
    private Persona comprador;
    private ArrayList<Producto> vendido;

    public Ventas(String id,ArrayList<Producto> vendido,Persona persona) {
        this.id = id;
        this.comprador=persona;
        float total=0;
        for(int i = 0; i<vendido.size();i++){
            total= total+vendido.get(i).Total();
        }        
        this.ventatotal = total;
        this.vendido = vendido;
    }   
}

