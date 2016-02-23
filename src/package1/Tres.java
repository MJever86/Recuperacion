package package1;

/**
 * 
 * @author Maria Jose
 *
 */
//Clase Tres.java donde imprimiremos la raiz cuadrada de los primeros 10 numeros impares
public class Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		double raiz;
		while (i<=10){//usamos el bucle while para mostrar los numeros menos de 10
			raiz=Math.sqrt(i);//con math.sqrt mostraremos la raiz cuadrada
			if (i%2!=0){
				System.out.printf("%s %d %s %.2f%n","numero",i,"raiz cuadrada ",raiz);
				}
					i++;
				}
		}
	}
	


