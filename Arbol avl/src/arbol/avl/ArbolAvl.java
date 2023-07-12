/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol.avl;

/**
 *
 * @author UTPL
 */
public class ArbolAvl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        Metodos arbol= new Metodos();
        do {
            op = arbol.menu();
            switch (op){
                case 1 -> { 
                System.out.println("Valor a ingresar:");
                int num = arbol.entrada.nextInt();
                arbol.raiz  = arbol.insertarAvl(op, arbol.raiz);
                }
                case 2 ->{
                    arbol.preOrden(arbol.raiz);
                    arbol.inOrden(arbol.raiz);
                    arbol.postOrden(arbol.raiz);
                }
                case 3 ->{
                    System.out.println("Valor a eliminar:");
                    int num = arbol.entrada.nextInt();
                    arbol.raiz  = arbol.eliminar(num, arbol.raiz);
                }
        
            }    
        } while (op!=0);
        
    }
    
}
