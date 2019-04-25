package java.awt;

import java.util.Locale;
import java.util.ResourceBundle;

public final class ComponentOrientation implements java. io. Serializable {
  public static final ComponentOrientation LEFT_TO_RIGHT;
  public static final ComponentOrientation RIGHT_TO_LEFT;
  public static final ComponentOrientation UNKNOWN;
  public boolean isHorizontal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeftToRight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ComponentOrientation getOrientation(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ComponentOrientation getOrientation(ResourceBundle bdl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private ComponentOrientation(int value) {
  }
}