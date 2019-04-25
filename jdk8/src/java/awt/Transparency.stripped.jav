package java.awt;


public interface Transparency {
  @Native public final static int OPAQUE
  ;
  @Native public final static int BITMASK
  ;
  @Native public final static int TRANSLUCENT
  ;
  public int getTransparency( ) ;
}