package java.beans;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class XMLEncoder extends Encoder implements AutoCloseable {
  public XMLEncoder(OutputStream out) {
    this(out, "UTF-8", true, 0);
  }
  public XMLEncoder(OutputStream out,String charset,boolean declaration, int indentation) {
  }
  public void setOwner(Object owner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeObject(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeStatement(Statement oldStm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeExpression(Expression oldExp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}