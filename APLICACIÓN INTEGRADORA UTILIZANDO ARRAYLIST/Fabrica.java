package fabricandoinstrumentos;
import java.util.ArrayList;
public class Fabrica {
    //Una fabrica tiene su lista de sucursales
    private ArrayList<Sucursal> sucursales;
    //constructor
    public Fabrica() {
        //crear una lista de sucursales vacia
        this.sucursales = new ArrayList<>();
    }
    public double[] porcInstrumentosPorTipo(String nombreSuc){
        double[] porcentajes = null;
        //devuelve la sucursal encontrada 
        Sucursal sucEncontrada = buscarSucursal(nombreSuc);
        // condicion verificar sucursal encontarada
        if (sucEncontrada != null){
            // si se encuentra la sucursal llamamos al metodo porcInstrumentosPorTipo
            porcentajes = sucEncontrada.porcInstrumentosPorTipo();
        }
        //retorna null al no encontrar la sucursal
        return porcentajes;      
    }    
    //buscar sucursal en caso de no encontrar vuelve null
    public Sucursal buscarSucursal(String nombreSuc){
        int i=0;
        //si no encuentra una sucursal devuelve null
        Sucursal sucEncontrado = null;
        // verificar todas las sucursales
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc)){
            i++;
        }
        //si queda menor a la sucursal  significa que encontro la sucursal buscada
        if (i< sucursales.size()){
            sucEncontrado = this.sucursales.get(i);
        }
        //devulve sucursal encontrada o null en caso que no lo encuentre
        return sucEncontrado;    
    }    
    public Instrumento borrarInstrumento(String ID){
        //en caso de que encontrar el instrumento , retornara null ("siempre se tiene que devolver algo"
        Instrumento borrado = null;
        int i = 0;
        // recorrer por todas las sucursales y que verificar que se borrado ( cuando deje de ser null)
        while(i < sucursales.size() && borrado == null ){
            // retornara el instrumento borrado
            //selecionamos la sucursal actual y intenamos borrar instrumento con el metodo borrar Instrumento de la clase sucursal
            borrado = sucursales.get(i).borrarInstrumento(ID);    
            //cuando borrado deje de ser null cortara la secuencia
            i++;
        }
        return borrado;        
    }       
    //imprimir nombre de la sucursal con la lista de instrumentos que tiene
    public void listarIntrumentos(){
        for (Sucursal sucursal: sucursales ){
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
    public void agregarSucursal(Sucursal suc){
        this.sucursales.add(suc);
    }    
    public ArrayList<Instrumento> instrumentoPorIipo(TipoInstrumento tipo){
        //Nueva lista para almacenar los instrumentos encontrados
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        //   Nombre de la clase -  Variable(puede ser y , a ,etc - nombre de la lista//coleccion 
        //recorre por todas las sucursales de mi lista
        for (Sucursal sucursal : sucursales){
            //añadir a mi lista instEncontrador los instrumento de igual tipo
            instEncontrados.addAll(sucursal.instrumentoPorIipo(tipo));
        }
        return instEncontrados;
        
    }    
}