package Practica1;
import java.util.Scanner;
import java.util.Random;
public class Practica1 {
	
	public static void main(String[]args){
		Random rd= new Random();
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
			String hora, minutos="0";
			int hora1=0, hora2=0, hora3=0;
						
			System.out.println("Cambiar la notacion de una hora de 24 a 12 horas\n"
					+ "\n"
					+ "Introduzca la fecha que desea transformar en formato hh:mm");
			
			hora = s.next();
			hora1= hora.length();
			if(hora1==5){
				char h1, h2, b1, m1,m2;
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
				double l,a,p,h;
				System.out.println("Ingrese la longitud de uno de los lados del triangulo ()");
				l=s.nextDouble();
				h=(Math.sqrt(3)/2)*l;
				a=(Math.sqrt(3)/4)*l*l;
				p=(3*l);
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
		else if(num==6){
			float n1, n2;
			String letra;
			System.out.println("Calculadora\n"
					+ "Ingrese la letra segun la operacion que desea realizar\n"
					+ "    \n"
					+ "S = Suma;\n"
					+ "R = Resta;\n"
					+ "M = Multiplicacion\n"
					+ "D = Division");
			letra = s.next();
			System.out.println("Ingrese el primer numero");
			n1=s.nextFloat();
			System.out.println("Ingrese el segundo numero");
			n2=s.nextFloat();
				
			if(letra.equals("S")||letra.equals("s"))
					System.out.println("La suma de los numeros es = "+" "+ (n1+n2));
			else if(letra.equals("R")|| letra.equals("r"))
				System.out.println("La resta de los numeros es = "+" "+ (n1-n2));
			else if(letra.equals("M")||letra.equals("m"))
				System.out.println("La multiplicacion de los numeros es = "+" "+(n1*n2));
			else if(letra.equals("D")||letra.equals("d"))
				System.out.println("division de los numeros es = "+n1+"/"+n2+" = "+" "+ (n1/n2));
			else
				System.out.println("La letra ingresada es incorrecta\n");		
			}
		else if(num==7){
			int multi;
			System.out.println("Las tablas de multiplicar\n"
					+ "\n"
					+ "Ingrese un numero del 0 al 10");
			multi=s.nextInt();
			if(multi>=0&&multi<11)
			for(int i=11; i>1; i--)
				System.out.println(multi+"X"+ (i-1)+"="+" "+(multi*(i-1)));
			else
				System.out.println("el numero ingresado no esta dentro del intervalo pedido");						
		}
		else if(num==8){
			int nu1, nu2 ;
			System.out.println("Numeros aleatorios\n"
					+ "\n"
					+ "Ingrese un numero dentro del rango de 0-100\n");
			nu1=s.nextInt();
			System.out.println("Ingrese otro numero diferente al primero dentro del rango de 0-100");
			nu2=s.nextInt();
			if(nu1<101 &&nu2<101&&nu1>=0&&nu2>=0){				
				
				int max=rd.nextInt(nu2+1)+nu1;
			String uni[]={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
			String unic[]={"once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
			String venti[]={"Veinte","Veintiuno","Ventidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintinueve"};
			String cent[]={"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
			if(max>=0 && max<11)
				System.out.println("Numero en numero ="+" "+max+"\n"
						+"Numero en letras ="+" "+ uni[max]);
				else if(max<20)
					System.out.println("Numero ="+" "+max+"\n"
							+ "Numero en letras ="+" "+unic[max-11]);
				else if(max>19&&max<30)
					System.out.println("Numero ="+" "+max+"\n"
							+ "Numero en letras ="+" "+ venti[max-20]);
				else if(max<20){
					int un=max%10;
					int dc=max/10;
					if(un==0)
						System.out.println("Numero ="+" "+max+"\n"
								+ "Numero en letras ="+" "+ cent[dc-2]);
					else
						System.out.println("Numero ="+" "+max+"\n"
								+ "Numero en letras ="+" "+ cent[dc-2]+""+"y"+" "+uni[un]);
				}
				
				else if(max==100)
					System.out.println("Numero ="+" "+max+"\n"
							+ "Numero en letras ="+" "+"Cien");
				else if(max==0)
					System.out.println("Numero ="+" "+max+"\n"
							+ "Numero en letras ="+" "+"Cero");
					
			}
			else
			
				System.out.println("El numero ingresado no esta dentro de los limites establecido o los numeros son iguales");	
			}
		else if(num==9){
			int numero;
			System.out.println("Numeros Romanos\n"
					+ "Ingrese un numero el cual desee convertirlo a numero romano del rango de 1 al 3999");
			numero=s.nextInt();
			
			String base[]={" ","I","II","III","IV","V","VI","VII","VIII","IX"};
			String decena[]={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			String cente[]={"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
			String mile[]={"M","MM","MMM"};
			
			if(numero<10&&numero>0)
				System.out.println("El numero ingresado = " + numero+"\n"
						+ "El numero en notacion romana = " + base[numero]);
			else if(numero>9&&numero<100){
				int  ter=numero%10;
				int tor=numero/10;
				if(ter==0)
					System.out.println("El numero ingresado = " + numero +"\n"
							+ "El numero en notacion romana = "+ decena[tor-1]);
				else
					System.out.println("El numero ingresado = " + numero + "\n"
							+ "El numero en notacion romana = "+ decena[tor-1]+base[ter]);}
			else if(numero>=100&&numero<1000){
				int cien=numero%100;
				int ciene=numero/100;
				if(cien==0)
					System.out.println("El numero ingresado = " + numero +"\n"
							+ "El numero en notacion romana = "+ cente[ciene-1]);
				else{
					int div=cien%10;
					int val=cien/10;
					if(div==0)
						System.out.println("El numero ingresado = " + numero + "\n"
								+ "El numero en notacion romana = "+ cente[ciene-1]+decena[val-1]);
					else
						System.out.println("El numero ingresado = " + numero + "\n"
								+ "El numero en notacion romana = "+ cente[ciene-1]+decena[val-1]+base[div]);}
									
				}
					
			else if(numero>=1000&&numero<4000){
				int mil=numero%1000;
				int divmil=numero/1000;
				if(mil==0)
					System.out.println("El numero ingresado = " + numero +"\n"
							+ "El numero en notacion romana = " + mile[divmil-1]);
				else{
					int cen=mil%100;
					int cn=mil/100;
					if(cen==0)
						System.out.println("El numero ingresado = " + numero +"\n"
								+ "El numero en notacion romana = " + mile[divmil-1]+cente[cn-1]);
					else{
						int ver=cen%10;
						int loc=cen/10;
						if(ver==0)
							System.out.println("El numero ingresado = " + numero +"\n"
									+ "El numero en notacion romana = " + mile[divmil-1]+cente[cn-1]+decena[loc-1]);
						else
							System.out.println("El numero ingresado = " + numero +"\n"
									+ "El numero en notacion romana = " + mile[divmil-1]+cente[cn-1]+decena[loc-1]+ base[ver]);
					}
				}							
			}
			else
				System.out.println("El numero que ingreso no esta dentro del intervalo dado");
					
				}
		else if(num==10){
			int pir;
			System.out.println("Piramide de numeros\n"
					+ "Ingrese el numero del cual desea que la piramide tenga el tamaño");
			pir=s.nextInt();
			if(pir<10&&pir%2==0){
			for (int i = 0; i < pir; i++) {				 	            
	            int nu=pir;
	            
				for (int j = pir; j>pir-i; j-- ) {                      
	                System.out.print(" ");  
	                nu--;
	            }
	            for (int j =pir*2; j>(2*i); j--  ){
	            	if(j%2==0)
	            		System.out.print(nu);
	            	else
	                    System.out.print(" ");
	                
	            }
	            System.out.println(""); 
			}
			}
			else if(pir<10&&pir%2!=0){
				for (int i = 0; i < pir; i++) {				 	            
		            int nu=1;
		            
					for (int j = pir; j>pir-i; j-- ) {                      
		                System.out.print(" ");  
		                nu++;
		            }
		            for (int j =pir*2; j>(2*i); j--  ){
		            	if(j%2==0)
		            		System.out.print(" ");
		            	else
		                    System.out.print(nu);
		                
		            }
		            System.out.println(""); 
				}	
			}		
			     }
		else if(num==11){
			
			
		}
		else if(num==12){
			String cadena=" ";
			int numc;
			
			System.out.println("Cadena de caracteres y asteriscos\n"
					+ "Ingrese una cadena de caracteres");
			cadena=s.next();
			numc=cadena.length();
			
			for(int i=0; i<numc; i++){
				System.out.print("*");
			}
			System.out.println(" ");
			}
		else if(num==13){
			String letra;
			
			System.out.println("Encuentra la letra");
			String  abecedario[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","0","p","q","r","s","t","u","v","w","x","y","z"};
			
			int max=rd.nextInt(27+1)+0;			
			System.out.println("La letra a encontrar es"+"="+abecedario[max]);
				
		String comp= abecedario[max];
		
		do{
			System.out.println("Ingrese su letra como solucion");
			letra=s.next();
			
          if(letra.compareTo(comp)==0){
			  
			System.out.println("Respuesta correcta");}
		else if(letra.compareTo(comp)<0)
			System.out.println("La letra esta despues\n");
		else if(letra.compareTo(comp)>0)
			System.out.println("La letra esta antes\n");
		}while(letra.compareTo(comp)!=0);
			}
		else if(num==14){
			int tamaño;
			System.out.println("Cuadro de asteriscos\n"
					+ "Ingrese el numero para el tamaño del cuadrado");
		tamaño=s.nextInt();
		for(int i=0;i<tamaño;i++){
			for(int j=0;j<tamaño;j++){
				System.out.print("*"+" \n");
			}
			System.out.println("");
		}
		}
		else if(num==15){
			int primo;
			System.out.println("Cantidad de numeros primeros");
			primo=s.nextInt();
		}
		
		
		
		
			
					
			
				
					
			
			
							
							
				
					
		
				
				
					
				
		
			
		
		
			
			
		
		
		
		
		
		}while(num!=0);	
	}
}
