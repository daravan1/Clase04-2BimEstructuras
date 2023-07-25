
package pruebaparcial;

public class Cliente {

    private String nombre;
    private String id;
    private double montoCompra;
    private String categoria;
    private double descuento;

    public Cliente(String nombre, String id, double montoCompra, String categoria, double descuento) {
        this.nombre = nombre;
        this.id = id;
        this.montoCompra = montoCompra;
        this.categoria = categoria;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
