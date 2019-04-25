package java.awt;


public class GridBagLayout implements LayoutManager2, java. io. Serializable {
  public int columnWidths[];
  public int rowHeights[];
  public double columnWeights[];
  public double rowWeights[];
  public GridBagLayout( ) {
  }
  public void setConstraints(Component comp, GridBagConstraints constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GridBagConstraints getConstraints(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLayoutOrigin( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] [] getLayoutDimensions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] [] getLayoutWeights( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point location(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLayoutComponent(String name, Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLayoutComponent(Component comp, Object constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeLayoutComponent(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredLayoutSize(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumLayoutSize(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension maximumLayoutSize(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getLayoutAlignmentX(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getLayoutAlignmentY(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void invalidateLayout(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void layoutContainer(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}