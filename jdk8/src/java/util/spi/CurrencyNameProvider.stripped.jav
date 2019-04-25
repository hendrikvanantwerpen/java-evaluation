package java.util.spi;

import java.util.Locale;

public abstract class CurrencyNameProvider extends LocaleServiceProvider {
  protected CurrencyNameProvider( ) {
  }
  public abstract String getSymbol(String currencyCode, Locale locale) ;
  public String getDisplayName(String currencyCode, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}