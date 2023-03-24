
package cambioletrasapp;
public class CambioLetrasApp {
     public static void main(String[] args) {
        String cadena="la lluvia en Sevilla es una maravilla";
        //Aviso: De esta forma no modifica el string original
        System.out.println(cadena.replace('a', 'e')); 
    }
}
