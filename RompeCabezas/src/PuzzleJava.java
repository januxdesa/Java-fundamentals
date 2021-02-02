import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public int[] arreglo = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };

	Random r = new Random();

	/*
	 * Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir
	 * la suma de todos los números en el arreglo. El método también debe retornar
	 * un arreglo que incluya solo los números que son mayores a 10 (Por ejemplo
	 * cuando envía el arreglo anterior, debe retornar un arreglo con los valores de
	 * 13,25,32).
	 */

	public int imprimeSuma() {

		int[] arr = this.arreglo;
		int suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma += arr[i];
		}
		return suma;
	}

	public ArrayList<Integer> imprimeMayores() {

		ArrayList<Integer> newArr = new ArrayList<Integer>();

		int[] arr = this.arreglo;

		int mayor = 10;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mayor) {
				newArr.add(arr[i]);
			}
		}

		return newArr;
	}

	public ArrayList<String> mezclar(ArrayList<String> nombres) {

		Collections.shuffle(nombres);

		return nombres;
	}

	public ArrayList<String> largos(ArrayList<String> nombres) {
		int largo = 0;
		ArrayList<String> outArr = new ArrayList<String>();

		for (int i = 0; i < nombres.size(); i++) {

			largo = nombres.get(i).length();

			if (largo > 5) {
				outArr.add(nombres.get(i));
			}
		}

		return outArr;
	}

	public ArrayList<String> alfabeto() {

		ArrayList<String> alfa = new ArrayList<String>();
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			alfa.add(String.valueOf(letra));
		}

		return alfa;
	}

	public ArrayList<String> mezclaAlfabeto(ArrayList<String> arr) {

		ArrayList<String> newAlfabeto = new ArrayList<String>();

		Collections.shuffle(arr);
		newAlfabeto = arr;

		return newAlfabeto;

	}

	public String ultimaLetra(ArrayList<String> arr) {

		String out = arr.get(25);

		return out;
	}

	public String mensaje(ArrayList<String> arr) {

		String letra = arr.get(0).toString();
		// System.out.println(letra);
		if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {

			// System.out.println("Es una Vocal" + letra);
			return "Es la vocal " + letra;
		}
		// msg = letra;
		return "";
	}

	public ArrayList<Integer> numerosAleatorios() {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			// (max - min) + 1) + min
			int num = r.nextInt((100 - 55) + 1) + 55;
			numeros.add(num);
		}

		return numeros;
	}

	/*
	 * Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y
	 * hacer que estén ordenados (mostrar el número más pequeño en el principio del
	 * arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor
	 * mínimo del arreglo, así como el valor máximo.
	 */

	public ArrayList<Integer> arregloNumerosAleatorios() {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			// (max - min) + 1) + min
			int num = r.nextInt((100 - 55) + 1) + 55;
			numeros.add(num);
		}

		return numeros;

	}

	public ArrayList<Integer> arregloNumerosAleatoriosOrdenados(ArrayList<Integer> numeros) {

		Collections.sort(numeros);

		return numeros;
	}

	public int arregloNumerosAleatoriosMin(ArrayList<Integer> numeros) {

		int min = Collections.min(numeros);

		return min;
	}

	public int arregloNumerosAleatoriosMax(ArrayList<Integer> numeros) {

		int max = Collections.max(numeros);

		return max;
	}

	/* Crear una cadena aleatoria con 5 caracteres de longitud. */

	public String cadenaAleatoria(ArrayList<String> alfabeto) {

		String cadena = "";

		for (int i = 0; i < 5; i++) {
			// random 0 a 25
			int num = r.nextInt(26);
			cadena += alfabeto.get(num);
		}

		return cadena;
	}

	/*
	 * Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de
	 * longitud.
	 */

	public ArrayList<Object> cadenaAleatoria10(ArrayList<String> alfabeto) {
		ArrayList<Object> arregloObjeto = new ArrayList<Object>();
		String cadenaOut = "";
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5; i++) {
				// (max - min) + 1) + min
				int num = r.nextInt(26);
				cadenaOut += alfabeto.get(num);
			}

			arregloObjeto.add(cadenaOut);
			cadenaOut = "";
		}

		return arregloObjeto;
	}

}
