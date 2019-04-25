package java.rmi;


public class NoSuchObjectException extends RemoteException {
  public NoSuchObjectException(String s) {
    super(s);
  }
}