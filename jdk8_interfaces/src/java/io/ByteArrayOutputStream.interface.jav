package java.io;


public class ByteArrayOutputStream extends OutputStream {
  protected byte buf[];
  protected int count;
  public ByteArrayOutputStream( ) {
    this(32);
  }
  public ByteArrayOutputStream(int size) {
  }
  private void ensureCapacity(int minCapacity) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static final int MAX_ARRAY_SIZE;
  private void grow(int minCapacity) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static int hugeCapacity(int minCapacity) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public synchronized void write(int b) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public synchronized void write(byte b[],int off, int len) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public synchronized void writeTo(OutputStream out) throws IOException {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public synchronized void reset( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public synchronized byte toByteArray( ) [] {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public synchronized int size( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public synchronized String toString( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public synchronized String toString(String charsetName) throws UnsupportedEncodingException {
                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                              }
  public synchronized String toString(int hibyte) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
}