package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	int autosFabricados;

	static private ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();

	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		pais.agregarFabrica(this);
		fabricas.add(this);

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMayorVentas() {
	    Fabricante max=fabricas.get(0);
		for (int i = 0; i < fabricas.size(); i++)
			if (max.autosFabricados < fabricas.get(i).autosFabricados) {
				max=fabricas.get(i);
			}
		return max;
	}

}
