import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Metodos metodo = new Metodos();
		
		metodo.numeros();
		
		
		metodo.impares();
		
		metodo.suma();
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		metodo.showarray(array);
		
		int[] arreglo = {-9,9,2,1,0,-3,5};
		int max = metodo.max(arreglo);
		System.out.println("El máximo número del arreglo es " + max);
		
		Metodos promedio = new Metodos();
		int[] arreglo2 = {7,7,6,7};
		double avg = promedio.avgArray(arreglo2); 
		System.out.println(avg);
		
		Metodos getarr = new Metodos();
		ArrayList<Integer> arr = getarr.getArray();
		System.out.println(arr.toString());
		
		Metodos com = new Metodos();
		int[] arrcomp = {1,2,3,4,5};
		int numero = 3;
		int resultado = com.compara(arrcomp, numero);
		System.out.printf("La Cantidad de números mayores es %d ",resultado);
		
		Metodos cuadradoArr = new Metodos();
		int[] inArr = { 1,2,3,4 };
		ArrayList<Integer> outArr; 
		outArr = cuadradoArr.sqrtArray(inArr);
		System.out.println(outArr);
		
		Metodos ele = new Metodos();
		int[] nuevoArr = { 1,5,10,-2 };
		nuevoArr = ele.eliminaNegativos(nuevoArr);
		System.out.println(Arrays.toString(nuevoArr));
		
		Metodos minmaxpromedio = new Metodos();
		int[] inArr2 = { -4,1,2,3,4 };
		ArrayList<Object> outArr2;
		outArr2 = minmaxpromedio.minMaxAvg(inArr2);
		System.out.println(outArr2.toString());
		
		Metodos cambiar = new Metodos();
		int[] inArr3 = { 1,5,10,7,-2 };
		int[] outArr3 = cambiar.changeValue(inArr3);
		System.out.println(Arrays.toString(outArr3));
		
	}

}
