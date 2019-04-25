package java.awt;

import java.awt.image.BufferStrategy;
import javax.accessibility.*;

public class Canvas extends Component implements Accessible {
  public Canvas( ) {
  }
  public Canvas(GraphicsConfiguration config) {
    this( );
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paint(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void createBufferStrategy(int numBuffers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void createBufferStrategy(int numBuffers, BufferCapabilities caps) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferStrategy getBufferStrategy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}