package listacaracteresapp;
public class ListaCaracteresApp {
    public static void main(String[] args) {
        String cadena="la lluvia en Sevilla es una maravilla";
        
        for(int i=0;i<cadena.length();i++){
            //hacemos un casting para convertir el char a int
            System.out.println((int)cadena.charAt(i)+" ");         
        }
    }  
}
