package pruebaparcial;



import java.util.Scanner;


public class Datos {
    Scanner entrada = new Scanner(System.in);

    public void MenuDatos() {
        
        ABB abbA = new ABB();
        ABB abbB = new ABB();
        ABB abbC = new ABB();

        System.out.println("Ingrese cuantos clientes desea agregar:");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {
            //REESTABLECER DATOS
            double descuento = 0;
            int histo_crediticio = 0;
            double monto_compra = 0;
            double op3 = 0;
            int antiguedad = 0;
            double montocompra = 0;
            //PEDIR DATOS
            entrada.nextLine();
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la ID");
            String id = entrada.nextLine();
            System.out.println("Ingrese la antiguedad");
            int op2 = entrada.nextInt();
            System.out.println("Ingrese el tipo de Historial crediticio (A(1), B(2), C(3))");
            int op = entrada.nextInt();
            System.out.println("Ingrese el monto de compra");
            op3 = entrada.nextDouble();

            //CALCULO HISTORIAL CREDITICIO
            if (op == 1) {
                histo_crediticio = 3;
            }
            if (op == 2) {
                histo_crediticio = 2;
            }
            if (op == 3) {
                histo_crediticio = 1;
            }
            //CALCULO ANTIGUEDAD
            if (op2 > 5) {
                 antiguedad = 3;
            }
            if (op2 >= 2 && op2 <= 5) {
                antiguedad = 2;
            }
            if (op2 < 2) {
                antiguedad=1;
            }
            //CALCULO MONTO COMPRA
            if (op3 > 1000) {
                montocompra = 3;
            }
            if (op3 > 500 && op3 < 1000) {
                montocompra = 2;
            }
            if (op3 < 500) {
                montocompra = 0;
            }

            // Calcular el descuento final y la categoría
            double aux_categoria = montocompra + antiguedad + histo_crediticio;
            if (aux_categoria >= 7) {
                descuento = 0.10;
            } else if (aux_categoria >= 3 && aux_categoria < 7) {
                descuento = 0.06;
            } else {
                descuento = 0.02;
            }
            montocompra = op3 - descuento;

            // Determinar la categoría A, B o C
            String categoria;
            if (aux_categoria >= 7) {
                categoria = "A";
            } else if (aux_categoria >= 3 && aux_categoria < 7) {
                categoria = "B";
            } else {
                categoria = "C";
            }

            // Crear el objeto Cliente con los datos ingresados
            Cliente cliente = new Cliente(nombre, id, op3, categoria, descuento);

            // Insertar el cliente en el ABB correspondiente según su categoría
            if (categoria.equals("A")) {
                abbA.insertar(cliente);
            } else if (categoria.equals("B")) {
                abbB.insertar(cliente);
            } else if (categoria.equals("C")) {
                abbC.insertar(cliente);
            }
        }

        // Presentar los datos de cada categoría ordenados por ID
        System.out.println("Clientes en la categoría A (ordenados por ID):");
        abbA.imprimirEnOrden();

        System.out.println("\nClientes en la categoría B (ordenados por ID):");
        abbB.imprimirEnOrden();

        System.out.println("\nClientes en la categoría C (ordenados por ID):");
        abbC.imprimirEnOrden();
    }
}
