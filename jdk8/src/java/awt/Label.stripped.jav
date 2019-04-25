package java.awt;

import javax.accessibility.*;

public class Label extends Component implements Accessible {
  public static final int LEFT;
  public static final int CENTER;
  public static final int RIGHT;
  public Label( ) throws HeadlessException{
    this("", LEFT);
  }
  public Label(String text) throws HeadlessException{
    this(text, LEFT);
  }
  public Label(String text, int alignment) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAlignment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setAlignment(int alignment) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getText( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setText(String text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}