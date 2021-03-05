package java.time.temporal;


public interface TemporalAccessor {
  boolean isSupported(TemporalField field) ;
  default ValueRange range(TemporalField field) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  default int get(TemporalField field) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  long getLong(TemporalField field) ;
  default <R> R query(TemporalQuery<R> query) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
}