package tema8;
import java.io.*;
import java.util.*;

//Crea un programa en el que vas pidiendo números hasta meter un 0
//Los pares guárdalos en una lista y los impares en otra lista
//El 0 no se guarda
//Si las dos listas tienen el mismo tamaño, crea una tercera lista donde en cada elemento guardarás la suma de los elementos de ambas listas
//Si son de distinto tamaño, crea una tercera lista con los elementos intercalados, cogiendo alternativamente uno de la par y otro de la impar 
//Mostrar las tres listas por consola
//Prueba todas las opciones de entrada
//Ejemplo de salida:
//Listas iguales:
//○ Lista par: 2, 4, 14, 2
//○ Lista impar: 5, 3, 7, 9
//○ Lista resultante: 7, 7, 21, 11
//Lista distintas:
//○ Lista par: 2, 4, 14, 2
//○ Lista impar: 5, 3, 7, 9, 5
//○ Lista resultante: 2, 5, 4, 3, 14, 7, 2, 9, 5


public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		List<Integer> pares = new ArrayList <Integer>();
		List<Integer> impares = new ArrayList <Integer>();
		List<Integer> resultado = new ArrayList <Integer>();
		
		boolean x = false;
		do {
			int numero = Funciones.dimeEntero("Dime un numero entero", teclado);
			if (numero==0) {
				x=true; 
			}
			else if (numero%2!=0)
				impares.add(numero);
			else
				pares.add(numero);
			
		} while (x==false);
		
		if(pares.size()==impares.size()) {
			for (int i = 0; i < pares.size(); i++) {
				int n = pares.get(i) + impares.get(i);
				resultado.add(n);
			}
		}
		
		else if (pares.size()>impares.size()) {
			for (int i = 0; i < impares.size(); i++) {
				int n = pares.get(i);
				int n1 = impares.get(i);
				resultado.add(n);
				resultado.add(n1);
			}
			for (int i = impares.size(); i<pares.size(); i++) {
				resultado.add(pares.get(i));
			}	
		}
		
		else {
			for (int i = 0; i < pares.size(); i++) {
				int n = pares.get(i);
				int n1 = impares.get(i);
				resultado.add(n);
				resultado.add(n1);
			}
			for (int i = pares.size(); i<impares.size(); i++) {
				resultado.add(impares.get(i));
			}
		}
		
		System.out.println("\n");
		Funciones.muestraListaInt(pares);
		Funciones.muestraListaInt(impares);
		Funciones.muestraListaInt(resultado);
		
	}

}
