/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.avl;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Nodo raiz;
    Scanner entrada;
    boolean altura;

    public Metodos() {
        this.raiz = null;
        this.entrada = new Scanner(System.in);
        this.altura = false;
    }

    public int menu() {
        System.out.println("Insertar     [1]");
        System.out.println("Recorrer     [2]");
        System.out.println("Eliminar     [3]");
        System.out.println("Salir        [0]");
        return entrada.nextInt();
    }

    public Nodo rotarIzqIzq(Nodo actual, Nodo nodox) {
        actual.izq = nodox.der;
        nodox.der = actual;

        actual.fe = 0;
        nodox.fe = 0;
        return nodox;
    }

    public Nodo rotarDerDer(Nodo actual, Nodo nodox) {
        actual.der = nodox.izq;
        nodox.izq = actual;

        actual.fe = 0;
        nodox.fe = 0;
        return nodox;
    }
    
    public Nodo insertarAvl(int num, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(num);
            altura = true;
            return nuevo;
        } else if (num < actual.dato) {
            actual.izq = insertarAvl(num, actual.izq);
            if (altura) {
                switch (actual.fe) {
                    case -1 -> {
                        Nodo nodoX = actual.izq;
                        if (nodoX.fe == -1) {
                            actual = rotarIzqIzq(actual, nodoX);
                        } else {
                            actual = rotarIzqDer(actual, nodoX);
                        }
                    }
                    case 0 -> {
                        actual.fe = -1;
                    }
                    case 1 -> {
                        actual.fe = 0;
                        Nodo nodoX = actual.der;
                        if (nodoX.fe == 1) {
                            actual = rodarDerDer(actual, nodoX);
                        } else {
                            (actual = rotarDerIzq(actual, nodoX);
                        }             
                    }    
                }
            } else if (num > actual.dato) {
                actual.der = insertarAvl(num, actual.der);
            }
        } else {
            System.out.println("No se aceptan numeros repetidos");
        }
        return 
    }
}
