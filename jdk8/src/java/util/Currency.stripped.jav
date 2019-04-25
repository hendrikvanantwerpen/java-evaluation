package java.util;

import java.io.Serializable;

public final class Currency implements Serializable {
  private Currency(String currencyCode,int defaultFractionDigits, int numericCode) {
  }
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
}