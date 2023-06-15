package Ej_01_persona;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona("Anthony","Pacheco");
		DNI dni = new DNI('c',1172651);
		p.setDni(dni);
		dni.getNumero();
		System.out.println(p.getDni().getSerie());
	}

}
