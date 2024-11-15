/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    //1. Declarar el método main obligatoriamente --llama al interprete de Java
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO!!");
        
        //Ejercicio1: DETERMINAR EL HORÓSCOPO MEDIANTE EL SINO ZODIACAL
        
        String signoZodiacal= "Aries";
        if(signoZodiacal == "Aries"){
            System.out.println("El día de hoy te vas a morir de hambre!!!");
        }else if (signoZodiacal== "Leo") {
            System.out.println("Hoy serás la persona más feliz del mundo!!!");
        }else if (signoZodiacal== "Cáncer") {
            System.out.println("Tendrás un día caótico pero es posible que encuentres un billete");
        }else{
            System.out.println("Ingrese un signo válido");
        }
        
        //PROBAR UNA CLASE
        //DECLARAR/INSTANCIAR UN OBJETO UN OBJETO
        //NombreClase nombreObjeto(variable)= new NombreClase();
        
        Persona a= new Persona();
        a.setSigno("Leo");
        //Todos los métodos de Retorno se deben imprimir para
        //poder Visualizar el valor contenido o almacenado en la memoria
        
        System.out.println("");
        
    }
    public void holaMundo(){
        
    }
}
