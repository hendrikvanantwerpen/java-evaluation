package java.awt;


public final class SystemColor extends Color implements java. io. Serializable {
  public final static int DESKTOP;
  public final static int ACTIVE_CAPTION;
  public final static int ACTIVE_CAPTION_TEXT;
  public final static int ACTIVE_CAPTION_BORDER;
  public final static int INACTIVE_CAPTION;
  public final static int INACTIVE_CAPTION_TEXT;
  public final static int INACTIVE_CAPTION_BORDER;
  public final static int WINDOW;
  public final static int WINDOW_BORDER;
  public final static int WINDOW_TEXT;
  public final static int MENU;
  public final static int MENU_TEXT;
  public final static int TEXT;
  public final static int TEXT_TEXT;
  public final static int TEXT_HIGHLIGHT;
  public final static int TEXT_HIGHLIGHT_TEXT;
  public final static int TEXT_INACTIVE_TEXT;
  public final static int CONTROL;
  public final static int CONTROL_TEXT;
  public final static int CONTROL_HIGHLIGHT;
  public final static int CONTROL_LT_HIGHLIGHT;
  public final static int CONTROL_SHADOW;
  public final static int CONTROL_DK_SHADOW;
  public final static int SCROLLBAR;
  public final static int INFO;
  public final static int INFO_TEXT;
  public final static int NUM_COLORS;
  public final static SystemColor desktop;
  public final static SystemColor activeCaption;
  public final static SystemColor activeCaptionText;
  public final static SystemColor activeCaptionBorder;
  public final static SystemColor inactiveCaption;
  public final static SystemColor inactiveCaptionText;
  public final static SystemColor inactiveCaptionBorder;
  public final static SystemColor window;
  public final static SystemColor windowBorder;
  public final static SystemColor windowText;
  public final static SystemColor menu;
  public final static SystemColor menuText;
  public final static SystemColor text;
  public final static SystemColor textText;
  public final static SystemColor textHighlight;
  public final static SystemColor textHighlightText;
  public final static SystemColor textInactiveText;
  public final static SystemColor control;
  public final static SystemColor controlText;
  public final static SystemColor controlHighlight;
  public final static SystemColor controlLtHighlight;
  public final static SystemColor controlShadow;
  public final static SystemColor controlDkShadow;
  public final static SystemColor scrollbar;
  public final static SystemColor info;
  public final static SystemColor infoText;
  private SystemColor(byte index) {
    super(systemColors[index]);
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}