package java.util.zip;

import java.nio.file.attribute.FileTime;

public class ZipEntry implements ZipConstants, Cloneable {
  public static final int STORED;
  public static final int DEFLATED;
  public ZipEntry(String name) {
  }
  public ZipEntry(ZipEntry e) {
  }
  ZipEntry( ) {
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTime(long time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry setLastModifiedTime(FileTime time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileTime getLastModifiedTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry setLastAccessTime(FileTime time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileTime getLastAccessTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ZipEntry setCreationTime(FileTime time) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FileTime getCreationTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(long size) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getCompressedSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCompressedSize(long csize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCrc(long crc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getCrc( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMethod(int method) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExtra(byte [] extra) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getExtra( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setComment(String comment) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getComment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDirectory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}