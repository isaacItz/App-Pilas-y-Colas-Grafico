package modelo;

import javax.swing.JOptionPane;
import static modelox.Utileria.*;

public class Principal {

	private static Character caracter;

	public static void main(String[] args) {

		Pila<Character> pila = new Pila<>();
		Pila<Character> pila2 = new Pila<>();

		String dato = JOptionPane.showInputDialog("Ingrese un Daato");
		dato = dato.replace(" ", "");
		
		for(int i = 0; i< dato.length(); i++) {
			pila.push(dato.charAt(i));
			pila2.push(dato.charAt(dato.length()-(i+1)));
		}

//		char[] letras = dato.toCharArray();
//		String dato2 = new StringBuilder(dato).reverse().toString();
//		char[] letras2 = dato2.toCharArray();
//		for (char c : letras) {
//			pila.push(c);
//		}
//		for (char c : letras2) {
//			pila2.push(c);
//		}

		// entrada.length -(i+1)

		boolean esigual = true;
		while (!pila.estaVacia() && !pila2.estaVacia() && esigual)
			if (pila.pop() != pila2.pop())
				esigual = false;

		String aux = esigual ? "son iguales" : "no son iguales";
		escribir(aux);

		
		
		//			
//		while (!pila.estaVacia())
//			if (!pila.pop().equals(pila2.pop())) {
//				escribir("no son iguales");
//			}

	}

}
