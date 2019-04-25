package java.awt;

import java.awt.event.*;

public interface Adjustable {
  @Native public static final int HORIZONTAL
  ;
  @Native public static final int VERTICAL
  ;
  @Native public static final int NO_ORIENTATION
  ;
  int getOrientation( ) ;
  void setMinimum(int min) ;
  int getMinimum( ) ;
  void setMaximum(int max) ;
  int getMaximum( ) ;
  void setUnitIncrement(int u) ;
  int getUnitIncrement( ) ;
  void setBlockIncrement(int b) ;
  int getBlockIncrement( ) ;
  void setVisibleAmount(int v) ;
  int getVisibleAmount( ) ;
  void setValue(int v) ;
  int getValue( ) ;
  void addAdjustmentListener(AdjustmentListener l) ;
  void removeAdjustmentListener(AdjustmentListener l) ;
}