package java.io;


public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
  public ObjectInputStream(InputStream in) throws IOException{
  }
  protected ObjectInputStream( ) throws IOException, SecurityException{
  }
  public final Object readObject( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object readUnshared( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void defaultReadObject( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ObjectInputStream. GetField readFields( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean readBoolean( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte readByte( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int readUnsignedByte( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char readChar( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short readShort( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int readUnsignedShort( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int readInt( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long readLong( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float readFloat( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double readDouble( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void readFully(byte [] buf) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void readFully(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int skipBytes(int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String readLine( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String readUTF( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static abstract class GetField {
    public abstract ObjectStreamClass getObjectStreamClass( ) ;
    public abstract boolean defaulted(String name) throws IOException ;
    public abstract boolean get(String name, boolean val) throws IOException ;
    public abstract byte get(String name, byte val) throws IOException ;
    public abstract char get(String name, char val) throws IOException ;
    public abstract short get(String name, short val) throws IOException ;
    public abstract int get(String name, int val) throws IOException ;
    public abstract long get(String name, long val) throws IOException ;
    public abstract float get(String name, float val) throws IOException ;
    public abstract double get(String name, double val) throws IOException ;
    public abstract Object get(String name, Object val) throws IOException ;
  }
}