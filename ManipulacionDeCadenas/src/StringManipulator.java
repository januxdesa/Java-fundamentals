
public class StringManipulator {

	public String trimAndConcat(String palabra1, String palabra2) {
		
		palabra1 = palabra1.trim();
		palabra2 = palabra2.trim();
		return palabra1.concat(palabra2);
		
	}
	
	public int getIndexOrNull(String palabra, char letra) {
		
		int indice =  palabra.indexOf(letra);
		
		return indice;
	}
	
	public int getIndexOrNull(String palabra1, String palabra2) {
		
		int indice = palabra1.indexOf(palabra2);
		
		return indice;
	}
	
	public String concatSubstring(String palabra1, int inicio, int fin, String palabra2) {
		
		
		String word = palabra1.substring(inicio, fin);
		word = word.concat(palabra2);
		
		return word;
	}
}
