package package2;

import java.util.Scanner;
//clase Dos que usa el mismo método que la clase Uno pero con Scanner
public class Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//iniciamos el Scanner 
		System.out.println("Introduce dos numeros: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();//cerramos el Scanner
		int suma= num1+num2;
		int resta= num1-num2;
		int multiplicacion=num1*num2;
		double division= (double)num1/(double)num2;
		System.out.printf("La suma es: %d%nLa resta es: %d%nLa multiplicacion es: %d%nLa division es: %.2f%n", suma,resta,multiplicacion,division);
	}

}
