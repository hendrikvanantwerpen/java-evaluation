package java.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Base64 {
  private Base64( ) {
  }
  public static Encoder getEncoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Encoder getUrlEncoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Encoder getMimeEncoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Encoder getMimeEncoder(int lineLength, byte [] lineSeparator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Decoder getDecoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Decoder getUrlDecoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Decoder getMimeDecoder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class Encoder {
    private Encoder(boolean isURL,byte [] newline,int linemax, boolean doPadding) {
    }
    public byte [] encode(byte [] src) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int encode(byte [] src, byte [] dst) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String encodeToString(byte [] src) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ByteBuffer encode(ByteBuffer buffer) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public OutputStream wrap(OutputStream os) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Encoder withoutPadding( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Decoder {
    private Decoder(boolean isURL, boolean isMIME) {
    }
    public byte [] decode(byte [] src) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public byte [] decode(String src) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int decode(byte [] src, byte [] dst) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ByteBuffer decode(ByteBuffer buffer) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public InputStream wrap(InputStream is) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}