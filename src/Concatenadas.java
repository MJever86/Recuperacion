import java.util.Scanner;

//clase que solicite dos palabras mediante Scanner
public class Concatenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce dos palabras");
		String palabra1=sc.next();
		String palabra2=sc.next();
		//nos muestra el resultado de las dos palabras solicitadas concatenadas
		System.out.printf("concatenadas: "+palabra1+palabra2);
		
	}

}
