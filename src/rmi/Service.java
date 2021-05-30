package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    public String getDateHour() throws RemoteException;
    public String countLetter(String string) throws RemoteException;
}
