package java.util.concurrent;


public abstract class RecursiveTask<V> extends ForkJoinTask<V> {
  public final V getRawResult( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}