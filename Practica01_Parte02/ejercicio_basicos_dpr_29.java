package ejercicio_basicos_dpr_29;
import javax.swing.JOptionPane;
public class Ejercicio_basicos_DPR_29 {  
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = JOptionPane.showInputDialog(null,"Introduce un texto, cadena vacia para terminar",
                "introducir texto",
                JOptionPane.INFORMATION_MESSAGE);
        String cadenaResultante="";
        //Mientras no este vacio la cadena escrita continuo
        while(!texto.isEmpty()){
            //concatenamos el texto
            cadenaResultante+=texto;   
            //Reintroducimotexto de nuevo una cadena            
            texto=JOptionPane.showInputDialog(null,
                    "Introdece un texto , caddena vacia para terminar",
                    "Introducir texto ",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }    
}