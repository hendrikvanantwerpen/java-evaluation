package java.awt;


public class GridLayout implements LayoutManager, java. io. Serializable {
  public GridLayout( ) {
    this(1, 0, 0, 0);
  }
  public GridLayout(int rows, int cols) {
    this(rows, cols, 0, 0);
  }
  public GridLayout(int rows,int cols,int hgap, int vgap) {
  }
  public int getRows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRows(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getColumns( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColumns(int cols) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  public void addLayoutComponent(String name, Component comp) {
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
  public void layoutContainer(Container parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}