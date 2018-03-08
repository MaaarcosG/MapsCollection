/**
 * @author Marcos Gutierrez 	17909
 * @author Raul Monzon 			17014
 * Esta clase, tendra los atributos de las cartas 	
 */
public class Cartas {
	/*Atributos de la clase*/
	private String cartas;
	private String coleccion;
	private int  cantidad;
	
	/*Constructor de la clase*/
	public Cartas(String cartas, String coleccion, int cantidad) {
		this.setCartas(cartas);
		this.setColeccion(coleccion);
		this.setCantidad(cantidad);
	}

	/**
	 * @return the cartas
	 */
	public String getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the cartas to set
	 */
	public void setCartas(String cartas) {
		this.cartas = cartas;
	}

	/**
	 * @return the coleccion
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
