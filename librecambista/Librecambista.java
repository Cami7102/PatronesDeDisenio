package visitor.practice.librecambista;

public class Librecambista implements IVisitor {

    @Override
    public void cambioMoneda(Bolivia bolivia) {
        System.out.println("INFO> haciendo cambio");
        bolivia.showInfo();
        if(bolivia.getMoneda().equals("bolivianos")){
            String c = String.valueOf(bolivia.getCantidad() * 6.96);
            System.out.println(c + " dolares");
        }else if(bolivia.getMoneda().equals("dolares")){
            String ca = String.valueOf(bolivia.getCantidad() / 6.96);
            System.out.println(ca + " bolivianos");
        }
    }

    @Override
    public void cambioMoneda(Argentina argentina) {
        System.out.println("INFO> haciendo cambio");
        argentina.showInfo();
        if(argentina.getMoneda().equals("pesos")){
            String cam = String.valueOf(argentina.getCantidad() * 0.0081);
            System.out.println(cam + " dolares");
        }else if(argentina.getMoneda().equals("dolares")){
            String camb = String.valueOf(argentina.getCantidad() / 0.0081);
            System.out.println(camb+ " pesos");
        }
    }

    @Override
    public void cambioMoneda(Brasil brasil) {
        System.out.println("INFO> haciendo cambio");
        brasil.showInfo();
        if(brasil.getMoneda().equals("reales")){
            String cambi = String.valueOf(brasil.getCantidad() * 0.19);
            System.out.println(cambi + " dolares");
        }else if(brasil.getMoneda().equals("dolares")){
            String cambia = String.valueOf(brasil.getCantidad() / 0.19);
            System.out.println(cambia + " reales");
        }
    }

    @Override
    public void cambioMoneda(Italia italia) {
        System.out.println("INFO> haciendo cambio");
        italia.showInfo();
        if(italia.getMoneda().equals("euros")){
            String cambiar = String.valueOf(italia.getCantidad() * 1.05);
            System.out.println(cambiar + " dolares");
        }else if(italia.getMoneda().equals("dolares")){
            double cambiar1 = italia.getCantidad() / 1.05;
            System.out.println(cambiar1 + " euros");
        }
    }
}
