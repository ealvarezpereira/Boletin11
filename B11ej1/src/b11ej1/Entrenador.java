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
public class Entrenador extends Persona {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }


    @Override
    public String toString() {
        return "ID Federación= " + idFederacion + super.toString();
    }

    @Override
    public void viajar() {
        System.out.println("Viajan los entrenadores");

    }
}
