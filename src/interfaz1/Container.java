/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz1;


import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Container implements Barco{
    String nombre;
    boolean hundido;
    int max_containers;
    int contenedores;
    String puerto;
    String hora;
    
    public void alta (){
        Scanner teclado=new Scanner(System.in);
        this.hundido=false;
        System.out.println("Nombre del container");
        this.nombre=teclado.next();
        System.out.println("Indica el numero de contenedores maximo");
        this.max_containers=teclado.nextInt();
        System.out.println("Indica el numero de contenedores en carga");
        this.contenedores=teclado.nextInt();
        this.hora="00:00";
        this.puerto="Astilleros Cadiz";
    }

    @Override
    public boolean hundirse() {
        Scanner teclado=new Scanner(System.in);
        boolean hundir;
        System.out.println("El container se ha hundido?(s/n)");
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
            System.out.println("El barco esta hundido y no esta vinculado a ningun puerto");
        }
        else{
            System.out.println("Container de nombre "+nombre);
            System.out.println("El ultimo puerto en el que ha atracado es  "+puerto);
            System.out.println("La hora a la que ha atracado fue a las "+hora);
            System.out.println("tiene una capacidad maxima de "+max_containers+" contenedores.");
            System.out.println("Actualmente lleva una carga de "+contenedores+" contenedores.");
        } 
        System.out.println("=============================================");
        System.out.println("=============================================");        
    }
    public void cambia_max(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica la capacidad maxima");
        int capacidad=teclado.nextInt();
        this.max_containers=capacidad;
    }
    public void cambia_real(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica el numero de contenedores actuales");
        int real=teclado.nextInt();
        this.contenedores=real;        
    }
    
    
}
