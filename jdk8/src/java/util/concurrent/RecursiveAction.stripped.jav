package java.util.concurrent;


public abstract class RecursiveAction extends ForkJoinTask<Void> {
  public final Void getRawResult( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}