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
public class Masajista extends Persona {

    String titulacion;
    int anosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasajes() {
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }



    @Override
    public String toString() {
        return "Titulacion= " + titulacion + ", Años Experiencia= " + anosExperiencia + super.toString();
    }

    @Override
    public void viajar() {
        System.out.println("Viajan los Masajistas");

    }
}
