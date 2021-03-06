package java.util.spi;

import java.util.Locale;

public abstract class LocaleNameProvider extends LocaleServiceProvider {
  public abstract String getDisplayLanguage(String languageCode, Locale locale) ;
  public String getDisplayScript(String scriptCode, Locale locale) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public abstract String getDisplayCountry(String countryCode, Locale locale) ;
  public abstract String getDisplayVariant(String variant, Locale locale) ;
}