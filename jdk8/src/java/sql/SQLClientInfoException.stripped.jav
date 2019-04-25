package java.sql;

import java.util.Map;

public class SQLClientInfoException extends SQLException {
  public SQLClientInfoException( ) {
  }
  public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties) {
  }
  public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties, Throwable cause) {
    super(cause != null ? cause. toString( ) : null);
  }
  public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties) {
    super(reason);
  }
  public SQLClientInfoException(String reason,Map<String, ClientInfoStatus> failedProperties, Throwable cause) {
    super(reason);
  }
  public SQLClientInfoException(String reason,String SQLState, Map<String, ClientInfoStatus> failedProperties) {
    super(reason, SQLState);
  }
  public SQLClientInfoException(String reason,String SQLState,Map<String, ClientInfoStatus> failedProperties, Throwable cause) {
    super(reason, SQLState);
  }
  public SQLClientInfoException(String reason,String SQLState,int vendorCode, Map<String, ClientInfoStatus> failedProperties) {
    super(reason, SQLState, vendorCode);
  }
  public SQLClientInfoException(String reason,String SQLState,int vendorCode,Map<String, ClientInfoStatus> failedProperties, Throwable cause) {
    super(reason, SQLState, vendorCode);
  }
  public Map<String, ClientInfoStatus> getFailedProperties( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}