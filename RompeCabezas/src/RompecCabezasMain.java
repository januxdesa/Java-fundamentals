import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RompecCabezasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PuzzleJava arreglo = new PuzzleJava();

		// imprime Suma
		int resultado = arreglo.imprimeSuma();
		System.out.println("La suma del arreglo es : " + resultado);

		// Mayor a 10
		ArrayList<Integer> outArr = arreglo.imprimeMayores();
		System.out.println("Los números mayores a 10 : " + outArr);

		// Arreglo
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Nancy");
		arr.add("Jinichi");
		arr.add("Fujibayashi");
		arr.add("Momochi");
		arr.add("Ishikawa");

		// Mezcla el arreglo
		ArrayList<String> outStrArr = arreglo.mezclar(arr);
		System.out.println(outStrArr);

		// Imprime nombres de largo mayor a 5
		ArrayList<String> nombres = arreglo.largos(arr);
		System.out.println(nombres);

		// Genera el alfabeto en un array
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto = arreglo.alfabeto();
		System.out.println(alfabeto);

		// mezcla alfabeto
		ArrayList<String> alfabetoMezclado = new ArrayList<String>();
		alfabetoMezclado = arreglo.mezclaAlfabeto(alfabeto);
		System.out.println(alfabetoMezclado);

		// Última letra del alfabetoMezclado
		String ultimaLetra = arreglo.ultimaLetra(alfabetoMezclado);
		System.out.println(ultimaLetra);

		// Si es vocal arroja un mensaje
		String esVocal = arreglo.mensaje(alfabetoMezclado);
		System.out.println(esVocal);

		// Numeros aleatorios
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
		numerosAleatorios = arreglo.arregloNumerosAleatorios();
		System.out.println(numerosAleatorios);

		// ordenados
		ArrayList<Integer> numerosOrdenados = new ArrayList<Integer>();
		numerosOrdenados = arreglo.arregloNumerosAleatoriosOrdenados(numerosAleatorios);
		System.out.println(numerosOrdenados);

		// Mínimo
		int minimo = arreglo.arregloNumerosAleatoriosMin(numerosOrdenados);
		System.out.println(minimo);

		// Máximo
		int maximo = arreglo.arregloNumerosAleatoriosMax(numerosOrdenados);
		System.out.println(maximo);

		// Cadena Aleatoria
		String cadena = arreglo.cadenaAleatoria(alfabeto);
		System.out.println(cadena);

		// Cadena Aleatoria 10
		ArrayList<Object> nuevacadena = new ArrayList<Object>();
		nuevacadena = arreglo.cadenaAleatoria10(alfabeto);
		System.out.println(nuevacadena);
	}

}
