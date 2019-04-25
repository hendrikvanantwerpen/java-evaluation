package java.rmi.server;


abstract public class RemoteStub extends RemoteObject {
  protected RemoteStub( ) {
    super( );
  }
  protected RemoteStub(RemoteRef ref) {
    super(ref);
  }
}