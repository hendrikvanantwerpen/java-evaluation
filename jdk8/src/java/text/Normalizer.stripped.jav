package java.text;


public final class Normalizer {
  private Normalizer( ) {
  }
  ;
  public static enum Form {
    NFD, NFC, NFKD, NFKC
  }
  public static String normalize(CharSequence src, Form form) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isNormalized(CharSequence src, Form form) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}