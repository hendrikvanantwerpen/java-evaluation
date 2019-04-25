package java.awt;


public class FlowLayout implements LayoutManager, java. io. Serializable {
  public static final int LEFT;
  public static final int CENTER;
  public static final int RIGHT;
  public static final int LEADING;
  public static final int TRAILING;
  public FlowLayout( ) {
    this(CENTER, 5, 5);
  }
  public FlowLayout(int align) {
    this(align, 5, 5);
  }
  public FlowLayout(int align,int hgap, int vgap) {
  }
  public int getAlignment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAlignment(int align) {
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
  public void setAlignOnBaseline(boolean alignOnBaseline) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getAlignOnBaseline( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addLayoutComponent(String name, Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeLayoutComponent(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredLayoutSize(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumLayoutSize(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void layoutContainer(Container target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}