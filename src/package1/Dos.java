package package1;

/**
 * 
 * @author Maria Jose
 *
 */
//clase Dos.java en el formatearemos la salida usando printf.
//programa similar a Uno.java
public class Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i <=20; i++){
			int numAleatorio=(int)Math.floor(Math.random()*1000);
			if (numAleatorio%2!=0){
				System.out.printf("%s %d %s %d%n","número",i,"obtenido: ",numAleatorio);
				}else{
					i--;
				}
			}	
		}


}
