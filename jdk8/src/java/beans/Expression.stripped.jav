package java.beans;


public class Expression extends Statement {
  @ConstructorProperties({"target","methodName","arguments"}) public Expression(Object target,String methodName, Object [] arguments) {
    super(target, methodName, arguments);
  }
  public Expression(Object value,Object target,String methodName, Object [] arguments) {
    this(target, methodName, arguments);
  }
  public void execute( ) throws Exception {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getValue( ) throws Exception {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setValue(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}