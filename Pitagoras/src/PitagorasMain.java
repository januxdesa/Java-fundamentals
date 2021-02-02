
public class PitagorasMain {
	public static void main(String[] args) {
		int catetoA = 3;
		int catetoB = 4;
        Pitagoras pitagoras = new Pitagoras();
        double resultado = pitagoras.calcularHipotenusa(catetoA,catetoB);
        System.out.println("La hipotenusa es " + resultado);  
    }
}
