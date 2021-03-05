package java.io;


public final class FileDescriptor {
  public FileDescriptor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final FileDescriptor in;
  public static final FileDescriptor out;
  public static final FileDescriptor err;
  public boolean valid( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public native void sync( ) throws SyncFailedException ;
  synchronized void attach(Closeable c) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  synchronized void closeAll(Closeable releaser) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
}