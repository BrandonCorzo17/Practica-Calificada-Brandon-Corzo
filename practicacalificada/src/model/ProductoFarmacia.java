/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ProductoFarmacia extends Producto {
    private String laboratorio;
    private String fechaCaducidad;


    public ProductoFarmacia(String nombre, double precio, String descripcion, String laboratorio, String fechaCaducidad) {
        super(nombre, precio, descripcion);
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
    }

   
    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    @Override
    public String toString() {
        return super.toString() + ", Laboratorio: " + laboratorio + ", Fecha de Caducidad: " + fechaCaducidad;
    }
}
