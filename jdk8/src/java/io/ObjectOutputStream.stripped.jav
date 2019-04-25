package java.io;


public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
  public ObjectOutputStream(OutputStream out) throws IOException{
  }
  protected ObjectOutputStream( ) throws IOException, SecurityException{
  }
  public void useProtocolVersion(int version) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeObject(Object obj) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeUnshared(Object obj) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void defaultWriteObject( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ObjectOutputStream. PutField putFields( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeFields( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] buf) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeBoolean(boolean val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeByte(int val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeShort(int val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeChar(int val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeInt(int val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeLong(long val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeFloat(float val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeDouble(double val) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeBytes(String str) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeChars(String str) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void writeUTF(String str) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static abstract class PutField {
    public abstract void put(String name, boolean val) ;
    public abstract void put(String name, byte val) ;
    public abstract void put(String name, char val) ;
    public abstract void put(String name, short val) ;
    public abstract void put(String name, int val) ;
    public abstract void put(String name, long val) ;
    public abstract void put(String name, float val) ;
    public abstract void put(String name, double val) ;
    public abstract void put(String name, Object val) ;
    public abstract void write(ObjectOutput out) throws IOException ;
  }
}