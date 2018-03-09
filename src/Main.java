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
		
		boolean correcto =false;
		/*Condicion para cada uno de los metodos*/
		if(Cartatipo.equals("HashMap")) {
			System.out.println("-----");
			maps.Escoger(Cartatipo);
			correcto = true;
			
		}
		else {
			if(Cartatipo.equals("TreeMap")) {
				System.out.println("-----");
				maps.Escoger(Cartatipo);
				correcto = true;
				
			}
			else {
				if(Cartatipo.equals("LinkedMap")) {
					System.out.println("-----");
					maps.Escoger(Cartatipo);
					correcto = true;
				}
				else {
					System.out.println("Debe escribir el nombre correctamente, gracias");
				}
			}
		}
		while (correcto){
			System.out.println("¿Qué operación desea realizar? "
					+ "\n 1. Agregar carta \n 2. Indicar tipo \n 3. Mostrar el nombre, tipo y cantidad"
					+ "\n 4. Mostrar el nombre, tipo y cantidad ordenadas por tipo\n"
					+ " 5. Mostrar el nombre y tipo de cartas existentes "
					+ "\n 6. Mostrar el nombre y tipo de cartas existentes, ordenadas por tipo"
					+ "\nIngrese el número de la operación deseada");
			String operacion = teclado.nextLine();
			if (operacion.equals("1")) {
				//System.out.println("Ingrese el nombre de la carta que desea agregar: ");
				//String nombre = teclado.nextLine();
				//maps.cartasEnArray();
			}
			System.out.println("¿Desea continuar? escriba si o no.");
			String continuar = teclado.nextLine();
			if (continuar.equals("no")) {
				correcto=false;
			}
		}
		System.out.println("Feliz Día");
	}
}
