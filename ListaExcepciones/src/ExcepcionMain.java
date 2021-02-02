import java.util.ArrayList;

public class ExcepcionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			ArrayList<Object> myList = new ArrayList<Object>();
			
			myList.add("13");
			myList.add("Hola Mundo");
			myList.add(48);
			myList.add("Adios Mundo");

			System.out.println(myList);
			
			
			for (int i = 0; i < myList.size(); i++) {
				//int castedValue =  (int) myList.get(i).toString();
				//System.out.println(castedValue);
				try {
				int castedValue = (int) myList.get(i);
				
				System.out.println("Index : " + i);
				System.out.println("Valor : " + myList.get(i));
				
				
				}
				catch (ClassCastException e) {
					
					System.out.println("Index : " + i);
					System.out.println("Valor : " + myList.get(i));
					
					System.out.println("Mensaje ClassCast: " + e.getMessage());
						
				} catch (Exception e) {
					

					System.out.println("Index : " + i);
					System.out.println("Valor : " + myList.get(i));
					
					System.out.println("Mensaje Exception: " + e.getMessage());
						
				}
			

				
			}
			
		
		
	}

}