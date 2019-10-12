package productos;

public class Perecedero extends Productos{

	//atributos
	private int diasCaducar;

	//constructor
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	//getters and setters
	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	public double calcular(int cantidad) {

		double precioNuevo = super.calcular(cantidad);
		
		if(diasCaducar ==1) {
			
			precioNuevo /=4;
			
        } else if(diasCaducar == 2) {
        	
        	precioNuevo /= 3; 
        	
        } else if (diasCaducar == 3) {
        	
        	precioNuevo /= 2;
        	
        }
         
        return precioNuevo;
	}

	@Override
	public String toString() {
		return super.toString() + "Perecedero [diasCaducar=" + diasCaducar + "]";
	}
	
	
	
	
}
