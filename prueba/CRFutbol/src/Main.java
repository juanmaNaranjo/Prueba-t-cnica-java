import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadoresTitulares = new ArrayList<>();
        jugadoresTitulares.add(new Jugador("Jugador 1", "Posición 1"));
        jugadoresTitulares.add(new Jugador("Jugador 2", "Posición 2"));

        ArrayList<Jugador> jugadoresSuplentes = new ArrayList<>();
        jugadoresSuplentes.add(new Jugador("Jugador 3", "Posición 3"));
        jugadoresSuplentes.add(new Jugador("Jugador 4", "Posición 4"));

        Equipo equipo = new Equipo("Equipo 1", "Estadio 1", 5, jugadoresTitulares, jugadoresSuplentes);

        System.out.println("1. Reporte básico");
        System.out.println("2. Reporte detallado");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println(equipo.reporteBasico());
        } else if (opcion == 2) {
            System.out.println(equipo.reporteDetallado());
        } else {
            System.out.println("Opción no válida");
        }

    }



}