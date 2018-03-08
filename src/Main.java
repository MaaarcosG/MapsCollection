import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Marcos Gutierrez 	17909
 * @author Raul Monzon 			17014
 * Clase principal del Programa
 */
public class Main {
	public static void main(String[] args) {
		String datos = "";
		MapFactory maps = new MapFactory();
		/*Abrimos el Archivo*/
		try {
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("cards_desc.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			/*Condicion para verificar si esta lleno o no*/
			if ((datos=buffer.readLine()) != null) {
				System.out.println("Archivo abierto correctamente");
			}
			else {
				/*Si esta vacio se manda el mensaje*/
				System.err.println("El .txt esta vacio");
			}
			
			entrada.close(); 	
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
		
		Scanner teclado = new Scanner(System.in);
		/*String tipo = ""; */
		System.out.println("1. HashMap \n2. TreeMap \n3. LinkedMap");
		System.out.println("Escriba el tipo de Map que desea utilizar: ");
		String Cartatipo = teclado.nextLine();
		
		/*Condicion para cada uno de los metodos*/
		if(Cartatipo.equals("HashMap")) {
			System.out.println("-----");
			maps.Escoger(Cartatipo);
			System.out.println("Ingrese el nombre de la carta que desea agregar: ");
			String nombre = teclado.nextLine();
			
		}
	}
}
