/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Productos {
        // suma para el llevar el total
    public static int sumaProductos=0;

    // METODOS

    public void escogerDia() {
        String[] paquetes = {"1 Semana completa", "2  3 Dias y 2 Noches", "3 Vip ", "4 Todas las anteriores +areas recreativas"};




        JOptionPane.showMessageDialog(null, "Bienvenidos a paquetes. ");
        JOptionPane.showMessageDialog(null, "1= semana completa con valor de 50.000 " +
                "\n" + "2= 3 dias y 2 noches con un valor de 70.000" + "\n"
                + "3= vip con un valor de 120.000" + "\n" +
                "4= todas las anteriores + areas recreativas con un valor de 150.000");
        JOptionPane.showMessageDialog(null, "escoja su seleccion a comprar");
        String opcion = JOptionPane.showInputDialog("ingrese el numero de paquete que quiera comprar");
        int opcion1 = Integer.parseInt(opcion);

        Facturacion fct = new Facturacion();

        if (opcion1 == 1) {
            JOptionPane.showMessageDialog(null, (paquetes[0]));
            sumaProductos+= Facturacion.semanaCompleta;
        } else if (opcion1 == 2) {
            JOptionPane.showMessageDialog(null, (paquetes[1]));
            sumaProductos+= Facturacion.dosNoches;
        } else if (opcion1 == 3) {
            JOptionPane.showMessageDialog(null, (paquetes[2]));
            sumaProductos+= Facturacion.vip;
        } else if (opcion1 == 4) {
            JOptionPane.showMessageDialog(null, (paquetes[3]));
            sumaProductos+= Facturacion.recreativas;
        } else
            JOptionPane.showMessageDialog(null, "seleccion incorrecta");

        }



    // crear adicinal
   public void paquetesAdicionales(){

        JOptionPane.showMessageDialog(null, "Tenemos paquetes adicionales para usted "
                +"\n"+"1 camping"+"\n"+"2 senderismo");

        int lectura1 = Integer.parseInt(JOptionPane.showInputDialog("elija el paquete deseado, o cualquier otro numero para salir "));
        if (lectura1==1){
            JOptionPane.showMessageDialog(null,"a seleccionado camping con exito");
            sumaProductos+=Facturacion.camping;
        }
        else if (lectura1==2){
            sumaProductos+=Facturacion.senderismo;
        }
        else JOptionPane.showMessageDialog(null,"no se escogieron adiccionales, gracias");
    }


}
