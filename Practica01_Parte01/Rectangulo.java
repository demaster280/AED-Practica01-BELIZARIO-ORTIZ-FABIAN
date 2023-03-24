package practica01;
public class Rectangulo {   
	private Coordenada esquina1;
	private Coordenada esquina2;
        // Constructor
        public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
		this.esquina1=esquina1;
		this.esquina2=esquina2;
	}
	public Rectangulo() {
		this.esquina1 = new Coordenada();
		this.esquina2 = new Coordenada();
	}
	public void setEsquina1 (Coordenada coo) {
		this.esquina1=coo;
	}
	public void setEsquina2 (Coordenada coo) {
		this.esquina2=coo;
	}
	public Coordenada getEsquina1 () {
		return esquina1;
	}
	public Coordenada getEsquina2 () {
		return esquina2;
	}
	public String toString() {
		return "("+esquina1+", "+esquina2+")";
	}	
	//METODO DE INSTANCIA  QUE CALCULA EL AREA DEL RECTANGULO  
	double calculoArea(){
		Rectangulo rec = new Rectangulo(esquina1,esquina2);
		double x11,x12,y11,y12;                
		//ORDENAMOS COORDENADAS X1
                if(rec.getEsquina1().getX()<rec.getEsquina2().getX()){
			x11=rec.getEsquina1().getX();
			x12=rec.getEsquina2().getX();
		}else{
			x11=rec.getEsquina2().getX();
			x12=rec.getEsquina1().getX();
		}                
		//ORDENAMOS COORDENADAS Y1
                if(rec.getEsquina1().getY()<rec.getEsquina2().getY()){
			y11=rec.getEsquina1().getY();
			y12=rec.getEsquina2().getY();
		}else{
			y11=rec.getEsquina2().getY();
			y12=rec.getEsquina1().getY();
		}
		return Math.abs((x12-x11)*(y12-y11));
	}
}
