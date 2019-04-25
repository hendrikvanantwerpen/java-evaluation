package java.sql;


public class DriverManager {
  private DriverManager( ) {
  }
  public static java. io. PrintWriter getLogWriter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setLogWriter(java. io. PrintWriter out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Connection getConnection(String url, java. util. Properties info) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Connection getConnection(String url,String user, String password) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Connection getConnection(String url) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Driver getDriver(String url) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void registerDriver(java. sql. Driver driver) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void registerDriver(java. sql. Driver driver, DriverAction da) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void deregisterDriver(Driver driver) throws SQLException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static java. util. Enumeration<Driver> getDrivers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setLoginTimeout(int seconds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getLoginTimeout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setLogStream(java. io. PrintStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static java. io. PrintStream getLogStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void println(String message) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}