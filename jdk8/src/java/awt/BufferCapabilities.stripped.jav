package java.awt;


public class BufferCapabilities implements Cloneable {
  public BufferCapabilities(ImageCapabilities frontCaps,ImageCapabilities backCaps, FlipContents flipContents) {
  }
  public ImageCapabilities getFrontBufferCapabilities( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ImageCapabilities getBackBufferCapabilities( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPageFlipping( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FlipContents getFlipContents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFullScreenRequired( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMultiBufferAvailable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final class FlipContents extends AttributeValue {
    public static final FlipContents UNDEFINED;
    public static final FlipContents BACKGROUND;
    public static final FlipContents PRIOR;
    public static final FlipContents COPIED;
    private FlipContents(int type) {
      super(type, NAMES);
    }
  }
}