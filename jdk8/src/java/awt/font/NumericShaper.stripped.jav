package java.awt.font;

import java.util.Set;

public final class NumericShaper implements java. io. Serializable {
  public static enum Range {
    EUROPEAN (null), ARABIC (null), EASTERN_ARABIC (null), DEVANAGARI (null), BENGALI (null), GURMUKHI (null), GUJARATI (null), ORIYA (null), TAMIL (null), TELUGU (null), KANNADA (null), MALAYALAM (null), THAI (null), LAO (null), TIBETAN (null), MYANMAR (null), ETHIOPIC (null){
      char getNumericBase( ) {
        throw new java . lang . RuntimeException ("Implementation stripped");
      }
    }, KHMER (null), MONGOLIAN (null), NKO (null), MYANMAR_SHAN (null), LIMBU (null), NEW_TAI_LUE (null), BALINESE (null), SUNDANESE (null), LEPCHA (null), OL_CHIKI (null), VAI (null), SAURASHTRA (null), KAYAH_LI (null), CHAM (null), TAI_THAM_HORA (null), TAI_THAM_THAM (null), JAVANESE (null), MEETEI_MAYEK (null)
    ;  private static int toRangeIndex(Range script) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       private static Range indexToRange(int index) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       private static int toRangeMask(Set<Range> ranges) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       private static Set<Range> maskToRangeSet(int mask) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       private final int base;
       private final int start, end;
       private Range(int base,int start, int end) {
    }
       private int getDigitBase( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       char getNumericBase( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       private boolean inRange(int c) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final int EUROPEAN;
  public static final int ARABIC;
  public static final int EASTERN_ARABIC;
  public static final int DEVANAGARI;
  public static final int BENGALI;
  public static final int GURMUKHI;
  public static final int GUJARATI;
  public static final int ORIYA;
  public static final int TAMIL;
  public static final int TELUGU;
  public static final int KANNADA;
  public static final int MALAYALAM;
  public static final int THAI;
  public static final int LAO;
  public static final int TIBETAN;
  public static final int MYANMAR;
  public static final int ETHIOPIC;
  public static final int KHMER;
  public static final int MONGOLIAN;
  public static final int ALL_RANGES;
  public static NumericShaper getShaper(int singleRange) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NumericShaper getShaper(Range singleRange) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NumericShaper getContextualShaper(int ranges) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NumericShaper getContextualShaper(Set<Range> ranges) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NumericShaper getContextualShaper(int ranges, int defaultContext) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static NumericShaper getContextualShaper(Set<Range> ranges, Range defaultContext) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private NumericShaper(int key, int mask) {
  }
  private NumericShaper(Range defaultContext, Set<Range> ranges) {
  }
  public void shape(char [] text,int start, int count) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shape(char [] text,int start,int count, int context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void shape(char [] text,int start,int count, Range context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isContextual( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRanges( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Range> getRangeSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}