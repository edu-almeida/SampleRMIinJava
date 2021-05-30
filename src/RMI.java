import rmi.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMI {
    public static void main(String[] args) {
        try {
            Server server = new Server();
            String location = "//localhost/service";
            Naming.rebind(location, server);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
