package java.awt.im;

import java.awt.font.TextAttribute;
import java.util.Map;

public class InputMethodHighlight {
  public final static int RAW_TEXT;
  public final static int CONVERTED_TEXT;
  public final static InputMethodHighlight UNSELECTED_RAW_TEXT_HIGHLIGHT;
  public final static InputMethodHighlight SELECTED_RAW_TEXT_HIGHLIGHT;
  public final static InputMethodHighlight UNSELECTED_CONVERTED_TEXT_HIGHLIGHT;
  public final static InputMethodHighlight SELECTED_CONVERTED_TEXT_HIGHLIGHT;
  public InputMethodHighlight(boolean selected, int state) {
    this(selected, state, 0, null);
  }
  public InputMethodHighlight(boolean selected,int state, int variation) {
    this(selected, state, variation, null);
  }
  public InputMethodHighlight(boolean selected,int state,int variation, Map<TextAttribute, ?> style) {
  }
  public boolean isSelected( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVariation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<TextAttribute, ?> getStyle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}
;