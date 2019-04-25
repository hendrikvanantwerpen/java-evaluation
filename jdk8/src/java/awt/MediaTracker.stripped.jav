package java.awt;

import java.awt.Component;
import java.awt.Image;

public class MediaTracker implements java. io. Serializable {
  public MediaTracker(Component comp) {
  }
  public void addImage(Image image, int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addImage(Image image,int id,int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int LOADING;
  public static final int ABORTED;
  public static final int ERRORED;
  public static final int COMPLETE;
  public boolean checkAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean checkAll(boolean load) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isErrorAny( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Object [] getErrorsAny( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void waitForAll( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean waitForAll(long ms) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int statusAll(boolean load) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean checkID(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean checkID(int id, boolean load) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isErrorID(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Object [] getErrorsID(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void waitForID(int id) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean waitForID(int id, long ms) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int statusID(int id, boolean load) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeImage(Image image) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeImage(Image image, int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeImage(Image image,int id,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}