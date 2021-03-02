package java.text;

import java.io.Serializable;

public abstract class Format implements Serializable, Cloneable {
  private static final long serialVersionUID;
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
  AttributedCharacterIterator createAttributedCharacterIterator(String s) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  AttributedCharacterIterator createAttributedCharacterIterator(AttributedCharacterIterator [] iterators) {
                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                          }
  AttributedCharacterIterator createAttributedCharacterIterator(String string,AttributedCharacterIterator. Attribute key, Object value) {
                                                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                        }
  AttributedCharacterIterator createAttributedCharacterIterator(AttributedCharacterIterator iterator,AttributedCharacterIterator. Attribute key, Object value) {
                                                                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                               }
  public static class Field extends AttributedCharacterIterator. Attribute {
    private static final long serialVersionUID;
    protected Field(String name) {
      super(name);
    }
  }
  interface FieldDelegate {
    public void formatted(Format. Field attr,Object value,int start,int end, StringBuffer buffer) ;
    public void formatted(int fieldID,Format. Field attr,Object value,int start,int end, StringBuffer buffer) ;
  }
}