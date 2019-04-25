package java.awt.event;

import java.awt.AWTEvent;
import java.awt.ItemSelectable;

public class ItemEvent extends AWTEvent {
  public static final int ITEM_FIRST;
  public static final int ITEM_LAST;
  public static final int ITEM_STATE_CHANGED;
  public static final int SELECTED;
  public static final int DESELECTED;
  public ItemEvent(ItemSelectable source,int id,Object item, int stateChange) {
    super(source, id);
  }
  public ItemSelectable getItemSelectable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getItem( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getStateChange( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}