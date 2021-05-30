package daytime;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            Server stub = (Server) registry.lookup("Servidor");
            System.out.println("Invocando metodo do servidor");
            System.out.println("Mensagem retornada pelo Servidor: " + stub.getDateHour());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
