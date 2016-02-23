package package1;

/**
 * 
 * @author Maria Jose
 *
 */

//clase Uno.java en el que usando main imprimiremos impares aleatorios del 1 al 1000
public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("20 Números entre 1 y 1000 aleatorios: "); //imprimimos 20 numeros entre 1 y 1000
		for (int i=1; i <20; i++){ 
			//usamos el metodo math.random para mostrarlos de forma aleatoria
			int numAleatorio=(int)Math.floor(Math.random()*1000);
			if (numAleatorio%2!=0){//el numero aleatorio par se descartará
				System.out.println(numAleatorio);
				}else{
					i--;
				}
			}	
		}
	}



