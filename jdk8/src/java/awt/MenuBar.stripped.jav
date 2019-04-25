package java.awt;

import java.util.Enumeration;
import javax.accessibility.*;

public class MenuBar extends MenuComponent implements MenuContainer, Accessible {
  public MenuBar( ) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Menu getHelpMenu( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHelpMenu(Menu m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Menu add(Menu m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(MenuComponent m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMenuCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int countMenus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Menu getMenu(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Enumeration<MenuShortcut> shortcuts( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuItem getShortcutMenuItem(MenuShortcut s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deleteShortcut(MenuShortcut s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}