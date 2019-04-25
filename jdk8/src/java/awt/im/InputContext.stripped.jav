package java.awt.im;

import java.awt.Component;
import java.util.Locale;
import java.awt.AWTEvent;
import java.lang.Character.Subset;

public class InputContext {
  protected InputContext( ) {
  }
  public static InputContext getInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean selectInputMethod(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCharacterSubsets(Subset [] subsets) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCompositionEnabled(boolean enable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompositionEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reconvert( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dispatchEvent(AWTEvent event) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify(Component client) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void endComposition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dispose( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getInputMethodControlObject( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}