/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Interfaz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opcion=0;
        ArrayList<Barco> listabarcos=new ArrayList<Barco>();
        do{
          opcion=Menu();
          switch(opcion){
              case 1:
                  int seleccion=0;
                  do{
                      System.out.println("Menu transatlantico");
                      System.out.println("1 - alta ");
                      System.out.println("2- estado de flotacion  ");
                      System.out.println("3- atracar");
                      System.out.println("4- ver datos");
                      System.out.println("5- Camhiar pasaje");
                      System.out.println("6- Cambiar camas");
                      System.out.println("0- salir");
                      seleccion=teclado.nextInt();
                      switch(seleccion){
                          case 1:
                              Transatlantico transatlantico=new Transatlantico();
                              transatlantico.alta();
                              listabarcos.add(transatlantico);
                              break;
                          case 2:
                              System.out.println("Indica el nombre del transatlantico");
                              String nombre=teclado.next();
                              int posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Transatlantico trans=(Transatlantico)listabarcos.get(posicion);
                                  if(trans.hundirse())System.out.println("El Transatlantico se ha hundido");
                                  else System.out.println("El Transatlantico esta navegando");                                
                              }
                              break;

                          case 3:
                              System.out.println("Indica el nombre del transatlantico");
                              nombre=teclado.next();
                              posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Transatlantico trans=(Transatlantico)listabarcos.get(posicion);
                                  System.out.println("Indica el puerto");
                                  String puerto=teclado.next();
                                  System.out.println("Indica la hora");
                                  String hora=teclado.next();
                                  trans.atracar(puerto, hora);
                              }                           
                              break;
                          case 4:
                              System.out.println("Indica el nombre del transatlantico");
                              nombre=teclado.next();
                              posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Transatlantico trans=(Transatlantico)listabarcos.get(posicion);
                                  trans.ver_datos();
                              }
                              break;
                          case 5:
                              System.out.println("Indica nombre del Transatlantico");
                              nombre=teclado.next();
                              posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Transatlantico trans=(Transatlantico)listabarcos.get(posicion);
                                  trans.cambia_pasaje();
                              }
                              break;
                          case 6:
                              System.out.println("Indica nombre del Transatlantico");
                              nombre=teclado.next();
                              posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Transatlantico trans=(Transatlantico)listabarcos.get(posicion);
                                  trans.cambia_camas();
                              }                                 
                              break;   
                            }
                  }while(seleccion!=0);
                  break;
              case 2:
                  seleccion=0;
                  do{
                      System.out.println("Menu container");
                      System.out.println("1 - alta ");
                      System.out.println("2- estado de flotacion  ");
                      System.out.println("3- atracar");
                      System.out.println("4- ver datos");
                      System.out.println("5- Camhiar capacidad");
                      System.out.println("6- Cambiar numero contenedores");
                      System.out.println("0- salir");
                      seleccion=teclado.nextInt();
                      switch(seleccion){
                          case 1:
                              Container container=new Container();
                              container.alta();
                              listabarcos.add(container);
                              break;
                          case 2:
                              System.out.println("Indica el nombre del container");
                              String nombre=teclado.next();
                              int posicion=buscar_container(listabarcos, nombre);
                              if(posicion!=-1){
                                  Container cont=(Container) listabarcos.get(posicion);
                                  if(cont.hundirse())System.out.println("El container se ha hundido");
                                  else  System.out.println("El container esta navegando");    
                              }
                              break;
                          case 3:
                              System.out.println("Indica el nombre del container");
                              nombre=teclado.next();
                              posicion=buscar_container(listabarcos, nombre);
                              if(posicion!=-1){
                                  Container cont=(Container) listabarcos.get(posicion);
                                  System.out.println("Indica el puerto");
                                  String puerto=teclado.next();
                                  System.out.println("Indica la hora");
                                  String hora=teclado.next();
                                  cont.atracar(puerto, hora);
                              }                            
                              break;
                          case 4:
                              System.out.println("Indica el nombre del container");
                              nombre=teclado.next();
                              posicion=buscar_container(listabarcos, nombre);
                              if(posicion!=-1){
                                  Container cont=(Container) listabarcos.get(posicion);
                                  cont.ver_datos();
                              }
                              break;                              
                          case 5:
                              System.out.println("Indica nombre del container");
                              nombre=teclado.next();
                              posicion=buscar_container(listabarcos, nombre);
                              if(posicion!=-1){
                                  Container cont=(Container) listabarcos.get(posicion);
                                  cont.cambia_max();         
                              }
                              break;
                          case 6:
                              System.out.println("Indica nombre del container");
                              nombre=teclado.next();
                              posicion=buscar_container(listabarcos, nombre);
                              if(posicion!=-1){
                                  Container cont=(Container)listabarcos.get(posicion);
                                  cont.cambia_real();
                              }
                              break;  
                            }
                  }while(seleccion!=0);                  
                  break;
              case 3:
                  seleccion=0;
                  do{
                      System.out.println("Menu Hidroavion");
                      System.out.println("1 - alta ");
                      System.out.println("2- estado de flotacion ");
                      System.out.println("3- atracar");
                      System.out.println("4- ver datos");
                      System.out.println("5- Camhiar capacidad");
                      System.out.println("6- Cambiar potencia");
                      System.out.println("7- Ver peso");
                      System.out.println("8- Amerizar");
                      System.out.println("0- salir");
                      seleccion=teclado.nextInt();
                      switch(seleccion){
                          case 1:
                              Hidroavion hidroavion=new Hidroavion();
                              hidroavion.alta();
                              listabarcos.add(hidroavion);
                              break;
                          case 2:
                              System.out.println("Indica el nombre del hidroavion");
                              String nombre=teclado.next();
                              int posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  boolean hundido=hidro.hundirse();
                                  if(hundido)System.out.println("El hidroavion se ha hundido");
                                  else System.out.println("El hidroavion esta navegando");   
                              }     
                              break;
                          case 3:
                              System.out.println("Indica el nombre del hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  System.out.println("Indica el puerto");
                                  String puerto=teclado.next();
                                  System.out.println("Indica la hora");
                                  String hora=teclado.next();
                                  hidro.atracar(puerto, hora);
                              }                            
                              break;
                          case 4:
                              System.out.println("Indica el nombre del hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  hidro.ver_datos();
                              }     
                              break;                                   
                          case 5:
                              System.out.println("Indica nombre del hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  hidro.cambia_distancia();
                              }
                              break;
                          case 6:
                              System.out.println("Indica nombre del Hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  hidro.cambia_potencia();
                              }
                              break;  
                          case 7:
                              System.out.println("Indica nombre del Hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion) listabarcos.get(posicion);
                                  System.out.println("El peso maximo es de "+hidro.ver_peso()+" Kg.");
                              }
                              break; 
                           case 8:
                              System.out.println("Indica nombre del Hidroavion");
                              nombre=teclado.next();
                              posicion=buscar_hidroavion(listabarcos, nombre);
                              if(posicion!=-1){
                                  Hidroavion hidro=(Hidroavion)listabarcos.get(posicion);
                                      System.out.println("Indica velocidad de viento");
                                      int viento=teclado.nextInt();
                                      System.out.println("Indica distancia de la pista");
                                      int distancia=teclado.nextInt();
                                  if(hidro.aterrizar(viento, distancia)){
                                      System.out.println("El hidroavion ha amerizado con exito");
                                  }else System.out.println("No es posible amerizar");
                              } 
                            }
                  }while(seleccion!=0);                  
                  break;
              case 4:
                  seleccion=0;
                  do{
                      System.out.println("Menu Asimetrico");
                      System.out.println("1 - alta ");
                      System.out.println("2- estado de flotacion  ");
                      System.out.println("3- atracar");
                      System.out.println("4- ver datos");
                      System.out.println("5- Camhiar capacidad");
                      System.out.println("0- salir");
                      seleccion=teclado.nextInt();
                      switch(seleccion){
                          case 1:
                              Asimetrico asimetrico=new Asimetrico();
                              asimetrico.alta();
                              System.out.println("Alta ok");
                              listabarcos.add(asimetrico);
                              break;
                          case 2:
                              System.out.println("Indica el nombre del asimetrico");
                              String nombre=teclado.next();
                              int posicion=buscar_asimetrico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Asimetrico asim=(Asimetrico)listabarcos.get(posicion);
                                  if(asim.hundirse())System.out.println("El asimetrico se ha hundido");
                                  else System.out.println("El asimetrico esta navegando");                                
                              }
                              break;

                          case 3:
                              System.out.println("Indica el nombre del asimetrico");
                              nombre=teclado.next();
                              posicion=buscar_asimetrico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Asimetrico asim=(Asimetrico)listabarcos.get(posicion);
                                  System.out.println("Indica el puerto");
                                  String puerto=teclado.next();
                                  System.out.println("Indica la hora");
                                  String hora=teclado.next();
                                  asim.atracar(puerto, hora);
                              }                           
                              break;
                          case 4:
                              System.out.println("Indica el nombre del asimetrico");
                              nombre=teclado.next();
                              posicion=buscar_asimetrico(listabarcos, nombre);
                              if(posicion!=-1){
                                  Asimetrico asim=(Asimetrico)listabarcos.get(posicion);
                                  asim.ver_datos();
                              }
                              break;
                          case 5:
                              System.out.println("Indica nombre del asimetrico");
                              nombre=teclado.next();
                              posicion=buscar_transatlantico(listabarcos, nombre);
                              if(posicion!=-1){
                                  System.out.println("Indica la nueva capacidad");
                                  float capacidad=teclado.nextFloat();
                                  Asimetrico asim=(Asimetrico)listabarcos.get(posicion);
                                  asim.setCapacidad(capacidad);
                              }
                              break;  
                            }
                  }while(seleccion!=0);                  
                  break;
              case 5:
                      ver_todos(listabarcos);              
                  break;
                                    
          }
        }while(opcion!=0);
        System.out.println("Has salido del programa");
          
    }
        
        
    
    
    public static int Menu(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Transportes Chan do Monte");
        System.out.println("1- Transatlanticos");
        System.out.println("2- Containers");
        System.out.println("3- Hidroaviones");
        System.out.println("4- Asimetricos");
        System.out.println("5- Ver transportes");
        System.out.println("0- Salir");
        System.out.println("Elige una opcion");
        int opcion=teclado.nextInt();
        return opcion;
    }
        public static int buscar_transatlantico(ArrayList<Barco>listabarcos,String nombre){
            int posicion=-1;
            for (int i = 0; i < listabarcos.size(); i++) {
                    if(listabarcos.get(i) instanceof Transatlantico trans) {
                        if(trans.nombre.equals(nombre))posicion=i;
                    }
            } 
            if(posicion==-1) System.out.println("Transatlantico no encontrado.");
            return posicion;
        }
        
        public static int buscar_container(ArrayList<Barco>listabarcos,String nombre){
            int posicion=-1;
            for (int i = 0; i < listabarcos.size(); i++) {
                    if(listabarcos.get(i) instanceof Container cont) {
                        if(cont.nombre.equals(nombre))posicion=i;
                    }
            } if(posicion==-1) System.out.println("Container no encontrado.");
            return posicion;
        }       
        public static int buscar_hidroavion(ArrayList<Barco>listabarcos,String nombre){
            int posicion=-1;
            for (int i = 0; i < listabarcos.size(); i++) {
                    if(listabarcos.get(i) instanceof Hidroavion hidro) {
                        if(hidro.nombre.equals(nombre))posicion=i;
                    }
            }if(posicion==-1) System.out.println("Hidroavion no encontrado."); 
            return posicion;
        }  
        public static int buscar_asimetrico(ArrayList<Barco>listabarcos,String nombre){
            int posicion=-1;
            for (int i = 0; i < listabarcos.size(); i++) {
                    if(listabarcos.get(i) instanceof Asimetrico asim) {
                        if(asim.nombre.equals(nombre))posicion=i;
                    }
            }if(posicion==-1) System.out.println("asimetrico no encontrado."); 
            return posicion;
        }               
        public static void ver_todos(ArrayList<Barco>listabarcos){
            for (int i = 0; i < listabarcos.size(); i++) {
                if(listabarcos.get(i)instanceof Transatlantico){
                    Transatlantico trans=(Transatlantico) listabarcos.get(i);
                    if(trans.hundido==false){
                        trans.ver_datos();
                        }else System.out.println("El transatlantico "+trans.nombre+" esta hundido");
               }if(listabarcos.get(i)instanceof Container){
                      Container cont=(Container) listabarcos.get(i);
                      if(cont.hundido==false){
                            cont.ver_datos();
                       }else System.out.println("El containero "+cont.nombre+"  esta hundido");
                }if(listabarcos.get(i)instanceof Hidroavion){
                     Hidroavion hidro=(Hidroavion) listabarcos.get(i);
                     if(hidro.hundido==false){
                         hidro.ver_datos();
                         }else System.out.println("El hidroaviono "+hidro.nombre+"  esta hundido");
                 }
            }
      }
}        

