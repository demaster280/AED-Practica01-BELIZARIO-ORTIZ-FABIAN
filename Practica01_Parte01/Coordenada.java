
package practica01;

public class Coordenada {
    
	private double x;
	private double y;
	
	public Coordenada( ){
		this.x=0;
		this.y=0;
	}	
	public Coordenada(double x, double y ){
		this.x=x;
		this.y=y;
	}
	public Coordenada(Coordenada c ){
		this.x=c.x;
		this.y=c.y;
	}
	
	//set y get
        
	public void setX(double x) {
		this.x=x;
	}
	public double getX(){
		return x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double getY(){
		return y;
	}
	
	//método de instancia que calcula la distancia euclideana
        
	public double distancia(Coordenada c){
		return Math.sqrt(Math.pow(c.getX()-x,2)+ Math.pow(c.getY()-y,2));
	}
	
	//método de clase que calcula la distancia euclideana
        
	static double distancia(Coordenada c1, Coordenada c2){
		return Math.sqrt(Math.pow(c1.getX()-c2.getX(),2)+ Math.pow(c1.getY()-c2.getY(),2));
        
        }
	
	//método que devuelve los valores de una coordenada en determinado formato
        public String toString(){
            return "["+x+", "+y+"]";
        }

	
}