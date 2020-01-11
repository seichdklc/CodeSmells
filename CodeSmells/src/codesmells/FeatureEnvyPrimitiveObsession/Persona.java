/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.FeatureEnvyPrimitiveObsession;

/**
 *
 * @author Jimmy Leon
 */
//public class Persona {              
//    protected String name;                  //-Primitive Obsession
//    protected String apellido;              //-Tecnica Replace Data Value with Object
//    protected String cedula;                //-New Objects (Contacto,Informacion personal) 
//    protected int telefonoCelular;             
//    protected int telefonoConvencional;       
//    protected int edad;                     
//    protected String domicilio;
//    protected String ocupacion;
//}
public class Persona {              
    protected InformacionPersonal info;               
    protected Contacto contactoTelefonico; 
    protected int edad;
    protected String ocupacion;
    
    public void call(int number){               
//        // llamar a alguien                     
    }
    
    public void cobrar(int number){                     //Feature Envy
        //call(number);                                 //Tecnica Move Method 
        call(number);                                   //Contacto(Call) hacia Persona
    }                                                   
    
    public void obtenerInformacion(int number){         //Feature Envy
//        contactoTelefonico.call(number);              //Tecnica Move Method
        call(number);                                   //Contacto(Call) hacia Persona
    }                       
    
    public void tomarDiaLibre(int number){              //Feature Envy
//        contactoTelefonico.call(edad);                //Tecnica Move Method
        call(number);                                   //Contacto(Call) hacia Persona
    }                                                   
}
