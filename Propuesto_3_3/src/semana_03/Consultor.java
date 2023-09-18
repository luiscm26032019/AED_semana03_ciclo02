package semana_03;

public class Consultor {
	private int codigo, horasTrabajadas;
	private String nombre;
	private double tarifa;
	
	private static int cantidad;
	private static double suma;
	
	public static final double AFP;
	public static final double EPS;
	
	static {
		cantidad = 0;
		suma = 0;
		
		AFP = 0.10;
		EPS = 0.05;
	}

	// Constructores
	public Consultor(int codigo, int horasTrabajadas, String nombre, double tarifa) {
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.nombre = nombre;
		this.tarifa = tarifa;
		
		cantidad++;
		suma += sueldoNeto();
	}
	
	public Consultor(int codigo, int horasTrabajadas, String nombre) {
		this(codigo, horasTrabajadas, nombre, 65.0);
	}
	
	public Consultor() {
		this(333, 30, "Juan");
	}
	
	// Get / Set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Consultor.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Consultor.suma = suma;
	}
	
	// Métodos
	public double sueldoBruto() {
		return horasTrabajadas * tarifa;
	}
	public double descuentoAFP() {
		return sueldoBruto() * AFP;
	}
	public double descuentoEPS() {
		return sueldoBruto() * EPS;
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
	
}
