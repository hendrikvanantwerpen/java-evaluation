package java.rmi;


public class ServerError extends RemoteException {
  public ServerError(String s, Error err) {
    super(s, err);
  }
}