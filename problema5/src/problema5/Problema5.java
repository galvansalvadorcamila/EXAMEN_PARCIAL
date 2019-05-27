package problema5;
import java.util.Scanner;
public class Problema5 {
	private static Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra=teclado.nextLine();
		String palabra1="";
		String palabra2="";
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)!=' ') {
				palabra1=palabra1+palabra.charAt(i);
			}
		}
		for (int i=palabra.length()-1;i>=0;i--) {
			if (palabra.charAt(i)!=' ') {
				palabra2=palabra2+palabra.charAt(i);
			}
		}
		if (palabra1.equals(palabra2)) {
			System.out.print("Es un palindromo");
		}else {
			System.out.print("No es un palindromo");
		}
	}
}