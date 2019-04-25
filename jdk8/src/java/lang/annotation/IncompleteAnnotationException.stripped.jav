package java.lang.annotation;


public class IncompleteAnnotationException extends RuntimeException {
  public IncompleteAnnotationException(Class<? extends Annotation> annotationType, String elementName) {
    super(annotationType. getName( ) + " missing element " + elementName. toString( ));
  }
  public Class<? extends Annotation> annotationType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String elementName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}