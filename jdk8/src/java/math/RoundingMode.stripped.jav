package java.math;


public enum RoundingMode {
  UP (null), DOWN (null), CEILING (null), FLOOR (null), HALF_UP (null), HALF_DOWN (null), HALF_EVEN (null), UNNECESSARY (null)
  ;  final int oldMode;
     private RoundingMode(int oldMode) {
  }
     public static RoundingMode valueOf(int rm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}