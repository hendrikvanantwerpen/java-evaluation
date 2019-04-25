package java.awt.print;

import java.awt.HeadlessException;
import javax.print.PrintService;
import javax.print.StreamPrintServiceFactory;
import javax.print.attribute.PrintRequestAttributeSet;

public abstract class PrinterJob {
  public static PrinterJob getPrinterJob( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PrintService [] lookupPrintServices( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static StreamPrintServiceFactory [] lookupStreamPrintServices(String mimeType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrinterJob( ) {
  }
  public PrintService getPrintService( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrintService(PrintService service) throws PrinterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setPrintable(Printable painter) ;
  public abstract void setPrintable(Printable painter, PageFormat format) ;
  public abstract void setPageable(Pageable document) throws NullPointerException ;
  public abstract boolean printDialog( ) throws HeadlessException ;
  public boolean printDialog(PrintRequestAttributeSet attributes) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract PageFormat pageDialog(PageFormat page) throws HeadlessException ;
  public PageFormat pageDialog(PrintRequestAttributeSet attributes) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract PageFormat defaultPage(PageFormat page) ;
  public PageFormat defaultPage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PageFormat getPageFormat(PrintRequestAttributeSet attributes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract PageFormat validatePage(PageFormat page) ;
  public abstract void print( ) throws PrinterException ;
  public void print(PrintRequestAttributeSet attributes) throws PrinterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setCopies(int copies) ;
  public abstract int getCopies( ) ;
  public abstract String getUserName( ) ;
  public abstract void setJobName(String jobName) ;
  public abstract String getJobName( ) ;
  public abstract void cancel( ) ;
  public abstract boolean isCancelled( ) ;
}