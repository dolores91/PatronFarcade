public class BuscadorFacade implements IBuscadorFarcade{
    // Creo instancias de cada servicio
    private BuscadorHotel busquedaHotel;
    private BuscadorVuelo busquedaVuelo;

    // Constructor
    public BuscadorFacade(){
        this.busquedaHotel = new BuscadorHotel(); // Creo el objeto
        this.busquedaVuelo = new BuscadorVuelo();
    }

    // Hago el override del método de la interface y le paso los parámetros que corresponden. Invoco a los otros 2 métodos.
    @Override
    public void buscarDisponibilidad(String destino, String fechaDesde, String fechaHasta, String origen) {
        busquedaHotel.buscarHotel(fechaDesde,fechaHasta,destino);
        busquedaVuelo.buscarVuelo(fechaDesde,fechaHasta,origen,destino);
    }

}
