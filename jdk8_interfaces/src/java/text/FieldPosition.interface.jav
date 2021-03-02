package java.text;


public class FieldPosition {
  int field;
  int endIndex;
  int beginIndex;
  private Format. Field attribute;
  public FieldPosition(int field) {
  }
  public FieldPosition(Format. Field attribute) {
    this(attribute, -1);
  }
  public FieldPosition(Format. Field attribute, int fieldID) {
  }
  public Format. Field getFieldAttribute( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public int getField( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public int getBeginIndex( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int getEndIndex( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void setBeginIndex(int bi) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public void setEndIndex(int ei) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  Format. FieldDelegate getFieldDelegate( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public boolean equals(Object obj) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private boolean matchesField(Format. Field attribute) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private boolean matchesField(Format. Field attribute, int field) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private class Delegate implements Format. FieldDelegate {
    private boolean encounteredField;
    public void formatted(Format. Field attr,Object value,int start,int end, StringBuffer buffer) {
                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                  }
    public void formatted(int fieldID,Format. Field attr,Object value,int start,int end, StringBuffer buffer) {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  }
}