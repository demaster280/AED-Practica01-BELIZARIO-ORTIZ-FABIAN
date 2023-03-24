package practica01;
public class Verificador {
	static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
		//VARIABLES PARA ORDENAR LAS COORDENADAS DE LOS RECTANGULOS
		// X1=x11		Y1=y11
		// X2=x12		Y1=y12
		// X3=x21		Y1=y21
		// X4=x22		Y1=y22
		double x11,x12,x21,x22,
				y11,y12,y21,y22;
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
		//CASO 1 JUNTOS X
                if(x21<x12 && x21>x11 && x22>x12){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 2 JUNTOS X
                }else if(x22<x12 && x22>x11 && x21<x11){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
				
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
				
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 3 JUNTOS X
		}else if(x11>x21 && x12<x22){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 4 JUNTOS X
                }else if(x11<x21 && x12>x22){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 5 JUNTOS X IGUALES
                }else if((x11==x21 && x12==x22)){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y		//RECTANGULO IGUAL
			}else if((y11==y21 && y12==y22)){
				return true;					
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 6 Y 7 JUNTOS X IZQ IGUAL
                }else if(x11==x21 && x12!=x22){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		//CASO 8 Y 9 JUNTOS X DER IGUAL
                }else if(x12==x22 && x11!=x21){
			//CASO DISJUNTOS Y
			if(y12<y21 || y22<y11){
				return false;
			//CASO JUNTOS Y
			}else if(y12==y21 || y22==y11){
				if(y12==y21 && y11<y22){
					//JUNTOS POR Y
					return false;
				}else if(y11==y22 && y21<y12){
					//JUNTOS POR Y
					return false;
				}else{
					return false;
				}
			//CASO 1 JUNTOS Y
			}else if(y21<y12 && y21>y11 && y22>y12){
				return true;
			//CASO 2 JUNTOS Y
			}else if(y22<y12 && y22>y11 && y21<y11){
				return true;
			//CASO 3 JUNTOS Y
			}else if(y11>y21 && y12<y22){
				return true;
			//CASO 4 JUNTOS Y
			}else if(y11<y21 && y12>y22){
				return true;
			//CASO 5 JUNTOS Y
			}else if((y11==y21 && y12==y22)){
				return true;
			//CASO 6 y 7 JUNTOS Y
			}else if(y11==y21 && y12!=y22){
				return true;
			//CASO 8 y 9 JUNTOS Y
			}else if(y12==y22 && y11!=y21){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	static boolean esDisjunto(Rectangulo r1, Rectangulo r2){
		double x11,x12,x21,x22;
		double y11,y12,y21,y22;
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
                //CASO DISJUNTOS X y CASO DISJUNTOS Y
                if( (x12<x21 || x22<x11) || (y12<y21 || y22<y11)){
			return true;
		}else{
			return false;
		}
	}        
	static boolean esJunto(Rectangulo r1, Rectangulo r2){
		double x11,x12,x21,x22;
		double y11,y12,y21,y22;
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
		//CASO JUNTOS X
		if(x12==x21 || x22==x11){
			if(x12==x21 && x11<x22){
				return true;
			}else if(x11==x22 && x21<x12){
				return true;
			}else{
				return false;
			}
		//CASO JUNTOS Y
		}else if(y12==y21 || y22==y11){
			if(y12==y21 && y11<y22){
				return true;
			}else if(y11==y22 && y21<y12){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
