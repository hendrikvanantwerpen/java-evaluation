package java.awt.event;

import java.awt.AWTEvent;

public class TextEvent extends AWTEvent {
  public static final int TEXT_FIRST;
  public static final int TEXT_LAST;
  public static final int TEXT_VALUE_CHANGED;
  public TextEvent(Object source, int id) {
    super(source, id);
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}