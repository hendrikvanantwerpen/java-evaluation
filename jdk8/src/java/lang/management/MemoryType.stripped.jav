package java.lang.management;


public enum MemoryType {
  HEAP (null), NON_HEAP (null)
  ;  private final String description;
     private MemoryType(String s) {
  }
     public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     private static final long serialVersionUID;
}