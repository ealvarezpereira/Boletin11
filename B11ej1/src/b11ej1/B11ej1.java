package b11ej1;

/**
 *
 * @author quique
 */
public class B11ej1 {

    /* 1-instancia un obxecto de cada clase 
     * 2-instancia un xogador de tipo Seleccion
     * 3-chama ao método concentrarse a través de cada obxecto. ¿Que observas?.
     * 4-Invoca ao método viaxar a través de cada obxecto. ¿Cal é a saida?
     * 5-¿Podes invocar a un método da superclase con un obxecto dunha subclase?.Comprobao
     * 6-¿Podes invocar a un método da subclase con un obxecto do tipo da superclase?.Comprobao
     */

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador(1, "Quique", "Alvarez", 18, 7, "Delantero"); //1-Creas el objeto de la clase Jugador
        System.out.println(jugador1.toString()); //Muestras toString para que devuelva los valores
        jugador1.viajar(); //4-Llamas al Override de Jugador que sustituye al metodo viajar de Persona
        jugador1.concentrarse(); //5-Sí, puedes llamar a un metodo de la superclase con un objeto de la subclase.

        Entrenador entrenador1 = new Entrenador(1, "Pepe", "Franco", 56, "AE86"); //1-Creas el objeto de la clase Entrenador
        System.out.println(entrenador1.toString()); //Muestras toString para que devuelva los valores
        entrenador1.viajar(); //4-Llamas al Override de Entrenador que sustituye al metodo viajar de Persona
        entrenador1.concentrarse(); //3- Visualizas el contenido del metodo de la superclase

        Masajista masajista1 = new Masajista(1, "Ana", "Lopez", 35, "Traumatóloga", 15); //1-Creas el objeto de la clase Masajista
        System.out.println(masajista1.toString()); //Muestras toString para que devuelva los valores
        masajista1.viajar(); //4-Llamas al Override de Masajista que sustituye al metodo viajar de Persona
        masajista1.concentrarse();

        Persona jugador2 = new Jugador(1, "Juan","Perez",19,11,"Defensa"); //2-Jugador de tipo seleccion
        
        //persona1.jugarPartido();
        //6-No puedes llamar a un metodo de una subclase con un objeto de la superclase
        
    }

}
