package java.io;

import java.util.stream.Stream;

public class BufferedReader extends Reader {
  private Reader in;
  private char cb[];
  private int nChars, nextChar;
  private static final int INVALIDATED;
  private static final int UNMARKED;
  private int markedChar;
  private int readAheadLimit;
  private boolean skipLF;
  private boolean markedSkipLF;
  private static int defaultCharBufferSize;
  private static int defaultExpectedLineLength;
  public BufferedReader(Reader in, int sz) {
    super(in);
  }
  public BufferedReader(Reader in) {
    this(in, defaultCharBufferSize);
  }
  private void ensureOpen( ) throws IOException {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private void fill( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public int read( ) throws IOException {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private int read1(char [] cbuf,int off, int len) throws IOException {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public int read(char cbuf[],int off, int len) throws IOException {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  String readLine(boolean ignoreLF) throws IOException {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public String readLine( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public long skip(long n) throws IOException {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public boolean ready( ) throws IOException {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public boolean markSupported( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public void mark(int readAheadLimit) throws IOException {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public void reset( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public void close( ) throws IOException {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Stream<String> lines( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
}