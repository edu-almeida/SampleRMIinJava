package example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer implements Hello {
    public HelloServer() {
    }

    public static void main(String[] args) {
        try {
            HelloServer server = new HelloServer();
            //Exporta o server para o stub ("apendice ou toco") do RMI na porta 0
            Hello stub = (Hello) UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.getRegistry();
            // Registra a stub no RMI para que ela seja obtida pelos clientes
            registry.bind("Servidor", stub);

            System.out.println("Servidor inicializado com sucesso.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String hello() throws RemoteException {
        System.out.println("Executando metodo neste host");
        return "Ola!!!! Consegui executar o metodo remoto!!!";
    }
}