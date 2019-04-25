package java.awt.event;

import java.awt.AWTEvent;

public class ActionEvent extends AWTEvent {
  public static final int SHIFT_MASK;
  public static final int CTRL_MASK;
  public static final int META_MASK;
  public static final int ALT_MASK;
  public static final int ACTION_FIRST;
  public static final int ACTION_LAST;
  public static final int ACTION_PERFORMED;
  public ActionEvent(Object source,int id, String command) {
    this(source, id, command, 0);
  }
  public ActionEvent(Object source,int id,String command, int modifiers) {
    this(source, id, command, 0, modifiers);
  }
  public ActionEvent(Object source,int id,String command,long when, int modifiers) {
    super(source, id);
  }
  public String getActionCommand( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWhen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getModifiers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}