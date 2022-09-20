package ro.java.ctrln;

public class ClientUsage {
    public static void main(String[] args) {
        Client clientOne = new Client();
        Client clientTWo = new Client();


        clientOne.setClientName("John");
        clientOne.setClientId(1);
        clientTWo.setClientName(new String("John"));
        clientTWo.setClientId(1);
        System.out.println("clientOne.getClientName() == clientTWo.getClientName(): " + (clientOne.getClientName() == clientTWo.getClientName()));

        String clientOneString = clientOne.toString().intern();
        String clientTwoString = clientTWo.toString().intern();

        System.out.println(clientOne);
        System.out.println(clientTWo);

        System.out.println("clientOneString.equals(clientTwoString) " + (clientOneString.equals(clientTwoString)));
        System.out.println("clientOneString == clientTwoString: " + (clientOneString == clientTwoString));

    }
}
