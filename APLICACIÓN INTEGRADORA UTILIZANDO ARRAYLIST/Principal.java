
package fabricandoinstrumentos;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
                    
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        //mostrar instrumentos y el nombre de la surcursal con el getnombre
        //f.listarIntrumentos();
        
        /*
        //crea una lista para almacenar los valores obtenidos
        ArrayList<Instrumento> Lista = f.instrumentoPorIipo(TipoInstrumento.VIENTO);
        //imprimir datos de mi lista creada
        
        //   Nombre de la clase -  Variable(puede ser y , a ,etc - nombre de la lista//coleccion
        for (Instrumento instrumento : Lista){
            System.out.println(instrumento);
        }
        */
        /*
        Instrumento borrado = f.borrarInstrumento("AFE855");
        System.out.println("se borro: "+borrado);
        f.listarIntrumentos();*/
        
        
         double[] porcs = f.porcInstrumentosPorTipo("Sucursal A");
         for (int i = 0; i < porcs.length; i++) {
             System.out.println(porcs[i]);
         }
    }
    
    public static void cargarFabrica(Fabrica f){
        
        // agregamos el nombre de las sucursales 
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        //agregar lista de instrumentos de la sucursal A        
        s1.agregarInstrumento(new Instrumento("ABC123",1155,TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("AFE855",4655,TipoInstrumento.PERCUSION));
        s1.agregarInstrumento(new Instrumento("VFT153",1587,TipoInstrumento.VIENTO));
        //Agregar lista de instrumentos de la sucursal B
        s2.agregarInstrumento(new Instrumento("GRT489",9874,TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("DEF593",5598,TipoInstrumento.VIENTO));
        
        //agregar nombre de la surcursal
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);                    
    }    
}