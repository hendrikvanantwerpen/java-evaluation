package java.util.concurrent.locks;


public abstract class AbstractOwnableSynchronizer implements java. io. Serializable {
  private static final long serialVersionUID;
  protected AbstractOwnableSynchronizer( ) {
  }
  private transient Thread exclusiveOwnerThread;
  protected final void setExclusiveOwnerThread(Thread thread) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  protected final Thread getExclusiveOwnerThread( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
}