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
public class Facturacion {
        //precios
    public static float iva = 0.13f;
    public static int semanaCompleta = 50000;
    public static int dosNoches = 70000;
    public static int vip = 10000;
    public static int recreativas = 120000;
    public static int senderismo = 25000;
    public static int camping = 10000;


    // metodos


    //public void mostrarFactura(Registro rg){
    // System.out.println("Estimad@"+"" + rg.getNombre()+"\n" + " su factura es de : "
    // + Productos.sumaProductos+"\n"+
    //  "iva = 13% "+"\n" +"el total a pagar es de : "+(Productos.sumaProductos*(1+iva))+"\n"+"la factura sera remitida al correo:" + rg.getCorreo()
    //  +" y al numero :"+ rg.getCelular()+"le llegara un mensaje de aviso");


    //}


    public void mostrarFactura(Registro rg) {
        float total = Productos.sumaProductos* (1 + iva);

        JOptionPane.showMessageDialog(null,
                "Estimad@ " + rg.getNombre() + "\n" +
                        "Subtotal: ₡" + Productos.sumaProductos + "\n" +
                        "IVA (13%): ₡" + String.format("%.2f", Productos.sumaProductos * iva) + "\n" +
                        "Total a pagar: ₡" + String.format("%.2f", total) + "\n\n" +
                        "La factura sera enviada al correo: " + rg.getCorreo() + "\n" +
                        "y al numero: " + rg.getCelular());


    }
    
}
