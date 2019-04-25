package java.awt;

import java.awt.event.KeyEvent;
import java.io.Serializable;

public class AWTKeyStroke implements Serializable {
  protected AWTKeyStroke( ) {
  }
  protected AWTKeyStroke(char keyChar,int keyCode,int modifiers, boolean onKeyRelease) {
  }
  public static AWTKeyStroke getAWTKeyStroke(char keyChar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTKeyStroke getAWTKeyStroke(Character keyChar, int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTKeyStroke getAWTKeyStroke(int keyCode,int modifiers, boolean onKeyRelease) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTKeyStroke getAWTKeyStroke(int keyCode, int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTKeyStroke getAWTKeyStrokeForEvent(KeyEvent anEvent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AWTKeyStroke getAWTKeyStroke(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final char getKeyChar( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getKeyCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getModifiers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isOnKeyRelease( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getKeyEventType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean equals(Object anObject) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}