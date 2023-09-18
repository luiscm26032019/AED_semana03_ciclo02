package semana_03;

public class Balon {
	private String marca;
	private double peso, presion, diametro, precio;
	
	private static int cantidad;
	private static double importeTotal;
	
	public static final double PI, factorDescuento;
	
	static {
		PI = 3.1416;
		factorDescuento = 0.05;
		
		cantidad = 0;
		importeTotal = 0;
	}

	// Constructores
	public Balon(String marca, double peso, double presion, double diametro, double precio) {
		this.marca = marca;
		this.peso = peso;
		this.presion = presion;
		this.diametro = diametro;
		this.precio = precio;
		
		cantidad++;
		importeTotal += importePagar();
	}
	
	public Balon (String marca, double peso , double presion) {
		this(marca, peso, presion, 18.5, 100.0);
	}
	
	public Balon() {
		this("Adidas", 1.5, 4.8);
	}
	
	// Get / Set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Balon.cantidad = cantidad;
	}

	public static double getImporteTotal() {
		return importeTotal;
	}

	public static void setImporteTotal(double importeTotal) {
		Balon.importeTotal = importeTotal;
	}
	
	// Métodos
	public double radio() {
		return diametro / 2;
	}
	
	public double volumen() {
		return (4/3) * PI * radio() * radio() * radio();
	}
	
	public double descuento() {
		return precio * factorDescuento;
	}
	
	public double importePagar() {
		return precio - descuento();
	}
}
