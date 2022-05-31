package iterator.practice;

public class Client {
    public static void main(String[]args){
        ConcreteImportadora1 autofast = new ConcreteImportadora1();
        autofast.add("Jose");
        autofast.add("Carlos");
        autofast.add("Tania");
        autofast.add("Briana");
        autofast.add("Rodrigo");

        ConcreteImportadora2 autopart = new ConcreteImportadora2();
        autopart.add("Manuel");
        autopart.add("Carla");
        autopart.add("Roxana");
        autopart.add("Pompeya");
        autopart.add("Juan");

        ConcreteImportadora3 autotune = new ConcreteImportadora3();
        autotune.add("Edgar");
        autotune.add("Marco");
        autotune.add("Daniela");
        autotune.add("Samanta");
        autotune.add("Nicolas");

        ConcreteImportadora4 autonego = new ConcreteImportadora4();
        autonego.add("Vivian");
        autonego.add("Mateo");
        autonego.add("Jorge");
        autonego.add("Edith");
        autonego.add("Andrea");

        Iterator iterator;

        iterator = autofast.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("autofast: "+client);
        }

        iterator = autopart.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("autopart: "+client);
        }

        iterator = autotune.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("autotune: "+client);
        }

        iterator = autonego.createIterator();
        while (iterator.hasNext()){
            String client = (String) iterator.next();
            System.out.println("autonego: "+client);
        }
    }
}
