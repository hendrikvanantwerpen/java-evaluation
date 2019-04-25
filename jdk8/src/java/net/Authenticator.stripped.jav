package java.net;


public abstract class Authenticator {
  public enum RequestorType {
    PROXY, SERVER
  }
  public synchronized static void setDefault(Authenticator a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PasswordAuthentication requestPasswordAuthentication(InetAddress addr,int port,String protocol,String prompt, String scheme) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PasswordAuthentication requestPasswordAuthentication(String host,InetAddress addr,int port,String protocol,String prompt, String scheme) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PasswordAuthentication requestPasswordAuthentication(String host,InetAddress addr,int port,String protocol,String prompt,String scheme,URL url, RequestorType reqType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}