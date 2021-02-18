package java.util;

import java.io.Serializable;
import java.util.spi.LocaleNameProvider;
import sun.util.locale.LocaleObjectCache;
import sun.util.locale.provider.LocaleServiceProviderPool;

public final class Locale implements Cloneable, Serializable {
  private static class Cache extends LocaleObjectCache<LocaleKey, Locale> {
  }
  private static final class LocaleKey {
  }
  private static class LocaleNameGetter implements LocaleServiceProviderPool. LocalizedObjectGetter<LocaleNameProvider, String> {
  }
  public enum Category {
    ;
  }
  public static final class Builder {
  }
  public static enum FilteringMode {
  }
  public static final class LanguageRange {
  }
}