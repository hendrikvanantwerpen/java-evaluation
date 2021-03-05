package java.io;

import java.util.*;

public final class Console implements Flushable {
  public PrintWriter writer( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public Reader reader( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public Console format(String fmt, Object ... args) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public Console printf(String format, Object ... args) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public String readLine(String fmt, Object ... args) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public String readLine( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public char [] readPassword(String fmt, Object ... args) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public char [] readPassword( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public void flush( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  class LineReader extends Reader {
    boolean leftoverLF;
    LineReader(Reader in) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void close( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    public boolean ready( ) throws IOException {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    public int read(char cbuf[],int offset, int length) throws IOException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  }
}