package tema8;
import java.io.*;
import java.util.*;

//Crea una función a la que le pasas un número entero, y te devuelve una lista con los divisores de ese número 
//(la lista que no incluya al 1 ni el mismo número)
//En el main ve pidiendo números hasta que el que introduzcas sea primo
//De los que no son primos debe mostrar sus divisores, del primo nada
//Para saber si es primo usa esa función que has hecho antes, mira qué devolverá si es primo

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int entero = Funciones.dimeEntero("Dime un numero entero", teclado);
		
		Funciones.muestraListaInt(divisores(entero));
		
		System.out.println("\n");
		
		boolean x = false;
		do {
			int contador=0;
			int primo = Funciones.dimeEntero("Dime un numero primo", teclado);
			for (int i =2; i < primo ; i++) {
				if (primo%i==0)
					contador++;
			}
			if(contador==0)
				x=true;
			else {
				System.out.println("No es un numero primo");
				System.out.print("Estos son sus divisores: ");
				Funciones.muestraListaInt(divisores(primo));
				System.out.println("\n"); }
		} while (x == false);
	}
	
	public static List<Integer> divisores(int entero){
		List<Integer>divisores = new ArrayList <Integer>();
		for (int i = 2; i < entero; i++) {
			if (entero%i==0)
				divisores.add(i);
		}
		return divisores;
	}
	
}
