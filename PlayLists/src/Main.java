import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayLists trackList = new PlayLists();
		trackList.agregar("Bliss", "Lyrics: " +"Everything about you is how I'd wanna be\r\n"
				+ "Your freedom comes naturally\r\n"
				+ "Everything about you resonates happiness\r\n"
				+ "Now I won't settle for less\r\n"
				+ "\r\n"
				+ "Give me all the peace and joy in your mind\r\n"
				+ "\r\n"
				+ "Everything about you pains my envying\r\n"
				+ "Your soul can't hate anything\r\n"
				+ "Everything about you is so easy to love\r\n"
				+ "They're watching you from above\r\n"
				+ "Give me the peace and joy in your mind");
		trackList.agregar("New Born",
				"Lyrics: " + "Link it to the world\r\n" + "Link it to yourself\r\n"
				+ "Stretch it like a birth squeeze\r\n" + "The love for what you hide\r\n"
				+ "The bitterness inside\r\n" + "Is growing like the new born\r\n"
				+ "When you've seen, seen\r\n" + "Too much too young, young\r\n" + "Soulless is everywhere");

		trackList.agregar("Absolution",
				"Lyrics: " + "Ever since you were born you've been dying\r\n"
				+ "Every day a little more you've been dying\r\n" + "Dying to reach the setting sun\r\n"
				+ "\r\n" + "As a child, with your mind on the horizon\r\n"
				+ "Over corpses, to the prize you kept your eyes on\r\n" + "Trying to be the chosen one\r\n"
				+ "\r\n" + "All those things that you desire\r\n" + "You will find here in the fire");

		trackList.agregar("Hiper Music",
				"Lyrics: " + "Your golden lies feed my role\r\n"
						+ "In this forgotten space race under my control\r\n"
						+ "\r\n" + "Who's returned from the dead?\r\n"
						+ "Who remains?\r\n"+ "(Just to spit it in your face)\r\n"
						+ "\r\n"
						+ "You know that I don't want you and I never did\r\n"
						+ "I don't want you and I never will\r\n"
						+ "\r\n"
						+ "You wanted more than I was worth\r\n"
						+ "And you think I was scared, yeah\r\n"
						+ "And you needed proof\r\n");
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		boolean loop = true;
		String busqueda = "";
		do {
			System.out.println("----------------------------------------------------------");
			System.out.println("Grupo Musical Muse");
			System.out.println("Ingrese el nombre de la canción para mostrar su lírica : ");
			trackList.mostrarLista();
			System.out.println("Ingrese la palabra \"todo\" para imprimir en pantalla.");
			
			

			 busqueda = sc.nextLine();
			
			 System.out.println(busqueda);
			if (busqueda.equals("salir")) {
				loop = false;
			} else if (busqueda.equals("todo")) {
				trackList.mostrarTodo();
			} else {
				// Extrae lírica de la canción
				String lyrics = trackList.extraer(busqueda);
				System.out.println(lyrics);
			}

		} while (loop != false);
		sc.close();
	}

}
