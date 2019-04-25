package java.sql;


public class DataTruncation extends SQLWarning {
  public DataTruncation(int index,boolean parameter,boolean read,int dataSize, int transferSize) {
    super("Data truncation", read == true ? "01004" : "22001");
  }
  public DataTruncation(int index,boolean parameter,boolean read,int dataSize,int transferSize, Throwable cause) {
    super("Data truncation", read == true ? "01004" : "22001", cause);
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getParameter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getRead( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransferSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}