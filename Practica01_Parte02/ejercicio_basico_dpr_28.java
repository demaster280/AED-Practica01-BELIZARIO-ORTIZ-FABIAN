
package ejercicio_basico_dpr_28;
import javax.swing.JOptionPane;
public class Ejercicio_basico_DPR_28 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Inserte una frase",
                "insercion",
                JOptionPane.INFORMATION_MESSAGE);
        //usado para almacenar el texto final
        String texto_sin_espacios="";       
        char caracterActual;
        //recorro el array
        for(int i=0; i<texto.length();i++){
            caracterActual=texto.charAt(i);
            //cuando es un espacio no lo copia a la cadena
            if(caracterActual!=' '){
                texto_sin_espacios+=String.valueOf(caracterActual); 
            }
        }
        JOptionPane.showMessageDialog(null,"La frase sin espacios es "+texto_sin_espacios,
                "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }    
}

