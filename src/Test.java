public class Test {
    public static void main(String[] args) {
        // Creo el buscador de tipo interface
        IBuscadorFarcade buscador = new BuscadorFacade();
        // Invoco el método y relleno los parámetros que me pide (Este método me imprime por pantalla)
        buscador.buscarDisponibilidad("Orlando, Fl", "24/05/2022","15/01/2023", "Buenos Aires");
    }
}
