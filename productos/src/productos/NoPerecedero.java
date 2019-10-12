package productos;

public class NoPerecedero extends Productos{
	
	//atributos
	private String tipo;

	//constructor
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	//getters and setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "NoPerecedero [tipo=" + tipo + "]";
	}
	
	
	

}
