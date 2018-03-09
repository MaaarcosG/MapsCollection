import java.io.BufferedReader;
import java.io.FileReader;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;


/**
 * @author Marcos Gutierrez 	17909
 * @author Raul Monzon 			17014
 * Esta clase, se hara la implementacion de cada uno de los 
 * metodos de los map. 	
 */
public class MapFactory {
	/*Atributo de la clase*/
	private  AbstractMap<String, Cartas> cartasMap;
	private  AbstractMap<String, Cartas> coleccionCartas;

	
	/**
	 * @param tipo
	 * Metodo que asigna valor al atributo cartasMap
	 */
	public void Escoger(String Cartatipo) {
		/*Escoge el cualquier metodo*/
		cartasMap = Factory.getMap(Cartatipo);
		coleccionCartas = Factory.getMap(Cartatipo);
	}
	/**
	 * @param cartasColeccions, atributo que tiene los nombre de cada uno de los tipos de carta
	 * @throws Exception, si no se logra hacer manda un error
	 */
	@SuppressWarnings("null")
	public void agregarCartas(String cartasColeccions) throws Exception {
		/*Leemos el archivo de texto*/
		try {
			BufferedReader datos = new BufferedReader(new FileReader(cartasColeccions));
			String expresion = "";
			while((expresion = datos.readLine()) != null) {
				String[] coleccionCartas = null;
				/*Condicion para verificar si cumple un tipo de carta*/
				if(coleccionCartas[1].equals("trampa") || coleccionCartas[1].equals("montruos") || coleccionCartas[1].equals("hechizo")) {
					/*Lo agrega al atributo que se encuentra en la clase Cartas*/
					Cartas carta = new Cartas(coleccionCartas[0], coleccionCartas[1],0);
					/*Lo ingresamos en la coleccion, y inmediatamente se actualiza*/
					cartasMap.put(carta.getCartas(), carta);
				} else {
					throw new IllegalStateException("La carta tipo" + coleccionCartas[1] +"no existe");
				}
			}
			datos.close();
		} catch(Exception e) {
			//LogException(e);
			throw new IllegalStateException("El archivo de clase esta dañado");
			//throw e;
		}
	}
	/**
	 * Metodo que agrega a la coleccion
	 * @param nombre
	 */
	public void agregarAColeccion(String nombre) {
		/*Condicion para ver si ya esta en la coleccion el tipo de carta*/
		if(cartasMap.containsKey(nombre) && coleccionCartas.containsKey(nombre)) {
			/*A la clase Cartas, le removemos el nombre, lo sobreescribimos*/
			Cartas carta = coleccionCartas.remove(nombre);
			carta.setCantidad(carta.getCantidad() + 1);
			/*Lo agregamos a la coleccion de cartas*/
			coleccionCartas.put(carta.getCartas(), carta);
		} else {
			/*Si no es igual, dejamos la coleccion como estaba*/
			coleccionCartas.put(cartasMap.get(nombre).getCartas(), cartasMap.get(nombre));
		}
	}

	/**
	 * @param nombre
	 * @return devuelve el nombre de la carta que este en la coleccion
	 */
	public Cartas buscarTipo(String nombre) {
		if(cartasMap.containsKey(nombre)) {
			return cartasMap.get(nombre);
		}
		throw new IllegalStateException("LA CARTA QUE DESEA ENCONTRAR NO ESTA");
	}
	
	
}

