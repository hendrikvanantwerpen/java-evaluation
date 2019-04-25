package java.text;

import java.io.Serializable;

public abstract class Format implements Serializable, Cloneable {
  protected Format( ) {
  }
  public final String format(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract StringBuffer format(Object obj,StringBuffer toAppendTo, FieldPosition pos) ;
  public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Object parseObject(String source, ParsePosition pos) ;
  public Object parseObject(String source) throws ParseException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class Field extends AttributedCharacterIterator. Attribute {
    protected Field(String name) {
      super(name);
    }
  }
}