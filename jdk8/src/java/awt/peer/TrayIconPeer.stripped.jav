package java.awt.peer;


public interface TrayIconPeer {
  void dispose( ) ;
  void setToolTip(String tooltip) ;
  void updateImage( ) ;
  void displayMessage(String caption,String text, String messageType) ;
  void showPopupMenu(int x, int y) ;
}