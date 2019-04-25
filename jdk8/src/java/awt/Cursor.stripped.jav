package java.awt;


public class Cursor implements java. io. Serializable {
  public static final int DEFAULT_CURSOR;
  public static final int CROSSHAIR_CURSOR;
  public static final int TEXT_CURSOR;
  public static final int WAIT_CURSOR;
  public static final int SW_RESIZE_CURSOR;
  public static final int SE_RESIZE_CURSOR;
  public static final int NW_RESIZE_CURSOR;
  public static final int NE_RESIZE_CURSOR;
  public static final int N_RESIZE_CURSOR;
  public static final int S_RESIZE_CURSOR;
  public static final int W_RESIZE_CURSOR;
  public static final int E_RESIZE_CURSOR;
  public static final int HAND_CURSOR;
  public static final int MOVE_CURSOR;
  public static final int CUSTOM_CURSOR;
  static public Cursor getPredefinedCursor(int type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static public Cursor getSystemCustomCursor(final String name) throws AWTException, HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static public Cursor getDefaultCursor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  @ConstructorProperties({"type"}) public Cursor(int type) {
  }
  protected Cursor(String name) {
  }
  public int getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}