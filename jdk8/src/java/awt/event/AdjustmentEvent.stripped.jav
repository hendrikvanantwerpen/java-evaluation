package java.awt.event;

import java.awt.Adjustable;
import java.awt.AWTEvent;

public class AdjustmentEvent extends AWTEvent {
  public static final int ADJUSTMENT_FIRST;
  public static final int ADJUSTMENT_LAST;
  public static final int ADJUSTMENT_VALUE_CHANGED;
  public static final int UNIT_INCREMENT;
  public static final int UNIT_DECREMENT;
  public static final int BLOCK_DECREMENT;
  public static final int BLOCK_INCREMENT;
  public static final int TRACK;
  public AdjustmentEvent(Adjustable source,int id,int type, int value) {
    this(source, id, type, value, false);
  }
  public AdjustmentEvent(Adjustable source,int id,int type,int value, boolean isAdjusting) {
    super(source, id);
  }
  public Adjustable getAdjustable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAdjustmentType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getValueIsAdjusting( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}