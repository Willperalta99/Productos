package productos;

public class EjecutableProducto {

	public static void main(String[] args) {
		
		//Variable para el total de productos
		double totalPrecio=0;
		
		//Creamos el array de los productos
        Productos[] productos = new Productos[3];
         
        //Creamos los productos segun las clases
        productos[0] = new Productos("Gel para el cabello", 18);
        productos[1] = new Perecedero("Shampu", 35, 3);
        productos[2] = new NoPerecedero("producto 3", 5, "1");
 
        //Calculamos el precio 
        for(int i=0;i<productos.length;i++){
            totalPrecio += productos[i].calcular(5);
        }
         
        
        System.out.println("El total por los productos es: " + totalPrecio);
        System.out.println();
         

	}

}
