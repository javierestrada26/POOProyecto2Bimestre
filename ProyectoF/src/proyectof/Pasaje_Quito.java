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
class Pasaje_Quito extends Boleto {

    // Constructor  con 0 argumentos 
    public Pasaje_Quito() {
    }// Fin del constructor vacio.

    // Constructor con 5 argumentos 
    public Pasaje_Quito(String numCedula, String nombre, String apellido, String Tipo_Pasajero) {
        super(numCedula, nombre, apellido, Tipo_Pasajero);
    }// Fin del constructor

    // Metodo sobreescrito  obtener_descuento heredado de la superclase  
    @Override
    public double obtener_descuento() {
        if (this.Tipo_Pasajero.equals("Normal") || this.Tipo_Pasajero.equals("normal")) {
            this.descuento = 30 * 0;
        }
        if (this.Tipo_Pasajero.equals("Estudiante") || this.Tipo_Pasajero.equals("estudiante")) {
            this.descuento = 30 * 0.1;
        }
        if (this.Tipo_Pasajero.equals("Jubilado") || this.Tipo_Pasajero.equals("jubilado")) {
            this.descuento = 30 * 0.15;
        }
        if (this.Tipo_Pasajero.equals("Abonado") || this.Tipo_Pasajero.equals("abonado")) {
            this.descuento = 30 * 0.25;
        }
        return descuento;
    } // Fin del metodo obtener_descuento();

    // Metodo sobreescrito  obtener_precioboleto heredado de la superclase  
    @Override
    public double obtener_precioBoleto() {

        return 30 - obtener_descuento();

    } // Fin del metodo 

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "Destino Quito", super.toString(),
                "Descuento", obtener_descuento(),
                "Precio Matricula", obtener_precioBoleto());
    }

} // Fin de la subclase
