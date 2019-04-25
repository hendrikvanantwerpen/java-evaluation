package java.awt;

import java.awt.event.*;

public class TrayIcon {
  private TrayIcon( ) throws UnsupportedOperationException, HeadlessException, SecurityException{
  }
  public TrayIcon(Image image) {
    this( );
  }
  public TrayIcon(Image image, String tooltip) {
    this(image);
  }
  public TrayIcon(Image image,String tooltip, PopupMenu popup) {
    this(image, tooltip);
  }
  public void setImage(Image image) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Image getImage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPopupMenu(PopupMenu popup) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PopupMenu getPopupMenu( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToolTip(String tooltip) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getToolTip( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setImageAutoSize(boolean autosize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isImageAutoSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addMouseListener(MouseListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeMouseListener(MouseListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MouseListener [] getMouseListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addMouseMotionListener(MouseMotionListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeMouseMotionListener(MouseMotionListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MouseMotionListener [] getMouseMotionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getActionCommand( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setActionCommand(String command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addActionListener(ActionListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeActionListener(ActionListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ActionListener [] getActionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public enum MessageType {
    ERROR, WARNING, INFO, NONE
  }
  ;
  public void displayMessage(String caption,String text, MessageType messageType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}