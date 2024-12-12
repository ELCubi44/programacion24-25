package tema8;
import java.io.*;
import java.util.*;

//Crea un programa en el que vas pidiendo por consola números positivos y negativos hasta meter el 0, y ve guardándolos en una lista
//El 0 no lo guardes
//Llama a una función que recibe la lista y te devuelve la suma de los números positivos
//Llama a otra función que recibe la lista y te devuelve cuántos números negativos hay


public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		List<Integer>lista = new ArrayList<Integer>();
		boolean x=false;
		do {
			int numero = Funciones.dimeEntero("Dime un numero diferente a 0", teclado);
			if(numero!=0) {
				lista.add(numero);
			}
			else if(numero==0){
				x = true;
			}
			
		} while (x==false);
		
		System.out.println("La suma de todos los numeros positivos es: "+suma(lista));
		System.out.println("Hay "+contador(lista)+" numeros negativos.");
		
	}
	
	public static int suma (List<Integer>lista) {
		int suma=0;
		
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i)>0)
				suma = suma + lista.get(i);
			}
		
		return suma;
	}
	
	public static int contador (List<Integer>lista) {
		int numeros = 0;
		
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i)<0)
					numeros++;
			}
		
		return numeros;
	}

}
