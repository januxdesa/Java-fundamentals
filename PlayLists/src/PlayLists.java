import java.util.HashMap;
import java.util.Set;

public class PlayLists {

	HashMap<String, String> userMap = new HashMap<String, String>();

	public void agregar(String NombreCancion, String Lirica) {
	
		this.userMap.put(NombreCancion, Lirica);

	}

	public String extraer(String cancion) {

		String lirica = this.userMap.get(cancion);

		return lirica;
	}

	public void mostrarLista() {

		Set<String> lyrics = userMap.keySet();
		
		for (String track : lyrics) {
			System.out.println(track);
		}

	}

	public void mostrarTodo() {

		Set<String> lyrics = userMap.keySet();
	
		for (String track : lyrics) {
			System.out.println("*********************************" );
			System.out.println(track);
			System.out.println(userMap.get(track)); 
			System.out.println("*********************************" );
		
		}

	}

}
