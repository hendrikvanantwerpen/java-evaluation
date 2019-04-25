package java.sql;

import java.util.Iterator;

public class SQLException extends java. lang. Exception implements Iterable<Throwable> {
  public SQLException(String reason,String SQLState, int vendorCode) {
    super(reason);
  }
  public SQLException(String reason, String SQLState) {
    super(reason);
  }
  public SQLException(String reason) {
    super(reason);
  }
  public SQLException( ) {
    super( );
  }
  public SQLException(Throwable cause) {
    super(cause);
  }
  public SQLException(String reason, Throwable cause) {
    super(reason, cause);
  }
  public SQLException(String reason,String sqlState, Throwable cause) {
    super(reason, cause);
  }
  public SQLException(String reason,String sqlState,int vendorCode, Throwable cause) {
    super(reason, cause);
  }
  public String getSQLState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getErrorCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SQLException getNextException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setNextException(SQLException ex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<Throwable> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}