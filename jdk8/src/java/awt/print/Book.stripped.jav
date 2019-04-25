package java.awt.print;


public class Book implements Pageable {
  public Book( ) {
  }
  public int getNumberOfPages( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPage(int pageIndex,Printable painter, PageFormat page) throws IndexOutOfBoundsException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void append(Printable painter, PageFormat page) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void append(Printable painter,PageFormat page, int numPages) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}