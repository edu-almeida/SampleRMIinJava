package daytime;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Server implements Service {

    public static void main(String[] args) {
        try {
            Server server = new Server();
            LocateRegistry.getRegistry().bind("Servidor", UnicastRemoteObject.exportObject(server, 0));
            System.out.println("Servidor inicializado com sucesso.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getDateHour() throws RemoteException {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
    }

    @Override
    public String countLetter(String string) throws RemoteException {
        return new StringBuffer(string).reverse().toString();
    }
}
