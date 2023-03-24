package ejercicio_basicos_dpr_18;
import java.util.Scanner;
public class Ejercicio_basicos_DPR_18 {
    public static void main(String[] args) {       
        Scanner sn = new Scanner(System.in);
        //hace que podamos escribir espacio en la frase y coja todo el string
        sn.useDelimiter("\n");
        System.out.println("Escribe una frase");
        String frase = sn.next();       
        //Divido la frase en palabras
        String palabras[] = frase.split(" ");
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }        
    }
}