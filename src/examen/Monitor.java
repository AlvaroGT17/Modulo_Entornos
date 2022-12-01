package examen;

public class Monitor {
	
	/**
	 * 
	 */
	String marca;
	String modelo;
	int tamaño;
	String tipo;
	
	public Monitor(String marca, String modelo, int tamaño, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}
	
	public Monitor () {
		
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	

}
