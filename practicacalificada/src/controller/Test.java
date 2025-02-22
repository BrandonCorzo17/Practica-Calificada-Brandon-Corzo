
package controller;
import model.*;

public class Test {
    public static void main(String[] args) {
        
        ProductoFarmacia medicamento = new ProductoFarmacia("Paracetamol", 5, 
                                     "Analgésico", "SuizaLab", "11022025");
        
        ProductoFerreteria herramienta = new ProductoFerreteria("Martillo", 10, 
                                       "Martillo de acero", "Herramienta manual");
        
        PlatoRestaurant plato = new PlatoRestaurant("Pizza Americana", 20, 
                                "Pizza con tomate, queso y chorizo", 
                                "Plato Principal", "Comida Italiana");

   
        System.out.println("Información del Producto de Farmacia:  ");
        System.out.println(medicamento.toString());
        
        System.out.println("Información del Producto de Ferretería:  ");
        System.out.println(herramienta.toString());
        
        System.out.println("Información del Plato de Restaurante:  ");
        System.out.println(plato.toString());
    }
}
