package java.io;


public class CharArrayWriter extends Writer {
  protected char buf[];
  protected int count;
  public CharArrayWriter( ) {
    this(32);
  }
  public CharArrayWriter(int initialSize) {
  }
  public void write(int c) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public void write(char c[],int off, int len) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void write(String str,int off, int len) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void writeTo(Writer out) throws IOException {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public CharArrayWriter append(CharSequence csq) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public CharArrayWriter append(CharSequence csq,int start, int end) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public CharArrayWriter append(char c) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void reset( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public char toCharArray( ) [] {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int size( ) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void flush( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public void close( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
}