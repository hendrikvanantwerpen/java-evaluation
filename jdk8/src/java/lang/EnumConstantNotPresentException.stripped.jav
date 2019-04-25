package java.lang;


public class EnumConstantNotPresentException extends RuntimeException {
  public EnumConstantNotPresentException(Class<? extends Enum> enumType, String constantName) {
    super(enumType. getName( ) + "." + constantName);
  }
  public Class<? extends Enum> enumType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String constantName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}