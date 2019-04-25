package java.awt;

import javax.accessibility.*;

public class TextArea extends TextComponent {
  public static final int SCROLLBARS_BOTH;
  public static final int SCROLLBARS_VERTICAL_ONLY;
  public static final int SCROLLBARS_HORIZONTAL_ONLY;
  public static final int SCROLLBARS_NONE;
  public TextArea( ) throws HeadlessException{
    this("", 0, 0, SCROLLBARS_BOTH);
  }
  public TextArea(String text) throws HeadlessException{
    this(text, 0, 0, SCROLLBARS_BOTH);
  }
  public TextArea(int rows, int columns) throws HeadlessException{
    this("", rows, columns, SCROLLBARS_BOTH);
  }
  public TextArea(String text,int rows, int columns) throws HeadlessException{
    this(text, rows, columns, SCROLLBARS_BOTH);
  }
  public TextArea(String text,int rows,int columns, int scrollbars) throws HeadlessException{
    super(text);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insert(String str, int pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void insertText(String str, int pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void append(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void appendText(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void replaceRange(String str,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void replaceText(String str,int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRows(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getColumns( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColumns(int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getScrollbarVisibility( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize(int rows, int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize(int rows, int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize(int rows, int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize(int rows, int columns) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}