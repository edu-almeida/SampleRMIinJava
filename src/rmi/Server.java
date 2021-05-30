package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Server extends UnicastRemoteObject implements Service {
    public Server() throws RemoteException {
        super();
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
