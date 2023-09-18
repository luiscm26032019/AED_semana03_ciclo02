package semana_03;

public class Asesor {
	private int dni, codigo;
	private String nombre;
	private double remuneracion;
	
	private static int cantidad;
	private static double suma;
	
	public static final String institucion;
	
	static {
		cantidad = 0;
		suma = 0;
		institucion = "De las Casas";
	}

	// Constructores
	public Asesor(int dni, int codigo, String nombre, double remuneracion) {
		this.dni = dni;
		this.codigo = codigo;
		this.nombre = nombre;
		this.remuneracion = remuneracion;
		cantidad++;
		suma += remuneracion;
	}
	
	public Asesor(int dni, String nombre) {
		this(dni, 55555 , nombre , 2000.0);
	}
	
	public Asesor() {
		this(88888888, "NN");
	}

	// Get / Set
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Asesor.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Asesor.suma = suma;
	}
	
}
