package java.awt;

import java.io.*;

public abstract class GraphicsConfigTemplate implements Serializable {
  public GraphicsConfigTemplate( ) {
  }
  public static final int REQUIRED;
  public static final int PREFERRED;
  public static final int UNNECESSARY;
  public abstract GraphicsConfiguration getBestConfiguration(GraphicsConfiguration [] gc) ;
  public abstract boolean isGraphicsConfigSupported(GraphicsConfiguration gc) ;
}