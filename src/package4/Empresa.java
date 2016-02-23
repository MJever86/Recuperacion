package package4;



//clase Empresa que nos sirve para el manejo de las mismas.
public class Empresa {
	//atributos
	private String NombreEmpresa;
	private String TitularEmpresa;
	private String DniTitularEmpresa;
	private String Direccion;
	private String FechaConstitucion;
	private String CIF;
	
	//constructor
	public Empresa(String nombreEmpresa, String titularEmpresa, String dniTitular, String direccion, String fechaConstitucion){
		this.NombreEmpresa=nombreEmpresa;
		this.TitularEmpresa=titularEmpresa;
		this.DniTitularEmpresa=dniTitular;
		this.Direccion=direccion;
		this.FechaConstitucion=fechaConstitucion;
		
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public String getTitularEmpresa() {
		return TitularEmpresa;
	}

	public void setTitularEmpresa(String titularEmpresa) {
		TitularEmpresa = titularEmpresa;
	}

	public String getDniTitularEmpresa() {
		return DniTitularEmpresa;
	}

	public void setDniTitularEmpresa(String dniTitularEmpresa) {
		DniTitularEmpresa = dniTitularEmpresa;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getFechaConstitucion() {
		return FechaConstitucion;
	}

	public void setFechaConstitucion(String fechaConstitucion) {
		FechaConstitucion = fechaConstitucion;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}
	
}
	





