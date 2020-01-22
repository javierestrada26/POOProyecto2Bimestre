/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectof;

/**
 *
 * @author Jose Luis
 */
// La superclase abstracta
abstract class Boleto {

    public String numCedula;
    public String nombre;
    public String apellido;
    public String Tipo_Pasajero;
    public double descuento;
    public double precio_boleto;

    // Constructor boleto () con cero argumentos 
    public Boleto() {
    }

    public Boleto(String numCedula, String nombre, String apellido, String Tipo_Pasajero) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Tipo_Pasajero = Tipo_Pasajero;
    } // Fin del constructor

    //_____ Metodos get y set de los atributos______//
    public String getNumCedula() {
        return numCedula;
    }//Fin del metodo getNumCedula

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula; // deberia validar
    }// Fin de metodo setNumCedula
    // devuelve valor del Nombre 

    public String getNombre() {
        return nombre;
    }// Fin del metodo getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;// deberia validar
    }//Fin del metodo setNombre
    // devuelve valor del Apellido 

    public String getApellido() {
        return apellido;
    }//Fin del metodo getApellido

    public void setApellido(String apellido) {
        this.apellido = apellido; // deberia validar
    } // Fin del metodo setApellido

    
    public String getTipo_Pasajero() {
        return Tipo_Pasajero;
    } // Fin del Metodo

    public void setTipo_Pasajero(String Tipo_Pasajero) {
        this.Tipo_Pasajero = Tipo_Pasajero; // deberia validar
    }// Fin del metodo 
   
    abstract public double obtener_descuento(); // No tiene implementaciones

    abstract public double obtener_precioBoleto(); // No tiene implementaciones
   

    // devuelve representación String de un objeto boleto
    @Override
    public String toString() {

        return String.format("%s %s\nCedula: %s\nTipo de Pasajero: %s", getNombre(), getApellido(), getNumCedula(), getTipo_Pasajero());

    } 
}
