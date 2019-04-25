package java.rmi;


public class ServerRuntimeException extends RemoteException {
  @Deprecated public ServerRuntimeException(String s, Exception ex) {
    super(s, ex);
  }
}