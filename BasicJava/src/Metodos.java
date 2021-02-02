import java.util.ArrayList;

public class Metodos {

	/*
	 * Imprimir 1 - 255 Escriba un método que imprima todos los número del 1 al 255.
	 */

	public void numeros() {

		for (int i = 1; i < 256; i++) {
			System.out.printf(i + "-");
		}
		System.out.println(".");

	}

	/*
	 * Imprimir los Números Impares Entre 1 - 255 Escriba un método que imprima
	 * todos los número impares entre el 1 al 255.
	 */

	public void impares() {

		for (int i = 0; i < 256; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

	/*
	 * Imprimir la Suma Escriba un método que imprima los números desde el 0 hasta
	 * el 255, pero esta vez muestre también las suma de los números que ha mostrado
	 * en pantalla hasta ahora. Por ejemplo, su salida debe ser algo como esto:
	 * Nuevo numero: 0 Suma: 0 Nuevo numero: 1 Suma: 1 ... Nuevo numero: 255 Suma:
	 * __ No utilice arreglos para hacer este ejercicio.
	 */

	public void suma() {
		int suma = 0;
		for (int i = 0; i < 256; i++) {
			suma += i;
			System.out.println("Nuevo número:" + i + " Suma " + suma);
		}

	}

	/*
	 * Recorrer un Arreglo Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un
	 * método que recorra cada uno de los elementos del arreglo e imprima cada
	 * valor. Ser capaz de recorrer cada elemento } de un arreglo es extremadamente
	 * importante.
	 */

	public void showarray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		/*
		 * for(int c : arr){ System.out.println(arr[c]); }
		 */

	}

	/*
	 * Encontrar el Máximo Escribir un método que tome un arreglo e imprima el valor
	 * máximo en el arreglo. Su método debería funcionar también con todos los
	 * números en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números
	 * positivos, números negativos y cero.
	 */
	public int max(int[] array) {

		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}

		}

		return max;
	}

	/*
	 * Obtener el Promedio Escribir un método que tome un arreglo e imprima el
	 * promedio de los valores en el arreglo. Por ejemplo en un arreglo hay
	 * [2,10,3], su método debería Imprimir “Promedio de 5”. Nuevamente, asegúrese
	 * de crear un caso simple y escriba las instrucciones para resolver ese caso
	 * primero, luego pruebe sus instrucciones con casos más complicados.
	 */

	public double avgArray(int[] arreglo) {
		double suma = 0;
		for (int i = 0; i < arreglo.length; i++) {

			suma += arreglo[i];

		}

		double avg = suma / arreglo.length;
		return avg;
	}

	/*
	 * Arreglo con Números Impares Escribir un método que cree un arreglo ‘y’ que
	 * contenga todos los números impares entre 1 - 255. Cuando el método haya
	 * terminado, ‘y’ debe tener los valores de [1,3,5,7…255].
	 */

	public ArrayList<Integer> getArray() {
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		for (int i = 1; i < 256; i++) {

			if (i % 2 == 1) {
				newArr.add(i);
			}
		}

		return newArr;
	}

	/*
	 * Mayor que Y Escribir un método que tome un arreglo y devuelva el número de
	 * valores mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y
	 * Y = 3, después de terminar el proceso el método debe Imprimir el número 2 (ya
	 * que hay 2 valores en el arreglo que son mayores que 3).
	 */

	public int compara(int[] arr, int numero) {
		int cuenta = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > numero) {
				cuenta++;
			}
		}

		return cuenta;
	}

	/*
	 * Valores al Cuadrado Dado cualquier arreglo x, digamos [1,5,10,-2], escribir
	 * un método que multiplique cada valor en el arreglo por sí mismo. Cuando el
	 * método haya terminado, el arreglo x debe contener valores que han sido
	 * elevados al cuadrado, digamos [1,25,100,4].
	 */

	public ArrayList<Integer> sqrtArray(int[] arr) {
		ArrayList<Integer> newArray= new ArrayList<Integer>();
		//int[] newArray = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {

			newArray.add(arr[i] * arr[i]);
		}

		return newArray;
	}

	/*
	 * Eliminar Números Negativos Dado un arreglo x, digamos [1,5,10,-2], escribir
	 * un método que reemplace cualquier número negativo por 0. Cuando el método
	 * haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
	 */

	public int[] eliminaNegativos(int[] arr) {

		/*
		 * for (int i: arr) { if (arr[i] <0 ) { arr[i] = 0; } }
		 */

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}

		}
		return arr;
	}

	/*
	 * Mínimo, Máximo y Promedio Dado un arreglo x, digamos [1,5,10,-2], escribir un
	 * método que devuelva un arreglo con el número máximo, el número mínimo y el
	 * valor promedio que hay en el arreglo x. El arreglo devuelto debe contener
	 * solo 3 valores [Max, Min, Prom].
	 */
	
	
	public ArrayList<Object> minMaxAvg(int[] arr) {

		ArrayList<Object> newArray= new ArrayList<Object>();
		
		int min = arr[0];
		int max = arr[0];
		double avg = 0;
		int sum = 0;
		//double[] newArr = new double[3];
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

			sum += arr[i];
		}

		avg = sum / arr.length;
		
		newArray.add(max);
		newArray.add(min);
		newArray.add(avg);

		return newArray;
	}

	/* Cambiando los Valores del Arreglo
	 * Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada 
	 * valor por el valor que sigue. Por ejemplo, cuando el método haya terminado, 
	 * un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. 
	 * Observe que el último número es 0. El método no necesita ajustarse para los valores 
	 * que están fuera de los límites.
	*/
	
	
	public int[] changeValue(int[] arr) {
		
		int[] arrOut = new int[arr.length];
			 
		for (int i = 0 ;i < arr.length;i++) {
			
			 int next = i + 1;
			 
			 if (next < arr.length) {
				 arrOut[i] = arr[next];
			 }
					 
		}
			
		return arrOut;
	}
	
	
	
}
