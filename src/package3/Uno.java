package package3;

import javax.swing.JOptionPane;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int numero;
		//int contador=0;
		frase=JOptionPane.showInputDialog("Inserta una frase");
		numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
		
		/*for (int i =0; i<frase.length();i++){
			if (frase.trim().charAt(i)==' ')
			contador++;
		if (frase.length()==0)
			contador=0;
		}
		*/
		char c1=frase.charAt(numero);
		System.out.println("El caracter se corresponde a la letra: "+c1);
		//System.out.println("El caracter es un espacio en blanco");
		
	}

}
