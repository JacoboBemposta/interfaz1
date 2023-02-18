/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz1;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public interface Avion {
    public boolean despegar(int viento,int carga);
    public boolean aterrizar(int viento,int distancia);
    public void ver_datos();
    public void alta();
}
