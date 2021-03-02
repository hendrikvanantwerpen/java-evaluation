package sun.util.locale.provider;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.spi.LocaleServiceProvider;

public final class LocaleServiceProviderPool {
  private static ConcurrentMap<Class<? extends LocaleServiceProvider>, LocaleServiceProviderPool> poolOfPools;
  private ConcurrentMap<LocaleProviderAdapter. Type, LocaleServiceProvider> providers;
  private ConcurrentMap<Locale, List<LocaleProviderAdapter. Type>> providersCache;
  private Set<Locale> availableLocales;
  private Class<? extends LocaleServiceProvider> providerClass;
  static final Class<LocaleServiceProvider> [] spiClasses;
  public static LocaleServiceProviderPool getPool(Class<? extends LocaleServiceProvider> providerClass) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  private LocaleServiceProviderPool(final Class<? extends LocaleServiceProvider> c) {
  }
  static void config(Class<? extends Object> caller, String message) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  private static class AllAvailableLocales {
    static final Locale [] allAvailableLocales;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    private AllAvailableLocales( ) {
    }
  }
  public static Locale [] getAllAvailableLocales( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public Locale [] getAvailableLocales( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private synchronized Set<Locale> getAvailableLocaleSet( ) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  boolean hasProviders( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public <P extends LocaleServiceProvider,S> S getLocalizedObject(LocalizedObjectGetter<P, S> getter,Locale locale, Object ... params) {
                                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                       }
  public <P extends LocaleServiceProvider,S> S getLocalizedObject(LocalizedObjectGetter<P, S> getter,Locale locale,String key, Object ... params) {
                                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                  }
  private <P extends LocaleServiceProvider,S> S getLocalizedObjectImpl(LocalizedObjectGetter<P, S> getter,Locale locale,boolean isObjectProvider,String key, Object ... params) {
                                                                                                                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                                                }
  private List<LocaleProviderAdapter. Type> findProviders(Locale locale) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  static List<Locale> getLookupLocales(Locale locale) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static Locale getLookupLocale(Locale locale) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static List<LocaleProviderAdapter. Type> NULL_LIST;
  public interface LocalizedObjectGetter<P extends LocaleServiceProvider,S> {
    public S getObject(P lsp,Locale locale,String key, Object ... params) ;
  }
}