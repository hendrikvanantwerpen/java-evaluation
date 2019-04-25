package java.awt;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class Desktop {
  public static enum Action {
    OPEN, EDIT, PRINT, MAIL, BROWSE
  }
  ;
  private Desktop( ) {
  }
  public static synchronized Desktop getDesktop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDesktopSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSupported(Action action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void open(File file) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void edit(File file) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(File file) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void browse(URI uri) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mail( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mail(URI mailtoURI) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}