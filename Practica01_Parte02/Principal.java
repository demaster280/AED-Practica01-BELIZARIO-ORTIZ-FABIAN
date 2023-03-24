package principal;
public class Principal {
    public static void main(String[] args) {      
        String cadena="la lluvia en Sevilla es una maravilla";
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            //comprobamos si el caracter es una vocal 
            if(cadena.charAt(i)=='e' ||
                    cadena.charAt(i)=='e'||
                    cadena.charAt(i)=='i'||
                    cadena.charAt(i)=='o'||
                    cadena.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("hay "+contador+" vocales"); 
    }
}
 