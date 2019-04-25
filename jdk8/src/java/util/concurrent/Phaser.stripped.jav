package java.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Phaser {
  public Phaser( ) {
    this(null, 0);
  }
  public Phaser(int parties) {
    this(null, parties);
  }
  public Phaser(Phaser parent) {
    this(parent, 0);
  }
  public Phaser(Phaser parent, int parties) {
  }
  public int register( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int bulkRegister(int parties) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int arrive( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int arriveAndDeregister( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int arriveAndAwaitAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int awaitAdvance(int phase) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int awaitAdvanceInterruptibly(int phase) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int awaitAdvanceInterruptibly(int phase,long timeout, TimeUnit unit) throws InterruptedException, TimeoutException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void forceTermination( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getPhase( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRegisteredParties( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getArrivedParties( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getUnarrivedParties( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Phaser getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Phaser getRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTerminated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}