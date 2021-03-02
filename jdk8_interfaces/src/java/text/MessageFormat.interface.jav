package java.text;

import java.io.InvalidObjectException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Locale;

public class MessageFormat extends Format {
  private static final long serialVersionUID;
  public MessageFormat(String pattern) {
  }
  public MessageFormat(String pattern, Locale locale) {
  }
  public void setLocale(Locale locale) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public Locale getLocale( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public void applyPattern(String pattern) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public String toPattern( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public void setFormatsByArgumentIndex(Format [] newFormats) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public void setFormats(Format [] newFormats) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public void setFormatByArgumentIndex(int argumentIndex, Format newFormat) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public void setFormat(int formatElementIndex, Format newFormat) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public Format [] getFormatsByArgumentIndex( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public Format [] getFormats( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public final StringBuffer format(Object [] arguments,StringBuffer result, FieldPosition pos) {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
  public static String format(String pattern, Object ... arguments) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  public final StringBuffer format(Object arguments,StringBuffer result, FieldPosition pos) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  public AttributedCharacterIterator formatToCharacterIterator(Object arguments) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public Object [] parse(String source, ParsePosition pos) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public Object [] parse(String source) throws ParseException {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Object parseObject(String source, ParsePosition pos) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public Object clone( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public static class Field extends Format. Field {
    private static final long serialVersionUID;
    protected Field(String name) {
      super(name);
    }
    protected Object readResolve( ) throws InvalidObjectException {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    public final static Field ARGUMENT;
  }
  private Locale locale;
  private String pattern;
  private static final int INITIAL_FORMATS;
  private Format [] formats;
  private int [] offsets;
  private int [] argumentNumbers;
  private int maxOffset;
  private StringBuffer subformat(Object [] arguments,StringBuffer result,FieldPosition fp, List<AttributedCharacterIterator> characterIterators) {
                                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                                 }
  private void append(StringBuffer result, CharacterIterator iterator) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  private static final int SEG_RAW;
  private static final int SEG_INDEX;
  private static final int SEG_TYPE;
  private static final int SEG_MODIFIER;
  private static final int TYPE_NULL;
  private static final int TYPE_NUMBER;
  private static final int TYPE_DATE;
  private static final int TYPE_TIME;
  private static final int TYPE_CHOICE;
  private static final String [] TYPE_KEYWORDS;
  private static final int MODIFIER_DEFAULT;
  private static final int MODIFIER_CURRENCY;
  private static final int MODIFIER_PERCENT;
  private static final int MODIFIER_INTEGER;
  private static final String [] NUMBER_MODIFIER_KEYWORDS;
  private static final int MODIFIER_SHORT;
  private static final int MODIFIER_MEDIUM;
  private static final int MODIFIER_LONG;
  private static final int MODIFIER_FULL;
  private static final String [] DATE_TIME_MODIFIER_KEYWORDS;
  private static final int [] DATE_TIME_MODIFIERS;
  private void makeFormat(int position,int offsetNumber, StringBuilder [] textSegments) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private static final int findKeyword(String s, String [] list) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  private static final void copyAndFixQuotes(String source,int start,int end, StringBuilder target) {
                                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                    }
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
}