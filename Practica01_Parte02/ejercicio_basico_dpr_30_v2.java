package ejercicio_basico_dpr_30_v2;
import javax.swing.JOptionPane;
public class Ejercicio_basico_DPR_30_v2 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introduccion",
                JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante;
        //true: lo pasamos a mayusculas
        //false: lo pasamos todo a minusculas
        boolean IsMayus;
        int eleccion=JOptionPane.showConfirmDialog(null,
                "Quieres que se pase a mayusculas",
                "Eleccion",
                JOptionPane.YES_NO_OPTION);
        IsMayus= (eleccion==JOptionPane.YES_OPTION);
        //segun lo elegido, lo transformaremos a mayuscula o miniscula
        if(IsMayus){
            cadenaResultante=texto.toUpperCase();
        }
        else{
            cadenaResultante=texto.toLowerCase();
        }
        //Mosramos el menaje resultante
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        }
}