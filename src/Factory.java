import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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
	public static <E> Set<E> getSet(String tipo){
		/*Condicion que sirve para saber que tipo de Map, que el usuario escoga*/
		if(tipo.equalsIgnoreCase("HashMap")) { //Si es igual a HashMap
			return new HashSet<E>();
			
		} else if(tipo.equalsIgnoreCase("TreeMap")) { //Si es igual a TreeSet
			return new TreeSet<E>();
			
		} else if (tipo.equalsIgnoreCase("LinkedMap")) { //Si es igual a LinkedMap
			return new LinkedHashSet<E>();
		}
		return null;
	}
}
