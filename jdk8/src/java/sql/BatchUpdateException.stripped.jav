package java.sql;


public class BatchUpdateException extends SQLException {
  public BatchUpdateException(String reason,String SQLState,int vendorCode, int [] updateCounts) {
    super(reason, SQLState, vendorCode);
  }
  public BatchUpdateException(String reason,String SQLState, int [] updateCounts) {
    this(reason, SQLState, 0, updateCounts);
  }
  public BatchUpdateException(String reason, int [] updateCounts) {
    this(reason, null, 0, updateCounts);
  }
  public BatchUpdateException(int [] updateCounts) {
    this(null, null, 0, updateCounts);
  }
  public BatchUpdateException( ) {
    this(null, null, 0, null);
  }
  public BatchUpdateException(Throwable cause) {
    this(cause == null ? null : cause. toString( ), null, 0, (int [] ) null, cause);
  }
  public BatchUpdateException(int [] updateCounts, Throwable cause) {
    this(cause == null ? null : cause. toString( ), null, 0, updateCounts, cause);
  }
  public BatchUpdateException(String reason,int [] updateCounts, Throwable cause) {
    this(reason, null, 0, updateCounts, cause);
  }
  public BatchUpdateException(String reason,String SQLState,int [] updateCounts, Throwable cause) {
    this(reason, SQLState, 0, updateCounts, cause);
  }
  public BatchUpdateException(String reason,String SQLState,int vendorCode,int [] updateCounts, Throwable cause) {
    super(reason, SQLState, vendorCode, cause);
  }
  public int [] getUpdateCounts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BatchUpdateException(String reason,String SQLState,int vendorCode,long [] updateCounts, Throwable cause) {
    super(reason, SQLState, vendorCode, cause);
  }
  public long [] getLargeUpdateCounts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}