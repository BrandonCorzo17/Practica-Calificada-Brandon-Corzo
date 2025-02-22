
package model;

public class PlatoRestaurant extends Producto {
    private String categoria;
    private String tipoComida;


    public PlatoRestaurant(String nombre, double precio, String descripcion, String categoria, String tipoComida) {
        super(nombre, precio, descripcion); 
        this.categoria = categoria;
        this.tipoComida = tipoComida;
    }

 
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return super.toString() + ", Categoría: " + categoria + ", Tipo de Comida: " + tipoComida;
    }
}
