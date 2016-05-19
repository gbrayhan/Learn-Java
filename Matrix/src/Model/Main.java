package Model;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manejo de Matrices
		/*int[] num=new int[10];
		Scanner leer;
		leer=new Scanner(System.in);
		for(int i=0;i<num.length;i++){
			System.out.println("Poner Dato");
			num[i]=leer.nextInt();
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
					
		}*/
		//Matriz bidimencional
				
		int[][] bidim=new int[4][4];
		Scanner read;

		read=new Scanner(System.in);
				
		for(int i=0;i<bidim.length;i++){
			for(int j=0;j<bidim.length;j++){
				System.out.println("Ingresa el dato:");
				bidim[i][j]=read.nextInt();				
			}
				}
		for(int i=0;i<bidim.length;i++){
			for(int j=0;j<bidim.length;j++){
				System.out.println(bidim[i][j]);				
			}
		}

	}

}