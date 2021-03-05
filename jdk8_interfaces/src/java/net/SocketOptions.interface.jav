package java.net;


public interface SocketOptions {
  public void setOption(int optID, Object value) throws SocketException ;
  public Object getOption(int optID) throws SocketException ;
}