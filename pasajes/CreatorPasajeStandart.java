package factoryMethod.practice.pasajes;

public class CreatorPasajeStandart extends Creator {

    @Override
    public PasajeStandart createPasaje() {
        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("El Alto");
        Destino destino= new Destino();
        destino.setPais("Bolivia");
        destino.setCiudad("Chuquisaca");
        destino.setAeropuerto("Juana Azurduy de Padilla");
        Avion avion = new Avion();
        avion.setMarca("ble");
        avion.setCapacidad("ble");
        avion.setNumeroAsientos("ble");
        avion.setModelo("ble");
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Edgar Aviles");
        pasajero.setCi("10325007");
        pasajero.setFechaNacimiento("27/9/1976");
        PasajeStandart pasaje = new PasajeStandart(origen, destino, avion, pasajero);
        pasaje.setNumeroAsiento("52");
        pasaje.setNumeroAsiento("grande");
        pasaje.setCostoPasaje("circular");
        return pasaje;
    }
}
