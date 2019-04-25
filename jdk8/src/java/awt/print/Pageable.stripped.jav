package java.awt.print;


public interface Pageable {
  @Native int UNKNOWN_NUMBER_OF_PAGES
  ;
  int getNumberOfPages( ) ;
  PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException ;
  Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException ;
}