package sun.misc;

import java.util.Enumeration;

public class Queue<T> {
  int length;
  QueueElement<T> head;
  QueueElement<T> tail;
  public Queue( ) {
  }
  public synchronized void enqueue(T obj) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public T dequeue( ) throws InterruptedException {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public synchronized T dequeue(long timeOut) throws InterruptedException {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public synchronized boolean isEmpty( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public final synchronized Enumeration<T> elements( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public final synchronized Enumeration<T> reverseElements( ) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public synchronized void dump(String msg) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
}
final class FIFOQueueEnumerator<T> implements Enumeration<T> {
  Queue<T> queue;
  QueueElement<T> cursor;
  FIFOQueueEnumerator(Queue<T> q) {
  }
  public boolean hasMoreElements( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public T nextElement( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
}
final class LIFOQueueEnumerator<T> implements Enumeration<T> {
  Queue<T> queue;
  QueueElement<T> cursor;
  LIFOQueueEnumerator(Queue<T> q) {
  }
  public boolean hasMoreElements( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public T nextElement( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
}
class QueueElement<T> {
  QueueElement<T> next;
  QueueElement<T> prev;
  T obj;
  QueueElement(T obj) {
  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}