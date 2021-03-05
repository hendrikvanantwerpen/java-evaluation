package java.lang.reflect;


public interface Member {
  public Class<?> getDeclaringClass( ) ;
  public String getName( ) ;
  public int getModifiers( ) ;
  public boolean isSynthetic( ) ;
}