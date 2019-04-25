package java.awt;

import java.awt.event.*;
import javax.accessibility.*;

public class Dialog extends Window {
  public static enum ModalityType {
    MODELESS, DOCUMENT_MODAL, APPLICATION_MODAL, TOOLKIT_MODAL
  }
  ;
  public final static ModalityType DEFAULT_MODALITY_TYPE;
  public static enum ModalExclusionType {
    NO_EXCLUDE, APPLICATION_EXCLUDE, TOOLKIT_EXCLUDE
  }
  ;
  public Dialog(Frame owner) {
    this(owner, "", false);
  }
  public Dialog(Frame owner, boolean modal) {
    this(owner, "", modal);
  }
  public Dialog(Frame owner, String title) {
    this(owner, title, false);
  }
  public Dialog(Frame owner,String title, boolean modal) {
    this(owner, title, modal ? DEFAULT_MODALITY_TYPE : ModalityType.MODELESS);
  }
  public Dialog(Frame owner,String title,boolean modal, GraphicsConfiguration gc) {
    this(owner, title, modal ? DEFAULT_MODALITY_TYPE : ModalityType.MODELESS, gc);
  }
  public Dialog(Dialog owner) {
    this(owner, "", false);
  }
  public Dialog(Dialog owner, String title) {
    this(owner, title, false);
  }
  public Dialog(Dialog owner,String title, boolean modal) {
    this(owner, title, modal ? DEFAULT_MODALITY_TYPE : ModalityType.MODELESS);
  }
  public Dialog(Dialog owner,String title,boolean modal, GraphicsConfiguration gc) {
    this(owner, title, modal ? DEFAULT_MODALITY_TYPE : ModalityType.MODELESS, gc);
  }
  public Dialog(Window owner) {
    this(owner, "", ModalityType.MODELESS);
  }
  public Dialog(Window owner, String title) {
    this(owner, title, ModalityType.MODELESS);
  }
  public Dialog(Window owner, ModalityType modalityType) {
    this(owner, "", modalityType);
  }
  public Dialog(Window owner,String title, ModalityType modalityType) {
    super(owner);
  }
  public Dialog(Window owner,String title,ModalityType modalityType, GraphicsConfiguration gc) {
    super(owner, gc);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isModal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setModal(boolean modal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ModalityType getModalityType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setModalityType(ModalityType type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getTitle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTitle(String title) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVisible(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void show( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void hide( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void toBack( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isResizable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setResizable(boolean resizable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUndecorated(boolean undecorated) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUndecorated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOpacity(float opacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setShape(Shape shape) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBackground(Color bgColor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}