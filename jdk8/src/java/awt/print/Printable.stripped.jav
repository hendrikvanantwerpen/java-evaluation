package java.awt.print;

import java.awt.Graphics;

public interface Printable {
  int PAGE_EXISTS
  ;
  int NO_SUCH_PAGE
  ;
  int print(Graphics graphics,PageFormat pageFormat, int pageIndex) throws PrinterException ;
}