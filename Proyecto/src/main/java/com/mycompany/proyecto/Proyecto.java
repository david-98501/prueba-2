/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Proyecto {

    public static void main(String[] args) {
                Registro rg = new Registro();
        Facturacion ft= new Facturacion();
        Reservas rs =new Reservas();
        Productos pd =new Productos();

        JOptionPane.showMessageDialog(null,"Bienvenido al hotel MM "+"\n"+"Estamos a sus ordenes." );


        rg.setNombre(JOptionPane.showInputDialog("Digite su nombre "));
        rg.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula")));
        rg.setCelular(Integer.parseInt(JOptionPane.showInputDialog("Digite su celular")));
        rg.setCorreo(JOptionPane.showInputDialog("Digite su correo "));
        rg.setDireccion(JOptionPane.showInputDialog("Digite su direccion "));








        // aqui valido la edad por medio de un booleano
        if (!rg.edad()){
            return;// este me regresa true o false
        }

        boolean bandera = true;

        do {
            int lectura1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Oprima 1 para obtener paquetes" + "\n" + "Oprima 2 para reservar una habitación" + "\n" +
                    "Oprima 3 para mostrar factura"+"\n"+"precione 4 para paquetes adicionales"+"\n"+"precione cualquier otro para salir"));

            if (lectura1 == 1) {
                pd.escogerDia();
            } else if (lectura1 == 2) {
                rs.reservarHabitacion();
            } else if (lectura1 == 3) {
                ft.mostrarFactura(rg);
            } else if (lectura1 == 4) {
                pd.paquetesAdicionales();
            } else {
                bandera = false;
            }

        } while (bandera);


       
        
        
        
        
        
        
    }
}
