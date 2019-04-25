package java.lang.annotation;

import java.lang.reflect.Method;

public class AnnotationTypeMismatchException extends RuntimeException {
  public AnnotationTypeMismatchException(Method element, String foundType) {
    super("Incorrectly typed data found for annotation element " + element + " (Found data of type " + foundType + ")");
  }
  public Method element( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String foundType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}