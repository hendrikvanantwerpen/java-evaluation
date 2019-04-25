package java.awt;


public class BorderLayout implements LayoutManager2, java. io. Serializable {
  public static final String NORTH;
  public static final String SOUTH;
  public static final String EAST;
  public static final String WEST;
  public static final String CENTER;
  public static final String BEFORE_FIRST_LINE;
  public static final String AFTER_LAST_LINE;
  public static final String BEFORE_LINE_BEGINS;
  public static final String AFTER_LINE_ENDS;
  public static final String PAGE_START;
  public static final String PAGE_END;
  public static final String LINE_START;
  public static final String LINE_END;
  public BorderLayout( ) {
    this(0, 0);
  }
  public BorderLayout(int hgap, int vgap) {
  }
  public int getHgap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHgap(int hgap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVgap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVgap(int vgap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLayoutComponent(Component comp, Object constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLayoutComponent(String name, Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeLayoutComponent(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getLayoutComponent(Object constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getLayoutComponent(Container target, Object constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getConstraints(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumLayoutSize(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredLayoutSize(Container target) {
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
  public void layoutContainer(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}