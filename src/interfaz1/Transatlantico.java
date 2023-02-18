/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz1;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Transatlantico implements Barco{
    String nombre;
    int pasaje;
    boolean hundido;
    String puerto;
    String hora;
    int camas;
    
    @Override
    public void alta(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce nombre del transatlantico");
        this.nombre=teclado.next();
        System.out.println("Introduce el pasaje permitido");
        this.pasaje=teclado.nextInt();
        System.out.println("Introduce el numero de camas");
        this.camas=teclado.nextInt();
        this.hundido=false;
        this.puerto="Astilleros Ferrol";
        this.hora="00:00";
    }

    @Override
    public boolean hundirse() {
        Scanner teclado=new Scanner(System.in);
        boolean hundir;
        System.out.println("El transatlantico se ha hundido?(s/n)");
        String respuesta=teclado.next();
        if(respuesta.charAt(0)=='s') hundir=true;
        else hundir=false;
        this.hundido=hundir;
        return hundir;
    }

    @Override
    public void atracar(String puerto,String hora) {
        this.puerto=puerto;
        this.hora=hora;
    }

    @Override
    public void ver_datos() {
        if(hundido){
            System.out.println("El transatlantico esta hundido y no esta vinculado a ningun puerto");
        }
        else{
            System.out.println("Nombre del transatlantico "+nombre);
            System.out.println("El ultimo puerto en el que ha atracado es  "+puerto);
            System.out.println("La hora a la que ha atracado fue a las "+hora);
            System.out.println("El pasaje se compone de "+pasaje+" personas.");
            System.out.println("Dispone de "+camas+" camas.");
        }        
        System.out.println("=============================================");
        System.out.println("=============================================");
    }
        public void cambia_pasaje(){
            Scanner teclado=new Scanner(System.in);            
            System.out.println("Indica el numero de pasajeros actualizado");
            int cantidad=teclado.nextInt();
            this.pasaje=cantidad;
        }
        public void cambia_camas(){
            Scanner teclado=new Scanner(System.in);            
            System.out.println("Indica el numero de camas actualizado");
            int cantidad=teclado.nextInt();
            this.camas=cantidad;
        }

    
    
}
