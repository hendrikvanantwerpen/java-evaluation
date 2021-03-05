package java.nio.channels;


public abstract class SelectionKey {
  public abstract SelectableChannel channel( ) ;
  public abstract Selector selector( ) ;
  public abstract boolean isValid( ) ;
  public abstract void cancel( ) ;
  public abstract int interestOps( ) ;
  public abstract SelectionKey interestOps(int ops) ;
  public abstract int readyOps( ) ;
  public static final int OP_READ;
  public static final int OP_WRITE;
  public static final int OP_CONNECT;
  public static final int OP_ACCEPT;
  public final boolean isReadable( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final boolean isWritable( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public final boolean isConnectable( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final boolean isAcceptable( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public final Object attach(Object ob) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public final Object attachment( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
}