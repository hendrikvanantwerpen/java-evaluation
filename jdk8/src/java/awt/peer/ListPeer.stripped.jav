package java.awt.peer;

import java.awt.Dimension;

public interface ListPeer extends ComponentPeer {
  int [] getSelectedIndexes( ) ;
  void add(String item, int index) ;
  void delItems(int start, int end) ;
  void removeAll( ) ;
  void select(int index) ;
  void deselect(int index) ;
  void makeVisible(int index) ;
  void setMultipleMode(boolean m) ;
  Dimension getPreferredSize(int rows) ;
  Dimension getMinimumSize(int rows) ;
}