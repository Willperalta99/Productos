package productos;

public class Productos {
	
	//atributos
	private String nombre;
	private double precio;
	
	//cosntructor
	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodo calcular en donde se multiplica el precio del producto por la cantidad pasada
	public double calcular(int cantidad) {
		return precio * cantidad;
	}

	
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	

}
