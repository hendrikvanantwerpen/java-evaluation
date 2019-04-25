package java.awt.peer;

import java.awt.*;
import java.awt.event.PaintEvent;
import java.awt.image.ImageProducer;
import java.awt.image.ImageObserver;
import java.awt.image.ColorModel;
import java.awt.image.VolatileImage;
import java.awt.GraphicsConfiguration;
import sun.awt.CausedFocusEvent;
import sun.java2d.pipe.Region;

public interface ComponentPeer {
  public static final int SET_LOCATION
  ;
  public static final int SET_SIZE
  ;
  public static final int SET_BOUNDS
  ;
  public static final int SET_CLIENT_SIZE
  ;
  public static final int RESET_OPERATION
  ;
  public static final int NO_EMBEDDED_CHECK
  ;
  public static final int DEFAULT_OPERATION
  ;
  boolean isObscured( ) ;
  boolean canDetermineObscurity( ) ;
  void setVisible(boolean v) ;
  void setEnabled(boolean e) ;
  void paint(Graphics g) ;
  void print(Graphics g) ;
  void setBounds(int x,int y,int width,int height, int op) ;
  void handleEvent(AWTEvent e) ;
  void coalescePaintEvent(PaintEvent e) ;
  Point getLocationOnScreen( ) ;
  Dimension getPreferredSize( ) ;
  Dimension getMinimumSize( ) ;
  ColorModel getColorModel( ) ;
  Graphics getGraphics( ) ;
  FontMetrics getFontMetrics(Font font) ;
  void dispose( ) ;
  void setForeground(Color c) ;
  void setBackground(Color c) ;
  void setFont(Font f) ;
  void updateCursorImmediately( ) ;
  boolean requestFocus(Component lightweightChild,boolean temporary,boolean focusedWindowChangeAllowed,long time, CausedFocusEvent. Cause cause) ;
  boolean isFocusable( ) ;
  Image createImage(ImageProducer producer) ;
  Image createImage(int width, int height) ;
  VolatileImage createVolatileImage(int width, int height) ;
  boolean prepareImage(Image img,int w,int h, ImageObserver o) ;
  int checkImage(Image img,int w,int h, ImageObserver o) ;
  GraphicsConfiguration getGraphicsConfiguration( ) ;
  boolean handlesWheelScrolling( ) ;
  void createBuffers(int numBuffers, BufferCapabilities caps) throws AWTException ;
  Image getBackBuffer( ) ;
  void flip(int x1,int y1,int x2,int y2, BufferCapabilities. FlipContents flipAction) ;
  void destroyBuffers( ) ;
  void reparent(ContainerPeer newContainer) ;
  boolean isReparentSupported( ) ;
  void layout( ) ;
  void applyShape(Region shape) ;
  void setZOrder(ComponentPeer above) ;
  boolean updateGraphicsData(GraphicsConfiguration gc) ;
}