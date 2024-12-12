package tema8;
import java.io.*;
import java.util.*;

//Crea un programa que pida al usuario cadenas hasta que el usuario introduzca “fin”, y las guarde en una lista
//fin no lo guardes
//guarda las palabras en la lista con el siguiente formato: pon en mayúscula la primera y última letra de cada palabra
//Muestra la lista por consola
//Pide otra cadena por consola y llama a una función que te devolverá si esa otra cadena está en la lista o no 
//Que no importen mayúsculas o minúsculas


public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		List<String> lista = new ArrayList <String>();
		boolean x = false;
		
		do {
			System.out.println("Escribe lo que quieras");
			System.out.println("Para acabar escribe fin");
			String cadenas = teclado.nextLine().toLowerCase();
			
			String l1 = cadenas.substring(0,1).toUpperCase();
			String l2 = cadenas.substring(1,cadenas.length()-1).toLowerCase();
			String l3 = cadenas.substring(cadenas.length()-1,cadenas.length()).toUpperCase();
			cadenas=l1+l2+l3;
			//System.out.println(l1+" "+l2+" "+l3+" "+cadenas); comprobar que coge bien la palabra
			if(cadenas.equalsIgnoreCase("FiN") )
				x=true;
			else{
				lista.add(cadenas);
			}
			
		} while (x==false);
		
		Funciones.muestraListaS(lista);
		
		System.out.println("\nDime una palabra");
		String palabra = teclado.nextLine();
		
		if (comprobarLista(lista,palabra)==true)
			System.out.println("Esta palabra esta en la lista");
		else
			System.out.println("Esta palabra no esta en la lista");
	}
	
	public static boolean comprobarLista (List<String>lista, String palabra) {
		boolean x = false;
		
			for (int i = 0; i < lista.size(); i++) {
				if(palabra.equalsIgnoreCase(lista.get(i)))
					x = true;
			}
		
		return x;
	}

}
