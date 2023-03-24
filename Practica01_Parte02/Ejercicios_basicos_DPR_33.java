package ejercicios_basicos_dpr_33;
public class Ejercicios_basicos_DPR_33 {
    public static void main(String[] args) {
        String cadena = "Hola mundo";        
        //Cuidado: Es 3 porque empiesa en 0 las cadenas(cuartra letra)
        // el 5 es porque siempre hay que sumarle uno  ya que sino no mostraria lo que deseamos (quinta letra)
        String subcadena = cadena.substring(3, 5);
        System.out.println(subcadena);       
    }
}

