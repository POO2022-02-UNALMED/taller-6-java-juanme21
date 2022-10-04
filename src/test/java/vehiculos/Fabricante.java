package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	private ArrayList<Vehiculo> fabricados = new ArrayList<Vehiculo>();
	private ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();


	
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
	public void agregarVehiculo(Vehiculo veh){
		fabricados.add(veh);
		
	}

}
