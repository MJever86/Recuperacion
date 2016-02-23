package package2;



/**
 * 
 * @author Maria Jose
 *
 */

//clase Uno.java en el que haremos la suma, resta, division y multiplicacion de dos numeros.

public class Uno {
	public static void main(String[] args) {
		int numero1=Integer.parseInt(args[0]);
        int numero2=Integer.parseInt(args[1]);
        int suma= numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        double division=(double)numero1/(double)numero2;
        
        System.out.printf("Suma: %d Resta: %d Multiplicacion: %d Division: %.2f%n",suma,resta,multiplicacion,division);
        
        //comprobamos que los numeros estan entre el 1 y 10 y en caso contrario mostrar con un JoptionPane
        //que no son validos y terminar el programa
              	               
	}

	
	
}
