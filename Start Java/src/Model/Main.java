package Model;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingresa tu nombre: ");
		Scanner leer =new Scanner(System.in);
		String nombre=leer.next();
		System.out.println("Buenas tardes "+nombre+" cómo estás?");
		int num=29;
		num++;
		System.out.println(num);
		/*
		for(float numf=0.00f;numf<2.0f;numf+=0.020f){
			System.out.println(numf);
		}
		*/	
		int a=1;
		/*
		while(a<=12){//Hacerlo hasta que el argumento sea falso
			System.out.println(a);
			a++;	
		}
		*/
		do{
			System.out.println(a);
			a++;			
		}while(a<=12);
		//foreach facilitar uso de arreglos
		String[] listaName={"Alejandro","Elizabeth","Salas","Gabriel","Isaac"};
		for(String x:listaName){
			System.out.println(x);
		}
		
		int number=8;
		
		switch(number){
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 8:
			System.out.println("El numero es: 8");
			break;
		}
		/*Try Catch no elimina error solo no ejecuta la accion por alguna accion*/
		
		//int z=12/0; Error mathematico y de programación
		
		int j=0;
		int k=12;
		
		try{
			float s=k/j;
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("La aplicacion no se cerro");
	}
}
