
package model;

public class ProductoFerreteria extends Producto {
    private String tipoHerramienta;

   
    public ProductoFerreteria(String nombre, double precio, String descripcion, String tipoHerramienta) {
        super(nombre, precio, descripcion); 
        this.tipoHerramienta = tipoHerramienta;
    }

  
    public String getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(String tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }


    @Override
    public String toString() {
        return super.toString() + ", Tipo de Herramienta: " + tipoHerramienta;
    }
}
