package java.security;

import java.util.HashMap;
import sun.security.util.Debug;

public class SecureClassLoader extends ClassLoader {
  private final boolean initialized;
  private final HashMap<CodeSource, ProtectionDomain> pdcache;
  private static final Debug debug;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  protected SecureClassLoader(ClassLoader parent) {
    super(parent);
  }
  protected SecureClassLoader( ) {
    super( );
  }
  protected final Class<?> defineClass(String name,byte [] b,int off,int len, CodeSource cs) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  protected final Class<?> defineClass(String name,java. nio. ByteBuffer b, CodeSource cs) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  protected PermissionCollection getPermissions(CodeSource codesource) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  private ProtectionDomain getProtectionDomain(CodeSource cs) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private void check( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
}