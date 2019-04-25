package java.awt;


public abstract class GraphicsDevice {
  protected GraphicsDevice( ) {
  }
  public final static int TYPE_RASTER_SCREEN;
  public final static int TYPE_PRINTER;
  public final static int TYPE_IMAGE_BUFFER;
  public static enum WindowTranslucency {
    PERPIXEL_TRANSPARENT, TRANSLUCENT, PERPIXEL_TRANSLUCENT
    ;
  }
  public abstract int getType( ) ;
  public abstract String getIDstring( ) ;
  public abstract GraphicsConfiguration [] getConfigurations( ) ;
  public abstract GraphicsConfiguration getDefaultConfiguration( ) ;
  public GraphicsConfiguration getBestConfiguration(GraphicsConfigTemplate gct) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFullScreenSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFullScreenWindow(Window w) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window getFullScreenWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDisplayChangeSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDisplayMode(DisplayMode dm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DisplayMode getDisplayMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DisplayMode [] getDisplayModes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAvailableAcceleratedMemory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isWindowTranslucencySupported(WindowTranslucency translucencyKind) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}