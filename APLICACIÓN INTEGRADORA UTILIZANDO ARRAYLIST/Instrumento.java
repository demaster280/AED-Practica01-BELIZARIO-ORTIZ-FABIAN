package fabricandoinstrumentos;
public class Instrumento {    
    //un intrumento contige una ID . precio y tipo de instrumento
    private String ID;
    private double precio;
    private TipoInstrumento tipo;    
    //constructor
    public Instrumento(String ID, double precio, TipoInstrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }
    public TipoInstrumento getTipo() {
        return tipo;
    }
    public String getID() {
        return ID;
    } 
    //concadednacion nombre , id precio y tipo del instrumento
    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }   
}
