package java.beans;


public class Statement {
  @ConstructorProperties({"target","methodName","arguments"}) public Statement(Object target,String methodName, Object [] arguments) {
  }
  public Object getTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMethodName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] getArguments( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void execute( ) throws Exception {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}