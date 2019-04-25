package java.awt.image;

import sun.java2d.StateTrackable.State;

public abstract class DataBuffer {
  public static final int TYPE_BYTE;
  public static final int TYPE_USHORT;
  public static final int TYPE_SHORT;
  public static final int TYPE_INT;
  public static final int TYPE_FLOAT;
  public static final int TYPE_DOUBLE;
  public static final int TYPE_UNDEFINED;
  public static int getDataTypeSize(int type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected DataBuffer(int dataType, int size) {
    this(UNTRACKABLE, dataType, size);
  }
  DataBuffer(State initialState,int dataType, int size) {
  }
  protected DataBuffer(int dataType,int size, int numBanks) {
    this(UNTRACKABLE, dataType, size, numBanks);
  }
  DataBuffer(State initialState,int dataType,int size, int numBanks) {
  }
  protected DataBuffer(int dataType,int size,int numBanks, int offset) {
    this(UNTRACKABLE, dataType, size, numBanks, offset);
  }
  DataBuffer(State initialState,int dataType,int size,int numBanks, int offset) {
  }
  protected DataBuffer(int dataType,int size,int numBanks, int offsets[]) {
    this(UNTRACKABLE, dataType, size, numBanks, offsets);
  }
  DataBuffer(State initialState,int dataType,int size,int numBanks, int offsets[]) {
  }
  public int getDataType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getOffsets( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumBanks( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getElem(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getElem(int bank, int i) ;
  public void setElem(int i, int val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setElem(int bank,int i, int val) ;
  public float getElemFloat(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getElemFloat(int bank, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemFloat(int i, float val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemFloat(int bank,int i, float val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getElemDouble(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getElemDouble(int bank, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemDouble(int i, double val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemDouble(int bank,int i, double val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}