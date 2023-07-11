/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.avl;

/**
 *
 * @author UTPL
 */
public class Nodo {
    int dato;
    int fe;
    Nodo izq;
    Nodo der;
    
    public Nodo(int dato){
    this.dato = dato;
    this.fe = 0;
    this.izq = null;
    this.der = null;
    }
}
