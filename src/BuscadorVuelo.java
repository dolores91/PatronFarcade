public class BuscadorVuelo {
    // Creo un método donde imprime por pantalla + random para que me dé un numero aleatorio en vuelos.
    public void buscarVuelo(String fechaDesde, String fechaHasta, String origen, String destino){
        System.out.println("Tenes " + (int)(Math.random()*10) + " vuelos disponibles entre las fechas " + fechaDesde + " y " + fechaHasta + " Para el tramo: " + origen + " - " + destino);
    }
}
