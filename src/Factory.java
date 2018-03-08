import java.util.AbstractMap;
/*import java.util.LinkedHashSet;*/
import java.util.HashMap;
/*import java.util.HashSet;*/
import java.util.LinkedHashMap;
/*import java.util.TreeSet;*/
import java.util.TreeMap;

/**
 * @author Marcos Gutierrez 	17909
 * @author Raul Monzon 			17014
 * Esta clase, contendra los tres tipos de Map, que seran utilizados
 * HashMap, TreeMap, LinkedMap
 */
public class Factory {
	/**
	 * @param tipo, es el tipo de coleccion que el usuario escoga
	 * @return Devuelve un set, que es llenando cada uno de los Map
	 */
	public static <K,V> AbstractMap<K,V> getMap(String tipo){
		/*Condicion que sirve para saber que tipo de Map, que el usuario escoga*/
		if(tipo.equalsIgnoreCase("HashMap")) { //Si es igual a HashMap
			return new HashMap<K,V>();
			
		} else if(tipo.equalsIgnoreCase("TreeMap")) { //Si es igual a TreeSet
			return new TreeMap<K,V>();
			
		} else if (tipo.equalsIgnoreCase("LinkedMap")) { //Si es igual a LinkedMap
			return new LinkedHashMap<K,V>();
		}
		return null;
	}
}
