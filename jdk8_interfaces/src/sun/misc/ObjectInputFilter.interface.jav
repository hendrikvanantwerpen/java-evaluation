package sun.misc;

import java.io.ObjectInputStream;
import java.util.List;
import java.util.function.Function;
import sun.util.logging.PlatformLogger;

public interface ObjectInputFilter {
  Status checkInput(FilterInfo filterInfo) ;
  interface FilterInfo {
    Class<?> serialClass( ) ;
    long arrayLength( ) ;
    long depth( ) ;
    long references( ) ;
    long streamBytes( ) ;
  }
  enum Status {
    UNDECIDED, ALLOWED, REJECTED
    ;
  }
  final class Config {
    private Config( ) {
    }
    private final static Object serialFilterLock;
    private final static PlatformLogger configLog;
    static void filterLog(PlatformLogger. Level level,String msg, Object ... args) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    private final static String SERIAL_FILTER_PROPNAME;
    private final static ObjectInputFilter configuredFilter;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    private static ObjectInputFilter serialFilter;
    public static ObjectInputFilter getObjectInputFilter(ObjectInputStream inputStream) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
    public static void setObjectInputFilter(ObjectInputStream inputStream, ObjectInputFilter filter) {
                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                     }
    public static ObjectInputFilter getSerialFilter( ) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public static void setSerialFilter(ObjectInputFilter filter) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public static ObjectInputFilter createFilter(String pattern) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
    public static ObjectInputFilter createFilter2(String pattern) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    final static class Global implements ObjectInputFilter {
      private final String pattern;
      private final List<Function<Class<?>, Status>> filters;
      private long maxStreamBytes;
      private long maxDepth;
      private long maxReferences;
      private long maxArrayLength;
      private final boolean checkComponentType;
      static ObjectInputFilter createFilter(String pattern, boolean checkComponentType) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
      private Global(String pattern, boolean checkComponentType) {
      }
      private boolean isEmpty( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
      private boolean parseLimit(String pattern) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
      private static long parseValue(String string) throws IllegalArgumentException {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
      public Status checkInput(FilterInfo filterInfo) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
      private static boolean matchesPackage(Class<?> c, String pkg) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
      public String toString( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    }
  }
}