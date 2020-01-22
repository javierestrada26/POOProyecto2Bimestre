/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectof;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis
 */
public class Main {

   
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Formatter outFile = new Formatter("ListadePasajeros.csv"); //CSV
            outFile.format("%s;\n", "REPORTES DE Ventas");
            outFile.format("%s;%s;%s;%s;%s;%s;\n", " Nombres   ", " Cedula  ", " Tipo Pasajero ", " Destino    ", " Descuento  ", " Precio Boleto  ");

            Scanner entrada = new Scanner(System.in); // Linea de codigo que permite ingresar datos a la consola
            // Intancia de objetos de las diferentes clases con parametros vacios.
            Pasaje_Quito bt_quito = new Pasaje_Quito();
            Pasaje_Ambato bt_ambato = new Pasaje_Ambato();
            Pasaje_Machala bt_machala = new Pasaje_Machala();
            Pasaje_Cuenca bt_cuenca = new Pasaje_Cuenca();
            // Inicializacion de Variables
            int op_destino;
            String op = "";
            int opcion_menu;
            // Contadores
            int ct_quito = 0;
            int ct_cuenca = 0;
            int ct_ambato = 0;
            int ct_machala = 0;
            // Variables
            String variable_nombre = null; // Variable que guarda el nombre
            String variable_apellido = null;// Variable que guarda el apellido
            String variable_cedula = null;// Variable que guarda la cedula
            String variable_pasajero = null;// Variable que guarda la PASAJERO
            String nombre_archivo = null; // Variable que almacena la variable variable_nombre.
            String apellido_archivo = null; // Variable que almacena la variable variable_apellido.
            String cedula_archivo = null; // Variable que almacena la variable variable_cedula.
            String pasajero_archivo = null; // Variable que almacena la variable  variable_PASAJERO.
            String destino_archivo = null; // manda el destino 
            double descuento_archivo = 0;  // Variable que almacena .obtener_descuento().
            double precio_archivo = 0;   // Variable que almacena .obtener_precioBOLETO()
            int respuesta; // Variable que guarda la opcion del usuario del continuar en la aplicacion.
            boolean corrida = true; // Variable de tipo boolean inicializado en true.
            while (corrida = true) { // Inicio del ciclo while
                // Salida de Datos en pantalla

                op = JOptionPane.showInputDialog("******Cooperativa de Transporte Loja******\n" + " MENU DE OPCIONES \n"
                        + "|1--->Venta de Boletos \n "
                        + "|2 --->Reporte de ventas \n" + "| 3 --->Informacion de boletos vendidos\n"
                        + "Ingrese su opcion[1-3]:");
                opcion_menu = Integer.parseInt(op);

                switch (opcion_menu) {
                    case 1:

                        op = JOptionPane.showInputDialog("\t\tMENU DE DESTINOS \n" + "|  1 Quito -----> $30\n "
                                + "|2 Cuenca -----> $20  \n" + "| 3 Ambato -----> $25 \n " + "| 4 Machala -----> $ 15 \n"
                                + "Ingrese su opcion[1-4]:");
                        op_destino = Integer.parseInt(op);

                        
                        switch (op_destino) {
                            case 1:
                                //QUITO
                                variable_nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                                variable_apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                                variable_cedula = JOptionPane.showInputDialog("Ingrese su numero de cedula:");
                                variable_pasajero = JOptionPane.showInputDialog("Ingrese tipo de pasajero : "
                                        + "[Normal][Estudiante][Jubilado][Abonado]:");
                                bt_quito.setNombre(variable_nombre);
                                bt_quito.setApellido(variable_apellido);
                                bt_quito.setNumCedula(variable_cedula);
                                bt_quito.setTipo_Pasajero(variable_pasajero);
                                bt_quito.obtener_descuento();
                                bt_quito.obtener_precioBoleto();
                                ct_quito++;
                                
                                JOptionPane.showMessageDialog(null, "COMPRA EXITOSA ");
                                destino_archivo = "Quito";
                                descuento_archivo = bt_quito.obtener_descuento();
                                precio_archivo = bt_quito.obtener_precioBoleto();
                                break;// Sale de switch

                            case 2:
                                //CUENCA
                                variable_nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                                variable_apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                                variable_cedula = JOptionPane.showInputDialog("Ingrese su numero de cedula:");
                                variable_pasajero = JOptionPane.showInputDialog("Ingrese tipo de pasajero : [Normal][Estudiante][Jubilado][Abonado]:");

                                bt_cuenca.setNombre(variable_nombre);
                                bt_cuenca.setApellido(variable_apellido);
                                bt_cuenca.setNumCedula(variable_cedula);
                                bt_cuenca.setTipo_Pasajero(variable_pasajero);
                                bt_cuenca.obtener_descuento();
                                bt_cuenca.obtener_precioBoleto();
                                ct_cuenca++;
                                JOptionPane.showMessageDialog(null, "COMPRA EXITOSA ");
                                destino_archivo = "Cuenca";
                                descuento_archivo = bt_cuenca.obtener_descuento();
                                precio_archivo = bt_cuenca.obtener_precioBoleto();
                                break;// Sale de switch

                            case 3:
                                //AMBATO
                                variable_nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                                variable_apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                                variable_cedula = JOptionPane.showInputDialog("Ingrese su numero de cedula:");
                                variable_pasajero = JOptionPane.showInputDialog("Ingrese tipo de pasajero : [Normal][Estudiante][Jubilado][Abonado]:");
                                bt_ambato.setNombre(variable_nombre);
                                bt_ambato.setApellido(variable_apellido);
                                bt_ambato.setNumCedula(variable_cedula);
                                bt_ambato.setTipo_Pasajero(variable_pasajero);
                                bt_ambato.obtener_descuento();
                                bt_ambato.obtener_precioBoleto();
                                ct_ambato++;
                                JOptionPane.showMessageDialog(null, "COMPRA EXITOSA ");
                                destino_archivo = "Ambato";
                                descuento_archivo = bt_ambato.obtener_descuento();
                                precio_archivo = bt_ambato.obtener_precioBoleto();
                                break;

                            case 4:
                                //MACHALA
                                variable_nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                                variable_apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
                                variable_cedula = JOptionPane.showInputDialog("Ingrese su numero de cedula:");
                                variable_pasajero = JOptionPane.showInputDialog("Ingrese tipo de pasajero : [Normal][Estudiante][Jubilado][Abonado]:");
                                bt_machala.setNombre(variable_nombre);
                                bt_machala.setApellido(variable_apellido);
                                bt_machala.setNumCedula(variable_cedula);
                                bt_machala.setTipo_Pasajero(variable_pasajero);
                                bt_machala.obtener_descuento();
                                bt_machala.obtener_precioBoleto();
                                ct_machala++;
                                JOptionPane.showMessageDialog(null, "COMPRA EXITOSA ");
                                destino_archivo = "Machala";
                                descuento_archivo = bt_machala.obtener_descuento();
                                precio_archivo = bt_machala.obtener_precioBoleto();
                                break;// Sale de switch

                            default:
                                
                                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA ");
                                break;

                        }
                        
                        
                        
                        nombre_archivo = variable_nombre;
                        apellido_archivo = variable_apellido;
                        cedula_archivo = variable_cedula;
                        pasajero_archivo = variable_pasajero;
                        outFile.format("%s;%s;%s;%s;%f;%f;\n", nombre_archivo + " " + apellido_archivo, cedula_archivo, pasajero_archivo, destino_archivo, descuento_archivo, precio_archivo);
                        break;

                    case 2: 
                        // Primero verifica si hay registros de BOLETOS
                        if (ct_quito != 0 || ct_cuenca != 0 || ct_ambato != 0 || ct_machala != 0) {

                            JOptionPane.showMessageDialog(null,
                                    "EL REPORTE DE LOS BOLETOS HA SIDO GENERADO\n");

                            break;
                        } else { //Caso contrario muestra lo siguiente
                            JOptionPane.showMessageDialog(null, "Aun no hay boletos vendidos");
                            break;// Sale del la opcion_menu
                        }
                    case 3: // Si la opcion_menu es 3 ejecutara lo siguiente:
                        

                        JOptionPane.showMessageDialog(null, "================================================\n"
                                + "INFORMACION DE BOLETOS VENDIDOS\n" + "================================================\n"
                                + "Destino a Quito:" + ct_quito + "boleto vendido\n" + "Destino a Cuenca:" + ct_cuenca + "boleto vendido\n"
                                + "Destino a Ambato:" + ct_ambato + "boleto vendido\n" + "Destino a Machala:" + ct_machala + "boleto vendido\n"
                                + "================================================");
                        break;// salida de siwtch

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    

                }

                
                op = JOptionPane.showInputDialog("Desea ingesar nuevamente al menu [1]Si/[2]No");
                respuesta = Integer.parseInt(op);

                if (respuesta == 2) {
                    JOptionPane.showMessageDialog(null, "Fue un placer atenderlo");
                    corrida = false; 
                    outFile.close();// Cierra el archivo creado.
                    break; // Linea de codigo que hace que el programa finalice
                }

            }// Fin del ciclo while
        } catch (FileNotFoundException | HeadlessException | NumberFormatException e) {
        }
    }
}// Fin de la clase
