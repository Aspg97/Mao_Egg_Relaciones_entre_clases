package Ej_02_jugador;

import java.util.Iterator;

public class Service {
	public void mostrarDatosJugador(Jugador jugador) {
		System.out.println("\nNombre: " + jugador.getNombre() + "\nApellido: " + jugador.getApellido() + "\nPosicion: "
				+ jugador.getPosicion() + "\nNumero: " + jugador.getNumero()+"\n");
	}

	public void mostrarEquipo(Equipo equipo) {
		Iterator<Jugador> mostrar = equipo.getJugador().iterator();
		while(mostrar.hasNext()) {
			mostrarDatosJugador(mostrar.next());
		}
	}
}
