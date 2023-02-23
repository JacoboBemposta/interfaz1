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
public class Asimetrico extends Container {
    float largo;
    float alto;
    float ancho;
    float capacidad;
    public Asimetrico (){
        Scanner teclado=new Scanner(System.in);
        super.alta();
        System.out.println("Introduce el largo");
        this.largo=teclado.nextFloat();
        System.out.println("Introduce el alto");
        this.alto=teclado.nextFloat();
        System.out.println("Introduce el ancho");
        this.ancho=teclado.nextFloat();
        System.out.println("Introduce capacidad");
        this.capacidad=teclado.nextFloat();
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public boolean hundirse() {
        boolean hundir;
        hundir=super.hundirse();
        return hundir;
    }    
    @Override
    public void atracar(String puerto,String hora) {
        super.atracar(puerto, hora);
    }

    @Override
    public void ver_datos() {
        if(hundido){
            System.out.println("El Asimetrico esta hundido y no esta vinculado a ningun puerto");
        }
        else{
            System.out.println("Asimetrico de nombre "+nombre);
            System.out.println("El ultimo puerto en el que ha atracado es  "+puerto);
            System.out.println("La hora a la que ha atracado fue a las "+hora);
            System.out.println("tiene una capacidad maxima de "+max_containers+" contenedores.");
            System.out.println("Actualmente lleva una carga de "+contenedores+" contenedores.");
            System.out.println("Tiene una capacidad de "+capacidad+" metros cubicos");
            System.out.println("Mide "+largo+" m de largo, "+alto+" de alto y "+ancho+" de ancho.");
        } 
        System.out.println("=============================================");
        System.out.println("=============================================");        
    }    
}
