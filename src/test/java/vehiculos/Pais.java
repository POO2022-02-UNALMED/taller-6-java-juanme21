package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
	private ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	public void agregarFabrica(Fabricante fab) {
		fabricantes.add(fab);
	}

}
