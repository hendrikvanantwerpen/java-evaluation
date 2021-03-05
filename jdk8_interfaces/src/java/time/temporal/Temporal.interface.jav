package java.time.temporal;


public interface Temporal extends TemporalAccessor {
  boolean isSupported(TemporalUnit unit) ;
  default Temporal with(TemporalAdjuster adjuster) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  Temporal with(TemporalField field, long newValue) ;
  default Temporal plus(TemporalAmount amount) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  Temporal plus(long amountToAdd, TemporalUnit unit) ;
  default Temporal minus(TemporalAmount amount) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  default Temporal minus(long amountToSubtract, TemporalUnit unit) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  long until(Temporal endExclusive, TemporalUnit unit) ;
}