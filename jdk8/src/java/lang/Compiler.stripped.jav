package java.lang;


public final class Compiler {
  private Compiler( ) {
  }
  public static native boolean compileClass(Class<?> clazz) ;
  public static native boolean compileClasses(String string) ;
  public static native Object command(Object any) ;
  public static native void enable( ) ;
  public static native void disable( ) ;
}