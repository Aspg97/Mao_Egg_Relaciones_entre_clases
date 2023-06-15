package Ej_02_jugador;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Service tool = new Service();
		ArrayList<Jugador> jugadores = new ArrayList();
		Jugador j1 = new Jugador("nom1","ape1","del",1);
		Jugador j2 = new Jugador("nom2","ape2","def",2);
		Jugador j3 = new Jugador("nom3","ape3","arq",3);
		Jugador j4 = new Jugador("nom4","ape4","lat",4);
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		Equipo futbolFC = new Equipo(jugadores);
		System.out.println("\nLa nomina de jugadores de Futbol FC son:");
		tool.mostrarEquipo(futbolFC);
	}

}
