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
public class Hidroavion implements Barco,Avion{
    String nombre;
    boolean hundido;
    String lugar_atraca;
    String hora_atraca;
    int potencia;
    int distancia_minima;
    int peso_maximo;
    
    public void alta(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica nombre del hidroavion");
        this.nombre=teclado.next();
        this.hundido=false;
        this.lugar_atraca="Aeropuerto";
        this.hora_atraca="00:00";
        System.out.println("Indica la potencia");
        this.potencia=teclado.nextInt();
        System.out.println("Indica distancia maxima para despegar");
        this.distancia_minima=teclado.nextInt();
        System.out.println("Indica carga maxima");
        this.peso_maximo=teclado.nextInt();
    }


    @Override
    public void atracar(String lugar_atraca,String hora_atraca) {
        this.lugar_atraca=lugar_atraca;
        this.hora_atraca=hora_atraca;
    }
    @Override
    public boolean hundirse() {
        Scanner teclado=new Scanner(System.in);
        boolean hundir;
        System.out.println("El hidroavion se ha hundido?(s/n)");
        String respuesta=teclado.next();
        if(respuesta.charAt(0)=='s') hundir=true;
        else hundir=false;
        this.hundido=hundir;
        return hundir;     
    }
    @Override
    public boolean despegar(int viento,int carga){
        boolean despega;
        if(viento<70&&carga<(peso_maximo)*0.9) despega=true;
        else despega=false;
        return despega;
    }
    @Override
    public boolean aterrizar(int viento,int distancia) {
        boolean aterriza;
        if(distancia<distancia_minima&&viento<70) aterriza=true;
        else aterriza=false;
        return aterriza;
    }
    @Override
    public void ver_datos() {
        if(hundido){
            System.out.println("El hidroavion "+nombre+" esta hundido y no esta vinculado a ningun puerto");
        }
        else{
            System.out.println("Nombre del hidroavion "+nombre);          
            System.out.println("El ultimo puerto en el que ha atracado es  "+lugar_atraca);
            System.out.println("La hora a la que ha atracado fue a las "+hora_atraca);
            System.out.println("Tiene una potencia de "+potencia);
            System.out.println("Necesita como minimo "+distancia_minima+" metros para aterrizar");
            System.out.println("su carga maxima es de "+peso_maximo+" Kg.");
        }        
        System.out.println("=============================================");
        System.out.println("=============================================");

    }
    public void cambia_potencia(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica nueva potencia");
        this.potencia=teclado.nextInt();
    }
    public void cambia_distancia(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Indica nueva distancia minima");
        this.distancia_minima=teclado.nextInt();
    }
    public int ver_peso(){
        return peso_maximo;
    }

}
