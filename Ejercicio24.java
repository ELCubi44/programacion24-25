package tema8;
import java.io.*;
import java.util.*;

//Crea un programa en el que rellenas un array de 20 números aleatorios, entre 0 a 100
//Llama a una función que te devolverá una lista con los números pares de ese array
//Recibe el array y devuelve una lista
//Muestra el array y la lista, mostrando en ambos sus números separados por comas sin mostrar la última coma
//
//Ejemplo salida:
//100, 55, 48, 90, 23, 97, 25, 38, 45, 36, 16, 22, 6, 29, 64, 22, 17, 24, 87, 19
//100, 48, 90, 38, 36, 16, 22, 6, 64, 22, 24


public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		Random r = new Random();
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(0,101);
		}
		
		Funciones.muestraArray(array);
		Funciones.muestraListaInt(numerosPares(lista,array));
		
	}
	
	public static List<Integer> numerosPares (List<Integer>lista,int array[]) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0)
				lista.add(array[i]);
		}
		
		return lista;
	}

}
