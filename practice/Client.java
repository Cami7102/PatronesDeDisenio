package prototype.practice;

public class Client {
    public static void main(String[]args){
        Accesorios acc= new Accesorios();
        acc.setEstuche("Verde");
        acc.setCargador("Cargador rapido");
        acc.setAudifonos("Alambricos o Bluetooth");

        Celular template= new Celular();
        template.setTamano("4.7 pulgadas");
        template.setCpu("Exynos 64bits Octa-core");
        template.setMemory("16 GB");
        template.setVersionAndroid("10");
        template.setCamara("40 MP");
        template.setBluetooth("SI");
        template.setCantidadDeMemoriasExternas("2");
        template.setTipoBateria("5.000 mAh");
        template.setAccesorios(acc);

        Sim uno = new Sim();
        uno.setNombreEmpresaTel("Viva");
        uno.setNumeroTelefono(70321019);

        Sim dos = new Sim();
        dos.setNombreEmpresaTel("Tigo");
        dos.setNumeroTelefono(75849561);

        Sim tres = new Sim();
        tres.setNombreEmpresaTel("Entel");
        tres.setNumeroTelefono(65676521);

        Celular celular1 = (Celular) template.clone();
        celular1.setSim(uno);
        celular1.setAccesorios(acc);

        Celular celular2 = (Celular) template.clone();
        celular1.setSim(dos);
        celular1.setAccesorios(acc);

        Celular celular3 = (Celular) template.clone();
        celular1.setSim(tres);
        celular1.setAccesorios(acc);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();

    }
}
