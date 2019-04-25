package java.util.logging;

import java.util.ResourceBundle;
import java.util.function.Supplier;

public class Logger {
  public static final String GLOBAL_LOGGER_NAME;
  public static final Logger getGlobal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final Logger global;
  protected Logger(String name, String resourceBundleName) {
    this(name, resourceBundleName, null, LogManager. getLogManager( ));
  }
  Logger(String name,String resourceBundleName,Class<?> caller, LogManager manager) {
  }
  private Logger(String name) {
  }
  public static Logger getLogger(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Logger getLogger(String name, String resourceBundleName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Logger getAnonymousLogger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Logger getAnonymousLogger(String resourceBundleName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ResourceBundle getResourceBundle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getResourceBundleName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFilter(Filter newFilter) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Filter getFilter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level, String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level, Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level,String msg, Object param1) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level,String msg, Object params[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level,String msg, Throwable thrown) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void log(Level level,Throwable thrown, Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod, String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod, Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod,String msg, Object param1) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod,String msg, Object params[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod,String msg, Throwable thrown) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logp(Level level,String sourceClass,String sourceMethod,Throwable thrown, Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,String bundleName, String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,String bundleName,String msg, Object param1) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,String bundleName,String msg, Object params[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,ResourceBundle bundle,String msg, Object ... params) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,String bundleName,String msg, Throwable thrown) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void logrb(Level level,String sourceClass,String sourceMethod,ResourceBundle bundle,String msg, Throwable thrown) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void entering(String sourceClass, String sourceMethod) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void entering(String sourceClass,String sourceMethod, Object param1) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void entering(String sourceClass,String sourceMethod, Object params[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void exiting(String sourceClass, String sourceMethod) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void exiting(String sourceClass,String sourceMethod, Object result) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void throwing(String sourceClass,String sourceMethod, Throwable thrown) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void severe(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void warning(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void info(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void config(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fine(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finer(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finest(String msg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void severe(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void warning(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void info(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void config(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fine(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finer(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finest(Supplier<String> msgSupplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLevel(Level newLevel) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Level getLevel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLoggable(Level level) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addHandler(Handler handler) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeHandler(Handler handler) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Handler [] getHandlers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUseParentHandlers(boolean useParentHandlers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getUseParentHandlers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setResourceBundle(ResourceBundle bundle) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Logger getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setParent(Logger parent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}