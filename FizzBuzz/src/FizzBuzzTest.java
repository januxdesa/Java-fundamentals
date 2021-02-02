
public class FizzBuzzTest {

	public static void main(String[] args) {
		int number[] = { 1,2,3,5,45,9,6 };
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		for (int i = 0; i < 7; i++) {
			String resultado = fizzbuzz.fizzBuzz(number[i]);
			System.out.println(resultado);
		}
		
	}

}
