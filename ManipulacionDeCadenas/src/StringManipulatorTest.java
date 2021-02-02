
public class StringManipulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulator manipulator = new StringManipulator();
		
		//trimAndConcat
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMundo 
		
		//getIndexOrNull
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		
		//getIndexOrNull
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		a = manipulator.getIndexOrNull(word, subString);
		b = manipulator.getIndexOrNull(word, notSubString);
		
		System.out.println(a); // 2
		System.out.println(b); // -1
		
		//ConcatSubstring
		
		word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		
		System.out.println(word); // olmundo
	}

}