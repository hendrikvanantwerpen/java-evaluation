package java.io;


public class OptionalDataException extends ObjectStreamException {
  OptionalDataException(int len) {
  }
  OptionalDataException(boolean end) {
  }
  public int length;
  public boolean eof;
}