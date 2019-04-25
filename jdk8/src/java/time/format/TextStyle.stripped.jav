package java.time.format;


public enum TextStyle {
  FULL (null), FULL_STANDALONE (null), SHORT (null), SHORT_STANDALONE (null), NARROW (null), NARROW_STANDALONE (null)
  ;  private final int calendarStyle;
     private final int zoneNameStyleIndex;
     private TextStyle(int calendarStyle, int zoneNameStyleIndex) {
  }
     public boolean isStandalone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public TextStyle asStandalone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public TextStyle asNormal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     int toCalendarStyle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     int zoneNameStyleIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}