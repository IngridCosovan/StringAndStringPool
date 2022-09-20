package ro.java.ctrln;

public class GarbageCollection {

    public static void main(String[] args) {

        exampleOneGarbageCollection();
        System.out.println("Final metoda main!");

    }

    private static void exampleOneGarbageCollection() {
        Client client = new Client();
        client.setClientName("ClientOne");
        client.setClientId(1);
        client = null;
        System.out.println("Final metoda exampleOneGarbageCollection! ");
        System.gc();

    }
}
