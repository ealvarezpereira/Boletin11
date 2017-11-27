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
public class Jugador extends Persona {

    private int dorsal;
    private String demarcacion;

    public Jugador(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
    }

    public void entrenar() {
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }


    @Override
    public String toString() {
        return "Dorsal= " + dorsal + ", Demarcación= " + demarcacion + super.toString();
    }

    @Override
    public void viajar() {
        System.out.println("Viajan los jugadores");

    }
}
