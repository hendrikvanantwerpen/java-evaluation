package java.awt.geom;


public interface PathIterator {
  @Native public static final int WIND_EVEN_ODD
  ;
  @Native public static final int WIND_NON_ZERO
  ;
  @Native public static final int SEG_MOVETO
  ;
  @Native public static final int SEG_LINETO
  ;
  @Native public static final int SEG_QUADTO
  ;
  @Native public static final int SEG_CUBICTO
  ;
  @Native public static final int SEG_CLOSE
  ;
  public int getWindingRule( ) ;
  public boolean isDone( ) ;
  public void next( ) ;
  public int currentSegment(float [] coords) ;
  public int currentSegment(double [] coords) ;
}