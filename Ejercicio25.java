package tema8;
import java.io.*;
import java.util.*;

//Crea un programa que rellene una lista con números enteros aleatorios entre el -20 y el 20. Cuando el número sea 0 deja de añadir números.
//Muestra todos los números de la lista separados por comas, sin mostrar la coma final
//Borra de la lista los números que estén entre el -10 y el 10 (usa el iterator para ir borrando conforme lees la lista)
//Después de borrar vuelve a mostrar los números de la lista separados por comas


public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		List<Integer> lista = new ArrayList <Integer>();
		
		Random r = new Random();
		boolean x = false;
		
		do {
			int numero = r.nextInt(-20,21);
			if (numero==0)
				x=true;
			else
				lista.add(numero);
		} while (x==false);
		
		Funciones.muestraListaInt(lista);
		
		Iterator<Integer> iterator = lista.iterator();
		
		while (iterator.hasNext()) {
			int numero = iterator.next();
			if (numero >= -10 && numero<= 10)
				iterator.remove();
		}

		System.out.println("\n\n");
		Funciones.muestraListaInt(lista);
		
	}

}
