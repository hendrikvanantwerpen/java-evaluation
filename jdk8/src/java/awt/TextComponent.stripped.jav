package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;
import java.awt.im.InputMethodRequests;

public class TextComponent extends Component implements Accessible {
  TextComponent(String text) throws HeadlessException{
  }
  public void enableInputMethods(boolean enable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputMethodRequests getInputMethodRequests( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setText(String t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String getText( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String getSelectedText( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEditable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setEditable(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getBackground( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBackground(Color c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getSelectionStart( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setSelectionStart(int selectionStart) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getSelectionEnd( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setSelectionEnd(int selectionEnd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void select(int selectionStart, int selectionEnd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void selectAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setCaretPosition(int position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getCaretPosition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addTextListener(TextListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeTextListener(TextListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized TextListener [] getTextListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}