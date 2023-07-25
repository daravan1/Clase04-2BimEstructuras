
package pruebaparcial;


public class ABB {
    private NodoABB raiz;

    public ABB() {
        this.raiz = null;
    }

    public void insertar(Cliente cliente) {
        raiz = insertarRecursivo(raiz, cliente);
    }

    private NodoABB insertarRecursivo(NodoABB nodo, Cliente cliente) {
        if (nodo == null) {
            return new NodoABB(cliente);
        }

        if (cliente.getId().compareTo(nodo.getCliente().getId()) < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), cliente));
        } else if (cliente.getId().compareTo(nodo.getCliente().getId()) > 0) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), cliente));
        }

        return nodo;
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRecursivo(raiz);
    }

    private void imprimirEnOrdenRecursivo(NodoABB nodo) {
        if (nodo != null) {
            imprimirEnOrdenRecursivo(nodo.getIzquierdo());
            System.out.println(nodo.getCliente().getId() + ", " + 
                    nodo.getCliente().getNombre() + ", " + " Un descuento de: "+ 
                    nodo.getCliente().getDescuento());
            imprimirEnOrdenRecursivo(nodo.getDerecho());
        }
    }

    private static class NodoABB {
        private Cliente cliente;
        private NodoABB izquierdo;
        private NodoABB derecho;

        public NodoABB(Cliente cliente) {
            this.cliente = cliente;
            this.izquierdo = null;
            this.derecho = null;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public NodoABB getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(NodoABB izquierdo) {
            this.izquierdo = izquierdo;
        }

        public NodoABB getDerecho() {
            return derecho;
        }

        public void setDerecho(NodoABB derecho) {
            this.derecho = derecho;
        }
    }
}
