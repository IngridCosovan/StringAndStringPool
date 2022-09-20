package ro.java.ctrln;

import java.util.Objects;

public class Client extends Person{

    private String clientName;
    private int clientId;

    public Client() {}

    public Client(String cnp){
        super(cnp);
    }

    public  Client(String clientName, int clientId, String cnp){
        super(cnp);
        this.clientName = clientName;
        this.clientId = clientId;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientId=" + clientId +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientId);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Reciclare memorie pentru obiectul " + this);
    }
}
