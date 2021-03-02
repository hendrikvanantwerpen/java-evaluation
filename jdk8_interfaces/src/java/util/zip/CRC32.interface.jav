package java.util.zip;

import java.nio.ByteBuffer;

public class CRC32 implements Checksum {
  private int crc;
  public CRC32( ) {
  }
  public void update(int b) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void update(byte [] b,int off, int len) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public void update(byte [] b) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public void update(ByteBuffer buffer) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public void reset( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public long getValue( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  private native static int update(int crc, int b) ;
  private native static int updateBytes(int crc,byte [] b,int off, int len) ;
  private native static int updateByteBuffer(int adler,long addr,int off, int len) ;
}