/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b11ej1;

/**
 *
 * @author quique
 */
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public void concentrarse() {
        System.out.println("Concentrarse a la seleccion");
    }

    public void viajar() {
        System.out.println("Viaja la selección");
    }

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public int getEdad() {

        return edad;
    }

    @Override
    public String toString() {
        return ", Nombre= " + nombre + ", Apellido= " + apellido + ", Edad= " + edad;
    }

}
