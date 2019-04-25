package java.awt;

import java.io.FilenameFilter;
import java.io.File;

public class FileDialog extends Dialog {
  public static final int LOAD;
  public static final int SAVE;
  public FileDialog(Frame parent) {
    this(parent, "", LOAD);
  }
  public FileDialog(Frame parent, String title) {
    this(parent, title, LOAD);
  }
  public FileDialog(Frame parent,String title, int mode) {
    super(parent, title, true);
  }
  public FileDialog(Dialog parent) {
    this(parent, "", LOAD);
  }
  public FileDialog(Dialog parent, String title) {
    this(parent, title, LOAD);
  }
  public FileDialog(Dialog parent,String title, int mode) {
    super(parent, title, true);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMode(int mode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDirectory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDirectory(String dir) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFile( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public File [] getFiles( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFile(String file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMultipleMode(boolean enable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMultipleMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FilenameFilter getFilenameFilter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setFilenameFilter(FilenameFilter filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}