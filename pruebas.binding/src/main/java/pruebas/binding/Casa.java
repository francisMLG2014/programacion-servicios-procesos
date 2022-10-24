package pruebas.binding;

public class Casa {
	private String nombre;
	private short aņoFundacion;
	private String ciudadOrigen;
	
	public Casa(String nombre, short aņoFundacion, String ciudadOrigen) {
		super();
		this.nombre = nombre;
		this.aņoFundacion = aņoFundacion;
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getAņoFundacion() {
		return aņoFundacion;
	}

	public void setAņoFundacion(short aņoFundacion) {
		this.aņoFundacion = aņoFundacion;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	
	
}
