package java.text.spi;

import java.text.DateFormat;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public abstract class DateFormatProvider extends LocaleServiceProvider {
  protected DateFormatProvider( ) {
  }
  public abstract DateFormat getTimeInstance(int style, Locale locale) ;
  public abstract DateFormat getDateInstance(int style, Locale locale) ;
  public abstract DateFormat getDateTimeInstance(int dateStyle,int timeStyle, Locale locale) ;
}