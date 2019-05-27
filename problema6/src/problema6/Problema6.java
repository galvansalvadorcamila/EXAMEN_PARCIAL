package problema6;
import java.util.Scanner;
public class Problema6 {
	private static Scanner teclado;
	public static void main(String[] args) {
		System.out.println("Ingrese el dimension del vector");
		teclado = new Scanner(System.in);
		int n=teclado.nextInt();
		int vector[]= new int[n];
		int pro=0, max=0;
		//Ingresamos los elementos del vector
		System.out.println("Ingrese los elementos del vector");
		for (int i=0;i<vector.length;i++) {	
			vector[i]=teclado.nextInt();
		}
		//Hallamos el mayor producto del vector
		for (int j=0;j<vector.length-3;j++) {
			pro=vector[j]*vector[j+1]*vector[j+2]*vector[j+3];
			if (pro>max) {
				max=pro;
			}
		}
		//Buscamos 4 numeros consecutivos que nos den el producto mayor 
		for (int j=0;j<vector.length-3;j++) {
			if (vector[j]*vector[j+1]*vector[j+2]*vector[j+3]==max) {
				System.out.println("El producto maximo es "+max+" y está formado por:");
				System.out.println(vector[j]+" "+vector[j+1]+" "+vector[j+2]+" "+vector[j+3]);
			}
		}
	}
}