package java.util;

import java.io.Serializable;
import java.util.spi.CurrencyNameProvider;
import sun.util.locale.provider.LocaleServiceProviderPool;

public final class Currency implements Serializable {
  static int formatVersion;
  static int dataVersion;
  static int [] mainTable;
  static long [] scCutOverTimes;
  static String [] scOldCurrencies;
  static String [] scNewCurrencies;
  static int [] scOldCurrenciesDFD;
  static int [] scNewCurrenciesDFD;
  static int [] scOldCurrenciesNumericCode;
  static int [] scNewCurrenciesNumericCode;
  static String otherCurrencies;
  static int [] otherCurrenciesDFD;
  static int [] otherCurrenciesNumericCode;
  public static Currency getInstance(String currencyCode) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public static Currency getInstance(Locale locale) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public static Set<Currency> getAvailableCurrencies( ) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public String getCurrencyCode( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public String getSymbol( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public String getSymbol(Locale locale) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int getDefaultFractionDigits( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public int getNumericCode( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public String getDisplayName( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String getDisplayName(Locale locale) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private static class CurrencyNameGetter implements LocaleServiceProviderPool. LocalizedObjectGetter<CurrencyNameProvider, String> {
    public String getObject(CurrencyNameProvider currencyNameProvider,Locale locale,String key, Object ... params) {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
  }
}