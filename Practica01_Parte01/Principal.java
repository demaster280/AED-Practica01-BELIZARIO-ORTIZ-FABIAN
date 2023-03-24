package practica01;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		//PRUEBA NUMERO UNO CASOS DE PRUEBA           
                System.out.println("//////////////////////////////////////////////////////////////////////");
                System.out.println("CASO DE PRUEBA NUMERO UNO");
		Coordenada coo1 = new Coordenada(1.5,0.3);
		Coordenada coo2 = new Coordenada(7.6,2.2);
		Rectangulo r1 = new Rectangulo(coo1,coo2);
		Coordenada coo3 = new Coordenada(4,4.2);
		Coordenada coo4 = new Coordenada(9.4,-2.5);
		Rectangulo r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
		//PRUEBA NUMERO DOS CASOS DE PRUEBA 
                System.out.println("//////////////////////////////////////////////////////////////////////");                
                System.out.println("CASO DE PRUEBA NUMERO DOS");
		coo1 = new Coordenada(20.5,-1.1);
		coo2 = new Coordenada(33.3,3.6);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(10.3,-5.2);
		coo4 = new Coordenada(20.5,8.6);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
		//PRUEBA NUMERO TRES CASOS DE PRUEBA
                System.out.println("//////////////////////////////////////////////////////////////////////");                
                System.out.println("CASO DE PRUEBA NUMERO TRES");
		coo1 = new Coordenada(4,0);
		coo2 = new Coordenada(9,5);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(0,6);
		coo4 = new Coordenada(5,11);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
		//CASO DE PRUEBA POSIBLE CASO DE ENCONTRAR DOS RECTANGULOS               
                System.out.println("//////////////////////////////////////////////////////////////////////");
                System.out.println("CASO DE PRUEBA DE ENCONTRAR DOS RECTANGULOS");
		coo1 = new Coordenada(1,1);
		coo2 = new Coordenada(2,2);
		r1 = new Rectangulo(coo1,coo2);
		coo3 = new Coordenada(2,2);
		coo4 = new Coordenada(3,3);
		r2 = new Rectangulo(coo3,coo4);
		MostrarRectangulos(r1, r2);
		Scanner entradaporteclado = new Scanner(System.in);
		int n;	//ENTERO PARA LA CANTIDAD DE RECTANGULOS
		System.out.println("//////////////////////////////////////////////////////////////////////");
		System.out.print("INSERTAR LA LONGITUD DEL CONTENEDOR DE RECTANGULOS:   ");
		n = entradaporteclado.nextInt();
		System.out.println("//////////////////////////////////////////////////////////////////////");
		ContainerRect container = new ContainerRect(n);
		//METODO DE PARA INGRESAR EL NUMERO DE RECTANGULOS
                for(int i=1;i<=n;i++){
			double x1,x2,y1,y2;//COORDENADAS DEL RECTANGULO
			System.out.print("Insertar una esquina del rectángulo "+i+" :   ");
			x1 = entradaporteclado.nextDouble();
			y1 = entradaporteclado.nextDouble();
			System.out.print("Insertar la esquina opuesta del rectángulo"+i+" :   ");
			x2 = entradaporteclado.nextDouble();
			y2 = entradaporteclado.nextDouble();
			System.out.println("//////////////////////////////////////////////////////////////////////");
			container.addRectagulo(new Rectangulo(new Coordenada(x1,y1),new Coordenada(x2,y2)));
		}
		entradaporteclado.close();//CERRAMOS EL SCANNER
		System.out.println(container);//IMPRIMIMOS EL CONTENEDOR
	}	
	//METODO PARA MOSTRAR EN QUE CASO SE ENCUENTRAN DOS RECTANGULOS
	//CON AYUDA DE LA CLASE VERIFICAR
        public static void MostrarRectangulos(Rectangulo r1,Rectangulo r2){
		System.out.println("//////////////////////////////////////////////////////////////////////");
		System.out.println("Rectangulo A = "+r1);
		System.out.println("Rectangulo B = "+r2);
		if(Verificador.esJunto(r1, r2)==true){
			System.out.println("Los rectangulos A y B se Juntan");
		}else if(Verificador.esDisjunto(r1, r2)==true){
			System.out.println("Rectangulos A y B son disjuntos");
		}else if(Verificador.esSobrePos(r1, r2)==true){
			System.out.println("Rectangulos A y B se Sobreponen");
			System.out.println("Area de Sobreposicion = "+
			rectanguloSobre(r1, r2).calculoArea());
		}
	}
	//METODO QUE DEVUELVE EL RECTANGULO FORMADO POR LA SOBREPOSICION
        public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2){
		double 		x11,x12,x21,x22,y11,y12,y21,y22,
					X11=0,X12=0,Y11=0,Y12=0;	//VARIABLES PARA LA COORDENADA DEL NUEVO RECTANGULO
					//INICIALIZADAS EN 0
		Coordenada Coordenada1Sob, Coordenada2Sob;	//COORDENADAS DEL RECTANGULO
		Rectangulo RecSob;
                //RECTANGULO A DEVOLVER
		//ORDENAMOS COORDENADAS X1
		if(r1.getEsquina1().getX()<r1.getEsquina2().getX()){
			x11=r1.getEsquina1().getX();
			x12=r1.getEsquina2().getX();
		}else{
			x11=r1.getEsquina2().getX();
			x12=r1.getEsquina1().getX();
		}                
		//ORDENAMOS COORDENADAS X2
                if(r2.getEsquina1().getX()<r2.getEsquina2().getX()){
			x21=r2.getEsquina1().getX();
			x22=r2.getEsquina2().getX();
		}else{
			x21=r2.getEsquina2().getX();
			x22=r2.getEsquina1().getX();
		}
                //ORDENAMOS COORDENADAS Y1
                if(r1.getEsquina1().getY()<r1.getEsquina2().getY()){
			y11=r1.getEsquina1().getY();
			y12=r1.getEsquina2().getY();
		}else{
			y11=r1.getEsquina2().getY();
			y12=r1.getEsquina1().getY();
		}
                //ORDENAMOS COORDENADAS Y2
                if(r2.getEsquina1().getY()<r2.getEsquina2().getY()){
			y21=r2.getEsquina1().getY();
			y22=r2.getEsquina2().getY();
		}else{
			y21=r2.getEsquina2().getY();
			y22=r2.getEsquina1().getY();
		}            
		//SACANDOS LAS X
		//CASO 1 JUNTOS X
                if(x21<x12 && x21>x11 && x22>x12){
			X11 = x21;
			X12 = x12; 
		//CASO 2 JUNTOS X
                }else if(x22<x12 && x22>x11 && x21<x11){
			X11 = x11;
			X12 = x22;     
		//CASO 3 JUNTOS X
                }else if(x11>x21 && x12<x22){
			X11 = x11;
			X12 = x12;     
		//CASO 4 JUNTOS X
                }else if(x11<x21 && x12>x22){
			X11 = x21;
			X12 = x22;                   
		//CASO 5 JUNTOS X                
		}else if((x11==x21 && x12==x22)){
			X11 = x11;
			X12 = x12;                        
		//SOBREPONEN CUANDO IZQ IGUAL                
		}else if(x11==x21 && x12!=x22){
			X11 = x11;
			//CASO 6 JUNTOS X
			//1<2
			if(x12<x22){
				X12 = x12;
			//CASO 7 JUNTOS X
			//2<1
			}else{
				X12 = x22;
			}                        
		//SOBREPONEN CUANDO DER IGUAL                
		}else if(x12==x22 && x11!=x21){
			X12 = x12;
			//CASO 8 JUNTOS X
			//1<2
			if(x22<x11){
				X11 = x11;
			//CASO 9 JUNTOS X
			//2<1
			}else{
				X11 = x21;
			}
		}		
		//SACANDOS LAS y
		//CASO 1 JUNTOS X                
		if(y21<y12 && y21>y11 && y22>y12){
			Y11 = y21;
			Y12 = y12;                        
		//CASO 2 JUNTOS X                
		}else if(y22<y12 && y22>y11 && y21<y11){
			Y11 = y11;
			Y12 = y22;                        
		//CASO 3 JUNTOS X                
		}else if(y11>y21 && y12<y22){
			Y11 = y11;
			Y12 = y12;                        
		//CASO 4 JUNTOS X                
		}else if(y11<y21 && y12>y22){
			Y11 = y21;
			Y12 = y22;                        
		//CASO 5 JUNTOS X                
		}else if((y11==y21 && y12==y22)){
			Y11 = y11;
			Y12 = y12;                        
		//IGUAL POR ABAJO                
		}else if(y11==y21 && y12!=y22){
			Y11 = y11;
			//CASO 6 JUNTOS X
			//1<2
			if(y12<y22){
				Y12 = y12;
			//CASO 7 JUNTOS X
			//2<1
			}else{
				Y12 = y22;
			}                        
		//IGUAL POR ARRIBA                
		}else if(y12==y22 && y11!=y21){
			Y12 = y12;
			//CASO 8 JUNTOS X
			//2<1
			if(y22<y11){
				Y11 = y11;
			//CASO 9 JUNTOS X
			//1<2
			}else{
				Y11 = y21;
			}
		}                
		Coordenada1Sob = new Coordenada(X11,Y11);
		Coordenada2Sob = new Coordenada(X12,Y12);
		RecSob = new Rectangulo(Coordenada1Sob,Coordenada2Sob);
		return RecSob;
	}
}