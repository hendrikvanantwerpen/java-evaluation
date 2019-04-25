package java.beans;


public @interface Transient {
  boolean value() default true;
}