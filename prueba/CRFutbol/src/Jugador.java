public class Jugador {
    String nombre;
    String posicion;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ")";
    }

}
