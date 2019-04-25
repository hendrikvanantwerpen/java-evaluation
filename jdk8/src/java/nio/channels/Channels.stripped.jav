package java.nio.channels;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public final class Channels {
  private Channels( ) {
  }
  public static InputStream newInputStream(ReadableByteChannel ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OutputStream newOutputStream(final WritableByteChannel ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static InputStream newInputStream(final AsynchronousByteChannel ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OutputStream newOutputStream(final AsynchronousByteChannel ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ReadableByteChannel newChannel(final InputStream in) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableByteChannel newChannel(final OutputStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Reader newReader(ReadableByteChannel ch,CharsetDecoder dec, int minBufferCap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Reader newReader(ReadableByteChannel ch, String csName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Writer newWriter(final WritableByteChannel ch,final CharsetEncoder enc, final int minBufferCap) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Writer newWriter(WritableByteChannel ch, String csName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}