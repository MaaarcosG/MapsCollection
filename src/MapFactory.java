import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Marcos Gutierrez 	17909
 * @author Raul Monzon 			17014
 * Esta clase, se hara la implementacion de cada uno de los 
 * metodos de los map. 	
 */
public class MapFactory {
	/*Atributo de la clase*/
	private static Map<String, Integer> coleccionCartas;
	private static Map<Integer, String> cartasMap;
	private ArrayList<Cartas> cartasList;
	private ArrayList<Cartas> collection;
	
	
	/**
	 * @param tipo
	 * Metodo que asigna valor al atributo cartasMap
	 */
	public void Escoger(String tipo) {
		/*Escoge el cualquier metodo*/
		cartasMap = Factory.getMap(tipo);
		coleccionCartas = Factory.getMap(tipo);
	}
	
	public static void agregarCartasColeccion(String nombreCarta) {
		/*Condicion para agregar cartas dentro de la coleccion*/
		if(coleccionCartas.containsKey(nombreCarta)) { /*Busca en la coleccion si no esta todavia*/
			Integer agregar = coleccionCartas.get(nombreCarta);
			coleccionCartas.replace(nombreCarta, (agregar + 1)); //Se agrega a la coleccion
			
		} else {
			coleccionCartas.put(nombreCarta, 1);
			Map<String, String> map; /*Actualizamos las cartas*/
		}
	}
	
}

