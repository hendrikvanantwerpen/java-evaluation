package java.awt.event;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.font.TextHitInfo;
import java.text.AttributedCharacterIterator;

public class InputMethodEvent extends AWTEvent {
  public static final int INPUT_METHOD_FIRST;
  public static final int INPUT_METHOD_TEXT_CHANGED;
  public static final int CARET_POSITION_CHANGED;
  public static final int INPUT_METHOD_LAST;
  public InputMethodEvent(Component source,int id,long when,AttributedCharacterIterator text,int committedCharacterCount,TextHitInfo caret, TextHitInfo visiblePosition) {
    super(source, id);
  }
  public InputMethodEvent(Component source,int id,AttributedCharacterIterator text,int committedCharacterCount,TextHitInfo caret, TextHitInfo visiblePosition) {
    this(source, id, EventQueue. getMostRecentEventTime( ), text, committedCharacterCount, caret, visiblePosition);
  }
  public InputMethodEvent(Component source,int id,TextHitInfo caret, TextHitInfo visiblePosition) {
    this(source, id, EventQueue. getMostRecentEventTime( ), null, 0, caret, visiblePosition);
  }
  public AttributedCharacterIterator getText( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCommittedCharacterCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getCaret( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextHitInfo getVisiblePosition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void consume( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isConsumed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWhen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}