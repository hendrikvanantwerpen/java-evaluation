package java.awt.peer;

import java.awt.*;

public interface FramePeer extends WindowPeer {
  void setTitle(String title) ;
  void setMenuBar(MenuBar mb) ;
  void setResizable(boolean resizeable) ;
  void setState(int state) ;
  int getState( ) ;
  void setMaximizedBounds(Rectangle bounds) ;
  void setBoundsPrivate(int x,int y,int width, int height) ;
  Rectangle getBoundsPrivate( ) ;
  void emulateActivation(boolean activate) ;
}