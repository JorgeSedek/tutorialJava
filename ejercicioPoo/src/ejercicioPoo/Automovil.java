package ejercicioPoo;

public class Automovil {
	
	//atributos
	String marca;
	int modelo;
	int precio;
	
	boolean estado;
	
	//constructor
	public Automovil() {
		estado = false;
		System.out.println("Se creo un objeto de tipo automovil");
	}
	
	//metodos
	public void enceder() {
		System.out.println("El automovil ha encedido");
		estado = true;
	}
	
	public void apagar() {
		if(estado == true) {
			System.out.println("El automovil se apago");
			estado = false;
		}
		else {
			System.out.println("El auto ya esta apagado");
		}
	}
	
	public void avanzar() {
		if (estado == true) {
			System.out.println("El automovil esta avanzando");
		}
		else {
			System.out.println("El automovil no avanza");
		}
	}
		
}
