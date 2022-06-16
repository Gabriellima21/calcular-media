package calcularMedia;

public class Media {

	public static void main(String[] args) {
		
	float notas[] = {5,7,4,9};
	
	float media = 0;
	for (float i = 0; i<notas.length; i++) {
		media += notas[1];
	}
	float mediaFinal = media / notas.length;

	System.out.println("A média é de: "+ mediaFinal);
	}

}
