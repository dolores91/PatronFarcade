public class BuscadorHotel {
    // Creo un método donde imprime por pantalla + random para que me dé un numero aleatorio en hoteles.
    public void buscarHotel(String fechaDesde, String fechaHasta, String ciudad){
        System.out.println("Tenes " + (int)(Math.random()*5) + " hoteles disponibles entre las fechas " + fechaDesde + " y " + fechaHasta + " En: " + ciudad);
    }
}
