package tema8;
import java.io.*;
import java.util.*;

//Rellena una lista con 20 números aleatorios del 1 al 50 y muéstrala por consola en la misma línea separados por comas
//Luego haz un bucle en el que vas pidiendo números por consola hasta que metan un -1:
//si el número que introduce el usuario está en la lista que diga “Número repetido” y no haga nada (usa el método contains de la lista)
//si no está en la lista que lo añada al final 
//el -1 no lo guardes en la lista
//Al final muestra todos los números de la lista separados por comas, sin mostrar la coma final


public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		Random r = new Random();
		List<Integer> lista= new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			lista.add(r.nextInt(1,51));
		}
		
		boolean x = false;
		do {
			int numero = Funciones.dimeEntero("Dime un numero\nPara finalizar escribe -1", teclado);
			for (int i = 0; i < args.length; i++) {
				
			}
			if(numero==-1)
				x = true;
			else if(lista.contains(numero))
				System.out.println("Numero repetido");
			else
				lista.add(numero);
			
		} while (x==false);
		
		Funciones.muestraListaInt(lista);
		
	}

}
