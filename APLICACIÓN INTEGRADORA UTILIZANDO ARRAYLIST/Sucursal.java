
package fabricandoinstrumentos;
import java.util.ArrayList;
public class Sucursal {
    private ArrayList<Instrumento> Instrumentos; //Cada sucursal tiene una lista de instrumentos
    private String nombre; //nombre de cada sucursal 
    //constructor
    public Sucursal(String nombre) {
        this.nombre = nombre;
        //crear lista de instrumentos vacio
        this.Instrumentos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }  
    public void agregarInstrumento(Instrumento ins){
        this.Instrumentos.add(ins);
    }
    //borrar instrumento
    public Instrumento borrarInstrumento(String ID){
        //busca instrumento por ID
        Instrumento insABorrar = buscarInstrumento(ID);
        //si encuentra instrumento lo borra
        this.Instrumentos.remove(insABorrar);
        return insABorrar;       
    }
    //buscar instrumento
    public Instrumento buscarInstrumento(String ID){
        int i=0;
        Instrumento insEncontrado = null;
        // verificar todos los instrumentos y toma la lista de instrumentos por su tipo y ver si es distinto
        while (i < Instrumentos.size() && !this.Instrumentos.get(i).getID().equals(ID)){
            i++;
        }
        //si queda menor al instrumento significa que encontroel instrumento
        if (i< Instrumentos.size()){
            // el insEncontrado ya no sera null cambiara de valor 
            insEncontrado = this.Instrumentos.get(i);
        }
        //devolvemos instrumento encontrado
        return insEncontrado;    
    }    
    public double[] porcInstrumentosPorTipo(){
        //guardamos la cantidad de instrumentos
        final int CANT_instrumentos = TipoInstrumento.values().length;
        //guardamos  en una lista la cantidad de instrumentos 
        double[] porcentajes = new double[CANT_instrumentos];
        //   Nombre de la clase -  Variable(puede ser y , a ,etc - nombre de la lista//coleccion 
        for(Instrumento instrumento : Instrumentos){
            //array de contadores por tipo de instrumentos
            porcentajes[instrumento.getTipo().ordinal()]++;
        }
        //llamamos al metodo absolutoAPorcentaje 
        absolutoAPorcentaje(porcentajes);
        //retornamos valor del pocentaje
        return porcentajes;              
    }
    // metodo para calcular el porcentaje 
    private void absolutoAPorcentaje(double[] porcentajes) {
        for (int i = 0; i < porcentajes.length; i++) {
            //calculamos porcentaje 
            porcentajes[i] = (porcentajes[i] * 100) / Instrumentos.size();
        }
    }    
    public void listarInstrumentos(){ 
       //   Nombre de la clase -  Variable(puede ser y , a ,etc - nombre de la lista//coleccion 
       for (Instrumento instrumento : Instrumentos){
           System.out.println(instrumento);
       }       
   }    
    public ArrayList<Instrumento> instrumentoPorIipo(TipoInstrumento tipo){
        //Nueva lista para almacenar los instrumentos encontrados
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        //   Nombre de la clase -  Variable(puede ser y , a ,etc - nombre de la lista//coleccion 
        for (Instrumento instrumento : Instrumentos){
            //comparamos el tipo de instrumento
            if (instrumento.getTipo()== tipo ){
                //agregamos a la lista nueva
                instEncontrados.add(instrumento);
            }
        }        
        return instEncontrados;     
    }
}
