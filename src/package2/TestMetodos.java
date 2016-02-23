package package2;

import javax.swing.JOptionPane;

//clase TestMetodos con el que comprobaremos el funcionamiento de la clase Metodos
public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//elegimos dos numero comprendidos entre el 1 y 10
		//int num1=5;
		//int num2=4;
		//Solicitamos los dos numeros con JOptionPane
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero"));
		System.out.printf("La suma es: %d%nLa resta es: %d%nLa multiplicacion es: %d%nLa division es: %.2f%n", Metodos.suma(num1,num2),Metodos.resta(num1,num2),Metodos.multiplicacion(num1,num2),Metodos.division(num1,num2));

	}

}
