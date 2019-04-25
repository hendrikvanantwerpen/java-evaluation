package java.io;


public class DataOutputStream extends FilterOutputStream implements DataOutput {
  public DataOutputStream(OutputStream out) {
    super(out);
  }
  public synchronized void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void write(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeBoolean(boolean v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeByte(int v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeShort(int v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeChar(int v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeInt(int v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeLong(long v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeFloat(float v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeDouble(double v) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeBytes(String s) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeChars(String s) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeUTF(String str) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}