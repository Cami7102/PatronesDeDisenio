package factoryMethod.practice.pasajes;

public class PasajeStandart implements IPasaje{
    private String numeroVuelo;
    private String numeroAsiento;
    private String costoPasaje;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;


    public PasajeStandart(Destino destino, Origen origen, Avion avion, Pasajero pasajero) {
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
        this.pasajero = pasajero;
    }

    @Override
    public void showInfo() {
        System.out.println("Pasaje Standart");
        System.out.println("numeroVuelo " + numeroVuelo);
        System.out.println("numeroAsiento " + numeroAsiento);
        System.out.println("costoPasaje " + costoPasaje);
        System.out.println("origen ciudad " + origen.getCiudad());
        System.out.println("origen pais " + origen.getPais());
        System.out.println("origen aeropuerto " + origen.getAeropuerto());
        System.out.println("destino ciudad " + destino.getCiudad());
        System.out.println("destino pais " + destino.getPais());
        System.out.println("destino aeropuerto " + destino.getAeropuerto());
        System.out.println("avion marca " + avion.getMarca());
        System.out.println("avion capacidad" + avion.getCapacidad());
        System.out.println("avion numeroAsientos" + avion.getNumeroAsientos());
        System.out.println("avion modelo" + avion.getModelo());
        System.out.println("pasajero nombre" + pasajero.getNombre());
        System.out.println("pasajero ci" + pasajero.getCi());
        System.out.println("pasajero numAsiento" + pasajero.getFechaNacimiento());

    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
