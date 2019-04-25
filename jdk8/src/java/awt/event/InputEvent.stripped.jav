package java.awt.event;

import java.awt.Component;

public abstract class InputEvent extends ComponentEvent {
  public static final int SHIFT_MASK;
  public static final int CTRL_MASK;
  public static final int META_MASK;
  public static final int ALT_MASK;
  public static final int ALT_GRAPH_MASK;
  public static final int BUTTON1_MASK;
  public static final int BUTTON2_MASK;
  public static final int BUTTON3_MASK;
  public static final int SHIFT_DOWN_MASK;
  public static final int CTRL_DOWN_MASK;
  public static final int META_DOWN_MASK;
  public static final int ALT_DOWN_MASK;
  public static final int BUTTON1_DOWN_MASK;
  public static final int BUTTON2_DOWN_MASK;
  public static final int BUTTON3_DOWN_MASK;
  public static final int ALT_GRAPH_DOWN_MASK;
  public static int getMaskForButton(int button) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  InputEvent(Component source,int id,long when, int modifiers) {
    super(source, id);
  }
  public boolean isShiftDown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isControlDown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMetaDown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAltDown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAltGraphDown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWhen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getModifiers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getModifiersEx( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void consume( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isConsumed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getModifiersExText(int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}