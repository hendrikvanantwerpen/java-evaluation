package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class TextField extends TextComponent {
  public TextField( ) throws HeadlessException{
    this("", 0);
  }
  public TextField(String text) throws HeadlessException{
    this(text, text != null ? text. length( ) : 0);
  }
  public TextField(int columns) throws HeadlessException{
    this("", columns);
  }
  public TextField(String text, int columns) throws HeadlessException{
    super(text);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char getEchoChar( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setEchoChar(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setEchoCharacter(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setText(String t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean echoCharIsSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getColumns( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColumns(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addActionListener(ActionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeActionListener(ActionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ActionListener [] getActionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}