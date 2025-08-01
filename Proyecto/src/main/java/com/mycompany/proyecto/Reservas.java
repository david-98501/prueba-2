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
public class Reservas {
    
    
    //numero de habitaciones
    boolean habitacion1= true;boolean habitacion2= true;boolean habitacion3= true;boolean habitacion4= true;boolean habitacion5= true;
    boolean habitacion6= false;boolean habitacion7= false;
    //boolean[] habitaciones = {true, true, true, true, true, false, false};
    //admin habitaciones arreglo fijo
    // premiun precio

    public void reservarHabitacion() {
        JOptionPane.showMessageDialog(null,"Bienvenido al apartado de reservacion de habitacion"+"\n"+"tenemos a disposicion 7 habitaciones completas"+"\n"
        +"por favor ingresar el numero de habitacion deseada");
        int lectura1= Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de habitacion que desea"));

        if (lectura1==1 && habitacion1== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion1=false;
        }
        else if (lectura1==2 && habitacion2== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion2=false;
        }
        else if (lectura1==3 && habitacion3== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion3=false;
        }
        else if (lectura1==4 && habitacion4== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion4=false;
        }
        else if (lectura1==5 && habitacion5== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion5=false;
        }
        else if (lectura1==6 && habitacion6== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion7=false;
        }
        else if (lectura1==7 && habitacion7== true){
            JOptionPane.showMessageDialog(null,"se reservo correctamente");
            habitacion6=false;
        }
        else JOptionPane.showMessageDialog(null,"Lo sentimos la habitacion esta ocupada");


    }
    
}
