package practicaPrimerParcial.prototype;

public class Client {
    public static void main(String[]args){

        Contrato template= new Contrato();
        template.setSueldo("5000");
        template.setCargaHoraria("80");
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMarcadoBiometrico(false);
        template.setMarcadoHoraDeEntrada("08:00");
        template.setMarcadoHoraDeSalida("18:00");

        DatosDocente uno = new DatosDocente();
        uno.setNombre("Silvia");
        uno.setApellido("Navarro");

        DatosDocente dos = new DatosDocente();
        dos.setNombre("Martha");
        dos.setApellido("Higareda");

        DatosDocente tres = new DatosDocente();
        tres.setNombre("Omar");
        tres.setApellido("Chaparro");

        DatosDocente cuatro = new DatosDocente();
        cuatro.setNombre("Eugenio");
        cuatro.setApellido("Derbez");

        DatosDocente cinco = new DatosDocente();
        cinco.setNombre("Ximena");
        cinco.setApellido("Sariñana");

        DatosDocente seis = new DatosDocente();
        seis.setNombre("Salma");
        seis.setApellido("Hayek");

        DatosDocente siete = new DatosDocente();
        siete.setNombre("Eiza");
        siete.setApellido("Gonzales");

        DatosDocente ocho = new DatosDocente();
        ocho.setNombre("Gael");
        ocho.setApellido("Garcia Bernal");

        DatosDocente nueve = new DatosDocente();
        nueve.setNombre("Pedro");
        nueve.setApellido("Fernandez");

        DatosDocente diez = new DatosDocente();
        diez.setNombre("Julieta");
        diez.setApellido("Venegas");

        DatosDocente once = new DatosDocente();
        once.setNombre("Diego");
        once.setApellido("Luna");

        DatosDocente doce = new DatosDocente();
        doce.setNombre("Alisson");
        doce.setApellido("Lozz");

        DatosDocente trece = new DatosDocente();
        trece.setNombre("Ana");
        trece.setApellido("De la Reguera");

        DatosDocente catorce = new DatosDocente();
        catorce.setNombre("Frida");
        catorce.setApellido("Kahlo");

        DatosDocente quince = new DatosDocente();
        quince.setNombre("Diego");
        quince.setApellido("Boneta");

        //**************************************************
        Contrato contrato1 = (Contrato) template.clone();
        contrato1.setDatosDocente(uno);

        Contrato contrato2 = (Contrato) template.clone();
        contrato2.setDatosDocente(dos);

        Contrato contrato3 = (Contrato) template.clone();
        contrato3.setDatosDocente(tres);

        Contrato contrato4 = (Contrato) template.clone();
        contrato4.setDatosDocente(cuatro);

        Contrato contrato5 = (Contrato) template.clone();
        contrato5.setDatosDocente(cinco);

        Contrato contrato6 = (Contrato) template.clone();
        contrato6.setDatosDocente(seis);

        Contrato contrato7 = (Contrato) template.clone();
        contrato7.setDatosDocente(siete);

        Contrato contrato8 = (Contrato) template.clone();
        contrato8.setDatosDocente(ocho);

        Contrato contrato9 = (Contrato) template.clone();
        contrato9.setDatosDocente(nueve);

        Contrato contrato10 = (Contrato) template.clone();
        contrato10.setDatosDocente(diez);

        Contrato contrato11 = (Contrato) template.clone();
        contrato11.setDatosDocente(once);

        Contrato contrato12 = (Contrato) template.clone();
        contrato12.setDatosDocente(doce);

        Contrato contrato13 = (Contrato) template.clone();
        contrato13.setDatosDocente(trece);

        Contrato contrato14 = (Contrato) template.clone();
        contrato14.setDatosDocente(catorce);

        Contrato contrato15 = (Contrato) template.clone();
        contrato15.setDatosDocente(quince);

        //**********************************************

        contrato1.showInfo();
        contrato2.showInfo();
        contrato3.showInfo();
        contrato4.showInfo();
        contrato5.showInfo();
        contrato6.showInfo();
        contrato7.showInfo();
        contrato8.showInfo();
        contrato9.showInfo();
        contrato10.showInfo();
        contrato11.showInfo();
        contrato12.showInfo();
        contrato13.showInfo();
        contrato14.showInfo();
        contrato15.showInfo();
    }
}
