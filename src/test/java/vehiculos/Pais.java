package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
	private ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	static private ArrayList<Pais> paises = new ArrayList<Pais>();


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
		paises.add(this);
		
	}
	public void agregarFabrica(Fabricante fab) {
		fabricantes.add(fab);
	}
	
	public int ventas() {
		int count =0;
		for (int i = 0; i < fabricantes.size(); i++) {
			count+=fabricantes.get(i).autosFabricados;
		}
		return count;
	}
	
	public static Pais paisMasVendedor() {
		Pais max=paises.get(0);
		for (int i = 0; i < paises.size(); i++)
			if (max.ventas() < paises.get(i).ventas()) {
				max=paises.get(i);
			}
		return max;
	}
}
