package java.awt;

import javax.accessibility.*;

public class Menu extends MenuItem implements MenuContainer, Accessible {
  public Menu( ) throws HeadlessException{
    this("", false);
  }
  public Menu(String label) throws HeadlessException{
    this(label, false);
  }
  public Menu(String label, boolean tearOff) throws HeadlessException{
    super(label);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTearOff( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getItemCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int countItems( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuItem getItem(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuItem add(MenuItem mi) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(String label) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insert(MenuItem menuitem, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insert(String label, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addSeparator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insertSeparator(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(MenuComponent item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}