/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Dell Core i7
 */
public class Persona {
    //1. Declarar los atributos de tipo privados
    private String signo;
    private Date fechaNacimiento;
    
    //2. Generar los métodos constructores
    public Persona(){ //ctrl + espacio
    
    }
    //3. Métodos de encapsulamiento
    // clic derecho, insertar codigo, 
    // Método de retorno-> Devuelve cadena
    public String getSigno() {
        return signo;
    }
    // Método de no retorno --> Almacena una información
    public void setSigno(String signo) {
        //THIS. ---> es un puntero que hace referencia a la clase
        //en la que estamos trabajando y accede directamente a
        // atributos o métodos
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //4. METODO DE REGLA DE NEGOCIO
    public String determinarHoroscopo(){
        if (signo=="Aries") {
            return "Hoy será un mal día";           
        }else if (signo== "Leo") {
            return("Caminaras por sendas oscuras");
        }
        return "No existe coinsidencias";
    }
    
    
    
    
    
}
