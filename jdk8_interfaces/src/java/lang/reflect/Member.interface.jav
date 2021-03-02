package java.lang.reflect;


public interface Member {
  public static final int PUBLIC
  ;
  public static final int DECLARED
  ;
  public Class<?> getDeclaringClass( ) ;
  public String getName( ) ;
  public int getModifiers( ) ;
  public boolean isSynthetic( ) ;
}