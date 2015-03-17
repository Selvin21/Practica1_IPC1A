package Practica1;
import java.util.Scanner;
public class Practica1 {
	
	public static void main(String[]args){
		int num=0;
		do{
		System.out.println("Practica 1: Problemas  nivel 1 y 2 \n"
				+ " \n"
				+"Ingrese el numero del problema que desea realizar:\n"
				+ "\n"
				+ "-Problema 1\n"
				+ "-Problema 2\n"
				+ "-Problema 3\n"
				+ "-Problema 4\n"
				+ "-Problema 5\n"
				+ "-Problema 6\n"
				+ "-Problema 7\n"
				+ "-Problema 8\n"
				+ "-Problema 9\n"
				+ "-Problema 10\n"
				+ "-Problema 11\n"
				+ "-Problema 12\n"
				+ "-Problema 13\n"
				+ "-Problema 14\n"
				+ "-Problema 15\n"
				+ "-Salir    0\n");
		Scanner s=new Scanner(System.in);
		num= s.nextInt();
		
		if(num==1){
			System.out.println("Rombo con asteriscos\n"
					+ "");
			 for (int i = 0; i < 5; i++) { 
		            for (int j = 0; j < 4-i; j++) {                      
		                System.out.print(" ");           
		            }
		            for (int j = 0; j < (2*i)+1; j++){
		                System.out.print("*");
		            }
		            System.out.println("");   
			 }
			 for (int i = 0; i < 4; i++) {				 	            
		            for (int j = 5; j >4-i; j-- ) {                      
		                System.out.print(" ");           
		            }
		            for (int j = 8; j > (2*i)+1; j--  ){
		                System.out.print("*");
		            }
		            System.out.println("");   
			 }			  		 
			 System.out.println("***********************************************************");
		}
		else if(num==2){
			float nota1; float nota2; float nota3; float nota4; float nota5; float nota6;		
			float promedio;
			System.out.println("Puntuacion con respecto a la media de notas\n"
					+ "\n"
					+ "Ingrese las 6 notas del estudiante de IPC\n"
					+ "Despues de ingresar la nota presionar enter, la nota tiene que estar en el intervalo de 0 a 100");
			nota1=s.nextFloat();
			nota2=s.nextFloat();
			nota3=s.nextFloat();
			nota4=s.nextFloat();
			nota5=s.nextFloat();
			nota6=s.nextFloat();
			promedio=(nota1 + nota2+ nota3+ nota4+ nota5+ nota6)/6;
				if(promedio<60)
					System.out.println("El promedio es "+promedio+"  Su nota es  : E");
				else if(promedio>59 && promedio<70)
					System.out.println("El promedio es " + promedio+ "Su nota es : D");
				else if(promedio>69 && promedio <80)
					System.out.println("El promedio es "+ promedio+" Su nota es : C");
				else if(promedio>79 && promedio <90)
					System.out.println("El promedio es "+ promedio+" Su nota es : B");
				else if(promedio>89 && promedio <101)
					System.out.println("El promedio es "+ promedio+" Su nota es : A");
		System.out.println("***********************************************************");
						}
		else if(num==3){
			String hora, numeros="0123456789", minutos="0";
			int hora1=0, hora2=0, hora3=0;
			char h1, h2, b1, m1,m2;
			
			System.out.println("Cambiar la notacion de una hora de 24 a 12 horas\n"
					+ "\n"
					+ "Introduzca la fecha que desea transformar en formato hh:mm");
			
			hora = s.next();
			hora1= hora.length();
			if(hora1==5){
				h1=hora.charAt(0);
				h2=hora.charAt(1);
				b1=hora.charAt(2);
				m1=hora.charAt(3);
				m2=hora.charAt(4);
				minutos= hora.substring(3,5);
				hora2= Integer.valueOf(hora.substring(0,2)).intValue();
				System.out.println("La hora introducida es"+"   "+ hora2+":" + minutos);		
			
			hora3= hora2-12;
			
			if(hora2>12)
				System.out.println("La hora convertida es"+"  "+hora3+":"+minutos+"  "+"PM");
			
			if	(hora2<=12){
				if(hora2==0)				
				System.out.println("La hora convertida es"+"12"+":"+minutos+"  "+"AM");
				else
					System.out.println("La hora convertida es"+" "+hora2+":"+minutos+"AM");
			}
			}
			else if(hora1!=0)
			System.out.println("El formato de hora es invalido");
			System.out.println("***********************************************************");
		}	
		
		else if(num==4){
			String letra;
			System.out.println("Operaciones Geometricas\n"
					+ "\n"
					+ "Ingrese letra segun la figura de la cual desea ejecutar las operaciones\n"
					+ "(C)= Circulo\n"
					+ "(T)= Triangulo\n"
					+ "(U)= Cuadrado\n");
			letra=s.next();
			
			if(letra.equals("c")||letra.equals("C")){
				double r,p,a, di;
				System.out.println("Ingrese el Diametro del circulo");
				di=s.nextDouble();
				r=(di/2);
				p=2*(Math.PI)*(r);
				a=(Math.PI)*(r*r);
				System.out.println("Las operaciones calculadas son las siguientes\n"
						+ "Radio="+r+"\n"
								+ "Perimetro="+p+"\n"
										+ "Area="+a);
			}
			else if(letra.equals("t")||letra.equals("T")){
				double l,b,a,p,h;
				System.out.println("Ingrese la longitud de uno de los lados del triangulo ()");
				l=s.nextDouble();
				System.out.println("Ingrese el tamaño de la base del triangulo");
				b=s.nextDouble();
				h=Math.sqrt(Math.pow(l,2)-((b/2)*(b/2)));
				a=(b*h)/2;
				p=(2*l)+b;
				System.out.println("Las operaciones calculadas son las siguientes\n"
						+ "Area="+a+"\n"
								+ "Perimetro="+p+"\n"
										+ "Altura="+h+"\n");				
			}
			else if(letra.equals("u")||letra.equals("U")){
				double l,a,p;
				System.out.println("Ingrese el valor de uno de los lados del cuadrado");
				l=s.nextDouble();
				a=l*l;
				p=4*l;
				System.out.println("Las operaciones calculadas son las siguientes\n"
						+ "Area="+a+"\n"
								+ "Perimetro="+p+"\n");				
			}
			else
				System.out.println("La letra es incorrecta");
		}
		
		else if(num==5){
			int dia1, dia2, mes1, mes2,año1, año2;
			int totaldias, totalñ, di;
			System.out.println("Demostracion de dias que hay de diferencia entre dos fechas ingresadas");
			System.out.println("Primera fecha\n"
					+ "Ingrese el dia ");
			dia1=s.nextInt();
			System.out.println("Ingrese el mes (En numeros)");
			mes1=s.nextInt();
			System.out.println("Ingrese el año");
			año1=s.nextInt();
			System.out.println("\n"
					+ "Segunda fecha\n"
					+ "Ingrese el dia");
			dia2=s.nextInt();
			System.out.println("Ingrese el mes");
			mes2=s.nextInt();
			System.out.println("Ingrese el año");
			año2=s.nextInt();
			if(dia1>0 && dia2>0 && dia1<31&& dia2<31&&mes1>0&& mes2>0 && mes1<13&& mes2<13){
			     if(año1>año2)
				          totalñ=año1-año2;
			    else
			    	totalñ=año2-año1;
				if(dia1==dia2)
					di=dia1-dia2;
				else
					di=(30-dia1)+(30-dia2);
				if(mes1==mes2)
					if(dia1>dia2)
						di=dia1-dia2;
					else
						di=dia2-dia1;
					
			totaldias=((di)+(((12-mes1)+(12-mes2))*30)+(totalñ*360));
			System.out.println("La diferencia de dias entre las dos fechas es de "+" "+totaldias);
			}
			else
				System.out.println("Un dato ingresado no es el correcto"
						+ "************************************************************");
		}
		
		
		
		
		
		}while(num!=0);
	}

}
