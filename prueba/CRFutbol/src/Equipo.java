import java.util.ArrayList;

public class Equipo {
    public String nombre;
    public String estadio;
    public int cantidadTitulos;
    public ArrayList<Jugador> jugadoresTitulares;
    public ArrayList<Jugador> jugadoresSuplentes;

    public Equipo(String nombre, String estadio, int cantidadTitulos, ArrayList<Jugador> jugadoresTitulares, ArrayList<Jugador> jugadoresSuplentes) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.cantidadTitulos = cantidadTitulos;
        this.jugadoresTitulares = jugadoresTitulares;
        this.jugadoresSuplentes = jugadoresSuplentes;
    }

    public String reporteBasico() {
        return nombre + " - Títulos ganados: " + cantidadTitulos + " - Total de jugadores: " +
                (jugadoresTitulares.size() + jugadoresSuplentes.size());
    }

    public String reporteDetallado() {
        StringBuilder reporte = new StringBuilder(nombre + " - Títulos ganados: " + cantidadTitulos + "\n");
        reporte.append("Jugadores titulares:\n");
        for (Jugador jugador : jugadoresTitulares) {
            reporte.append(jugador).append("\n");
        }
        reporte.append("Jugadores suplentes:\n");
        for (Jugador jugador : jugadoresSuplentes) {
            reporte.append(jugador).append("\n");
        }
        return reporte.toString();
    }

}
