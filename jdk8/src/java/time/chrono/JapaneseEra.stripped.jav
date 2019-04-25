package java.time.chrono;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;

public final class JapaneseEra implements Era, Serializable {
  public static final JapaneseEra MEIJI;
  public static final JapaneseEra TAISHO;
  public static final JapaneseEra SHOWA;
  public static final JapaneseEra HEISEI;
  ;
  private JapaneseEra(int eraValue, LocalDate since) {
  }
  public static JapaneseEra of(int japaneseEra) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseEra valueOf(String japaneseEra) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static JapaneseEra [] values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ValueRange range(TemporalField field) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}