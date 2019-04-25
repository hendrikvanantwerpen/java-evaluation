package java.util;

import java.io.Serializable;
import sun.util.locale.BaseLocale;
import sun.util.locale.LocaleExtensions;

public final class Locale implements Cloneable, Serializable {
  static public final Locale ENGLISH;
  static public final Locale FRENCH;
  static public final Locale GERMAN;
  static public final Locale ITALIAN;
  static public final Locale JAPANESE;
  static public final Locale KOREAN;
  static public final Locale CHINESE;
  static public final Locale SIMPLIFIED_CHINESE;
  static public final Locale TRADITIONAL_CHINESE;
  static public final Locale FRANCE;
  static public final Locale GERMANY;
  static public final Locale ITALY;
  static public final Locale JAPAN;
  static public final Locale KOREA;
  static public final Locale CHINA;
  static public final Locale PRC;
  static public final Locale TAIWAN;
  static public final Locale UK;
  static public final Locale US;
  static public final Locale CANADA;
  static public final Locale CANADA_FRENCH;
  static public final Locale ROOT;
  static public final char PRIVATE_USE_EXTENSION;
  static public final char UNICODE_LOCALE_EXTENSION;
  private Locale(BaseLocale baseLocale, LocaleExtensions extensions) {
  }
  public Locale(String language,String country, String variant) {
  }
  public Locale(String language, String country) {
    this(language, country, "");
  }
  public Locale(String language) {
    this(language, "", "");
  }
  public static Locale getDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Locale getDefault(Locale. Category category) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void setDefault(Locale newLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void setDefault(Locale. Category category, Locale newLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Locale [] getAvailableLocales( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String [] getISOCountries( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String [] getISOLanguages( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLanguage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getScript( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCountry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getVariant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasExtensions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale stripExtensions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getExtension(char key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Character> getExtensionKeys( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> getUnicodeLocaleAttributes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getUnicodeLocaleType(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> getUnicodeLocaleKeys( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toLanguageTag( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Locale forLanguageTag(String languageTag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getISO3Language( ) throws MissingResourceException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getISO3Country( ) throws MissingResourceException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getDisplayLanguage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayLanguage(Locale inLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayScript( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayScript(Locale inLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getDisplayCountry( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayCountry(Locale inLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getDisplayVariant( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayVariant(Locale inLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getDisplayName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getDisplayName(Locale inLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public enum Category {
    DISPLAY (null), FORMAT (null)
    ;  Category(String languageKey,String scriptKey,String countryKey, String variantKey) {
    }
       final String languageKey;
       final String scriptKey;
       final String countryKey;
       final String variantKey;
  }
  public static final class Builder {
    public Builder( ) {
    }
    public Builder setLocale(Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setLanguageTag(String languageTag) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setLanguage(String language) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setScript(String script) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setRegion(String region) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setVariant(String variant) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setExtension(char key, String value) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setUnicodeLocaleKeyword(String key, String type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder addUnicodeLocaleAttribute(String attribute) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder removeUnicodeLocaleAttribute(String attribute) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder clear( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder clearExtensions( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Locale build( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static enum FilteringMode {
    AUTOSELECT_FILTERING, EXTENDED_FILTERING, IGNORE_EXTENDED_RANGES, MAP_EXTENDED_RANGES, REJECT_EXTENDED_RANGES
  }
  ;
  public static final class LanguageRange {
    public static final double MAX_WEIGHT;
    public static final double MIN_WEIGHT;
    public LanguageRange(String range) {
      this(range, MAX_WEIGHT);
    }
    public LanguageRange(String range, double weight) {
    }
    public String getRange( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getWeight( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static List<LanguageRange> parse(String ranges) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static List<LanguageRange> parse(String ranges, Map<String, List<String>> map) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static List<LanguageRange> mapEquivalents(List<LanguageRange> priorityList, Map<String, List<String>> map) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object obj) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static List<Locale> filter(List<LanguageRange> priorityList,Collection<Locale> locales, FilteringMode mode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<Locale> filter(List<LanguageRange> priorityList, Collection<Locale> locales) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<String> filterTags(List<LanguageRange> priorityList,Collection<String> tags, FilteringMode mode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<String> filterTags(List<LanguageRange> priorityList, Collection<String> tags) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Locale lookup(List<LanguageRange> priorityList, Collection<Locale> locales) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String lookupTag(List<LanguageRange> priorityList, Collection<String> tags) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}