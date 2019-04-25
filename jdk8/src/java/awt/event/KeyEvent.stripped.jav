package java.awt.event;

import java.awt.Component;

public class KeyEvent extends InputEvent {
  public static final int KEY_FIRST;
  public static final int KEY_LAST;
  public static final int KEY_TYPED;
  public static final int KEY_PRESSED;
  public static final int KEY_RELEASED;
  public static final int VK_ENTER;
  public static final int VK_BACK_SPACE;
  public static final int VK_TAB;
  public static final int VK_CANCEL;
  public static final int VK_CLEAR;
  public static final int VK_SHIFT;
  public static final int VK_CONTROL;
  public static final int VK_ALT;
  public static final int VK_PAUSE;
  public static final int VK_CAPS_LOCK;
  public static final int VK_ESCAPE;
  public static final int VK_SPACE;
  public static final int VK_PAGE_UP;
  public static final int VK_PAGE_DOWN;
  public static final int VK_END;
  public static final int VK_HOME;
  public static final int VK_LEFT;
  public static final int VK_UP;
  public static final int VK_RIGHT;
  public static final int VK_DOWN;
  public static final int VK_COMMA;
  public static final int VK_MINUS;
  public static final int VK_PERIOD;
  public static final int VK_SLASH;
  public static final int VK_0;
  public static final int VK_1;
  public static final int VK_2;
  public static final int VK_3;
  public static final int VK_4;
  public static final int VK_5;
  public static final int VK_6;
  public static final int VK_7;
  public static final int VK_8;
  public static final int VK_9;
  public static final int VK_SEMICOLON;
  public static final int VK_EQUALS;
  public static final int VK_A;
  public static final int VK_B;
  public static final int VK_C;
  public static final int VK_D;
  public static final int VK_E;
  public static final int VK_F;
  public static final int VK_G;
  public static final int VK_H;
  public static final int VK_I;
  public static final int VK_J;
  public static final int VK_K;
  public static final int VK_L;
  public static final int VK_M;
  public static final int VK_N;
  public static final int VK_O;
  public static final int VK_P;
  public static final int VK_Q;
  public static final int VK_R;
  public static final int VK_S;
  public static final int VK_T;
  public static final int VK_U;
  public static final int VK_V;
  public static final int VK_W;
  public static final int VK_X;
  public static final int VK_Y;
  public static final int VK_Z;
  public static final int VK_OPEN_BRACKET;
  public static final int VK_BACK_SLASH;
  public static final int VK_CLOSE_BRACKET;
  public static final int VK_NUMPAD0;
  public static final int VK_NUMPAD1;
  public static final int VK_NUMPAD2;
  public static final int VK_NUMPAD3;
  public static final int VK_NUMPAD4;
  public static final int VK_NUMPAD5;
  public static final int VK_NUMPAD6;
  public static final int VK_NUMPAD7;
  public static final int VK_NUMPAD8;
  public static final int VK_NUMPAD9;
  public static final int VK_MULTIPLY;
  public static final int VK_ADD;
  public static final int VK_SEPARATER;
  public static final int VK_SEPARATOR;
  public static final int VK_SUBTRACT;
  public static final int VK_DECIMAL;
  public static final int VK_DIVIDE;
  public static final int VK_DELETE;
  public static final int VK_NUM_LOCK;
  public static final int VK_SCROLL_LOCK;
  public static final int VK_F1;
  public static final int VK_F2;
  public static final int VK_F3;
  public static final int VK_F4;
  public static final int VK_F5;
  public static final int VK_F6;
  public static final int VK_F7;
  public static final int VK_F8;
  public static final int VK_F9;
  public static final int VK_F10;
  public static final int VK_F11;
  public static final int VK_F12;
  public static final int VK_F13;
  public static final int VK_F14;
  public static final int VK_F15;
  public static final int VK_F16;
  public static final int VK_F17;
  public static final int VK_F18;
  public static final int VK_F19;
  public static final int VK_F20;
  public static final int VK_F21;
  public static final int VK_F22;
  public static final int VK_F23;
  public static final int VK_F24;
  public static final int VK_PRINTSCREEN;
  public static final int VK_INSERT;
  public static final int VK_HELP;
  public static final int VK_META;
  public static final int VK_BACK_QUOTE;
  public static final int VK_QUOTE;
  public static final int VK_KP_UP;
  public static final int VK_KP_DOWN;
  public static final int VK_KP_LEFT;
  public static final int VK_KP_RIGHT;
  public static final int VK_DEAD_GRAVE;
  public static final int VK_DEAD_ACUTE;
  public static final int VK_DEAD_CIRCUMFLEX;
  public static final int VK_DEAD_TILDE;
  public static final int VK_DEAD_MACRON;
  public static final int VK_DEAD_BREVE;
  public static final int VK_DEAD_ABOVEDOT;
  public static final int VK_DEAD_DIAERESIS;
  public static final int VK_DEAD_ABOVERING;
  public static final int VK_DEAD_DOUBLEACUTE;
  public static final int VK_DEAD_CARON;
  public static final int VK_DEAD_CEDILLA;
  public static final int VK_DEAD_OGONEK;
  public static final int VK_DEAD_IOTA;
  public static final int VK_DEAD_VOICED_SOUND;
  public static final int VK_DEAD_SEMIVOICED_SOUND;
  public static final int VK_AMPERSAND;
  public static final int VK_ASTERISK;
  public static final int VK_QUOTEDBL;
  public static final int VK_LESS;
  public static final int VK_GREATER;
  public static final int VK_BRACELEFT;
  public static final int VK_BRACERIGHT;
  public static final int VK_AT;
  public static final int VK_COLON;
  public static final int VK_CIRCUMFLEX;
  public static final int VK_DOLLAR;
  public static final int VK_EURO_SIGN;
  public static final int VK_EXCLAMATION_MARK;
  public static final int VK_INVERTED_EXCLAMATION_MARK;
  public static final int VK_LEFT_PARENTHESIS;
  public static final int VK_NUMBER_SIGN;
  public static final int VK_PLUS;
  public static final int VK_RIGHT_PARENTHESIS;
  public static final int VK_UNDERSCORE;
  public static final int VK_WINDOWS;
  public static final int VK_CONTEXT_MENU;
  public static final int VK_FINAL;
  public static final int VK_CONVERT;
  public static final int VK_NONCONVERT;
  public static final int VK_ACCEPT;
  public static final int VK_MODECHANGE;
  public static final int VK_KANA;
  public static final int VK_KANJI;
  public static final int VK_ALPHANUMERIC;
  public static final int VK_KATAKANA;
  public static final int VK_HIRAGANA;
  public static final int VK_FULL_WIDTH;
  public static final int VK_HALF_WIDTH;
  public static final int VK_ROMAN_CHARACTERS;
  public static final int VK_ALL_CANDIDATES;
  public static final int VK_PREVIOUS_CANDIDATE;
  public static final int VK_CODE_INPUT;
  public static final int VK_JAPANESE_KATAKANA;
  public static final int VK_JAPANESE_HIRAGANA;
  public static final int VK_JAPANESE_ROMAN;
  public static final int VK_KANA_LOCK;
  public static final int VK_INPUT_METHOD_ON_OFF;
  public static final int VK_CUT;
  public static final int VK_COPY;
  public static final int VK_PASTE;
  public static final int VK_UNDO;
  public static final int VK_AGAIN;
  public static final int VK_FIND;
  public static final int VK_PROPS;
  public static final int VK_STOP;
  public static final int VK_COMPOSE;
  public static final int VK_ALT_GRAPH;
  public static final int VK_BEGIN;
  public static final int VK_UNDEFINED;
  public static final char CHAR_UNDEFINED;
  public static final int KEY_LOCATION_UNKNOWN;
  public static final int KEY_LOCATION_STANDARD;
  public static final int KEY_LOCATION_LEFT;
  public static final int KEY_LOCATION_RIGHT;
  public static final int KEY_LOCATION_NUMPAD;
  private KeyEvent(Component source,int id,long when,int modifiers,int keyCode,char keyChar,int keyLocation, boolean isProxyActive) {
    this(source, id, when, modifiers, keyCode, keyChar, keyLocation);
  }
  public KeyEvent(Component source,int id,long when,int modifiers,int keyCode,char keyChar, int keyLocation) {
    super(source, id, when, modifiers);
  }
  public KeyEvent(Component source,int id,long when,int modifiers,int keyCode, char keyChar) {
    this(source, id, when, modifiers, keyCode, keyChar, KEY_LOCATION_UNKNOWN);
  }
  @Deprecated public KeyEvent(Component source,int id,long when,int modifiers, int keyCode) {
    this(source, id, when, modifiers, keyCode, (char) keyCode);
  }
  public int getKeyCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setKeyCode(int keyCode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char getKeyChar( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setKeyChar(char keyChar) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setModifiers(int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getKeyLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getKeyText(int keyCode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getKeyModifiersText(int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isActionKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getExtendedKeyCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getExtendedKeyCodeForChar(int c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}